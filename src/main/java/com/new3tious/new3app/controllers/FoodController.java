package com.new3tious.new3app.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.new3tious.new3app.model.User;
import com.new3tious.new3app.model.food.Food;
import com.new3tious.new3app.model.food.FoodSearchResponse;
import com.new3tious.new3app.model.food.Hint;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by aohana
 */

@RestController
public class FoodController {

    @Value("${food.search.app_id}")
    private String appId;

    @Value("${food.search.app_key}")
    private String appSecret;

    private static final String FOOD_SEARCH_HOST = "api.edamam.com";
    private OkHttpClient httpclient = new OkHttpClient();

    @GetMapping("/getRichFoods")
    public Set<Food> getRichFoods(@RequestBody User user) {

        FoodSearchResponse foodSearchResponse = null;

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host(FOOD_SEARCH_HOST)
                .addPathSegment("api")
                .addPathSegment("food-database")
                .addPathSegment("parser")
                .addQueryParameter("app_id", appId)
                .addQueryParameter("app_key", appSecret)
                .addQueryParameter("ingr", user.getFavoriteIngredients())
                .build();

        Request request = new Request.Builder().url(httpUrl).get().build();

        try (Response response = httpclient.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                foodSearchResponse = mapper.readValue(response.body().bytes(), FoodSearchResponse.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return filterRichFoods(foodSearchResponse);
    }

    private Set<Food> filterRichFoods(FoodSearchResponse foodSearchResponse) {

        Set<Food> res = new HashSet<>();

        List<Hint> hints = foodSearchResponse.getHints()
                .stream()
                .filter(Hint::isRichFood)
                .collect(Collectors.toList());

        for (Hint hint : hints) {
            res.add(hint.getFood());
        }

        return res;
    }

}
