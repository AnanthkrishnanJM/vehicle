package vehicle;
abstract class vehicle{
	abstract void start();
	{
		System.out.println("Vehicle Started");
	}
	abstract void stop();{
		System.out.println("Vehicle Stopped");
	}
	
}
class car extends vehicle{
	
	public void start() {
		System.out.println("Car Started");
	}
	
	public void stop() {
		System.out.println("Car stopped");
	}
}
class  Motorcycle extends vehicle {
	@Override
	public void start() {
		System.out.println("Motorcycle started");
	}
	@Override
	public void stop() {
		System.out.println("Motorcycle stopped");
	}
}

public class vehiclemodel {

	public static void main(String[] args) {
		
		Motorcycle motorcycle=new Motorcycle();
		motorcycle.start();
		motorcycle.stop();
		
		car Car=new car();
		Car.start();
		Car.stop();

	}

}