package project2;
/*
Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimeter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.

 */
public interface Task6 {

    double calculateArea(double a, double b);

    double Perimeter(double a, double b);
}

class Circle implements Task6 {


    @Override
    public double calculateArea(double a, double b) {
        double area = (a * (b * 2));
        return area;
    }

    @Override
    public double Perimeter(double a, double b) {
        double perimeter = 2 * a * b;
        return perimeter;
    }


}

class Square implements Task6 {


    @Override
    public double calculateArea(double a, double b) {
        double area = a * b;
        return area;
    }

    @Override
    public double Perimeter(double a, double b) {
        double perimeter = a * b;
        return perimeter;
    }
}

class ShapeTester {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle.calculateArea(3.14, 5));
        System.out.println(circle.Perimeter(3.14, 8));

        Square square = new Square();
        System.out.println(square.calculateArea(5, 5));
        System.out.println(square.Perimeter(4, 5));


    }
}
