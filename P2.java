import java.util.Scanner;

class Circle {
    double radius;
    int x;
    int y;

    Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    boolean PointInside(int a, int b) {
        if (Math.sqrt(Math.pow(a - this.x, 2) + Math.pow(b - this.y, 2)) <= this.radius) {
            return true;
        }
        return false;
    }
}
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the radius of the circle : ");
            double radius = input.nextInt();
            if (radius < 0) {
                System.out.println("Invalid Radius!");
                break;
            }
            System.out.print("Enter x-coordinate of center: ");
            int a = input.nextInt();
            System.out.print("Enter y-coordinate of center: ");
            int b = input.nextInt();

            Circle circle = new Circle(radius, a, b);

            System.out.println("Area of circle: " + circle.area());
            System.out.println("Perimeter of circle: " + circle.perimeter());

            System.out.println("Enter x & y coordinate of point ");
            int c = input.nextInt();
            int d = input.nextInt();

            System.out.println(circle.PointInside(c,d));
            
        }
        
        input.close();
    }
}
