package com.new3tious.new3app.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.new3tious.new3app.model.User;
import com.new3tious.new3app.model.recipe.Hit;
import com.new3tious.new3app.model.recipe.Recipe;
import com.new3tious.new3app.model.recipe.SearchRecipeResponse;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by aohana
 */

@RestController
public class FeedController {

    @Value("${recipe.search.app_id}")
    private String appId;

    @Value("${recipe.search.app_key}")
    private String appSecret;

    private static final String SEARCH_RECIPE_HOST = "api.edamam.com";
    private OkHttpClient httpclient = new OkHttpClient();

    @PostMapping("/feedMorag")
    public Recipe feedMorag(@RequestBody User user) {

        SearchRecipeResponse searchRecipeResponse = null;

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host(SEARCH_RECIPE_HOST)
                .addPathSegment("search")
                .addQueryParameter("q", user.getFavoriteIngredients())
                .addQueryParameter("excluded", user.getAllergies())
                .addQueryParameter("app_id", appId)
                .addQueryParameter("app_key", appSecret)
                .addQueryParameter("from", "0")
                .addQueryParameter("to", "5")
                .addQueryParameter("calories", user.getName().equals("Morag") ? "100-200" : "200+")
                .build();

        Request request = new Request.Builder().url(httpUrl).get().build();

        try (Response response = httpclient.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                searchRecipeResponse = mapper.readValue(response.body().bytes(), SearchRecipeResponse.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return searchRecipeResponse.getHits().get(0).getRecipe();
    }

    @PostMapping("/feedBen")
    public Recipe feedBen(@RequestBody User user) {

        SearchRecipeResponse searchRecipeResponse = null;

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host(SEARCH_RECIPE_HOST)
                .addPathSegment("search")
                .addQueryParameter("q", user.getFavoriteIngredients())
                .addQueryParameter("excluded", user.getAllergies())
                .addQueryParameter("app_id", appId)
                .addQueryParameter("app_key", appSecret)
                .addQueryParameter("from", "0")
                .addQueryParameter("to", "5")
                .addQueryParameter("calories", user.getName().equals("Ben") ? "500-1000" : "1000+")
                .build();

        Request request = new Request.Builder().url(httpUrl).get().build();

        try (Response response = httpclient.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                searchRecipeResponse = mapper.readValue(response.body().bytes(), SearchRecipeResponse.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return searchRecipeResponse.getHits().get(0).getRecipe();
    }

    @GetMapping("/leanestRecipe")
    public Recipe leanestRecipe() {

        List<Recipe> recipes = new ArrayList<>();

        addRecipesForUser(new User(UUID.randomUUID(), "Ben", "tomato,past", "gluten,banana", false), recipes);

        addRecipesForUser(new User(UUID.randomUUID(), "Morag", "rice,beans", "gluten,meat", true), recipes);

        return findLeanestRecipe(recipes);

    }

    private Recipe findLeanestRecipe(List<Recipe> recipes) {

        Recipe leanest = recipes.get(0);

        for(Recipe recipe : recipes) {
            if(recipe.getCalories() < leanest.getCalories()) {
                leanest = recipe;
            }
        }

        return leanest;
    }

    private void addRecipesForUser(User user, List<Recipe> recipes) {
        SearchRecipeResponse searchRecipeResponse = null;

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host(SEARCH_RECIPE_HOST)
                .addPathSegment("search")
                .addQueryParameter("q", user.getFavoriteIngredients())
                .addQueryParameter("excluded", user.getAllergies())
                .addQueryParameter("app_id", appId)
                .addQueryParameter("app_key", appSecret)
                .addQueryParameter("from", "0")
                .addQueryParameter("to", "5")
                .addQueryParameter("calories", user.getName().equals("Morag") ? "100-200" : "500-1000")
                .build();

        Request request = new Request.Builder().url(httpUrl).get().build();

        try (Response response = httpclient.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                searchRecipeResponse = mapper.readValue(response.body().bytes(), SearchRecipeResponse.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Hit hit : searchRecipeResponse.getHits()) {
            recipes.add(hit.getRecipe());
        }

    }

}
