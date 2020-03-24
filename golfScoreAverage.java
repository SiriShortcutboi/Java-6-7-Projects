package commandLineEcho;

import java.util.*;

public class golfScoreAverage {

	public golfScoreAverage() {
		String username;
		int course1;
		int course2;
		int course3;
		int averageadd;
		int average;
		 Scanner input = new Scanner(System.in);
		 System.out.print("Type your name and press Enter: ");
		 username = input.nextLine();
		 System.out.print("Hello " + username + ". Please tell me your score for Round 1: ");
		 course1 = input.nextInt();
		 System.out.print("Alright " + username + ", Lets get that second score: ");
		 course2 = input.nextInt();
		 System.out.print("And how aboout that third score? ");
		 course3 = input.nextInt();
		 averageadd = (course1 + course2 + course3);
		 average = (averageadd/3);
		 System.out.println(username.toUpperCase() + "! " + "Your golf score average is: " + average + "!");
		 
		 input.close();
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new golfScoreAverage();
	}

}
