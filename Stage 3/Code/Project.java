import java.util.Scanner;
import java.util.ArrayList;
public class Project
{
    public static void menu(ArrayList clients,ArrayList employees,ArrayList services,ArrayList appointments)
    {
        // setup menu
        System.out.println("MAIN MENU");
        System.out.println("1. Clients ");
        System.out.println("2. Employees ");
        System.out.println("3. Services ");
        System.out.println("4. Appointments ");
        System.out.println("5. Quit ");
        
        // user inputs option 
        Scanner in = new Scanner(System.in);
        int option=in.nextInt();
        
        // switch statement to call method based on option chosen
        switch (option){
            case 1: 
                clientMenu(clients,employees,services,appointments);
                menu(clients,employees,services,appointments);
                break;
            case 2: 
                employeeMenu(clients,employees,services,appointments);
                menu(clients,employees,services,appointments);
                break;
            case 3:
                servicesMenu(clients,employees,services,appointments);
                menu(clients,employees,services,appointments);
                break;
            case 4:
                appointmentsMenu(clients,employees,services,appointments);
                menu(clients,employees,services,appointments);
                break;
            case 5:
                System.out.println("Option Quit");
                System.out.println("Bye");
                return;
            default:
                System.out.println("Invalid option.");
                menu(clients,employees,services,appointments);
                break;
        }
    }
    
    public static void clientMenu(ArrayList clients,ArrayList employees,ArrayList services,ArrayList appointments) 
    {
        System.out.println("CLIENT MENU");
        System.out.println("1. Add ");
        System.out.println("2. Delete ");
        System.out.println("3. Display ");
        System.out.println("4. Modify ");
        System.out.println("5. Main Menu ");
        
        // user inputs option 
        Scanner in = new Scanner(System.in);
        int option_1=in.nextInt();
        
        // switch statement to call method based on option chosen
        switch (option_1){
            case 1: 
                addClient(clients);
                clientMenu(clients,employees,services,appointments);
                break;
            case 2: 
                deleteClient(clients);
                clientMenu(clients,employees,services,appointments);
                break;
            case 3:
                displayClient(clients);
                clientMenu(clients,employees,services,appointments);
                break;
            case 4:
                modifyClient(clients);
                clientMenu(clients,employees,services,appointments);
                break;
            case 5:
                System.out.println("Continue to main menu.");
                return;
            default:
                System.out.println("Invalid option.");
                clientMenu(clients,employees,services,appointments);
                break;
        }
    }
    
    public static void addClient(ArrayList clients) {
        System.out.println("Enter client ID you want to add: ");
        Scanner in = new Scanner(System.in);
        int id1=in.nextInt();
        Client client;
        for (int i=0; i<clients.size();i++) {
            client=(Client)clients.get(i);
            if (client.getClientID()==id1) {
                System.out.println("Client already exists. Returning to client menu.");
                return;
            }
        }
        Client c = new Client();
        c.setClientID(id1);
        System.out.println("Enter client first name you want to add: ");
        Scanner in_1 = new Scanner(System.in);
        String first = in_1.nextLine();
        c.setFirstName(first);
        System.out.println("Enter client last name you want to add: ");
        Scanner in_2 = new Scanner(System.in);
        String last = in_2.nextLine();
        c.setLastName(last);
        System.out.println("Enter client pet type you want to add: ");
        Scanner in_3 = new Scanner(System.in);
        String petType = in_3.nextLine();
        c.setAnimalType(petType);
        clients.add(c);
        System.out.println("The client has been added.");
        System.out.println("Would you like to add another client? Y/N");
        Scanner in_4 = new Scanner(System.in);
        String answer = in_4.nextLine();
        if (answer.equals("Y")) {
            addClient(clients);
        }
        else if (answer.equals("N")){
            System.out.println("Returning to client menu.");
            return;
        }
        else {
            System.out.println("Invalid answer. Returning to client menu.");
            return;
        }
    }
    
    public static void deleteClient(ArrayList clients) {
        System.out.println("Enter client ID you want to delete: ");
        Scanner in = new Scanner(System.in);
        int id2=in.nextInt();
        Client client;
        for (int i=0; i<clients.size();i++) {
            client=(Client)clients.get(i);
            if (client.getClientID()==id2) {
                System.out.println("Client exists.");
                clients.remove(clients.get(i));
                System.out.println("Client has been removed.");
                System.out.println("Would you like to remove another client? Y/N");
                Scanner in_4 = new Scanner(System.in);
                String answer = in_4.nextLine();
                if (answer.equals("Y")) {
                    deleteClient(clients);
                }
                else if (answer.equals("N")){
                    System.out.println("Returning to client menu.");
                    return;
                }
                else {
                    System.out.println("Invalid answer. Returning to client menu.");
                    return;
                }
            }
        }
        System.out.println("Client does not exist. Returning to client menu.");
    }
    
