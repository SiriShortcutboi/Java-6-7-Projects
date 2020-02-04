import java.util.Calendar;

/*
Holden Anderson
2/20
ShowTime activity
program will show current system time
*/

//Class declaration
public class ShowTime{
	//constructor
	public ShowTime(){
		System.out.println(Calendar.getInstance().getTime());
	}

	//main entry point
	public static void main(String[] args){
		new ShowTime();
	}	


}
