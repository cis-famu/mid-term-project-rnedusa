/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itzgo
 */
public class paymentType {
    private Address billingAddress;
    private String name;
    private int cardNumber;
    private int cvv;
    private int zipCode;

    public paymentType(Address billingAddress, String name, int cardNumber, int cvv, int zipCode) {
        this.billingAddress = billingAddress;
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.zipCode = zipCode;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
    
    
}
