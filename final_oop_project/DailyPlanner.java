package final_oop_project;

public class DailyPlanner {

    public String[] timeSlots = { "8am", "9am", "10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm",
            "8pm", "9pm", "10pm" }; // Total study slots
    public Object[] dailyTimetable;

    // Creating Daily Planner
    /**
     * DailyPlanner constructor
     */
    public DailyPlanner() {
        dailyTimetable = new Object[timeSlots.length];
    }

    // class methods
    /**
     * This method displays the daily timetable 
     */
    public void displayTimetable() {
        System.out.println("Schedule for Today");
        for (int i = 0; i < timeSlots.length; i++) {
            if (dailyTimetable[i] != null) {
                System.out.println(timeSlots[i] + ":" + dailyTimetable[i]);
            } else {
                System.out.println(timeSlots[i] + ": - ");
            }
        }
    }

    /*
     * public boolean addSubject(String subjectName, String time, int timeSlot){
     * if (dailyTimetable[slot] != null){
     * dailyTimetable[slot] = new Subject(subjectName, time);
     * return true;
     * }else{
     * return false;
     * }
     * }
     */
    /**
     * @param subject represents a subject object
     * @param timeSlot represents timeslots considered as study hours
     * @return
     */
    public boolean addSubject(Subject subject, int timeSlot) {
        try {
            if (subject != null && dailyTimetable[timeSlot] == null) {
                dailyTimetable[timeSlot] = subject;
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException e) {
            System.out.println("Unexpected error: One or more required objects are null.");
            return false;
        }
    }

    public boolean addSubject(Subject subject) {
        for (int i = 0; i < dailyTimetable.length; i++) {
            if (subject != null && dailyTimetable[i] == null) {
                dailyTimetable[i] = subject;
                return true;
            }
        }
        return false;
    }


    /**
     * @param subject represents a subject object
     * @param slot represents the slot the event should be rescheduled to
     * @return
     */
 
    public boolean rescheduleSubject(Subject subject, int slot) {
        try {
            for (int i = 0; i < timeSlots.length; i++) {
                if (dailyTimetable[i] == subject) {
                    dailyTimetable[i] = null;
                }
                if (i == slot && dailyTimetable[i] == null) {
                    dailyTimetable[i] = subject;
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Slot not available. Try again");
            return false;
        }
    }

    /**
     * @param slot represents the timeslot where the
     * @return
     */
    public boolean removeSubject(int slot) {
        try {
            for (int i = 0; i < timeSlots.length; i++) {
                if (i == slot && dailyTimetable[i] != null) {
                    dailyTimetable[i] = null;
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Slot not found");
            return false;
        }
    }

    /**
     * @param groupSession represents a group session object.
     * @param slot         represents a slot where the group session should be
     *                     added.
     * @return determines whether adding a group session was successful or not.
     */
    public boolean addGroupSession(GroupSession groupSession, int slot) {
        try {
            if (dailyTimetable[slot] == null) {
                dailyTimetable[slot] = groupSession;
                return true;
            } else
                return false;
        } catch (NullPointerException e) {
            System.out.println("Unexpected error: One or more required objects are null.");
            return false;
        }
    }

    /**
     * @param groupSession represents an already created group session object.
     * @param slot         represents the slot where the activity should be
     *                     rescheduled to.
     * @return determines whether the rescheduling was successful or not.
     */
    public boolean rescheduleGroupSession(GroupSession groupSession, int slot) {
        try {
            for (int i = 0; i < timeSlots.length; i++) {
                if (dailyTimetable[i] == groupSession) {
                    dailyTimetable[i] = null;
                }
                if (i == slot && dailyTimetable[i] == null) {
                    dailyTimetable[i] = groupSession;
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Slot not found");
            return false;
        }
    }

    /**
     * @param slot represents the slot where the group session would be removed
     * @return determines whether the group session was removed or not.
     */
    public boolean removeGroupSession(int slot) {
        try {
            for (int i = 0; i < timeSlots.length; i++) {
                if (i == slot && dailyTimetable[i] != null) {
                    dailyTimetable[i] = null;
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Slot not found");
            return false;
        }
    }

    /**
     * @param extracurricular represents an extra curricular activity
     * @param slot            represents the slot where the activity should be
     *                        added.
     * @return determined whether the activity was added or not.
     */
    public boolean addExtracurricular(Extracurricular extracurricular, int slot) {
        try {
            if (dailyTimetable[slot] == null) {
                dailyTimetable[slot] = extracurricular;
                return true;
            } else
                return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Slot not available. Try again");
            return false;
        }
    }

    /**
     * @param extracurricular represents an extra-curricular activity. Types already
     *                        created.
     * @param slot            represents the slot where the activity should be
     *                        rescheduled.
     * @return represents whether the rescheduling was successful or not.
     */
    public boolean rescheduleExtracurricular(Extracurricular extracurricular, int slot) {
        try {
            for (int i = 0; i < timeSlots.length; i++) {
                if (dailyTimetable[i] == extracurricular) {
                    dailyTimetable[i] = null;
                }
                if (i == slot && dailyTimetable[i] == null) {
                    dailyTimetable[i] = extracurricular;
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Slot not available. Try again");
            return false;
        }
    }

    /**
     * @param slot represents the timeslot which holds the desired extracurricular
     *             activity
     * @return returns a boolean depending on whether the extracurricular removal
     *         was successful.
     */
    public boolean removeExtracurricular(int slot) {
        try {
            for (int i = 0; i < timeSlots.length; i++) {
                if (i == slot && dailyTimetable[i] != null) {
                    dailyTimetable[i] = null;
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Slot not available. Try again");
            return false;
        }
    }
    

    /**
     * Ensures this unimplemented method cannot be called.
     */
    public void displayDailyTimetable() {

        throw new UnsupportedOperationException("Unimplemented method 'displayDailyTimetable'");
    }
}
