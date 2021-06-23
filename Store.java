/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ragha
 */
public final class Store {
    private final String name; private Products[] list; private static int counter=0;
    
    public Store(String name, int size){
        
        this.name=name;
        this.list = new Products[size];
    }
    public boolean isExist(Products obj){
        for (int i=0; i<list.length;i++)
            if(list[i] == obj)
                return true;
        return false;
                   
    }
    public void addProduct(Products obj){
        if(counter<list.length){
            list[counter]=obj;
            counter++;
            System.out.println("Successfully add ");
        }
        else
            System.out.println("Sorry, cannot add "+obj.getName());
                    
    

    }
    public void removeProduct(Products obj){
        if(isExist(obj)){
            for(int i=0;i<list.length;i++){
                if(list[i]==obj){
                    list[i]=null;
                    if( i==(counter-1))//last index 
                       counter--;
                    else  //middle index or fist
                    {
                        for(int j=i;j<counter-1;j++)
                            list[j]=list[j+1];
                        list[counter-1]=null;
                        counter--;
                    }
                
                }
                    }
        }
        else
            System.out.println("Sorry, "+obj.getName()+" can not removed becuse it is not exist");
    }
    
    public double totalPrice(Products[] list2, Customer person){
        double total=0;
        for(Products obj : list2)
             total+=obj.getPrice();

            if(person.times().equals("Special customer")){
             return (total-((total*25)/100));}
        return total;  
    }
    
    public static int getCounter(){return counter;}//we need in method remove test
    public Products[] getList(){return list;}//we need in method remove test
    
    public void buy(Products[] list2, Customer person){
        boolean operationBuy=false;
        for(Products obj: list2)
            if(isExist(obj)==false){
                operationBuy=true;
            System.out.println("Sorry the product "+obj.getName()+" does not exist");}
        if(operationBuy==false){
            person.updateCustomer();
            System.out.println(person);
            System.out.println("bought : ");
            for(Products obj: list2){
                System.out.println(obj);
                removeProduct(obj);
                }
            
        if(person.times().equals("Special customer"))
            System.out.println("(After discount) with total price: "+totalPrice(list2,person)+" SR.");
            else
            System.out.println("with total price: "+totalPrice(list2,person)+" SR.");}
        
        
    }

    public String toString(){
        
        String str="";
        for(Products obj : list)
            if(obj!=null){
                if (obj instanceof SpecialProducts)
                    str+=((SpecialProducts)obj).toString()+"\n";
                else
                str+=obj.toString()+"\n";}
        
        return name+" Store\nIt contains "+counter+" product(s)\n"+str;
              }
    
    public boolean Remove(int ID){
        for(Products obj : list)
            if (obj !=null){
                if(obj.getID()==ID){
                removeProduct(obj);
                return true;}}
       return false;
    
    }
}
