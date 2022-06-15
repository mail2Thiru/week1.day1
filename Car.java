package week1.day1;

public class Car {
	
	//method->actions,verifications
	
	//driveCar

	//access modifier,return type,methodName
	
	public void driveCar() {
		System.out.println("Drive The Car");
	}
   //special method - main method
	
   public static void main(String[] args) {
	   System.out.println("Inside Main Method");
		
//create an object
	   Car myCar = new Car();
	   myCar.driveCar();
	}

}
