
import java.util.ArrayList;
import java.util.Date;
import sun.jvm.hotspot.debugger.Address;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itzgo
 */
public class foodOrder {
    
    private int confirmationNo;
    private Date deliveryDate;
    private Address deliveryAddress, billingAddress;
    private String paymentType;
    private ArrayList<orderItems> order;
    private double tax;
    private double totalCost;
    
    
public foodOrder (){
    
}    

    public foodOrder(double tax, double totalCost) {
        this.tax = tax;
        this.totalCost = totalCost;
    }


public class orderItems {
    private String  appetizerItem, entreeItem, dessertItem, beverageItem, quantity;

    
    public orderItems() {
         }
   }

    public foodOrder(int confirmationNo, Date deliveryDate, Address deliveryAddress, Address billingAddress, int paymentType, int order) {
        this.confirmationNo = confirmationNo;
        this.deliveryDate = deliveryDate;
        this.deliveryAddress = deliveryAddress;
        this.billingAddress = billingAddress;
        
    }

    public foodOrder(String paymentType) {
        this.paymentType = paymentType;
    }

    public foodOrder(ArrayList<orderItems> order) {
        this.order = order;
    }

    public int getConfirmationNo() {
        return confirmationNo;
    }

    public void setConfirmationNo(int confirmationNo) {
        this.confirmationNo = confirmationNo;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    
    }

    public ArrayList<orderItems> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<orderItems> order) {
        this.order = order;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }


    
}
