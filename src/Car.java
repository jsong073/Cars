public class Car extends Vehicle{
    public String color;
    public String make;

    public Car() {
        color = "";
        make = "";
    }

    public Car(String color, String make) {
        this.color = color;
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String startEngine() {
        return ("The " + this.toString() + " is starting.");
    }

    public String stopEngine() {
        return ("The " + this.toString() + " is stopped.");
    }

    public String setSpeed(int speed) {
        return ("The " + this.toString() + " is going " + speed + " mph.");
    }

    public String accelerate() {
        return ("The " + this.toString() + " is accelerating.");
    }

    public String decelerate() {
        return ("The " + this.toString() + " is decelerating.");
    }

    public String passCar(Car car) {
        return ("The " + this.toString() + " passed the " + car.toString() + ".");
    }

    @Override
    public String toString() {
        return "" + color + " " + make;
    }
}
