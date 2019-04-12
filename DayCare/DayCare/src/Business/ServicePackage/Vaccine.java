/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ServicePackage;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sdzh4
 */
public abstract class Vaccine extends TimeCaculation{
        private String Name;
        private String Description;
        private int Interval;
        private int InoculationTImes;
        private Date Dateofinoculation;
        private int NumberofInoculationtimes;
        private int flag=0; //Display
        
        private ArrayList<Date> InoculationCalendar;
        public ArrayList<Date> getInoculationCalendar(  int InoculationTImes,Date Dateofinoculation, int NumberofInoculationtimes)
        {                        
                 ArrayList<Date> Result = new ArrayList<Date>();
                for(int i = NumberofInoculationtimes+1; i<=InoculationTImes; i++)
                {
                    Date temp;
                    int times = i-NumberofInoculationtimes;
                    temp =CalDate_SetDate(Dateofinoculation,times*Interval) ;
                    Result.add(temp);
                }
                return Result;
          }
        public ArrayList<Date> getAlertItem( ArrayList<Date> InoculationCalendar,  int days)
        {
            ArrayList<Date> Result = new ArrayList<Date>();
            for(Date r:InoculationCalendar)
            {
                if(Alert(r,  new Date(),  days))
                {
                    Result.add(r);
                }
            }
            return Result;
        }
       //  public abstract void AlertAction();

    
    public ArrayList<Date> getInoculationCalendar()
       {                        
                 ArrayList<Date> Result = new ArrayList<Date>();
                for(int i = NumberofInoculationtimes+1; i<=InoculationTImes; i++)
                {
                    Date temp;
                    int times = i-NumberofInoculationtimes;
                    temp =CalDate_SetDate(Dateofinoculation,times*Interval) ;
                    Result.add(temp);
                }
                return Result;
          }
    
          public int getLeftdays(Date now)
          {
              ArrayList<Date> temp = getInoculationCalendar();
              Date date = temp.get(0);
              return DateSubtraction(date,now);
          }
    
        public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setInterval(int Interval) {
        this.Interval = Interval;
    }

    public void setInoculationTImes(int InoculationTImes) {
        this.InoculationTImes = InoculationTImes;
    }

    public void setDateofinoculation(Date Dateofinoculation) {
        this.Dateofinoculation = Dateofinoculation;
    }

    public void setNumberofInoculationtimes(int NumberofInoculationtimes) {
        this.NumberofInoculationtimes = NumberofInoculationtimes;
    }

    public Date getDateofinoculation() {
        return Dateofinoculation;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
        
        

        
    
}
