import java.util.Scanner;
import Interfaces.*;
import Colors.*;
import Shapes.*;


public class RunClient {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your color:");
        System.out.println("Type 1 for BLUE");
        System.out.println("Type 2 for RED");
        System.out.println("Type 3 GREEN");

        int colorChoice = scanner.nextInt();

        Shape rectangleShape = new Rectangle();
        Shape circleShape = new Circle();
        Shape triangleShape = new Triangle();

        System.out.println();

        switch(colorChoice) {
            case 1:
                rectangleShape.setColor(new Blue());
                rectangleShape.addColor();

                circleShape.setColor(new Blue());
                circleShape.addColor();

                triangleShape.setColor(new Blue());
                triangleShape.addColor();

                break;
            case 2:
                rectangleShape.setColor(new Red());
                rectangleShape.addColor();

                circleShape.setColor(new Red());
                circleShape.addColor();

                triangleShape.setColor(new Red());
                triangleShape.addColor();

                break;
            case 3:
                rectangleShape.setColor(new Green());
                rectangleShape.addColor();

                circleShape.setColor(new Green());
                circleShape.addColor();

                triangleShape.setColor(new Green());
                triangleShape.addColor();

                break;
            default:
                System.out.println("ERROR: Invalid Input");

                break;
        }

    }
}
