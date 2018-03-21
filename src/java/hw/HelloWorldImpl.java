/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;


/**
 *
 * @author tomek.buslowski
 */
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

//@WebService(endpointInterface = "hw.HelloWorld", portName = "TomekPort", serviceName = "TomekSuperWebService", targetNamespace = "TomekSpace")
//@WebService(name="TomekName")
@WebService(endpointInterface = "hw.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    
    @Override
    public List<Product> getProducts(){
        
        List<Product> products = new ArrayList<>();
        
        products.add(new Product("Apples", "for eating", 5));
        products.add(new Product("How to Java", "for reading", 19));
        products.add(new Product("Headphones", "for listening", 100));
        
        return products;
    }

    @Override
    public String getHelloWorldAsString(String name) {
        return "Witaj świecie JAX-WS: " + name;
    }
    
}
