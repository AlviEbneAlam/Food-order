/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Waiter extends Common {
    Food [] meal_list=new Food[50];
    int meal_list_count=0;
    String waiter_name;
    int waiter_salary;
    Order o;
    
    public Waiter(){
        
    }
    public Waiter(String name,int salary){
        waiter_name=name;
        waiter_salary=salary;
    }
    public void check_list(){
        for(int i=0;i<category_count;i++){
            System.out.println("no: "+i+"\n"+"Category: "+category[i].cat_name+"\n"+"Description: "+category[i].cat_description);
            for(int j=0;j<category[i].food_count;j++){
                System.out.println("Item no: "+j+"\n"+"Item: "+category[i].food[j].food_name+"\n"+"Item description: "+category[i].food[j].food_description+"\n"+"Price: "+category[i].food[j].food_price);
            }
        }
    }
    public void add_meal(Food f){
        meal_list[meal_list_count]=f;
        
    }
    public void place_order(){
        o=new Order(meal_list,meal_list_count);
        System.out.println("Order added successfully");
    }
    public void show_order(){
        for(int i=0;i<=meal_list_count;i++){
            System.out.print(meal_list[i].food_name+"\n"+meal_list[i].food_price);
        }
    }
}
