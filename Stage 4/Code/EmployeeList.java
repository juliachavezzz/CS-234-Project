package ProjectGUI;

import java.util.HashMap;
import java.io.*;
import javax.swing.JOptionPane;

public class EmployeeList {
    
    private HashMap<Integer, Employee> employees;
    private static final String filename = "Employees.csv";
    private static final String delimiter = ",";
    
    public EmployeeList()
    {
        employees = new HashMap<>();
    }
    
    public void addEmployee(Employee anEmployee)
    {
        int id = anEmployee.getEmployeeID();
        employees.put(id, anEmployee);
    }
   
    
    public void removeEmployee(int id)
    {
        employees.remove(id);
    }
    
    
    public Employee getEmployee(int id)
    {
        return employees.get(id);
    }
    
    public HashMap<Integer, Employee> getEmployees()
    {
        return employees;
    }
    
}