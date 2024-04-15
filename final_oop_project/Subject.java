import java.util.*;

public class Subject {

    //class specific instance variables
    private String subjectName;
    //private int numModules;
    private ArrayList<String> modules; 
    private double progress;
    private String courseCode;
    private String lecturer;
    private String facultyIntern;
    private String location;
    private String times;

    public Subject(String subjectName){
        this.subjectName = subjectName;
    }

    public Subject(String subjectName, ArrayList<String> modules, double progress,String courseCode, String lecturer, String facultyIntern, String location, String times) {
       this.subjectName = subjectName; 
       this.modules = modules;
       this.progress = progress;
       this.courseCode = courseCode;
       this.lecturer = lecturer;
       this.facultyIntern = facultyIntern;
       this.location = location;
       this.times = times;
   }

   public Subject(String subjectName, double progress, String courseCode, String lecturer, String facultyIntern, String location, String times) {
    this.subjectName = subjectName;  
    this.progress = progress;
    this.courseCode = courseCode;
    this.lecturer = lecturer;
    this.facultyIntern = facultyIntern;
    this.location = location;
    this.times = times;
}
/* 
    public Subject(String subjectName, String time){
        super(subjectName, time);
   }
*/

    public ArrayList<String> getModules() { //getter 
       return modules;
   }
   
    public String getModule(int n){
        return modules.get(n);
    }

    public void setModules(ArrayList<String> modules) {  //setter
       this.modules = modules;
   }

    public void addModule(String moduleName){
        modules.add(moduleName);
    }

    public void addModules(int numModules){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numModules; i++){
            System.out.println("Please enter the name of the module:");
            String moduleName = input.nextLine();
            modules.add(moduleName);
        }
        input.close();
    }

    public double getProgress() { //getter
       return progress;
   }

    public void setProgress(double progress) { //setter 
       this.progress = progress;
   }

    public String getCourseCode() { //getter
        return courseCode;
    }

    public void setCourseCode(String courseCode) {  //setter
        this.courseCode = courseCode;
    }

    public String getLecturer() { //getter
        return lecturer;
    }

    public void setLecturer(String lecturer) {  //setter
        this.lecturer = lecturer;
    }

    public String getFacultyIntern() { //getter
        return facultyIntern;
    }

    public void setFacultyIntern(String facultyIntern) {  //setter
        this.facultyIntern = facultyIntern;
    }

    public String getLocation() { //getter
        return location;
    }

    public void setLocation(String location) {  //setter
        this.location = location;
    }

    public String getClassTimes() { //getter
        return times;
    }

    public void setClassTimes(String times) {  //setter
        this.times = times;
    }

   // Implementation of the abstract method from Event
    public void displaySubjectDetails() {
       System.out.println("Subject Name: " + this.subjectName);
       System.out.println("Modules: " + this.modules);
       System.out.println("Progress: " + this.progress + "%");
       System.out.println("Course Code: " + this.courseCode);
       System.out.println("Lecturer: " + this.lecturer);
       System.out.println("Faculty Intern: " + this.facultyIntern);
       System.out.println("Location: " + this.location);
       System.out.println("Class times: " + this.times);
   }
}
