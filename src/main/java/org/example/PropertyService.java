package org.example;

import java.util.ArrayList;
import java.util.List;

public class PropertyService {
    private List<House> houses;
    private List<Villa> villas;
    private List<SummerHouse> summerHouses;

    public PropertyService(List<House> houses, List<Villa> villas, List<SummerHouse> summerHouses) {
        this.houses = houses;
        this.villas = villas;
        this.summerHouses = summerHouses;
    }

    public List<House> getHouseList() {
        return houses;
    }

    public List<Villa> getVillaList() {
        return villas;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouses;
    }


    // HOUSES PRICES
    public int getTotalHousePrice() {
        int total = 0;
        for (House house : houses) {
            total += house.getPrice();
        }
        return total;
    }

    public int getTotalVillaPrice() {
        int total = 0;
        for (Villa villa : villas) {
            total += villa.getPrice();
        }
        return total;
    }

    public int getTotalSummerHousePrice() {
        int total = 0;
        for (SummerHouse summerHouse : summerHouses) {
            total += summerHouse.getPrice();
        }
    return total;
    }

    public int getAllTypesPrice(){
        int total = 0;
        for (House house : houses){
            total += house.getPrice();
        }
        for (Villa villa : villas) {
            total += villa.getPrice();
        }
        for (SummerHouse summerHouse : summerHouses) {
            total += summerHouse.getPrice();
        }
        return total;
    }



    // HOUSES SQUAREFOOTAGE
    public int getHousesTotalSquareFootage(){
        int total = 0;
        for (House house : houses) {
            total += house.getSquareFootage();
        }
        return total;
    }

    public int getVillaTotalSquareFootage(){
        int total = 0;
        for (Villa villa : villas) {
            total += villa.getSquareFootage();
        }
        return total;
    }

    public int getSummerHousesTotalSquareFootage(){
        int total = 0;
        for (SummerHouse summerHouse : summerHouses) {
            total += summerHouse.getSquareFootage();
        }
        return total;
    }

    public int getAllTypesTotalSquareFootage(){
        int total = 0;
        for (House house : houses){
            total += house.getSquareFootage();
        }
        for (Villa villa : villas) {
            total += villa.getSquareFootage();
        }
        for (SummerHouse summerHouse : summerHouses) {
            total += summerHouse.getSquareFootage();
        }
        return total;
    }

    public double getAverageOfHousesSquarefootage(){
        return houses.stream()
                .mapToDouble(House::getSquareFootage)
                .average()
                .orElse(0.0);

    }

    public double getAverageOfVillasSquarefootage(){
        return villas.stream()
                .mapToDouble(Villa::getSquareFootage)
                .average()
                .orElse(0.0);

    }

    public double getAverageOfSummerHousesSquarefootage(){
        return summerHouses.stream()
                .mapToDouble(SummerHouse::getSquareFootage)
                .average()
                .orElse(0.0);

    }

    public List<Object> filterProperties(int minRooms, int minSalons) {
        List<Object> filteredProperties = new ArrayList<>();
        for (House house : houses) {
            if (house.getRoomCount() >= minRooms && house.getSalonCount() >= minSalons) {
                filteredProperties.add(house);
            }
        }
        for (Villa villa : villas) {
            if (villa.getRoomCount() >= minRooms && villa.getSalonCount() >= minSalons) {
                filteredProperties.add(villa);
            }
        }
        for (SummerHouse summerHouse : summerHouses) {
            if (summerHouse.getRoomCount() >= minRooms && summerHouse.getSalonCount() >= minSalons) {
                filteredProperties.add(summerHouse);
            }
        }
        return filteredProperties;
    }


}







