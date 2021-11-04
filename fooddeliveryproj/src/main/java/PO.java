
import com.sun.xml.txw2.annotation.XmlAttribute;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itzgo
 */
public class PO {
    private @XmlAttribute Date submitted;
    private final @XmlAttribute int confirmationNo;
    private Address deliveryAddress;
    private ArrayList<orderItems> order;
    private String paymentType;

    /**
     *
     * @param submitted
     * @param confirmationNo
     * @param deliveryAddress
     * @param order
     * @param paymentType
     */
    public PO(Date submitted, int confirmationNo, Address deliveryAddress, ArrayList<orderItems> order, String paymentType) {
        this.submitted = submitted;
        this.confirmationNo = confirmationNo;
        this.deliveryAddress = deliveryAddress;
        this.paymentType = paymentType;
    }

    PO(int confirmationNo, Date submitted, Address deliveryAddress, Address billingAddress, ArrayList<orderItems> order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    PO(int id, int confirmationNo, Date submitted, Address deliveryAddress, Address billingAddress, ArrayList<orderItems> order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    PO(int confirmationNo, Date submitted, Address deliveryAddress, Address billingAddress, String paymentType, ArrayList<orderItems> order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public Date getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Date submitted) {
        this.submitted = submitted;
    }


    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public ArrayList<orderItems> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<DeliveryItems> order) {
        this.order = order;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    
    
}
