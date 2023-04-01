import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double weight;
        double height;
        double index;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your weight(kg): ");
        weight = scanner.nextDouble();
        System.out.print("Please enter your height(m): ");
        height = scanner.nextDouble();

        index = weight / (height * height);
        System.out.println("Your body mass index= " + index);

        if (index < 18.5) {
            System.out.println("zayıf");
        } else if (index >= 18.5 && index <= 24.9) {
            System.out.println("ideal");
        } else if (index > 24.9 && index <= 29.9) {
            System.out.println("şaşman");
        } else if (index > 29.9 && index <= 34.9) {
            System.out.println("obez");
        } else if (index > 34.9) {
            System.out.println("aşırız obez");
        }

    }
}
