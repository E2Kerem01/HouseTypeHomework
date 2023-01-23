package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
 public static void main(String[] args) {
  /*// Create a list of houses
  List<House> houses = new ArrayList<>();
  houses.add(new House(150, 3, 2, 500000));
  houses.add(new House(200, 4, 2, 600000));
  houses.add(new House(250, 5, 3, 700000));

  // Create a list of villas
  List<Villa> villas = new ArrayList<>();
  villas.add(new Villa(400, 6, 4, 800000));
  villas.add(new Villa(450, 7, 4, 900000));
  villas.add(new Villa(500, 8, 5, 1000000));

  // Create a list of summer houses
  List<SummerHouse> summerHouses = new ArrayList<>();
  summerHouses.add(new SummerHouse(100, 2, 1, 200000));
  summerHouses.add(new SummerHouse(120, 2, 2, 250000));
  summerHouses.add(new SummerHouse(140, 3, 2, 300000));

  // Create a service object to perform calculations
  PropertyService service = new PropertyService(houses, villas, summerHouses);

  // Calculate and print total prices for each property type
  System.out.println("Total price of houses: " + service.getTotalPrice(PropertyType.HOUSE));
  System.out.println("Total price of villas: " + service.getTotalPrice(PropertyType.VILLA));
  System.out.println("Total price of summer houses: " + service.getTotalPrice(PropertyType.SUMMER_HOUSE));
  System.out.println("Total price of all properties: " + service.getTotalPrice(PropertyType.ALL));

  // Calculate and print average square footage for each property type
  System.out.println("Average square footage of houses: " + service.getAvgSquareFootage(PropertyType.HOUSE));
  System.out.println("Average square footage of villas: " + service.getAvgSquareFootage(PropertyType.VILLA));
  System.out.println("Average square footage of summer houses: " + service.getAvgSquareFootage(PropertyType.SUMMER_HOUSE));
  System.out.println("Average square footage of all properties: " + service.getAvgSquareFootage(PropertyType.ALL));

  // Filter properties based on room and salon count
  System.out.println("Properties with at least 4 rooms and 2 salons: " + service.filterProperties(4, 2));*/
 }
}

enum PropertyType {
 HOUSE, VILLA, SUMMER_HOUSE, ALL
}

abstract class Property {
 private int squareFootage;
}