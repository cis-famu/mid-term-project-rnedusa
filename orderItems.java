/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itzgo
 */
class orderItems {
        private String  appetizerItem, entreeItem, dessertItem, beverageItem, quantity;

    public orderItems(String appetizerItem, String entreeItem, String dessertItem, String beverageItem, String quantity) {
        this.appetizerItem = appetizerItem;
        this.entreeItem = entreeItem;
        this.dessertItem = dessertItem;
        this.beverageItem = beverageItem;
        this.quantity = quantity;
    }

    public String getAppetizerItem() {
        return appetizerItem;
    }

    public void setAppetizerItem(String appetizerItem) {
        this.appetizerItem = appetizerItem;
    }

    public String getEntreeItem() {
        return entreeItem;
    }

    public void setEntreeItem(String entreeItem) {
        this.entreeItem = entreeItem;
    }

    public String getDessertItem() {
        return dessertItem;
    }

    public void setDessertItem(String dessertItem) {
        this.dessertItem = dessertItem;
    }

    public String getBeverageItem() {
        return beverageItem;
    }

    public void setBeverageItem(String beverageItem) {
        this.beverageItem = beverageItem;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    
}
