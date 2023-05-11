package ProjectGUI;

import java.util.HashMap;
import java.io.*;
import javax.swing.JOptionPane;

public class ServicesList {
    
    private HashMap<Integer, Services> services;
    private static final String filename = "Services.csv";
    private static final String delimiter = ",";
    
    public ServicesList()
    {
        services = new HashMap<>();
    }
    
    public void addService(Services aService)
    {
        int id = aService.getServiceID();
        services.put(id, aService);
    }
   
    
    public void removeService(int id)
    {
        services.remove(id);
    }
    
    
    public Services getService(int id)
    {
        return services.get(id);
    }
    
    public HashMap<Integer, Services> getServices()
    {
        return services;
    }
    
}