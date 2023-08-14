package com.company.entity;

/**
 * JavaBeans Pattern - allows inconsistency, mandates mutability
 */
public class NutritionFactsJavaBean {
    // Parameters initialized to default values (if any)
    private int servingSize = -1; //Required. No default value
    private int servings = -1; //Required. No default value
    private int fat = 0;
    private int calories = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFactsJavaBean() {
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
