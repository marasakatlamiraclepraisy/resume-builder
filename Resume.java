import java.util.ArrayList;
import java.util.Scanner;

class Resume {
    String name;
    String email;
    String phone;
    ArrayList<String> education;
    ArrayList<String> experience;
    ArrayList<String> skills;
    ArrayList<String> extracurricularActivities;
    ArrayList<String> hobbies;

    public Resume() {
        education = new ArrayList<>();
        experience = new ArrayList<>();
        skills = new ArrayList<>();
        extracurricularActivities = new ArrayList<>();
        hobbies = new ArrayList<>();
    }

    public void addEducation(String edu) {
        education.add(edu);
    }

    public void addExperience(String exp) {
        experience.add(exp);
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void addExtracurricularActivity(String activity) {
        extracurricularActivities.add(activity);
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public void printResume() {
        System.out.println("Resume");
        System.out.println("======");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        
        System.out.println("\nEducation:");
        for (String edu : education) {
            System.out.println("- " + edu);
        }
        
        System.out.println("\nExperience:");
        for (String exp : experience) {
            System.out.println("- " + exp);
        }
        
        System.out.println("\nSkills:");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }
        
        System.out.println("\nExtracurricular Activities:");
        for (String activity : extracurricularActivities) {
            System.out.println("- " + activity);
        }
        
        System.out.println("\nHobbies:");
        for (String hobby : hobbies) {
            System.out.println("- " + hobby);
        }
    }
}

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resume resume = new Resume();

        System.out.print("Enter your name: ");
        resume.name = scanner.nextLine();

        System.out.print("Enter your email: ");
        resume.email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        resume.phone = scanner.nextLine();

        System.out.println("Enter your education details (type 'done' when finished):");
        while (true) {
            String edu = scanner.nextLine();
            if (edu.equalsIgnoreCase("done")) {
                break;
            }
            resume.addEducation(edu);
        }

        System.out.println("Enter your experience details (type 'done' when finished):");
        while (true) {
            String exp = scanner.nextLine();
            if (exp.equalsIgnoreCase("done")) {
                break;
            }
            resume.addExperience(exp);
        }

        System.out.println("Enter your skills (type 'done' when finished):");
        while (true) {
            String skill = scanner.nextLine();
            if (skill.equalsIgnoreCase("done")) {
                break;
            }
            resume.addSkill(skill);
        }

        System.out.println("Enter your extracurricular activities (type 'done' when finished):");
        while (true) {
            String activity = scanner.nextLine();
            if (activity.equalsIgnoreCase("done")) {
                break;
            }
            resume.addExtracurricularActivity(activity);
        }

        System.out.println("Enter your hobbies (type 'done' when finished):");
        while (true) {
            String hobby = scanner.nextLine();
            if (hobby.equalsIgnoreCase("done")) {
                break;
            }
            resume.addHobby(hobby);
        }

        System.out.println("\nYour Resume:");
        resume.printResume();

        scanner.close();
    }
}
