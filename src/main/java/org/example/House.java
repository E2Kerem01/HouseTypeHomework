package org.example;

class House {

    private int squareFootage;
    private int roomCount;
    private int salonCount;
    private int price;

    public House(int squareFootage, int roomCount, int salonCount, int price) {
        this.squareFootage = squareFootage;
        this.roomCount = roomCount;
        this.salonCount = salonCount;
        this.price = price;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getSalonCount() {
        return salonCount;
    }

    public int getPrice() {
        return price;
    }
}

class Villa extends House {

    public Villa(int squareFootage, int roomCount, int salonCount, int price) {
        super(squareFootage, roomCount, salonCount, price);
    }


}

class SummerHouse extends House {

    public SummerHouse(int squareFootage, int roomCount, int salonCount, int price) {
        super(squareFootage, roomCount, salonCount, price);
    }

}

