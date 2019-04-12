/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class ReservationWorkRequest extends WorkRequest {
   

    private String reminder;

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }
}
