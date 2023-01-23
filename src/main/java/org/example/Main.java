package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


public class Main {

    static final Logger logger = Logger.getLogger(Main.class.toString());

    public static void main(String[] args) {

        // Create a list of houses
        List<House> houses = new ArrayList<>();
        houses.add(new House(150, 3, 2, 500000));
        houses.add(new House(200, 4, 2, 600000));
        houses.add(new House(250, 5, 3, 700000));

        // Create a list of villas
        List<Villa> villas = new ArrayList<>();
        villas.add(new Villa(400, 6, 4, 800000));
        villas.add(new Villa(450, 7, 4, 900000));
        villas.add(new Villa(500, 8, 5, 1000000));

        // Create a list of summerHouses
        List<SummerHouse> summerHouses = new ArrayList<>();
        summerHouses.add(new SummerHouse(100, 2, 1, 200000));
        summerHouses.add(new SummerHouse(120, 2, 2, 250000));
        summerHouses.add(new SummerHouse(140, 3, 2, 300000));

        PropertyService service = new PropertyService(houses,villas,summerHouses);

        System.out.println("########################################################################################################");
        System.out.println("PRICES CALCULATIONS*********************************************************");
        //Calculation of house types in terms of price
        System.out.println("Prices of houses : " + service.getTotalHousePrice() + " TRY");

        System.out.println("Prices of villas : " + service.getTotalVillaPrice() + " TRY");

        System.out.println("Prices of summerhouses : " + service.getTotalSummerHousePrice() + " TRY");

        System.out.println("Prices of all houses types : " + service.getAllTypesPrice() + " TRY");
        System.out.println();



        System.out.println();
        System.out.println("########################################################################################################");
        System.out.println("AVERAGE SQUAREFOOTAGE CALCULATIONS*********************************************************");
        //Calculation of houses of all types in average square meters
        System.out.println( "Average Squarefootage of houses : " + service.getAverageOfHousesSquarefootage() + " M²");

        System.out.println( "Average Squarefootage of villas : " + service.getAverageOfVillasSquarefootage() + " M²");

        System.out.println( "Average Squarefootage of summerhouses : " + service.getAverageOfSummerHousesSquarefootage() + " M²");
        System.out.println();



        System.out.println();
        System.out.println("########################################################################################################");
        System.out.println("All types of houses according to the number of rooms and halls******************************************");

        System.out.println("As a result of filtering : " + service.filterProperties(7,4) + " "
                + service.filterProperties(7,4).size() + " number of houses were found.");
        System.out.println();


        System.out.println();
        System.out.println("########################################################################################################");
        System.out.println("TOTAL SQUAREFOOTAGE CALCULATIONS(OPTIONAL CASE)*********************************************************");
        //Calculations of house types in total square meters
        System.out.println("Squarefootage of houses : " + service.getHousesTotalSquareFootage() + " M²");

        System.out.println("Squarefootage of villas : " + service.getVillaTotalSquareFootage() + " M²");

        System.out.println("Squarefootage of summerhouses : " + service.getSummerHousesTotalSquareFootage() + " M²");

        System.out.println("Squarefootage of all houses types : " + service.getAllTypesTotalSquareFootage() + " M²");






    }


}


