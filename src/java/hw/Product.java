/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;

import java.io.Serializable;

/**
 *
 * @author tomek.buslowski
 */
public class Product implements Serializable {
    
        public String name;
        public String desc;
        public int price;
        
        public Product(String n, String d, int p) {
            name = n;
            desc = d;
            price = p;
        }
        
        @Override
        public String toString() {
            return name + " " + desc + " " + price;
        }
}
