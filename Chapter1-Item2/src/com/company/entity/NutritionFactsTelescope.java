package com.company.entity;

/**
 * Telescoping constructor pattern - does not scale well!(Anti-Pattern)
 */
public class NutritionFactsTelescope {
    private final int servingSize; // required
    private final int servings; // required
    private final int fat; // optional
    private final int sodium; // optional
    private final int calories; // optional
    private final int carbohydrate; // optional

    public NutritionFactsTelescope(int servingSize, int servings, int fat, int sodium, int calories, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.fat = fat;
        this.sodium = sodium;
        this.calories = calories;
        this.carbohydrate = carbohydrate;
    }

    public NutritionFactsTelescope(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFactsTelescope(int servingSize, int servings,
                                   int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFactsTelescope(int servingSize, int servings,
                                   int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFactsTelescope(int servingSize, int servings,
                                   int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }
}
