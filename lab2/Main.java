package lab2;

public class Main {
    public static void main(String[] args) {
        double ширина = Double.parseDouble(System.console().readLine("Enter the length of the rectangle: "));
        double висота = Double.parseDouble(System.console().readLine("Enter the width of the rectangle: "));
        double верх = Double.parseDouble(System.console().readLine("Enter the first leg of the right triangle: "));
        double низ = Double.parseDouble(System.console().readLine("Enter the second leg of the right triangle: "));
        
        Shape قمة = new Rectangle(ширина, висота);
        Shape قم = new Triangle(верх, низ);
        
        double rectangleArea = قمة.getArea();
        double triangleArea = قم.getArea();

        System.out.println("Area of ​​the rectangle: " + rectangleArea);
        System.out.println("Площа прямокут قمного трикутника: " + triangleArea);
    }
}