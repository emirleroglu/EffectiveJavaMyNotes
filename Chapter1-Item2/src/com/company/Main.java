package com.company;

import com.company.builder.Calzone;
import com.company.builder.NyPizza;
import com.company.builder.Pizza;
import com.company.entity.NutritionFacts;
import com.company.entity.NutritionFactsJavaBean;
import com.company.entity.NutritionFactsTelescope;

import static com.company.builder.Pizza.Topping.HAM;

/**
 * Chapter-1, Item-2
 * Consider a builder when faced with many constructor parameters;
 */
public class Main {

    public static void main(String[] args) {
        /*
          the telescoping constructor pattern works, but it is hard to write
          client code when there are many parameters, and harder still to read it.
         */
        NutritionFactsTelescope cocaCola = new NutritionFactsTelescope(240, 8, 100, 0, 35, 27);
        NutritionFactsTelescope orangeJuice = new NutritionFactsTelescope(120, 45, 560);
        // constructorda herhangi bir hatada oluşturulon obje hatalı oluşucak.

        /*
        a JavaBean may be in an inconsistent state partway through its construction.
        the JavaBeans pattern precludes the possibility of making a class immutable
         */
        NutritionFactsJavaBean pepsi = new NutritionFactsJavaBean();
        pepsi.setCalories(560);
        pepsi.setServings(8);   // servingSize zorunlu olmasında rağmen setlemeden kullanabilirim. ??

        /*

         */
        NutritionFacts fanta = new NutritionFacts
                .Builder(200, 4)
                .fat(25)
                .calories(340)
                .build();

        System.out.println("Deneme");

        /*
         Hierarchical builders
         */

        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();

        /**
         * the Builder pattern is a good choice when designing classes
         * whose constructors or static factories would have more than a handful of
         * parameters, especially if many of the parameters are optional or of identical type.
         * Client code is much easier to read and write with builders than with telescoping
         * constructors, and builders are much safer than JavaBeans.
         */

    }
}
