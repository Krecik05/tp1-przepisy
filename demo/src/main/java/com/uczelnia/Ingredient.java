package com.uczelnia;

/**
 * Reprezentuje pojedynczy składnik kulinarny.
 */
public class Ingredient {
  private final String name;
  private double amount;
  private final String unit;

  /**
   * Tworzy nowy składnik kulinarny.
   *
   * @param name   nazwa składnika
   * @param amount ilość składnika
   * @param unit   jednostka miary (np. g, ml, szt.)
   */

  public Ingredient(String name, double amount, String unit) {
    this.name = name;
    this.amount = amount;
    this.unit = unit;
  }

  public String getName() {
    return name;
  }

  public double getAmount() {
    return amount;
  }

  public String getUnit() {
    return unit;
  }

  /**
  * Skaluje ilość składnika o dany współczynnik (np. x2 przy podwojeniu porcji).
  */
  public void scaleAmount(double factor) {
    if (factor > 0) {
      this.amount *= factor;
    }
  }

  @Override
    public String toString() {
    return String.format("- %s: %.1f %s", name, amount, unit);
  }
}