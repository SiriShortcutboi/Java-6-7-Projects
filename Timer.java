/*
Holden Anderson
2/20
Countdown Timer
*/

//imports
import java.util.Calendar;
import java.awt.Toolkit;

public class Timer{
//constructor

	public Timer(){
		Calendar x = Calendar.getInstance();
		x.add(Calendar.MINUTE, 1);
		while (true){
				Calendar time = Calendar.getInstance();
				int check = time.compareTo(x)
				System.out.println(check);
		}		
		
	}
	
	public static void main(String[] args){
		new Timer();
	}
	
}	