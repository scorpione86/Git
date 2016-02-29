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
public class ListenerView {
     
    private String text;
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
     
    public void handleKeyEvent() {
        text = "You've typed: " + 
                text.length() +
                " characters. Original text: " +
                text +
                ". Upper case: " +
                text.toUpperCase() +
                ". Lower case: " +
                text.toLowerCase()
                ;
    }
}
