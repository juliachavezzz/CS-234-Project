import java.util.ArrayList;
public class Appointment
{
  private int appointmentID;
  private int serviceID;
  private int clientID;
  private int doctor;
  private String day;
  private String time;
  
  public Appointment() {
    appointmentID=0;
  }
  
  public Appointment (int id)
  {
    appointmentID = id;
  }
  
  public void setAppointmentID(int id) {
    appointmentID=id;
  }
  
  public int getAppointmentID() {
    return appointmentID;
  }
    
  public void pickServiceID (int id)
  {
    serviceID = id;
  }

  public int chosenServiceID ()
  {
    return serviceID;
  }

  public void pickClientID (int client)
  {
    clientID = client;
  }

  public int chosenClientID ()
  {
    return clientID;
  }

  public void pickEmployee (int employee)
  {
    doctor = employee;
  }

  public int chosenEmployee ()
  {
    return doctor;
  }

  public void pickDay (String _day)
  {
    day = _day;
  }

  public String chosenDay ()
  {
    return day;
  }

  public void pickHour (String hour)
  {
    time = hour;
  }

  public String chosenHour ()
  {
    return time;
  }
}
