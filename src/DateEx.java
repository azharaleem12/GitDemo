import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Date d=new Date();
               SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
               // SimpleDateFormat sdf=new SimpleDateFormat();
                System.out.println(sdf.format(d));
                System.out.println(d);
	}

}

/*
 For Accessing the calendar feature in your prog
 Calendar cal= Calendar.getInstance();
 SimpleDateFormat sdf=new SimpleDateFormat();
 System.out.println(sd.format(cal.getTime()));
 */
