
public class Student {
    //class variables
    private String studentName;
    private int studentID;
    private String course;
    private String password;

    //constructor
    public Student(String name, int ID, String course, String password){
        this.studentName = name;
        this.studentID = ID;
        this.course = course;
        this.password= password;
    }
        
        //updated code to add password which students can use to login to code.
      
     //class methods
    public String getStudentName(){
        return studentName; 
    }

    public int getStudentID(){
        return studentID; 
    } 
    
    public String getPassword(){
        return course; 
    }

    public void setStudent(String studentName){
     this.studentName = studentName; 
    } 
    
	public void setStudentID(int studentID){
    this.studentID = studentID; 
    }
    
	public void setPassword(String course){
    this.password = password; 
    }
}  

