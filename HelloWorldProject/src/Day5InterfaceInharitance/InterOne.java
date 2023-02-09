package Day5InterfaceInharitance;

public interface InterOne {
	void show();
	default void welcomeMsg() {
		System.out.println("Welcome");
	}
	static int cube(int x) {
		return x*x*x;
	}
}
