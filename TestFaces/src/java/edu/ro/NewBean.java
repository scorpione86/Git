/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ro;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author victor
 */
@ManagedBean
@RequestScoped
public class NewBean {

    String name;
    String message="Hello";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Creates a new instance of NewBean
     */
    public NewBean() {
    }
    
    public String sayHello()
    {
        message= "Hello " + name;
        return null;
    }
    
}
