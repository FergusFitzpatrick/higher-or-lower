/*
* Author Fergus Fitzpatrick
*
* Date 15-11-16
*/
import java.util.Scanner;

public class higherorlower {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		//game variables
		boolean running = true;
		int guess = 0;
		int max = 100; //can do any number up to Integer.MAX_VALUE. For user experience. I think 100 is fine.
		int min = 0;
		int middle = (max+min)/2;
		System.out.println();
		System.out.println("	Higher or Lower");
		System.out.println("Pick a number between 1 and "+ max);
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
			if ( max == min){
				System.out.println(max+" must be your number!");
				break;
			}
		}
		System.out.println();
		System.out.println("Your number is: "+guess);
		System.out.println();
		System.out.println("	GAME OVER");
		System.out.println();
	}
}
