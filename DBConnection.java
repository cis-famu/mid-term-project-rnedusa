
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author itzgo
 */
public class DBConnection {
    //Database connection variable. It is shared with any class that inherits from this class
    protected static Firestore db;
    
	//constructor
	//throws file and IO exceptions from attempting to open the credential file
    public DBConnection() {
		
		//Your project id
        String projectId = "food-delivery-9d3e0";
		
		//Open the credential json file 
        FileInputStream serviceAccount;
        try{
            serviceAccount = new FileInputStream("food-delivery-9d3e0-8db54957e352.json");

            //set up database connection
            FirestoreOptions firestoreOptions;
            firestoreOptions = FirestoreOptions.getDefaultInstance().toBuilder()
                    .setProjectId(projectId)
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

		//connect to database
            db = firestoreOptions.getService();
        }
        catch(IOException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
