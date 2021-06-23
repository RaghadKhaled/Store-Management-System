
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ragha
 */
public final class SpecialProducts extends Products{
    private final String nameRelation; private Products[] list;
    
    public SpecialProducts(String nameRelation, Products[] list){
        
        this.nameRelation=nameRelation;
        this.list=new Products[list.length];
        for(int i=0; i<list.length; i++)
            this.list[i]=list[i];
    }

    @Override
    public double getPrice(){
        double prices=0;
        for (Products obj: getList())
            prices+=obj.getPrice();
        return prices;}
    
    public Products[] getList(){
       return list;

    }
    public String getProduct(Products obj){
        return "(In "+obj.getName()+") "+toString();
    }

    public String toString(){
        String str="";
        for(Products obj : list){
            if(obj!=null)
                str+=obj+"\n";
        }

        return "The relation "+nameRelation+" relateds between the following special products\n"+str;
                
    }

}
