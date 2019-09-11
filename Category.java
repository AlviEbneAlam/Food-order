/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Category {
    String cat_name;
    String cat_description;
    Food [] food=new Food[100];
    int food_count=0;
    public Category(String name,String description){
        cat_name=name;
        cat_description=description;
        
    }
    
}
