/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author MMaher
 */
public class Controller implements ActionListener  {

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        
        switch(actionCommand) {
            case "Load File":
                loadFile();
                    break;
            case "Save File":
                saveFile();
                    break;
            case "Creat New Invoice":
                createNewInvoice();
                    break;
            case "Delete Invoce":
                deleteInvoice();
                    break;
            case "Creat New Item":
                createNewItem();
                    break;
            case "Delete Item":
                deleteItem();
                    break;        
        }
    
    }

    private void loadFile() {
        
    }

    private void saveFile() {
        
    }

    private void createNewInvoice() {
        
    }

    private void deleteInvoice() {
        
    }

    private void createNewItem() {
        
    }

    private void deleteItem() {
        
    }
    
}