    public static void displayClient(ArrayList clients) {
        Client client;
        for (int i=0; i<clients.size();i++) {
            client=(Client)clients.get(i);
            System.out.println("CLIENT "+(i+1)+" DSPLAYED");
            System.out.println("Client ID: "+client.getClientID());
            System.out.println("Client first name: "+client.getFirstName());
            System.out.println("Client last name: "+client.getLastName());
            System.out.println("Client pet type: "+client.getAnimalType());
            System.out.println();
        }
    }
    
    public static void modifyClient(ArrayList clients) {
        System.out.println("Enter client ID you want to modify info for: ");
        Scanner in = new Scanner(System.in);
        int id4=in.nextInt();
        Client client;
        for (int i=0; i<clients.size();i++) {
            client=(Client)clients.get(i);
            if (client.getClientID()==id4) {
                System.out.println("Client exists.");
                System.out.println("Client ID: "+client.getClientID());
                System.out.println("Enter client new first name: ");
                Scanner in1 = new Scanner(System.in);
                String first=in1.nextLine();
                client.setFirstName(first);
                System.out.println("Enter client new last name: ");
                Scanner in2 = new Scanner(System.in);
                String last=in2.nextLine();
                client.setLastName(last);
                System.out.println("Enter client new pet type: ");
                Scanner in3 = new Scanner(System.in);
                String type=in3.nextLine();
                client.setAnimalType(type);
                System.out.println("Client information has been modified.");
                System.out.println("Would you like to modify another client? Y/N");
                Scanner in_4 = new Scanner(System.in);
                String answer = in_4.nextLine();
                if (answer.equals("Y")) {
                    addClient(clients);
                }
                else if (answer.equals("N")){
                    System.out.println("Returning to client menu.");
                    return;
                }
                else {
                    System.out.println("Invalid answer. Returning to client menu.");
                    return;
                }
            }
        }
        System.out.println("Client does not exist.");
    }


    public static void employeeMenu(ArrayList clients,ArrayList employees,ArrayList services,ArrayList appointments) 
    {
        System.out.println("EMPLOYEE MENU");
        System.out.println("1. Add ");
        System.out.println("2. Delete ");
        System.out.println("3. Display ");
        System.out.println("4. Modify ");
        System.out.println("5. Main Menu ");
        
        // user inputs option 
        Scanner in = new Scanner(System.in);
        int option_2=in.nextInt();
        
        // switch statement to call method based on option chosen
        switch (option_2){
            case 1: 
                addEmployee(employees,services);
                employeeMenu(clients,employees,services,appointments);
                break;
            case 2: 
                deleteEmployee(employees);
                employeeMenu(clients,employees,services,appointments);
                break;
            case 3:
                displayEmployee(employees);
                employeeMenu(clients,employees,services,appointments);
                break;
            case 4:
                modifyEmployee(employees,services);
                employeeMenu(clients,employees,services,appointments);
                break;
            case 5:
                System.out.println("Continue to main menu.");
                return;
            default:
                System.out.println("Invalid option.");
                employeeMenu(clients,employees,services,appointments);
                break;
        }
    }
    
