/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author senafunakubo
 */
    public class TestPizza {
        
       public static void main(String[] args) 
       {
         Pizza testPizza = new Pizza();
         testPizza.setToppings("pepperoni");
         testPizza.setDiameter(12);
         testPizza.setPrice(13.99);
        
        System.out.println(testPizza.getToppings());
        System.out.println(testPizza.getDiameter());
        System.out.println(testPizza.getPrice());

       }
    
    }
