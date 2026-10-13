package com.uczelnia;

import java.util.ArrayList;
import java.util.List;

/**
 * Reprezentuje przepis kulinarny zawierający listę składników.
 */
public class Recipe {
  private final String name;
  private final int preparationTimeMinutes;
  private int servings;
  private final List<Ingredient> ingredients;

  /**
  * Tworzy nowy przepis kulinarny.
  */
  public Recipe(String name, int preparationTimeMinutes, int servings) {
    this.name = name;
    this.preparationTimeMinutes = preparationTimeMinutes;
    this.servings = servings;
    this.ingredients = new ArrayList<>();
  }

  public void addIngredient(Ingredient ingredient) {
    ingredients.add(ingredient);
  }

  /**
  * Skaluje cały przepis na nową liczbę porcji.
  */
  public void adjustServings(int targetServings) {
    if (targetServings <= 0 || targetServings == this.servings) {
      return;
    }

    double factor = (double) targetServings / this.servings;
    for (Ingredient ingredient : ingredients) {
      ingredient.scaleAmount(factor);
    }
    this.servings = targetServings;
  }

  /**
  * Wypisuje szczegóły przepisu, w tym nazwę, czas przygotowania, liczbę porcji i listę składników.
  */
  public void displayRecipe() {
    System.out.println("========================================");
    System.out.println("PRZEPIS: " + name.toUpperCase());
    System.out.println("Czas przygotowania: " + preparationTimeMinutes + " min | ");
    System.out.println("Porcje: " + servings);
    System.out.println("----------------------------------------");
    System.out.println("Składniki:");
    for (Ingredient ingredient : ingredients) {
      System.out.println(ingredient);
    }
    System.out.println("========================================\n");
  }
}