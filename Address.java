/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itzgo
 */
public class Address {
       
private String id;
private String company;
private String street1;
private String street2;
private String city;
private String state;
private String postalCode;


    public Address() {
        
    }
    public Address(String id, String company, String street1, String street2, String city, String state, String postalCode){
	this.id = id;
	this.company = company;
	this.street1 = street1;
	this.street2 = street2;
	this.city = city;
	this.state = state;
	this.postalCode = postalCode;

}

    Address(String abc, String orlando, String fl, String string, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public void setId(String id){
	this.id = id;
}

public void setCompany(String company){
	this.company = company;
}

public void setStreet1(String street1){
	this.street1 = street1;
}
	
public void setStreet2(String street2){
	this.street2 = street2;
}
	
public void setCity(String city){
	this.city = city;
}
	
public void setState(String state){
	this.state = state;
}
	
public void setPostalCode(String postalCode){
	this.postalCode = postalCode;
}
	
	
public String getId() {return id;}
public String getCompany() {return company;}
public String getStreet1() {return street1;}
public String getStreet2() {return street2;}
public String getCity() {return city;}
public String getState() {return state;}
public String getPostalCode() {return postalCode;}


}
