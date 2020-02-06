/*
Holden Anderson
2/20
Countdown BoomerTimerSoundStartupSecond
*/

//imports
import java.util.Calendar;
import java.awt.Toolkit;

public class BoomerTimerSoundStartupSecond{
//constructor

	public BoomerTimerSoundStartupSecond(){
		Calendar x = Calendar.getInstance();
		x.add(Calendar.SECOND, 1);
		while (true){
				Calendar time = Calendar.getInstance();
				int check = time.compareTo(x);
				if (check == 0){
						break;
				}		
		
		}
		Runnable sound1 = (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.start");
		sound1.run();
		x = Calendar.getInstance();
		x.add(Calendar.SECOND, 1);
	}
		
	public static void main(String[] args){
		new BoomerTimerSoundStartupSecond();
	}
	
}	