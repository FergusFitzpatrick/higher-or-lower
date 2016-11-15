import java.util.Scanner;

public class higherorlower {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		//game variables
		boolean running = true;
		int guess = 0;
		int max = 10000;
		int min = 0;
		int middle = (max+min)/2;
		System.out.println();
		System.out.println("	Higher or Lower");
		System.out.println("Pick a number between 1 and 10,000");
		System.out.println("Reply 'higher' or 'lower' or 'correct'");

		GAME:
		while(running) {
			guess = middle;
			System.out.println("comp. guess: "+guess);
			String input = new String(scan.nextLine());
			if(input.equals("higher")){
				min = middle;
				middle = (max+min)/2;
			}
			else if(input.equals("lower")){
				max=middle;
				middle=(max+min)/2;
			}
			else if(input.equals("correct")){
				break;
			}
			else{
				System.out.println("	**Invalid Input**");
				continue GAME;
			}
		}
		System.out.println();
		System.out.println("Your number is: "+guess);
		System.out.println();
		System.out.println("	GAME OVER");
		System.out.println();
	}
}
