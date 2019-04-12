/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ServicePackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author sdzh4
 */
public abstract class TimeCaculation {
        public Date CalDate_CurrentTime(int t)
        {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DAY_OF_MONTH, t);
//           SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
//           String date = format.format(Calendar.getInstance().getTime());
            Date date;
            date = cal.getTime();
            return date;
        }
        public String DatePrint(Date date)
        {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String Print = format.format(date);
            return Print;
        }
        public Date CalDate_SetDate(Date date, int t)
        {
                Calendar SetDate = Calendar.getInstance();
                SetDate.setTime(date);
                SetDate.add(Calendar.DAY_OF_MONTH,t);
                Date Result = SetDate.getTime();
                return Result;
        }
        /**
         * 
         * @param a    initial time
         * @param b  expected time
         * @param days   intervals
         * @return  if b-a<days returns true
         */
        public boolean Alert(Date a, Date b, int days)
        {
            Date temp  = CalDate_SetDate(a,days);
            return temp.after(b);
        }
        
         /**
         * 
         * @return  a -b  /Day
         */
        public int DateSubtraction(Date a, Date b)
        {
            long sub = a.getTime() - b.getTime();
            long days = sub/(1000*60*60*24);
             return (int)days;
        }
    
}
