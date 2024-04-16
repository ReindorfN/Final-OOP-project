package final_oop_project;

public class Student {
    // class variables
    private String studentName;
    private String studentID;
    private String course;
    private String password;
    private String[] days = { "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
    private DailyPlanner[] weeklyTimetable = new DailyPlanner[7];

    // constructor
    /**
     * @param name     represents the name of the student
     * @param ID       represents id of student
     * @param course   represents the course student is enrolled in
     * @param password represents password of student
     */

    public Student() {
    }

    public Student(String name, String ID, String course, String password) {
        this.studentName = name;
        this.studentID = ID;
        this.course = course;
        this.password = password;
        weeklyTimetable = new DailyPlanner[7];
    }

    public boolean checkPassword(String passwordInput) {
        try {
            if(this.password == null){
                System.out.println("Password is not set. Please set a password.");
                return false;
            }
            //return passwordInput.equals(this.password);

        } catch (NullPointerException e) {
            System.out.println("Try Again. Incorrect password");
        }
        return passwordInput.equals(this.password);
    }

    // class methods
    public void displayWeeklyTimetable() {
        try {
            System.out.println("Schedule for the week:");
            for (int i = 0; i < days.length; i++) {
                System.out.println("Schedule for " + days[i] + ":");
                weeklyTimetable[i].displayTimetable();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array index is out of bounds");
        }
    }

    public boolean addSubject(int daySlot, int timeSlot, Subject subject) {
        try {
            if (subject != null && weeklyTimetable[daySlot] == null) {
                return weeklyTimetable[daySlot].addSubject(subject, timeSlot);
            } else {
                return false;
            }
        } catch (NullPointerException e) {
            System.out.println("Unexpected error: One or more required objects are null.");
            return false;
        }
    }

    public boolean rescheduleSubject(int daySlot, int timeSlot, Subject subject) {
        if (weeklyTimetable[daySlot].rescheduleSubject(subject, timeSlot)) {
            return true;
        }
        return false;
    }

    public void removeSubject(int daySlot, int timeSlot) {
        if (daySlot < weeklyTimetable.length) {
            weeklyTimetable[daySlot].removeSubject(timeSlot);
        }
    }

    public boolean addExtracurricular(int daySlot, int timeSlot, Extracurricular extracurricular) {
        try {
            if (extracurricular != null && weeklyTimetable[daySlot] == null) {
                return weeklyTimetable[daySlot].addExtracurricular(extracurricular, timeSlot);
            } else {
                return false;
            }
        } catch (NullPointerException e) {
            System.out.println("Unexpected error: One or more required objects are null.");
            return false;
        }
    }

    // Checks if event is present in daily timetable
    public boolean rescheduleExtracurricular(int daySlot, int timeSlot, Extracurricular extracurricular) {
        if (weeklyTimetable[daySlot].rescheduleExtracurricular(extracurricular, timeSlot)) {
            return true;
        }
        return false;
    }

    public void removeExtracurricular(int daySlot, int timeSlot) {
        if (daySlot < weeklyTimetable.length) {
            weeklyTimetable[daySlot].removeExtracurricular(timeSlot);
        }
    }

    public boolean addGroupSession(int daySlot, int timeSlot, GroupSession groupSession) {
        try {
            if (groupSession != null && weeklyTimetable[daySlot] == null) {
                return weeklyTimetable[daySlot].addGroupSession(groupSession, timeSlot);
            } else {
                return false;
            }
        } catch (NullPointerException e) {
            System.out.println("Unexpected error: One or more required objects are null.");
            return false;
        }
    }

    public boolean rescheduleGroupSession(int daySlot, int timeSlot, GroupSession groupSession) {
        if (weeklyTimetable[daySlot].rescheduleGroupSession(groupSession, timeSlot)) {
            return true;
        }
        return false;
    }

    public void removeGroupSession(int daySlot, int timeSlot) {
        if (daySlot < weeklyTimetable.length) {
            weeklyTimetable[daySlot].removeGroupSession(timeSlot);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getCourse() {
        return course;
    }

    public String getpassword(){
        return password;
    }

    public int getTimetableLength() {
        return this.weeklyTimetable.length;
    }

    public boolean passwordChecker() {
        throw new UnsupportedOperationException("Unimplemented method 'passwordChecker'");
    }

    public char[] getPassword() {
        throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
    }

}
