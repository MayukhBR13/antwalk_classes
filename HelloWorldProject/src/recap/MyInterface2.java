package recap;

public interface MyInterface2 {
	void m1();
	default void m2() {
		System.out.println("inter2");
	}
}
