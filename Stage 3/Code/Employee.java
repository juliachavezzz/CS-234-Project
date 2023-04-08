import java.util.Scanner;
import java.util.ArrayList;
public class Employee {
    private int employeeID;
    private String name;
    private String jobTitle;
    private ArrayList<String> workDays;
    private ArrayList<String> services;
    
     public Employee() {
        employeeID=0;
        name="name";
        jobTitle="title";
        workDays= new ArrayList<>();
        services= new ArrayList<>();
    }
    
    public Employee(int id, String _name, String title) {
        employeeID=id;
        name=_name;
        jobTitle=title;
        workDays= new ArrayList<>();
        services= new ArrayList<>();
    }
    
    public void setName(String _name) {
        name=_name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setEmployeeID(int number){
        employeeID=number;
    }
    
    public int getEmployeeID() {
        return employeeID;
    }
    
    public void setJobTitle(String title) {
        jobTitle=title;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }
    
    public void addWorkDays(String day) {
        workDays.add(day);
    }
    
    public ArrayList<String> getWorkDays() {
        return workDays;
    }
    
    public void addServices(String service) {
        services.add(service);
    }
    
    public ArrayList<String> getServices() {
        return services;
    }
}