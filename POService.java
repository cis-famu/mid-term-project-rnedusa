


import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import javax.jws.WebParam;
import javax.jws.WebResult;
import static org.glassfish.jersey.internal.inject.Bindings.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itzgo
 */
public class POService {
    
    private final ArrayList<orderItems> order;

    public POService extends DBConnection() {
        super();
        this.order = new ArrayList();
      
    }
    
    public ArrayList<orderItems> all(){
        return order;
    }
       
    public List<PO> all() throws InterruptedException, ExecutionException {
	List<PO> results = new ArrayList<>();
  
	// asynchronously retrieve all users
	ApiFuture<QuerySnapshot> query = db.collection("PurchaseOrder").get();
	
	// query.get() blocks (stops other processes from excuting) on response 
	// call to firebase
	QuerySnapshot querySnapshot = query.get();
	
	//getting the result set 
	List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
   
        //loop over result set and add them to list
        documents.forEach(document -> {
            results.add(document.toObject(PO.class));
        });
	
	return results;
}
    
    public PO findById(int confirmationNo) throws InterruptedException, ExecutionException{
    
	//refernce to the collection(table)
	CollectionReference  po = db.collection("PurchaseOrder");
	//query where clause
	com.google.cloud.firestore.Query query = po.whereEqualTo("confirmation number", confirmationNo);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(PO.class);

  
  return null;
}
    
    public ArrayList<PO> findBySubmitted(Date submitted) throws InterruptedException, ExecutionException{
    
	ArrayList<PO> resultList = new ArrayList<>();
   
	CollectionReference  po = db.collection("PurchaseOrder");
	com.google.cloud.firestore.Query query = po.whereEqualTo("submitted", submitted);
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	
        documents.forEach(document -> {
            resultList.add(document.toObject(PO.class));
        });
   
   return resultList;
}
    
    /**
     *
     * @param confirmationNo
     * @param deliveryAddress
     * @param billingAddress
     * @param paymentType
     * @param order
     * @return
     * @throws ParseException
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public String createPurchaseOrder(int confirmationNo, Address deliveryAddress, Address billingAddress, String paymentType, ArrayList<orderItems>order ) throws ParseException, InterruptedException, ExecutionException{
  
	//create date format that doesn't include time
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
	//get the current date as a string
	String now = formatter.format(new Date(System.currentTimeMillis()));

	//create submitted date
	Date submitted = formatter.parse(now);
  
	// create instance of Random class
	Random rand = new Random();

	// Generate random integers in range 0 to 9999
	int id = rand.nextInt(10000);
	
	
	//create purchase order
	PO newPO = new PO(confirmationNo, submitted, deliveryAddress, billingAddress, paymentType, order);
	//save values to database
	ApiFuture<DocumentReference> future = db.collection("PurchaseOrder").add(newPO);
	
	//retrieve newly created document(row)
	DocumentReference doc = future.get();
   
    //return the document id;
	return doc.getId();
	
 
}
    
    public String createPurchaseOrder(int confirmationNo, Address deliveryAddress, Address billingAddress, String paymentType, ArrayList<orderItems>order ) throws ParseException, InterruptedException, ExecutionException{
  
	//create date format that doesn't include time
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
	//get the current date as a string
	String now = formatter.format(new Date(System.currentTimeMillis()));

	//create submitted date
	Date submitted = formatter.parse(now);
  
	// create instance of Random class
	Random rand = new Random();

	// Generate random integers in range 0 to 9999
	int id = rand.nextInt(10000);
	
	
	//create purchase order
	PO newPO;
        newPO = new PO(confirmationNo, submitted, deliveryAddress, billingAddress, paymentType, order);
	//save values to database
	ApiFuture<DocumentReference> future = db.collection("PurchaseOrder").add(newPO);
	
	//retrieve newly created document(row)
	DocumentReference doc = future.get();
   
    //return the document id;
	return doc.getId();
	
 
}
    
    @WebResult(name="objectId")
    public String createPurchaseOrder (@WebParam(name="confirmationNo") int confirmationNo,
                                        @WebParam(name="deliveryAddress") Address deliveryAddress,
                                        @WebParam(name="billingAddress") Address billingAddress,
                                        @WebParam(name="paymentType") String paymentType,
                                        @WebParam(name="order") ArrayList<orderItems> order) throws ParseException, InterruptedException, ExecutionException
    {
    
        return service.createPurchaseOrder(confirmationNo, deliveryAddress, billingAddress, order);
    }

}
