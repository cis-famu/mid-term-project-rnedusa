
import java.util.ArrayList;

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
    
    private @XmlAttribute int id;
    private @XmlAttribute Date submitted;
    private @XmlAttribute int customerId;
    private Address deliveryAddress;
    private ArrayList<DeliveryItems> order;
    private String paymentType;
    
    
}
