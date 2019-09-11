/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Cashier {
    String name;
    int salary;
    public Cashier(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public Cashier(){
        
    }
    
    public void check_earnings(){
        System.out.println("Total order price: "+"\n"+Order.total_price);
    }
}
