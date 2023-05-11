package ProjectGUI;
import java.util.ArrayList;
public class Tech extends Employee {
    private String training;
    
    public Tech(int id, String _name, String title, String _training) {
        setEmployeeID(id);
        setName(_name);
        setJobTitle(title);
        training=_training;
    }
    
    public void neededTraining(String _training) {
        training=_training;
    }
    
    public String getNeededTraining() {
        return training;
    }
}