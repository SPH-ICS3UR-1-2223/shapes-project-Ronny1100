package shapes;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int userChoice;
		do {
			System.out.println("1. Make a shape");
			System.out.println("2. Change a shape");
			System.out.println("3. View a shape");
			System.out.println("4. Quit");
			userChoice=in.nextInt();
			if (userChoice==1) {
				System.out.println("Make a shape!");
			}
		}while (userChoice!=4);
		
	}
}
