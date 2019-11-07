import java.util.ArrayList;

public class Experience {
    private String company;
    private String jobTitle;
    private String startdate;
    private String endDate;
    private String description;

    public Experience(){}
    public Experience(String company, String jobTitle, String startdate, String endDate, String description){
        this.company = company;
        this.jobTitle = jobTitle;
        this.startdate = startdate;
        this.endDate = endDate;
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void expDsiplay(ArrayList array){
        System.out.println(company);
        System.out.println(jobTitle);
        System.out.println(startdate);
        System.out.println(endDate);
        System.out.println(description);
    }
}
