/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author tusiyu
 */
public class EmergencyRequest extends WorkRequest {
    @Override
    public String toString (){
        return this.getSender().getUsername();
    }
}