    public static void addEmployee(ArrayList employees, ArrayList services) {
        System.out.println("Enter employee ID you want to add: ");
        Scanner in = new Scanner(System.in);
        int id1=in.nextInt();
        Employee employee;
        for (int i=0; i<employees.size();i++) {
            employee=(Employee)employees.get(i);
            if (employee.getEmployeeID()==id1) {
                System.out.println("Employee already exists.");
                return;
            }
        }
        Employee e = new Employee();
        e.setEmployeeID(id1);
        System.out.println("Enter employee name you want to add: ");
        Scanner in_1 = new Scanner(System.in);
        String name = in_1.nextLine();
        e.setName(name);
        System.out.println("Enter employee job title you want to add: ");
        Scanner in_2 = new Scanner(System.in);
        String title = in_2.nextLine();
        e.setJobTitle(title);
        int i = 0;
        while (i==0) {
            System.out.println("Enter day employee works you want to add: ");
            Scanner in_3 = new Scanner(System.in);
            String day = in_3.nextLine();
            e.addWorkDays(day);
            System.out.println("Would you like to add another day employee works? Y/N");
            Scanner in_5 = new Scanner(System.in);
            String answer = in_5.nextLine();
            if (answer.equals("Y")) {
                i=0;
            }
            else if (answer.equals("N")){
                System.out.println("Continuing with addition.");
                i=1;
            }
            else {
                System.out.println("Invalid answer. Continuing with addition.");
                i=1;
            }
        }
        int j=0;
        while (j==0) {
            Services service1;
            ArrayList<String> services1 = new ArrayList<>();
            for (int h=0; h<services.size();h++) {
                service1=(Services)services.get(h);
                name=service1.getService();
                services1.add(name);
            }
            System.out.println("Enter service employee offers you want to add from the following list: ");
            System.out.println(services1);
            Scanner in_4 = new Scanner(System.in);
            String service = in_4.nextLine();
            e.addServices(service);
            System.out.println("Would you like to add another service the employee offers? Y/N");
            Scanner in_5 = new Scanner(System.in);
            String answer = in_5.nextLine();
            if (answer.equals("Y")) {
                j=0;
            }
            else if (answer.equals("N")){
                System.out.println("Continuing with addition.");
                j=1;
            }
            else {
                System.out.println("Invalid answer. Continuing with addition.");
                j=1;
            }
        }
        employees.add(e);
        System.out.println("The employee has been added.");
        System.out.println("Would you like to add another employee? Y/N");
        Scanner in_5 = new Scanner(System.in);
        String answer = in_5.nextLine();
        if (answer.equals("Y")) {
            addEmployee(employees,services);
        }
        else if (answer.equals("N")){
            System.out.println("Returning to employee menu.");
            return;
        }
        else {
            System.out.println("Invalid answer. Returning to employee menu.");
            return;
        }
    }
    
    public static void deleteEmployee(ArrayList employees) {
        System.out.println("Enter employee ID you want to delete: ");
        Scanner in = new Scanner(System.in);
        int id2=in.nextInt();
        Employee employee;
        for (int i=0; i<employees.size();i++) {
            employee=(Employee)employees.get(i);
            if (employee.getEmployeeID()==id2) {
                System.out.println("Employee exists.");
                employees.remove(employees.get(i));
                System.out.println("Employee has been removed.");
                System.out.println("Would you like to remove another employee? Y/N");
                Scanner in_4 = new Scanner(System.in);
                String answer = in_4.nextLine();
                if (answer.equals("Y")) {
                    deleteEmployee(employees);
                }
                else if (answer.equals("N")){
                    System.out.println("Returning to employee menu.");
                    return;
                }
                else {
                    System.out.println("Invalid answer. Returning to employee menu.");
                    return;
                }
            }
        }
        System.out.println("Employee does not exist.");
    }
    
    public static void displayEmployee(ArrayList employees) {
        Employee employee;
        for (int i=0; i<employees.size();i++) {
            employee=(Employee)employees.get(i);
            System.out.println("EMPLOYEE "+(i+1)+" DISPLAYED");
            System.out.println("Employee ID: "+employee.getEmployeeID());
            System.out.println("Employee name: "+employee.getName());
            System.out.println("Employee work days: "+employee.getWorkDays());
            System.out.println("Employee services offered: "+employee.getServices());
            System.out.println();
        }
    }
    
