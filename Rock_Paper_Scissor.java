import java.util.Scanner;
import java.util.Random;
class Rock_Paper_Scissor{
		static void checkWiner(int u,int c){
			int userInput=u;
			int computerChoice=c;
			if (userInput==computerChoice) {
			System.out.println("Drow");
			}
			else if ((userInput==0&&computerChoice==2) ||(userInput==1&&computerChoice==0)||(userInput==2&&computerChoice==1)) {
			System.out.println("You Win");
			}
			else if ((userInput==2&&computerChoice==1) ||(userInput==0&&computerChoice==1)||(userInput==1&&computerChoice==2)) {
			System.out.println("You Loss");
			}
			else{
			System.out.println("Error");
			}
		}
		static String Print(int ch){
			if (ch==0) {
			return "Rock";
			}
			else if (ch==1) {
			 return "Paper";
			}
			else if (ch==2) {
			return "Scissor";
			}
			return null;
		}
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		Random ram=new Random();
		System.out.print("Enter your choioce : ");
		String userChoice=scr.nextLine();
		int userInput=-1;
		int computerChoice=ram.nextInt(3);
		if (userChoice.equalsIgnoreCase("Rock")) {
			userInput=0;
			System.out.println("Your choioce "+Print(userInput));
			System.out.println("Computer choice "+Print(computerChoice));
			checkWiner(userInput,computerChoice);
		}
		else if (userChoice.equalsIgnoreCase("Paper")) {
			userInput=1;
			System.out.println("Your choioce "+Print(userInput));
			System.out.println("Computer choice "+Print(computerChoice));
			checkWiner(userInput,computerChoice);
		}
		else if (userChoice.equalsIgnoreCase("Scissor")) {
			userInput=2;
			System.out.println("Your choioce "+Print(userInput));
			System.out.println("Computer choice "+Print(computerChoice));
			checkWiner(userInput,computerChoice);
		}
		else{
			System.out.println("Invalid Choioce");
		}
	}
}