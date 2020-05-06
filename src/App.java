import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        Car audi = new Car("black", "Audi");
        Car mercedes = new Car("silver", "Mercedes");
        /*
        System.out.println(audi.toString());
        System.out.println(mercedes.toString());
        System.out.println(audi.startEngine());
        System.out.println(mercedes.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(mercedes.accelerate());
        System.out.println(audi.setSpeed(80));
        System.out.println(mercedes.setSpeed(90));
        System.out.println(mercedes.passCar(audi));
        System.out.println(mercedes.decelerate());
        System.out.println(audi.decelerate());
        System.out.println(mercedes.stopEngine());
        System.out.println(audi.stopEngine());
         */
        cars.add(audi);
        cars.add(mercedes);
        String response = "";
        do {
            Car car = new Car();
            System.out.print("Enter the name of the new car: ");
            car.setMake(input.nextLine());
            System.out.println("Enter the color of the new car: ");
            car.setColor(input.nextLine());
            cars.add(car);
            System.out.print("Add another car? y/n: ");
            response = input.nextLine();
        } while (!response.equalsIgnoreCase("n"));

        System.out.println("Your cars: ");
        for (Car car: cars) {
            System.out.println(car.toString());
        }



    }


}
