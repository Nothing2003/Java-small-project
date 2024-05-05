import java.util.Scanner;
import java.util.Random;
class NumberGussingGame{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		Random ram=new Random();
		int computerChoice=ram.nextInt(100);
		int userInput=-1;
		do{
			System.out.print("Enter your choioce : ");
			userInput=scr.nextInt();
			if (userInput==computerChoice) {
			System.out.println("You Win");	
			}
			else if (userInput<computerChoice) {
				System.out.println("Slow low");
			}
			else if (userInput>computerChoice) {
				System.out.println("Slow High");
			}

		}while(computerChoice!=userInput);
	}
}