package lab02;

public class Race{

	public static void main(String[] args) {
		Car[] race = new Car[3];
		race[0]= new Car("Ford", 30);
		race[1]= new Car("Tesla",300);
		race[2]= new Car("Honda",50);

		for(int i=0; i<race.length;i++){
			System.out.println(race[i].getCarType());
		} 

		for(Car i: race){
			System.out.println(i.getCarType());		
		}

		System.out.println("Expected average top speed = 126.667 \t Method result: " + averageTopSpeed(race));

		System.out.println("Expected top speed = 300 \t Method result: " + fastestSpeed(race));
	}

	public static double averageTopSpeed(Car[] cars){
		double sumTopSpeed = 0;

		for(Car i:cars){
			sumTopSpeed += i.getTopSpeed();
		}		
	
		return (sumTopSpeed/cars.length);
	}

	public static double fastestSpeed(Car[] cars){
		double topTopSpeed = 0;

		for(Car i:cars){
			if (i.getTopSpeed() > topTopSpeed)
				topTopSpeed = i.getTopSpeed();
		}
		return topTopSpeed;
	}
}
