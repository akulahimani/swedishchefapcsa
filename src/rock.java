import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class rock {

	public static void main(String[] args) { //creating a class
		int x = 1; //create x value
		Scanner scan = new Scanner(System.in); //input scanner
		while (x == 1) { //while loop
			String print = "Do you want to play Rock, Paper, Scissors? (Y/N)";
			System.out.print(print.substring(0,10)); //ask if they want to play Rock, Paper, Scissors
			System.out.println(print.substring(11,48));
			String ready = scan.nextLine(); //take input
				if(ready .equalsIgnoreCase("y")) { //if they say yes
					x++; // add 1 to x to end while loop due to input
					System.out.println("User wants to play rock. Paper, Scissors!"); //tell user you are going to play Rock, Paper, Scissors
					//vArIaBlE iNiTiAlIzAtIoN
					int xx = 0; 
					int Computer_pick= (int) (Math.random() *3 +1);
					String pick = " ";
					int rock = 1;
					int paper = 2;
					int scissors = 3;
					int userpick = 0;
					int AI_pick = 0;
					Rock(xx, Computer_pick, rock, paper, scissors, userpick, AI_pick, pick); //to method Rock with variables
				} else if(ready .equalsIgnoreCase("n")) { // if they dont want to play
					x++; // add 1 to x to end while loop
					System.out.println("User doesn't want to play Rock, Paper, Scissors."); //send to user
					for(int i = 0; i <6; i++) //for loop will run 20 times
					{
							System.out.println("GoodBye");
					}
					
				}else { // if they dont say y or n
					System.out.println("Invalid input!"); //send output
					try { //2 second delay 
							TimeUnit.SECONDS.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					System.out.println("Restarting in......"); //send output
					System.out.println("5..."); //more output
					int y = 4; //creat y as variable
					while(y != 0) {//if y is not equal to 0
						try { // 1 second delay 
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					System.out.println(y + "..."); // print ... after y
					y--; // subtract 1 from y
			
			}//end of if statement
		} 
		}// end of while statement
		System.out.println("Please input a number"); //tell user to input number greater then 10
		int num = scan.nextInt(); //set num = to what they type
		char multiple = '+';//set multiple to + sign (char
		System.out.println("Please input another number"); //ask for a number less then 10
		double num2 = scan.nextDouble();//take number in that is less then 10
		double add = num + num2;//num is int and num2 is a double so its promoted
		double max = Math.max(num, num2);
		System.out.println("Both of the numbers " + multiple + " together are " +  (add)); //add the 2 numbers
		System.out.println("First input subtracted by second number " + (num - num2)); //Subtract the larger number by smaller
		System.out.println("Numbers multiplied together " + (num*num2)); //multiply the 2 numbers
		System.out.println("Number 1 divided by number 2 = " + num/num2); //Divide the 2 numbers
		System.out.println("The number that is greater is "+max);
		scan.nextLine();
		System.out.println("Please enter your favorite month number (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)"); //ask for favorite month number
		String month1 = scan.nextLine(); //take in month number
		int month = Integer.parseInt(month1);
		String monthname; //make string named monthname
		switch(month) { //switch statement found https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
			case 1:  monthname = "January";
			break;
			case 2:  monthname = "February";
			break;
			case 3:  monthname = "March";
			break;
			case 4:  monthname = "April";
			break;
			case 5:  monthname = "May";
			break;
			case 6:  monthname = "June";
			break;
			case 7:  monthname = "July";
			break;
			case 8:  monthname = "August";
			break;
			case 9:  monthname = "September";
			break;
			case 10: monthname = "October";
			break;
			case 11: monthname = "November";
			break;
			case 12: monthname = "December";
			break;
			default: monthname = "Invalid month";
			break;
		}//end switch statement
		System.out.println(monthname); //print month name
		System.out.println("enter a letter and the computer will tell you if its upper case");//ask for a letter
		char thing = scan.next().charAt(0);//take in letter
		boolean isUpperCase;//create boolean method
		isUpperCase = Character.isUpperCase(thing);//test boolean method
		System.out.println( thing + " the letter it uppercase: " + isUpperCase ); //print if the letter is uppercase true/false
		System.out.println("Creating a timer that will go to 20");
		try { //2 second delay 
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int u = 1; u <= 2; u++) {
			for(int y = 0; y <= 9; y++) {
				System.out.print(u-1);
				System.out.println(y);
				try { //1 second delay 
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("20");
	
}
	
	public static void Rock(int x, int Computer_pick, int rock, int paper, int scissors, int userpick, int AI_pick, String pick) {//rock paper scissors method
		Scanner scan = new Scanner(System.in);//new scanner
		Computer_pick = (int) (Math.random() *3 + 1);//casting when i cast truncation occurs which drops the decimal. and mathematical equation
		x = 0;//set x=0
		do {//do while loop
			System.out.println("Welcome to Rock, Paper, Scissors!");//Welcom user
			System.out.println("Please make a pick rock, paper, scissors (please don't use caps)");//ask for users pick
			pick = scan.nextLine();//take in users pick
			if(pick .equalsIgnoreCase("rock")) {//see if user choice was rock
				userpick = 1;//set userpick to 1 if user picked rock
				x++;//exit while loop
			}else if (pick .equalsIgnoreCase("Paper")) {//see if user choice was paper
				userpick = 2;//set userpick to 2 if user picked paper
				x++;//exit while loop
			}else if(pick .equalsIgnoreCase("Scissors")) {//see if user choice was Scissors
				userpick = 3;//set userpick to 3 if user picked scissors
				x++;//exit while loop
			}else {//input not reconized
				System.out.println("Your choice was invalid");//tell user invalid pick
				x= 0;//DO NOT EXIT WHILE LOOP
			}
		}while(x == 0);//while part of do while statement
		if(Computer_pick == rock) {//test if computer picked rock
			System.out.println("Computer picked rock");//tell user that computer picked rock
			AI_pick = 1;//set AI_pick to 1
		}else if (Computer_pick == paper) {//test if computer picked paper
			System.out.println("Computer picked paper");//tell user that computer picked paper
			AI_pick = 2;//set AI_pick to 2
		}else if(Computer_pick == scissors) {//test if computer picked scissors
			System.out.println("Computer picked scissors");//tell user that computer picked scissors
			AI_pick = 3;//set AI_pick to 3
		}
		int k = 0; // set int k to 0
		if(userpick == AI_pick) {//test if user tied with computer(picked same thing)
			System.out.println("You tied");//tell user u tied
			while(k == 0) {//sentinal while loop
				System.out.println("Would you like to play again? (Y/N)");//ask if they want to play again
				String answer = scan.nextLine();//take in answer
				if(answer .equalsIgnoreCase("n")) {//test for no
					k++;//go back to main class
				}else if(answer .equalsIgnoreCase("y")) {//test if yes
					Rock(x, Computer_pick, rock, paper, scissors, userpick, AI_pick, pick);//if yes start over
					k++;//add to k
				}else {
					System.out.println("answer not known ending Rock, Paper, Scissors");//ask again
				}
			}
		}else if(userpick == rock && AI_pick == paper || userpick == paper && AI_pick == scissors || userpick == scissors && AI_pick == rock) {//test to see if you lost
			System.out.println("You lost, better luck next time.");//tell them they lost
			while(k == 0) {//sentinal while loop
				System.out.println("Would you like to play again? (Y/N)");//ask if they want to play again
				String answer = scan.nextLine();//take in answer
				if(answer .equalsIgnoreCase("n")) {//test for no
					k++;//go back to main class
				}else if(answer .equalsIgnoreCase("y")) {//test if yes
					Rock(x, Computer_pick, rock, paper, scissors, userpick, AI_pick, pick);//if yes start over
					k++;//add to k
				}else {
					System.out.println("answer not known ending Rock, Paper, Scissors");//ask again
				}
			}
		}else if(userpick == rock && AI_pick == scissors || userpick == paper && AI_pick == rock || userpick == scissors && AI_pick == paper) {//test to see if they won
			System.out.println("You won.");//tell them they won
			while(k == 0) {//sentinal while loop
				System.out.println("Would you like to play again? (Y/N)");//ask if they want to play again
				String answer = scan.nextLine();//take in answer
				if(answer .equalsIgnoreCase("n")) {//test for no
					k++;//go back to main class
				}else if(answer .equalsIgnoreCase("y")) {//test if yes
					Rock(x, Computer_pick, rock, paper, scissors, userpick, AI_pick, pick);//if yes start over
					k++;//add to k
				}else {
					System.out.println("answer not known ending Rock, Paper, Scissors");//ask again
				}
			}
		}else {
			System.out.println("error");//if something goes wrong
		}
	}	
	
}