package BuilderPattern;

public class SedanBuilder implements IBuilder{
	private Car car = new Car();
	@Override
	public Car build() {
		return car;
	}
	@Override
	public void buildDoors(int doors) {
		car.setDoors(doors);
	}
	@Override
	public void buildWindows(int windows) {
		car.setWindows(windows);
	}
	@Override
	public void buildTires(int tires) {
		car.setTires(tires);
	}
	@Override
	public void buildEngine(String engine) {
		car.setEngine(engine);
	}

}
