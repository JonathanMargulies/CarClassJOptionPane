import javax.swing.JOptionPane;
public class CarDriver {
	public static void main(String [] args) {
		System.out.println("Number of Cars registered: " + Car.getCount());
		String color = JOptionPane.showInputDialog(null, "Enter Color of Car.");
		int horsePower = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Horse Power of Car."));
		double engineSize = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Engine Size of Car."));
		String make = JOptionPane.showInputDialog(null, "Enter make of Car.");

		Car myCar = new Car(color, horsePower, engineSize, make);
		JOptionPane.showMessageDialog(null, "myCar information: " + " " + myCar.getColor() + " " + myCar.getHorsePower() + " " + myCar.getEngineSize() + " " + myCar.getMake());
		System.out.println("Number of Cars registered: " + Car.getCount());

		String color2 = JOptionPane.showInputDialog(null, "Enter Color of Car.");
		int horsePower2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Horse Power of Car."));
		double engineSize2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Engine Size of Car."));
		String make2 = JOptionPane.showInputDialog(null, "Enter make of Car.");

		Car hisCar = new Car(color2, horsePower2, engineSize2, make2);
		JOptionPane.showMessageDialog(null, "hisCar information: " + hisCar.getColor() + " " + hisCar.getHorsePower() + " " + hisCar.getEngineSize() + " " + hisCar.getMake());
		System.out.println("Number of Cars registered: " + Car.getCount());

		String color3 = JOptionPane.showInputDialog(null, "Enter Color of Car.");
		int horsePower3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Horse Power of Car."));
		double engineSize3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Engine Size of Car."));
		String make3 = JOptionPane.showInputDialog(null, "Enter make of Car.");
		Car herCar = new Car(color3, horsePower3, engineSize3, make3);
		JOptionPane.showMessageDialog(null, "herCar information: " + herCar.getColor() + " " + herCar.getHorsePower() + " " + herCar.getEngineSize() + " " + herCar.getMake());
		System.out.println("Number of Cars registered: " + Car.getCount());
		Car theirCar = new Car("White", 123, 1.0, "Honda");


		//myCar.setColor("Blue"); myCar.setHorsePower(650); myCar.setEngineSize(6.5); myCar.setMake("Ferrari");
		//hisCar.setColor("Blue"); hisCar.setHorsePower(650); hisCar.setEngineSize(6.5); hisCar.setMake("Ferrari");
		//herCar.setColor("Blue"); herCar.setHorsePower(650); herCar.setEngineSize(6.5); herCar.setMake("Ferrari");

		//System.out.println(myCar.getColor() + " " + myCar.getHorsePower() + " " + myCar.getEngineSize() + " " + myCar.getMake());
		//System.out.println(hisCar.getColor() + " " + hisCar.getHorsePower() + " " + hisCar.getEngineSize() + " " + hisCar.getMake());
		//System.out.println(herCar.getColor() + " " + herCar.getHorsePower() + " " + herCar.getEngineSize() + " " + herCar.getMake());
		//System.out.println("Number of Cars registered: " + Car.getCount());
	
		System.out.println("True/False: is myCar the same as theirCar? " + myCar.equals(theirCar));
	}
}
