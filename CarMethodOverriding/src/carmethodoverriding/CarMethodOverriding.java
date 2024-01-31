package carmethodoverriding;

class Car{
	public void start()
	{
		System.out.println("Car is started");
	}
	public void accelerate()
	{
		System.out.println("Car is accelerated");
	}
	public void changeGear()
	{
		System.out.println("Car gear is changed from gear 1 to 2");
	}
}
class LuxuryCar extends Car{
	

	@Override
	public void changeGear()
	{
		System.out.println("Automatic Gear is selected in LuxuryCar");
	}
	public void openRoof()
	{
		System.out.println("LuxuryCar roof is opened");
	}
}


public class CarMethodOverriding {

	public static void main(String[] args) {
		Car car=new LuxuryCar();
		LuxuryCar lcar=new LuxuryCar();
		car.start();
		car.accelerate();
		car.changeGear();
		lcar.start();
		

	}

}
