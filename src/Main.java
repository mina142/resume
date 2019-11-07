import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Degree> namelist = new ArrayList<>();
        ArrayList<Education> educationlist = new ArrayList<>();
        ArrayList<ArrayList> allEducationList = new ArrayList<>();
        ArrayList<Skills> allSkills = new ArrayList<>();

        Degree personalInfo = new Degree();
        Education educationinfo = new Education();
        Skills skill = new Skills();
        ResumeDB resume = new ResumeDB();
        Scanner k = new Scanner(System.in);
        System.out.println("name: ");
        String userName = k.next();
        personalInfo.setName(userName);
        System.out.println("Email Address: ");
        String email = k.next();
        personalInfo.setEmail(email);
        namelist.add(personalInfo);
        int count = 1;
        do {
            System.out.println("degree type: ");
            String edu = k.next();
            educationinfo.setEducationType(edu);
            System.out.println("major: ");
            String major = k.next();
            educationinfo.setMajor(major);
            System.out.println("University Name: ");
            String uni = k.next();
            educationinfo.setUniName(uni);
            System.out.println("graduation year: ");
            String gradYear = k.next();
            educationinfo.setGradYear(gradYear);
            educationlist.add(educationinfo);
            allEducationList.add(educationlist);
            System.out.println("would you like to add another degree? (y/n) ");
            String answer = k.next();
            if(answer.equalsIgnoreCase("y")){
                count ++;
            }
            if(answer.equalsIgnoreCase("n")){
                break;
            }
        }while(count>1);

        ArrayList<Experience> eduList =  new ArrayList<>();
        Experience personEdu = new Experience();

        do {
            System.out.println("Company Name: ");
            String workExp = k.next();
            personEdu.setCompany(workExp);
            System.out.println("Job Title: ");
            String jobTitle = k.next();
            personEdu.setJobTitle(jobTitle);
            System.out.println("Start Date: ");
            String startDate = k.next();
            personEdu.setStartdate(startDate);
            System.out.println("End Date: ");
            String endDate = k.next();
            personEdu.setEndDate(endDate);
            System.out.println("Job Description: ");
            String jobDesc = k.next();
            personEdu.setDescription(jobDesc);
            eduList.add(personEdu);
            System.out.println("would you like to add another job exprience? (y/n)");
            String ans = k.next();
            if(ans.equalsIgnoreCase("y")){
                count ++;
            }
            else{break;}
        }while (count>1);

        for(int i=0 ; i<3 ; i++) {
            System.out.println("please enter 3 skills: ");
            System.out.println("skills: ");
            String sk = k.next();
            skill.setSkillName(sk);
            System.out.println("proficiency");
            String pr = k.next();
            skill.setRating(pr);
            allSkills.add(skill);

        }
        personalInfo.displayPersonalText(allEducationList);

        personEdu.expDsiplay(eduList);
        skill.skillDisplay(allSkills);


    }
}