    public static void modifyEmployee(ArrayList employees, ArrayList services) {
        System.out.println("Enter employee ID you want to modify info for: ");
        Scanner in = new Scanner(System.in);
        int id4=in.nextInt();
        Employee employee;
        for (int i=0; i<employees.size();i++) {
            employee=(Employee)employees.get(i);
            if (employee.getEmployeeID()==id4) {
                System.out.println("Employee exists.");
                System.out.println("Employee ID: "+employee.getEmployeeID());
                System.out.println("Enter employee's new name: ");
                Scanner in1 = new Scanner(System.in);
                String name=in1.nextLine();
                employee.setName(name);
                System.out.println("Enter employee's new job title : ");
                Scanner in2 = new Scanner(System.in);
                String title=in2.nextLine();
                employee.setJobTitle(title);
                int h = 0;
                while (h==0) {
                    System.out.println("Enter new day employee works: ");
                    Scanner in_3 = new Scanner(System.in);
                    String day = in_3.nextLine();
                    employee.addWorkDays(day);
                    System.out.println("Would you like to add another new day employee works? Y/N");
                    Scanner in_5 = new Scanner(System.in);
                    String answer = in_5.nextLine();
                    if (answer.equals("Y")) {
                        h=0;
                    }
                    else if (answer.equals("N")){
                        System.out.println("Continuing with modification.");
                        h=1;
                    }
                    else {
                        System.out.println("Invalid answer. Continuing with modification.");
                        h=1;
                    }
                }
                int j=0;
                while (j==0) {
                    Services service1;
                    ArrayList<String> services1 = new ArrayList<>();
                    for (int k=0; k<services.size();k++) {
                        service1=(Services)services.get(k);
                        name=service1.getService();
                        services1.add(name);
                    }
                    System.out.println("Enter new service employee offers from following list: ");
                    System.out.println(services1);
                    Scanner in_4 = new Scanner(System.in);
                    String service = in_4.nextLine();
                    employee.addServices(service);
                    System.out.println("Would you like to add another new service the employee offers? Y/N");
                    Scanner in_5 = new Scanner(System.in);
                    String answer = in_5.nextLine();
                    if (answer.equals("Y")) {
                        j=0;
                    }
                    else if (answer.equals("N")){
                        System.out.println("Continuing with modification.");
                        j=1;
                    }
                    else {
                        System.out.println("Invalid answer. Continuing with modification.");
                        j=1;
                    }
                }
                System.out.println("Employee information has been modified.");
                System.out.println("Would you like to modify another employee? Y/N");
                Scanner in_4 = new Scanner(System.in);
                String answer = in_4.nextLine();
                if (answer.equals("Y")) {
                    modifyEmployee(employees,services);
                }
                else if (answer.equals("N")){
                    System.out.println("Returning to employee menu.");
                    return;
                }
                else {
                    System.out.println("Invalid answer. Returning to employee menu.");
                    return;
                }
            }
        }
        System.out.println("Employee does not exist. Returning to employee menu.");
    }
    
    public static void servicesMenu(ArrayList clients,ArrayList employees,ArrayList services,ArrayList appointments) 
    {
        System.out.println("SERVICES MENU");
        System.out.println("1. Add ");
        System.out.println("2. Delete ");
        System.out.println("3. Display ");
        System.out.println("4. Modify ");
        System.out.println("5. Main Menu ");
        
        // user inputs option 
        Scanner in = new Scanner(System.in);
        int option_3=in.nextInt();
        
        // switch statement to call method based on option chosen
        switch (option_3){
            case 1: 
                addServices(services);
                servicesMenu(clients,employees,services,appointments);
                break;
            case 2: 
                deleteServices(services);
                servicesMenu(clients,employees,services,appointments);
                break;
            case 3:
                displayServices(services);
                servicesMenu(clients,employees,services,appointments);
                break;
            case 4:
                modifyServices(services);
                servicesMenu(clients,employees,services,appointments);
                break;
            case 5:
                System.out.println("Continue to main menu.");
                return;
            default:
                System.out.println("Invalid option.");
                servicesMenu(clients,employees,services,appointments);
                break;
        }
    }
    
    public static void addServices(ArrayList services) {
        System.out.println("Enter service ID you want to add: ");
        Scanner in = new Scanner(System.in);
        int id1=in.nextInt();
        Services service;
        for (int i=0; i<services.size();i++) {
            service=(Services)services.get(i);
            if (service.getServiceID()==id1) {
                System.out.println("Service already exists.");
                return;
            }
        }
        Services s = new Services();
        s.setServiceID(id1);
        System.out.println("Enter name of service you want to add: ");
        Scanner in_1 = new Scanner(System.in);
        String name = in_1.nextLine();
        s.setService(name);
        System.out.println("Enter fee for service you want to add: ");
        Scanner in_2 = new Scanner(System.in);
        int fee = in_2.nextInt();
        s.setServiceFee(fee);
        services.add(s);
        System.out.println("The service has been added.");
        System.out.println("Would you like to add another service? Y/N");
        Scanner in_3 = new Scanner(System.in);
        String answer = in_3.nextLine();
        if (answer.equals("Y")) {
            addServices(services);
        }
        else if (answer.equals("N")){
            System.out.println("Returning to services menu.");
            return;
        }
        else {
            System.out.println("Invalid answer. Returning to services menu.");
            return;
        }
    }
    
