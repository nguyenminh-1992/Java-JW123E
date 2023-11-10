package Assignment6.Ex2.backend;

import Assignment6.Ex2.entity.Car;
import Assignment6.Ex2.entity.Car.Engine;

public class Ex2 {
	public void Question2() {
		System.out.println("-------Question 2-------");
		Car car = new Car("Mazda", "8WD");
		Engine engine = car.new Engine();
		engine.setEngineType("Crysler");
		System.out.println(engine.getEngineType());

	}
}
