package recap;

public interface MyInterface {
	void m1();
	default void m2() {

		System.out.println("inter1");
	}
}
