package project2;
/*
Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
 */

public class Task8 {
    int carPrice;
    String color;

    public Task8(int carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice() {
        return this.carPrice;
    }
}
class Truck extends Task8 {
    double weight;
    public Truck(int carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }
    double calculateSalePrice(double weight) {
        double tenDiscout=(carPrice/100)*10;
        double twentyDiscout=(carPrice/100)*20;
        if(this.weight>2000) {
            return carPrice-tenDiscout;
        }
        return carPrice-twentyDiscout;
    }
}

class Sedan extends Task8 {
    double length;
    public Sedan(int carPrice, String color, double length) {
        super (carPrice, color);
        this.length=length;
    }

    double calculateSalePrice(double length) {
        double fiveDiscount=(carPrice/100)*5;
        double tenDiscount=(carPrice/100)*10;
        if (this.length>20) {
            return carPrice-fiveDiscount;
        }
        return carPrice-tenDiscount;
    }
}

class CarTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(50000,"blue",23);
        Truck truck = new Truck(60000,"brown", 2100 );
        System.out.println(sedan.calculateSalePrice(23));
        System.out.println(truck.calculateSalePrice(2100));
    }
}
