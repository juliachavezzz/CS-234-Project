/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGUI;

import java.util.HashMap;

/**
 *
 * @author juliachavez
 */
public class AppointmentList {
    
    private HashMap<Integer, Appointment> appointments;
    private static final String filename = "Appointments.csv";
    private static final String delimiter = ",";
    
    public AppointmentList()
    {
        appointments = new HashMap<>();
    }
    
    public void addAppointment(Appointment anAppointment)
    {
        int id = anAppointment.getAppointmentID();
        appointments.put(id, anAppointment);
    }
   
    
    public void removeAppointment(int id)
    {
        appointments.remove(id);
    }
    
    
    public Appointment getAppointment(int id)
    {
        return appointments.get(id);
    }
    
    public HashMap<Integer, Appointment> getAppointments()
    {
        return appointments;
    }
}
