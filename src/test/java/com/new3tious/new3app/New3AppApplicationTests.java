package com.new3tious.new3app;

import com.new3tious.new3app.model.User;
import com.new3tious.new3app.model.food.Food;
import com.new3tious.new3app.model.recipe.Recipe;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = New3AppApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class New3AppApplicationTests {

    @LocalServerPort
    private int port;

    private TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void feedMoragTest() {

        Recipe recipe = this.restTemplate.postForObject("http://localhost:" + port + "/feedMorag",
                new User("1234567", "Morag", "rice,beans", "gluten,meat", true),
                Recipe.class);

        assertNotNull(recipe);

    }

    @Test
    public void feedBenTest() {

        Recipe recipe = this.restTemplate.postForObject("http://localhost:" + port + "/feedBen",
                new User("12345678", "Ben", "tomato,past", "gluten,banana", false),
                Recipe.class);

        assertNotNull(recipe);

    }

    @Test
    public void leanestRecipeTest() {

        Recipe recipe = this.restTemplate.getForObject("http://localhost:" + port + "/leanestRecipe", Recipe.class);

        assertNotNull(recipe);

    }

    @Test
    public void getRichFoodsTest() {

        Food food = this.restTemplate.getForObject("http://localhost:" + port + "/getRichFoods", Food.class, new User("12345678", "Ben", "tomato past", "gluten,banana", false));

        assertNotNull(food);
        assertEquals(200, food.getAdditionalProperties().get("status"));

    }

}
