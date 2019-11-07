import java.util.ArrayList;

public class Degree {
    private String name;
    private String email;
    private ArrayList<Education> educations;

    public Degree(){}
    public Degree(String name, String email){
        this.name = name;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayPersonalText(ArrayList<ArrayList> allEducationList){
        System.out.println("================================================");
        System.out.println(name + " Resume");
        System.out.println("Email Address:  " + email);

    }
}
