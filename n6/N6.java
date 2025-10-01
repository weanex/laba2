package n6;
import n6.geometry2d.Circle;
import n6.geometry2d.Rectangle;
import n6.geometry3d.Cylinder;

public class N6 {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(3.0);
            Rectangle rectangle = new Rectangle(2.0, 5.0);
            
            Cylinder cylinder1 = new Cylinder(circle, 12.0);
            Cylinder cylinder2 = new Cylinder(rectangle, 10.0);
            
            System.out.println(circle);
            System.out.println("Area: " + circle.area());
            System.out.println("Perimeter: " + circle.perimeter());
            
            System.out.println(cylinder1);
            System.out.println("Volume: " + cylinder1.volume());
            
            System.out.println(cylinder2);
            System.out.println("Volume: " + cylinder2.volume());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}