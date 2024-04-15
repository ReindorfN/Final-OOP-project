package final_oop_project;

public class Student {
    //class variables
    private String studentName;
    private int studentID;
    private String course;
    private String password;

    //constructor
    /**
     * @param name represents the name of the student
     * @param ID represents id of student
     * @param course represents the course student is enrolled in
     * @param password represents password of student
     */
    public Student(String name, int ID, String course, String password){
        this.studentName = name;
        this.studentID = ID;
        this.course = course;
        this.password= password;
    }
        
        //updated code to add password which students can use to login to code.
      
     //class methods
