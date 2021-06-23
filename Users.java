/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ragha
 */
public abstract class Users {
    protected final String name; protected final int ID; private static int counter=1000;
    public Users(String name){
        this.name=name; this.ID=counter++;
    } 
    public int getID(){return ID;}
    public String toString(){
        return  name+"("+ID+")";
    }
}
