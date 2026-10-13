package com.uczelnia;

/**
 * Główna klasa uruchomieniowa aplikacji kulinarnej.
 */
public class App {

  /**
 * Główna klasa uruchomieniowa aplikacji kulinarnej.
  */
  public static void main(String[] args) {
    Recipe pancakeRecipe = new Recipe("Naleśniki Klasyczne", 20, 2);

    pancakeRecipe.addIngredient(new Ingredient("Mąka pszenna", 200, "g"));
    pancakeRecipe.addIngredient(new Ingredient("Mleko", 250, "ml"));
    pancakeRecipe.addIngredient(new Ingredient("Jajka", 2, "szt."));
    pancakeRecipe.addIngredient(new Ingredient("Szczypta soli", 1, "szcz."));

    System.out.println("--- PRZEPIS PODSTAWOWY ---");
    pancakeRecipe.displayRecipe();

    System.out.println("... Przeliczam składniki na imprezę (z 2 na 6 porcji) ...\n");
    pancakeRecipe.adjustServings(6);

    System.out.println("--- PRZEPIS SKALOWANY ---");
    pancakeRecipe.displayRecipe();
  }
}