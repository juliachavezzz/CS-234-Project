package ProjectGUI;

import java.util.HashMap;
import java.io.*;
import javax.swing.JOptionPane;

public class ClientList {
    
    private HashMap<Integer, Client> clients;
    private static final String filename = "Clients.csv";
    private static final String delimiter = ",";
    
    public ClientList()
    {
        clients = new HashMap<>();
    }
    
    public void addClient(Client aClient)
    {
        int id = aClient.getClientID();
        clients.put(id, aClient);
    }
   
    
    public void removeClient(int id)
    {
        clients.remove(id);
    }
    
    
    public Client getClient(int id)
    {
        return clients.get(id);
    }
    
    public HashMap<Integer, Client> getClients()
    {
        return clients;
    }
    
}