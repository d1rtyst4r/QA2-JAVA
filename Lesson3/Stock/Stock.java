package lv.javaguru.JavaGuruQA2.Lesson3.Stock;

class Stock {

    String name;
    double minPrice;
    double maxPrice;
    double price;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        minPrice = price;
        maxPrice = price;
    }

    void printInformation() {
        System.out.println("Company = " + name + ", Current price = " + price + ", Max price = " + maxPrice +
                ", Min price = " + minPrice);
    }

    void updatePrice(double newPrice) {
        price = newPrice;
        if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }
}
