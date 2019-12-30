package com.new3tious.new3app.model;

/**
 * Created by aohana
 */
public class User {

    private String id;
    private String name;
    private String favoriteIngredients;
    private String allergies;
    private Boolean onDiet;

    public User() {
    }

    public User(String id, String name, String favoriteIngredients, String allergies, Boolean onDiet) {
        this.id = id;
        this.name = name;
        this.favoriteIngredients = favoriteIngredients;
        this.allergies = allergies;
        this.onDiet = onDiet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
