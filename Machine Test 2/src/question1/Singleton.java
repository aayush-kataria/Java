package question1;

public class Singleton {

	public static Singleton singleton = null;

	private Singleton() {
	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}