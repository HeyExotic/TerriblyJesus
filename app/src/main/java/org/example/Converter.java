package org.example;

public class Converter {
  public static String toPounds(double ounces) {
  double pounds = ounces / 16.0;
    return String.format("%d oz is equivalent to %d lbs", (int) ounces, pounds);
  }
  public static String toPoundsAndOunces(double ounces) {
      int pounds = (int) (ounces / 16);
    int remainingounces = (int) (ounces % 16);
    return String.format("%d oz is equivalent to %d lbs and %d oz", (int) ounces, pounds, remainingounces);
  }
}

