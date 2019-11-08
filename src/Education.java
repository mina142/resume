import java.util.ArrayList;

public class Education {
    private String educationType;
    private String major;
    private String uniName;
    private String gradYear;

    public Education(){}
    public Education(String educationType, String major, String uniName, String gradYear){

        this.educationType = educationType;
        this.major = major;
        this.uniName = uniName;
        this.gradYear = gradYear;
    }
    public String getEducationType() {
        return educationType;
    }

    public void setEducationType(String educationType) {
        this.educationType = educationType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    public void educationTextDisplay(){
        System.out.println(educationType);
        System.out.println(major);
        System.out.println(uniName);
        System.out.println(gradYear);
    }

}