    public static void deleteServices(ArrayList services) {
        System.out.println("Enter service ID you want to delete: ");
        Scanner in = new Scanner(System.in);
        int id2=in.nextInt();
        Services service;
        for (int i=0; i<services.size();i++) {
            service=(Services)services.get(i);
            if (service.getServiceID()==id2) {
                System.out.println("Service exists.");
                services.remove(services.get(i));
                System.out.println("Service has been removed.");
                System.out.println("Would you like to remove another service? Y/N");
                Scanner in_4 = new Scanner(System.in);
                String answer = in_4.nextLine();
                if (answer.equals("Y")) {
                    deleteServices(services);
                }
                else if (answer.equals("N")){
                    System.out.println("Returning to services menu.");
                    return;
                }
                else {
                    System.out.println("Invalid answer. Returning to services menu.");
                    return;
                }
            }
        }
        System.out.println("Service does not exist.");
    }
    
    public static void displayServices(ArrayList services) {
        Services service;
        for (int i=0; i<services.size();i++) {
            service=(Services)services.get(i);
            System.out.println("SERVICE "+(i+1)+" DISPLAYED");
            System.out.println("Service ID: "+service.getServiceID());
            System.out.println("Service name: "+service.getService());
            System.out.println("Service fee: "+service.getServiceFee());
            System.out.println();
        }
    }
    
    public static void modifyServices(ArrayList services) {
        System.out.println("Enter service ID you want to modify info for: ");
        Scanner in = new Scanner(System.in);
        int id4=in.nextInt();
        Services service;
        for (int i=0; i<services.size();i++) {
            service=(Services)services.get(i);
            if (service.getServiceID()==id4) {
                System.out.println("Service exists.");
                System.out.println("Service ID: "+service.getServiceID());
                System.out.println("Enter service's new name: ");
                Scanner in1 = new Scanner(System.in);
                String name=in1.nextLine();
                service.setService(name);
                System.out.println("Enter service's new fee: ");
                Scanner in2 = new Scanner(System.in);
                int fee=in2.nextInt();
                service.setServiceFee(fee);
                System.out.println("Employee information has been modified.");
                System.out.println("Would you like to modify another service? Y/N");
                Scanner in_4 = new Scanner(System.in);
                String answer = in_4.nextLine();
                if (answer.equals("Y")) {
                    modifyServices(services);
                }
                else if (answer.equals("N")){
                    System.out.println("Returning to services menu.");
                    return;
                }
                else {
                    System.out.println("Invalid answer. Returning to services menu.");
                    return;
                }
            }
        }
        System.out.println("Service does not exist.");
    }
    
    public static void appointmentsMenu(ArrayList clients,ArrayList employees,ArrayList services,ArrayList appointments) 
    {
        System.out.println("APPOINTMENTS MENU");
        System.out.println("1. Add ");
        System.out.println("2. Delete ");
        System.out.println("3. Display ");
        System.out.println("4. Modify ");
        System.out.println("5. Main Menu ");
        
        // user inputs option 
        Scanner in = new Scanner(System.in);
        int option_3=in.nextInt();
        
        // switch statement to call method based on option chosen
        switch (option_3){
            case 1: 
                addAppointment(clients,employees,services,appointments);
                appointmentsMenu(clients,employees,services,appointments);
                break;
            case 2: 
                deleteAppointment(appointments);
                appointmentsMenu(clients,employees,services,appointments);
                break;
            case 3:
                displayAppointment(appointments);
                appointmentsMenu(clients,employees,services,appointments);
                break;
            case 4:
                modifyAppointment(clients,employees,services,appointments);
                appointmentsMenu(clients,employees,services,appointments);
                break;
            case 5:
                System.out.println("Continue to main menu.");
                return;
            default:
                System.out.println("Invalid option.");
                appointmentsMenu(clients,employees,services,appointments);
                break;
        }
    }
    
