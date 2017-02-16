package pack;

public class SingleObject {

	private static SingleObject instance = new SingleObject();

	private SingleObject() {
	};

	public static SingleObject getInstance() {

		return instance;

	}

	public void showMessage(String name) {

		System.out.println("Hello " + name + " !");

	}

}
