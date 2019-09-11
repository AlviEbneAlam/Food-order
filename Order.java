/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Order {
    public static int total_price;
    //Food [] food=new Food[100];
    //int order_count;

    Order(Food [] f,int p) {
       for(int i=0;i<=p;i++){
        total_price+=f[i].food_price;
       }
    }
    
}
