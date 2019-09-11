/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Admin extends Common{
    Waiter [] waiter=new Waiter[100];
    int waiter_count;
    Cashier [] cashier=new Cashier[100];
    int cashier_count;
    
    public void add_category(String name,String description){
        category[category_count]=new Category(name,description);
        category_count++;
    }
    public void add_food(Category c,String name,String description,int price){
        int count=c.food_count;
        c.food[count]=new Food(name,description,price);
        c.food_count++;
    }
    public void add_waiter(String name,int salary){
        waiter[waiter_count]=new Waiter(name,salary);
        waiter_count++;
    }
    public void add_cashier(String name,int salary){
        cashier[cashier_count]=new Cashier(name,salary);
        cashier_count++;
    }
}
