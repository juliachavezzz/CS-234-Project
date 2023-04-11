import java.util.ArrayList;
public class Doctor extends Employee {
    private String medicine;
    
    public Doctor(int id, String _name, String title, String meds) {
        setEmployeeID(id);
        setName(_name);
        setJobTitle(title);
        medicine=meds;
    }
    
    public void prescribeMedicine(String meds) {
        medicine=meds;
    }
    
    public String getMedicineName() {
        return medicine;
    }
}