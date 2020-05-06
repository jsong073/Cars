public class App {
    public static void main(String[] args) {
        Car audi = new Car("black", "Audi");
        Car mercedes = new Car("silver", "Mercedes");
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



    }


}
