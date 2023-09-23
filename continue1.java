public class continue1 {
	public static void main(String[] args) {
				for (int i = 0; i < 10; i++) {
					// Terminate the loop when i is 5
					if (i == 5)
						continue;
					System.out.println("i: " + i);
				}
	}
}
