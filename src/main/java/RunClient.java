import java.util.Scanner;
import Interfaces.*;
import Colors.*;
import Shapes.*;


public class RunClient {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Select the color that will be assigned to all existing shapes
        System.out.println("Choose your color:");
        System.out.println("Type 1 for BLUE");
        System.out.println("Type 2 for RED");
        System.out.println("Type 3 GREEN");

        int colorChoice = scanner.nextInt();

        // Initialize objects of all existing shapes
        Shape rectangleShape = new Rectangle();
        Shape circleShape = new Circle();
        Shape triangleShape = new Triangle();

        System.out.println();

        // Display output to client
        switch(colorChoice) {
            case 1:
                rectangleShape.setColor(new Blue());
                rectangleShape.assignColor();

                circleShape.setColor(new Blue());
                circleShape.assignColor();

                triangleShape.setColor(new Blue());
                triangleShape.assignColor();

                break;
            case 2:
                rectangleShape.setColor(new Red());
                rectangleShape.assignColor();

                circleShape.setColor(new Red());
                circleShape.assignColor();

                triangleShape.setColor(new Red());
                triangleShape.assignColor();

                break;
            case 3:
                rectangleShape.setColor(new Green());
                rectangleShape.assignColor();

                circleShape.setColor(new Green());
                circleShape.assignColor();

                triangleShape.setColor(new Green());
                triangleShape.assignColor();

                break;
            default:
                System.out.println("ERROR: Invalid Input");

                break;
        }

    }
}
