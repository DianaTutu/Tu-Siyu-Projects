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
public class DonationRequest extends WorkRequest{
    
    private Double donationmoney;

    public Double getDonationmoney() {
        return donationmoney;
    }

    public void setDonationmoney(Double donationmoney) {
        this.donationmoney = donationmoney;
    }

    @Override
    public  String toString(){
        return this.getSender().getPerson().getName();
    }
  
    
    
}
