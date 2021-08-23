package question1;

class Singleton implements Cloneable{
	public static Singleton singleton = null;

	private Singleton() {
	}

	public static synchronized Singleton getSingletonObject() {
		if (singleton == null) {
			if(singleton==null) {
				singleton = new Singleton();
			}
		}
		return singleton;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}

public class ClonningProblem {
	
	public static void main(String[] args) {
		Singleton singleton=Singleton.getSingletonObject();
		
		try {
			singleton.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
