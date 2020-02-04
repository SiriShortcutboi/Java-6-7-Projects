/*
Holden Anderson
2/20
Countdown TimerTimer
*/

//imports
import java.util.Calendar;
import java.awt.Toolkit;

public class TimerTimer{
//constructor

	public TimerTimer(){
		Calendar x = Calendar.getInstance();
		x.add(Calendar.MINUTE, 1);
		while (true){
				Calendar time = Calendar.getInstance();
				int check = time.compareTo(x);
				if (check == 0){
						break;
				}		
		
		}
		Runnable sound1 = (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.default");
		sound1.run();
		x = Calendar.getInstance();
		x.add(Calendar.MINUTE, 1);
	}
		
	public static void main(String[] args){
		new TimerTimer();
	}
	
}	