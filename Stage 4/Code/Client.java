package ProjectGUI;

import java.util.ArrayList;
public class Client {
    private int clientID;
    private String firstName;
    private String lastName;
    private String animalType;
    
    public Client() {
        clientID = 0;
        firstName="first";
        lastName="last";
        animalType = "type";
    }
    
    public Client(int id, String first, String last, String type) {
        clientID = id;
        firstName=first;
        lastName=last;
        animalType = type;
    }

    public void setClientID(int id) {
        clientID = id;
    }

    public int getClientID() {
        return clientID;
    }
    
    public void setFirstName(String first) {
        firstName=first;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String last) {
        lastName=last;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setAnimalType(String type) {
        animalType = type;
    }

    public String getAnimalType() {
        return animalType;
    }
}