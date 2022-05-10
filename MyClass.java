package week3.day1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Bmw bmw = new Bmw();
		vehicle.applyBrake();
		vehicle.soundHorn();
		car.handBrake();
		car.turnAC();
		bmw.autoPark();
		System.out.println(" \n Car extends Vehicle \n");
		car.applyBrake();
		car.soundHorn();
		System.out.println(" \n BMW extends Vehicle and car \n");
		bmw.applyBrake();
		bmw.handBrake();

	}

}
