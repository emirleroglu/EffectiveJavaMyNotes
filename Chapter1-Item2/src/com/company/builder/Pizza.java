package com.company.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * The Builder pattern is well suited to class hierarchies.
 */
public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        //// Subclasses must override this method to return "this"
        protected abstract T self();

        abstract Pizza build();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
