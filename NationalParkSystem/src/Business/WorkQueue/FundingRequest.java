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
public class FundingRequest extends WorkRequest{
    
    private  double funding;

    public double getFunding() {
        return funding;
    }

    public void setFunding(double funding) {
        this.funding = funding;
    }
    
    @Override
    public String toString(){
        return this.getMessage();
    }
    
}
