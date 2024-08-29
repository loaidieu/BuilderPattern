package BuilderPattern;

public class Driver {

	public static void main(String[] args) {
		SedanBuilder builder = new SedanBuilder();
		builder.buildDoors(4);
		builder.buildEngine("V6 turbo");
		builder.buildTires(4);
		builder.buildWindows(4);
		Car car = builder.build();
		Print.print(car);
	}

}