    public static void addAppointment(ArrayList clients,ArrayList employees,ArrayList services,ArrayList appointments) {
        System.out.println("Enter appointment ID you want to add: ");
        Scanner in = new Scanner(System.in);
        int id1=in.nextInt();
        Appointment appointment;
        for (int i=0; i<appointments.size();i++) {
            appointment=(Appointment)appointments.get(i);
            if (appointment.getAppointmentID()==id1) {
                System.out.println("Appointment already exists.");
                return;
            }
        }
        Appointment a = new Appointment();
        a.setAppointmentID(id1);
        
        Services service1;
        ArrayList<Integer> serviceIDs = new ArrayList<>();
        for (int i=0; i<services.size();i++) {
            service1=(Services)services.get(i);
            int id=service1.getServiceID();
            serviceIDs.add(id);
        }
        System.out.println("Enter service ID you want to recieve at appointment from the following list: ");
        System.out.println(serviceIDs);
        Scanner in_1 = new Scanner(System.in);
        int service = in_1.nextInt();
        a.pickServiceID(service);
        
        Client client1;
        ArrayList<Integer> clientIDs = new ArrayList<>();
        for (int i=0; i<clients.size();i++) {
            client1=(Client)clients.get(i);
            int id=client1.getClientID();
            clientIDs.add(id);
        }
        System.out.println("Enter client ID that you want to book appointment with from the following list: ");
        System.out.println(clientIDs);
        Scanner in_2 = new Scanner(System.in);
        int client = in_2.nextInt();
        a.pickClientID(client);
        
        Employee employee1;
        ArrayList<Integer> employeeIDs = new ArrayList<>();
        for (int i=0; i<employees.size();i++) {
            employee1=(Employee)employees.get(i);
            int id=employee1.getEmployeeID();
            employeeIDs.add(id);
        }
        int t=0;
        int employee=0;
        while (t==0) {
            System.out.println("Enter employee ID that you want to book an appointment with from the following list: ");
            System.out.println(employeeIDs);
            Scanner in_3 = new Scanner(System.in);
            employee = in_3.nextInt();
            Employee employee3;
            ArrayList<String> serviceOffered = new ArrayList<>();
            for (int i=0; i<employees.size();i++) {
                employee3=(Employee)employees.get(i);
                if (employee3.getEmployeeID()==employee) {
                    serviceOffered = employee3.getServices();
                }
            }
            String name=" ";
            Services serviceWanted;
            for (int i=0; i<services.size();i++) {
                serviceWanted=(Services)services.get(i);
                int id=serviceWanted.getServiceID();
                if (id==service){
                    name=serviceWanted.getService();
                }
            }
            if (serviceOffered.contains(name)) {
                a.pickEmployee(employee);
                t=1;
            }
            else {
                System.out.println("The employee chosen doesn't offer service requested.");
                System.out.println("Please choose a different employee ID.");
                t=0;
            }
        }

        Employee employee2;
        ArrayList<String> days = new ArrayList<>();
        for (int i=0; i<employees.size();i++) {
            employee2=(Employee)employees.get(i);
            if (employee2.getEmployeeID()==employee) {
                days = employee2.getWorkDays();
            }
        }
        System.out.println("Enter day you want to book appointment from the following list: ");
        System.out.println(days);
        Scanner in_4 = new Scanner(System.in);
        String day = in_4.nextLine();
        a.pickDay(day);
        
        System.out.println("Enter time you want to book appointment (b/t 08:00 and 16:00): ");
        Scanner in_5 = new Scanner(System.in);
        String time = in_5.nextLine();
        a.pickHour(time);
        appointments.add(a);
        
        System.out.println("The appointment has been added.");
        
        System.out.println("Would you like to add another appointment? Y/N");
        Scanner in_6 = new Scanner(System.in);
        String answer = in_6.nextLine();
        if (answer.equals("Y")) {
            addAppointment(clients,employees,services,appointments);
        }
        else if (answer.equals("N")){
            System.out.println("Returning to appointment menu.");
            return;
        }
        else {
            System.out.println("Invalid answer. Returning to appointment menu.");
            return;
        }
    }
    
    public static void deleteAppointment(ArrayList appointments) {
        System.out.println("Enter appointment ID you want to delete: ");
        Scanner in = new Scanner(System.in);
        int id2=in.nextInt();
        Appointment appointment;
        for (int i=0; i<appointments.size();i++) {
            appointment=(Appointment)appointments.get(i);
            if (appointment.getAppointmentID()==id2) {
                System.out.println("Appointment exists.");
                appointments.remove(appointments.get(i));
                System.out.println("Appointment has been removed.");
                
                System.out.println("Would you like to remove another appointment? Y/N");
                Scanner in_4 = new Scanner(System.in);
                String answer = in_4.nextLine();
                if (answer.equals("Y")) {
                    deleteAppointment(appointments);
                }
                else if (answer.equals("N")){
                    System.out.println("Returning to appointment menu.");
                    return;
                }
                else {
                    System.out.println("Invalid answer. Returning to appointment menu.");
                    return;
                }
            }
        }
        System.out.println("Appointment does not exist.");
    }
    
