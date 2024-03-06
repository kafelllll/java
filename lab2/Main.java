package lab2;

public class Main {
    public static void main(String[] args) {
        double width = Double.parseDouble(System.console().readLine("Enter the length of the rectangle: "));
        double height = Double.parseDouble(System.console().readLine("Enter the width of the rectangle: "));
        double top = Double.parseDouble(System.console().readLine("Enter the first leg of the right triangle: "));
        double bottom = Double.parseDouble(System.console().readLine("Enter the second leg of the right triangle: "));
        
        Shape rec = new Rectangle(width, height);
        Shape tri = new Triangle(top, bottom);
        
        double rectangleArea = rec.getArea();
        double triangleArea = tri.getArea();

        System.out.println("Area of ​​the rectangle: " + rectangleArea);
        System.out.println("Area of ​​the triangle: " + triangleArea);
    }
}