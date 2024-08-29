package BuilderPattern;

public class Car implements IVehicle{

	private int doors;
	private int windows;
	private int tires;
	private String engine;
	
	@Override
	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public void setTires(int tires) {
		this.tires = tires;
	}

	@Override
	public void setWindows(int windows) {
		this.windows = windows;
	}

	@Override
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	@Override
	public String toString()
	{
		return "Engine: " + this.engine + ", Doors: " + this.doors + ", Windows: " + this.windows + ", Tires: " + this.tires;
	}
}