    public static void displayAppointment(ArrayList appointments) {
        Appointment appointment;
        for (int i=0; i<appointments.size();i++) {
            appointment=(Appointment)appointments.get(i);
            System.out.println("APPOINTMENTS "+(i+1)+" DISPLAYED");
            System.out.println("Appointment ID: "+appointment.getAppointmentID());
            System.out.println("Service ID to be performed at appointment: "+appointment.chosenServiceID());
            System.out.println("Client ID of client wanting appointment: "+appointment.chosenClientID());
            System.out.println("Employee ID of employee to perform appointment: "+appointment.chosenEmployee());
            System.out.println("Day of appointment: "+appointment.chosenDay());
            System.out.println("Time of appointment: "+appointment.chosenHour());
            System.out.println();
        }
    }
    
    public static void modifyAppointment(ArrayList clients,ArrayList employees,ArrayList services,ArrayList appointments) {
        System.out.println("Enter appointment ID you want to modify info for: ");
        Scanner in = new Scanner(System.in);
        int id4=in.nextInt();
        Appointment appointment;
        for (int i=0; i<appointments.size();i++) {
            appointment=(Appointment)appointments.get(i);
            if (appointment.getAppointmentID()==id4) {
                System.out.println("Appointment exists.");
                System.out.println("Appointment ID: "+appointment.getAppointmentID());
                
                Services service1;
                ArrayList<Integer> serviceIDs = new ArrayList<>();
                for (int j=0; j<services.size();j++) {
                    service1=(Services)services.get(j);
                    int id=service1.getServiceID();
                    serviceIDs.add(id);
                }
                System.out.println("Enter new service ID to be performed at appointment from the following list: ");
                System.out.println(serviceIDs);
                Scanner in1 = new Scanner(System.in);
                int service=in1.nextInt();
                appointment.pickServiceID(service);
                
                Client client1;
                ArrayList<Integer> clientIDs = new ArrayList<>();
                for (int k=0; k<clients.size();k++) {
                    client1=(Client)clients.get(k);
                    int id=client1.getClientID();
                    clientIDs.add(id);
                }
                System.out.println("Enter new client ID that wants to book appointment from the following list: ");
                System.out.println(clientIDs);
                Scanner in_2 = new Scanner(System.in);
                int client = in_2.nextInt();
                appointment.pickClientID(client);
                
                Employee employee1;
                ArrayList<Integer> employeeIDs = new ArrayList<>();
                for (int j=0; j<employees.size();j++) {
                    employee1=(Employee)employees.get(j);
                    int id=employee1.getEmployeeID();
                    employeeIDs.add(id);
                }
                int t=0;
                int employee=0;
                while (t==0) {
                    System.out.println("Enter new employee ID that you want to book an appointment with from the following list: ");
                    System.out.println(employeeIDs);
                    Scanner in_3 = new Scanner(System.in);
                    employee = in_3.nextInt();
                    Employee employee3;
                    ArrayList<String> serviceOffered = new ArrayList<>();
                    for (int m=0; m<employees.size();m++) {
                        employee3=(Employee)employees.get(m);
                        if (employee3.getEmployeeID()==employee) {
                            serviceOffered = employee3.getServices();
                        }
                    }
                    Services serviceWanted;
                    String name="";
                    for (int m=0; m<services.size();m++) {
                        serviceWanted=(Services)services.get(m);
                        int id=serviceWanted.getServiceID();
                        if (id==service){
                            name=serviceWanted.getService();
                        }
                    }
                    if (serviceOffered.contains(name)) {
                        appointment.pickEmployee(employee);
                        t=1;
                    }
                    else {
                        System.out.println("The employee chosen doesn't offer service requested.");
                        System.out.println("Please choose a different employee ID.");
                        t=0;
                    }
                }
            
                
                Employee employee2;
                ArrayList<String> days = new ArrayList<>();
                for (int k=0; k<employees.size();k++) {
                    employee2=(Employee)employees.get(k);
                    if (employee2.getEmployeeID()==employee) {
                        days = employee2.getWorkDays();
                    }
                }
                System.out.println("Enter new day you want to book appointment: ");
                System.out.println(days);
                Scanner in_4 = new Scanner(System.in);
                String day = in_4.nextLine();
                appointment.pickDay(day);
                
                System.out.println("Enter new time you want to book appointment: ");
                Scanner in_5 = new Scanner(System.in);
                String time = in_5.nextLine();
                appointment.pickHour(time);
                
                System.out.println("The appointment has been added.");
                
                System.out.println("Would you like to modify another appointment? Y/N");
                Scanner in_6 = new Scanner(System.in);
                String answer = in_6.nextLine();
                if (answer.equals("Y")) {
                    modifyAppointment(clients,employees,services,appointments);
                }
                else if (answer.equals("N")){
                    System.out.println("Returning to appointment menu.");
                    return;
                }
                else {
                    System.out.println("Invalid answer. Returning to appointment menu.");
                    return;
                }
            }
        }
        System.out.println("Appointment does not exist.");
    }
    
    
	public static void main(String[] args) 
	{
	    Client c1 = new Client(1000,"Mary","Brown","Dog");
	    Client c2 = new Client(1001,"Cam","Martinez","Dog");
	    Client c3 = new Client(1002,"Gracie","Lopez","Dog");
	    Client c4 = new Client(1003,"Richard","Brown","Dog");
	    
	    ArrayList<Client> clients = new ArrayList<>();
        clients.add(c1);
        clients.add(c2);
        clients.add(c3);
        clients.add(c4);
	    
	    Doctor e1 = new Doctor(3000,"Kaylee Dons","Doctor","Antibiotics");
	    e1.addWorkDays("Monday");
	    e1.addWorkDays("Wednesday");
	    e1.addWorkDays("Friday");
	    e1.addServices("Surgery");
	    e1.addServices("Fecal Test");
	    
	    Doctor e2 = new Doctor(3001,"Josh Morgan","Doctor","Antibiotics");
	    e2.addWorkDays("Monday");
	    e2.addWorkDays("Tuesday");
	    e2.addWorkDays("Thursday");
	    e2.addWorkDays("Friday");
	    e2.addServices("Cut Nails");
	    e2.addServices("Fecal Test");
	    
	    Tech e3 = new Tech(3002,"Savannah Griego","Tech","Surgical");
	    e3.addWorkDays("Tues");
	    e3.addWorkDays("Wednesdaday");
	    e3.addWorkDays("Thursday");
	    e3.addWorkDays("Friday");
	    e3.addServices("Cut Nails");
	    e3.addServices("Pet Vaccination");
	    
        Employee e4 = new Employee(3003,"Heather Salazar","Receptionist");
		e4.addWorkDays("Monday");
	    e4.addWorkDays("Tuesday");
	    e4.addWorkDays("Wednesday");
	    e4.addWorkDays("Thursday");
	    e4.addWorkDays("Friday");
	    e4.addServices("File Papers");
	    
	    ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
	    
	    Services s1 = new Services(2000,"Pet Vaccination",40);
	    Services s2 = new Services(2001,"Fecal Test",60);
	    Services s3 = new Services(2002,"Cut Nails",20);
	    Services s4 = new Services(2003,"Surgery",500);
	    
	    ArrayList<Services> services = new ArrayList<>();
        services.add(s1);
        services.add(s2);
        services.add(s3);
        services.add(s4);
        
	    Appointment a1 = new Appointment(4000);
	    a1.pickServiceID(s3.getServiceID());
	    a1.pickClientID(c1.getClientID());
	    a1.pickEmployee(e3.getEmployeeID());
	    a1.pickDay("Tuesday");
	    a1.pickHour("09:00");
	    
	    Appointment a2 = new Appointment(4001);
	    a2.pickServiceID(s4.getServiceID());
	    a2.pickClientID(c4.getClientID());
	    a2.pickEmployee(e1.getEmployeeID());
	    a2.pickDay("Friday");
	    a2.pickHour("12:00");
	    
	    Appointment a3 = new Appointment(4002);
	    a3.pickServiceID(s1.getServiceID());
	    a3.pickClientID(c2.getClientID());
	    a3.pickEmployee(e2.getEmployeeID());
	    a3.pickDay("Monday");
	    a3.pickHour("13:00");
	    
	    ArrayList<Appointment> appointments = new ArrayList<>();
        appointments.add(a1);
        appointments.add(a2);
        appointments.add(a3);
	    
	    menu(clients,employees,services,appointments);
	}
}