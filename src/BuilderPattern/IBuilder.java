package BuilderPattern;

public interface IBuilder {
	public void buildDoors(int doors);
	public void buildWindows(int windows);
	public void buildTires(int tires);
	public void buildEngine(String engine);
	public Car build();
}
