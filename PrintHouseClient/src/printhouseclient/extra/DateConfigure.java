package printhouseclient.extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateConfigure {
    public static String getDateDifference(String date1){
        try{
            date1=date1.substring(0, 19);
            System.out.println("Submision date"+date1);
            Date date2=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/M/dd hh:mm:ss");
        Date changedate1=simpleDateFormat.parse(date1);
        
            System.out.println("Current time"+date2+"anther date "+changedate1);
      long diff=changedate1.getTime()-date2.getTime();
            long diffminutes=TimeUnit.MILLISECONDS.toMinutes(diff)%60;
            long diffhurs=TimeUnit.MILLISECONDS.toHours(diff)%24;
            long diffdays=TimeUnit.MILLISECONDS.toDays(diff);
            System.out.println("days :"+diffdays+" hours :"+diffhurs+" minutes :"+diffminutes);
            return String.valueOf(diffdays)+" Day(s) "+String.valueOf(diffhurs)+" Hour(s) "+String.valueOf(diffminutes)+" Minute(s) ";
        }catch(ParseException px){
            System.out.println(px.getMessage());
        }
        return null;
    }
}
