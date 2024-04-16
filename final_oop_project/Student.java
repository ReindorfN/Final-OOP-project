package final_oop_project;

public class Student {
    //class variables
    private String studentName;
    private int studentID;
    private String course;
    private String password;
    private String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private DailyPlanner[] weeklyTimetable = new DailyPlanner[7]; 

    //constructor
    /**
     * @param name represents the name of the student
     * @param ID represents id of student
     * @param course represents the course student is enrolled in
     * @param password represents password of student
     * @param weeklyTimetable[] is an array which has a list of events for the day
     */
    public Student(String name, int ID, String course, String password, DailyPlanner a){
        this.studentName = name;
        this.studentID = ID;
        this.course = course;
        this.password= password;
        //this.weeklyTimetable=weeklyTimetable[];
    }
        
        //updated code to add password which students can use to login to code.
	public boolean checkPassword(String passwordInput){
    		try {
        		if (passwordInput.equals(password)) {
            			return true;
        		} else {
           	 		return false;
       			}
    		} catch (NullPointerException e) {
       			 System.out.println("Try Again. Incorrect password");
                 return false;
    		}
	}

     //class methods
    public void displayWeeklyTimetable() {
	    try{
            System.out.println("Schedule for the week:");
            for (int i = 0; i < days.length; i++) {
                System.out.println("Schedule for " + days[i] + ":");
                weeklyTimetable[i].displayDailyAppointments(); 
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array index is out of bounds");
        }
    }

public String getStudentName(){
	return studentName;
}

public String getpassword(){
	return studentName;
}

}
