package com.new3tious.new3app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

/**
 * Created by aohana
 */
public class User {

    @JsonProperty("id")
    private UUID id;
    @NotBlank
    @JsonProperty("name")
    private String name;
    @NotBlank
    @JsonProperty("favoriteIngredients")
    private String favoriteIngredients;
    @NotBlank
    @JsonProperty("allergies")
    private String allergies;
    @JsonProperty("onDiet")
    private Boolean onDiet;

    public User() {
    }

    public User(UUID id, String name, String favoriteIngredients, String allergies, Boolean onDiet) {
        this.id = id;
        this.name = name;
        this.favoriteIngredients = favoriteIngredients;
        this.allergies = allergies;
        this.onDiet = onDiet;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteIngredients() {
        return favoriteIngredients;
    }

    public void setFavoriteIngredients(String favoriteIngredients) {
        this.favoriteIngredients = favoriteIngredients;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public Boolean getOnDiet() {
        return onDiet;
    }

    public void setOnDiet(Boolean onDiet) {
        this.onDiet = onDiet;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", favoriteIngredients='" + favoriteIngredients + '\'' +
                ", allergies='" + allergies + '\'' +
                ", onDiet=" + onDiet +
                '}';
    }

}
