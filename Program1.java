package classprograms;

class Vehicle {
    public void drive() {
        System.out.println("Repairing a vehicle");
    }
}
class Car1 extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle = new Vehicle();
        Car1 car = new Car1();
        vehicle.drive();
        car.drive();
	}

}
