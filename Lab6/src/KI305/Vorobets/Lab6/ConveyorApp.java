package KI305.Vorobets.Lab6;
/**
* ConveyorApp is main class
*/

public class ConveyorApp {
	public static void main(String[] args) {
		Conveyor<Box> boxConveyor = new Conveyor<>();
		boxConveyor.addItem(new Box(10));
		boxConveyor.addItem(new Box(20));
		boxConveyor.addItem(new Box(5));

		Conveyor<Parts> partsConveyor = new Conveyor<>();
		partsConveyor.addItem(new Parts("Car", 10));
		partsConveyor.addItem(new Parts("Computer", 8));
		partsConveyor.addItem(new Parts("Monitor", 3));
		
		Item itBox = boxConveyor.findMin();
		System.out.println(itBox.info());

		Item itPart = partsConveyor.findMin();
		System.out.println(itPart.info());

	}
}
