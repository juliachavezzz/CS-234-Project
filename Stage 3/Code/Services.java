import java.util.ArrayList;
public class Services{
    private String service;
    private int serviceID;
    private int service_fee;
    
    public Services() {
        serviceID=0;
        service="name";
        service_fee=0;
    }
    
    public Services(int id, String name, int fee) {
        serviceID=id;
        service=name;
        service_fee=fee;
    }
    
    public void setService(String name) {
        service=name;
    }
    
    public String getService() {
        return service;
    }
    
    public void setServiceID(int id) {
        serviceID=id;
    }
    
    public int getServiceID() {
        return serviceID;
    }
    
    public void setServiceFee(int fee) {
        service_fee=fee;
    }
    public int getServiceFee() {
        return service_fee;
    }
}