/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ragha
 */
public class Products {
   private final String name; private final int ID; private final double price; private static int counter=0;
   
   public Products(){this(null,0.0);}
   public Products(String name, double price){
       this.name=name; this.ID=counter++; this.price=price;
   }
   public String getName(){return name;}
   public double getPrice(){return price;}
   public int getID(){ return ID;}
   public String toString(){
       return "Product("+ID+") : "+name+" costs "+price+" SR.";
   }
}
