package lab2;

public class Main {
    public static void main(String[] args) {
        double a = Double.parseDouble(System.console().readLine("Введіть довжину прямокутника: "));
        double b = Double.parseDouble(System.console().readLine("Введіть ширину прямокутника: "));
        double c = Double.parseDouble(System.console().readLine("Введіть перший катет прямокутного трикутника: "));
        double d = Double.parseDouble(System.console().readLine("Введіть другий катет прямокутного трикутника: "));
        
        Shape rectangle = new Rectangle(a, b);
        Shape triangle = new Triangle(c, d);
        
        double rectangleArea = rectangle.getArea();
        double triangleArea = triangle.getArea();

        System.out.println("Площа прямокутника: " + rectangleArea);
        System.out.println("Площа прямокутного трикутника: " + triangleArea);
    }
}