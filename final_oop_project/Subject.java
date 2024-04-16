package final_oop_project;

public class Subject extends Event {

    // class specific instance variables
    private String subjectName;
    private int modules;
    private double progress;
    private String courseCode;
    private String lecturer;
    private String facultyIntern;
    private String location;
    private String times;

    public Subject(String subjectName, String times) {
        super(subjectName, times);
    }
    public Subject(String subjectName, int modules, double progress, String courseCode, String lecturer,
            String facultyIntern, String location, String times) {
        super(subjectName, times);
        this.modules = modules;
        this.progress = progress;
        this.courseCode = courseCode;
        this.lecturer = lecturer;
        this.facultyIntern = facultyIntern;
        this.location = location;
    }

    public Subject(String subjectName, double progress, String courseCode, String lecturer, String facultyIntern,
            String location, String times) {
        super(subjectName, times);
        this.progress = progress;
        this.courseCode = courseCode;
        this.lecturer = lecturer;
        this.facultyIntern = facultyIntern;
        this.location = location;
    }
    /*
     * public Subject(String subjectName, String time){
     * super(subjectName, time);
     * }
     */

    public int getNumModules() { // getter
        return modules;
    }

    public double getProgress() { // getter
        return progress;
    }

    public void setProgress(int numCompletedModules) { // getter
        progress = (numCompletedModules / modules) * 100;
    }

    public String getCourseCode() { // getter
        return courseCode;
    }

    public void setCourseCode(String courseCode) { // setter
        this.courseCode = courseCode;
    }

    public String getLecturer() { // getter
        return lecturer;
    }

    public void setLecturer(String lecturer) { // setter
        this.lecturer = lecturer;
    }

    public String getFacultyIntern() { // getter
        return facultyIntern;
    }

    public void setFacultyIntern(String facultyIntern) { // setter
        this.facultyIntern = facultyIntern;
    }

    public String getLocation() { // getter
        return location;
    }

    public void setLocation(String location) { // setter
        this.location = location;
    }

    public String getClassTimes() { // getter
        return times;
    }

    public void setClassTimes(String times) { // setter
        this.times = times;
    }

    // Implementation of the abstract method from Event
    @Override
    public void displayEventDetails() {
        System.out.println("Subject Name: " + this.subjectName);
        System.out.println("Number of Modules: " + this.modules);
        System.out.println("Progress: " + this.progress + "%");
        System.out.println("Course Code: " + this.courseCode);
        System.out.println("Lecturer: " + this.lecturer);
        System.out.println("Faculty Intern: " + this.facultyIntern);
        System.out.println("Location: " + this.location);
        System.out.println("Class times: " + this.times);
    }
}
