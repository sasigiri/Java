package week3.Day1;

public class Desktop extends Computer {

	public void desktopSize() {
		int desktopSize = 15;
		System.out.println("Desktop size is " + desktopSize);
	}

	public static void main(String[] args) {
		Desktop system = new Desktop();
		system.computerModel();
		system.desktopSize();

	}

}
