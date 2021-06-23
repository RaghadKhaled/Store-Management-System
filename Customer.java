/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ragha
 */
public final class Customer extends Users {
    private String stateCustomer;
    private int counterVisit=0;
    public Customer(String name){
        super(name);
        stateCustomer=times();
    }
    public void updateCustomer(){ this.counterVisit++; stateCustomer=times();}
    public String times(){
       String c="";
       if (counterVisit<=2)
           c="New customer";
       else
           c="Special customer";
       
       return c;
    }
    @Override
    public String toString(){
        return stateCustomer+": "+super.toString()+" visits "+counterVisit+" time(s).";
        
        
    }
}
