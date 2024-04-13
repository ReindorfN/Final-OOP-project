package final_oop_project;

public class DailyPlanner{
    
    public String[] timeSlots={"8am","9am","10am","11am","12pm","1pm","2pm","3pm","4pm","5pm","6pm","7pm","8pm","9pm","10pm"}; //Total study slots
    public Event[] dailyTimetable;
    //Creating Daily Planner
    public DailyPlanner(){
        dailyTimetable = new Event[timeSlots.length]; 
    }

    //class methods
    public void displayTimetable(){
        System.out.println("Schedule for Today");
        for(int i = 0;i<timeSlots.length;i++){
            if(dailyTimetable[i]!= null){
                System.out.println(timeSlots[i]+":" + dailyTimetable[i]);
            }else{
             System.out.println(timeSlots[i]+": - ");
            }
        }
    }

    //public void getDailyTimetable(){}

    public boolean setEventInDailyTimeable(int slot, Event event){
        if (dailyTimetable[slot] != null){
            dailyTimetable[slot] = event;
            return true;
        }else return false;
    }

    public boolean setEventInDailyTimeable(int slot, String slotName, String slotTime){
        if (dailyTimetable[slot] != null){
            dailyTimetable[slot] = new Event(slotName, slotTime);
            return true;
        }else return false;
    }


    public boolean removeEventInDailyTimeable(int slot){
        for (int i = 0; i < timeSlots.length; i++){
            if (i == slot && dailyTimetable[i] != null){
                dailyTimetable[i] = null;
              return true;
            }
          }
          return false;
    }
/* 
    public boolean addSubject(String subjectName, String time, int timeSlot){
        if (dailyTimetable[slot] != null){
            dailyTimetable[slot] = new Subject(subjectName, time);
            return true;
        }else{
            return false;
        }
    }
*/
    public boolean addSubject(Subject subject, int timeSlot){
        if (dailyTimetable[timeSlot] != null){
            dailyTimetable[timeSlot] = subject;
            return true;
        }else return false; 
    }
/* 
    public boolean rescheduleSubject(String subjectName, String time, int slot){
        Subject subject = new Subject(subjectName, time);
        for (int i = 0; i < dailyTimetable.length; i++){
            if (dailyTimetable[i] == subject){
                dailyTimetable[i] = null;
            }
            if (i == slot && dailyTimetable[i] == null){
                dailyTimetable[i] = subject;
              return true;
            }
          }
          return false;
    }
*/

    public boolean rescheduleSubject(Subject subject, int slot){
        for (int i = 0; i < timeSlots.length; i++){
            if (dailyTimetable[i] == subject){
                dailyTimetable[i] = null;
            }
            if (i == slot && dailyTimetable[i] == null){
                dailyTimetable[i] = subject;
              return true;
            }
          }
          return false;
    }

    /**
     * @param slot represents the timeslot where the 
     * @return
     */
    public boolean removeSubject(int slot){
        for (int i = 0; i < timeSlots.length; i++){
            if (i == slot && dailyTimetable[i] != null){
                dailyTimetable[i] = null;
              return true;
            }
          }
          return false;
    }


    /**
     * @param groupSession represents a group session object.
     * @param slot represents a slot where the group session should be added.
     * @return determines adding a group session was successful or not.
     */
    public boolean addGroupSession(GroupSession groupSession, int slot){
        if (dailyTimetable[slot] != null){
            dailyTimetable[slot] = groupSession;
            return true;
        }else return false;
    }
    

    /**
     * @param groupSession represents an already created groupsession object.
     * @param slot represents the slot where the activity should be rescheduled to.
     * @return determines whether the rescheduling was successful or not. 
     */
    public boolean rescheduleGroupSession(GroupSession groupSession, int slot){
        for (int i = 0; i < timeSlots.length; i++){
            if (dailyTimetable[i] == groupSession){
                dailyTimetable[i] = null;
            }
            if (i == slot && dailyTimetable[i] == null){
                dailyTimetable[i] = groupSession;
              return true;
            }
          }
          return false;
    }

    /**
     * @param slot represents the slot where the group session whould be removed
     * @return determines whether the group session was removed or not. 
     */
    public boolean removeGroupSession(int slot){
        for (int i = 0; i < timeSlots.length; i++){
            if (i == slot && dailyTimetable[i] != null){
                dailyTimetable[i] = null;
              return true;
            }
          }
          return false;
    }
    
 
    /**
     * @param extracurricular represents an extra curricular activity
     * @param slot represents the slot where the activity should be added. 
     * @return determined whether the activity was added or not. 
     */
    public boolean addExtracurricular(Extracurricular extracurricular, int slot){
        if (dailyTimetable[slot] != null){
            dailyTimetable[slot] = extracurricular;
            return true;
        }else return false;
    }
    

    /**
     * @param extracurricular represents an extra-curricular activity. A types already created. 
     * @param slot represents the slot where the activity should be rescheduled to.
     * @return represents whether the rescheduling was successfull or not. 
     */
    public boolean rescheduleExtracurricular(Extracurricular extracurricular, int slot){
        for (int i = 0; i < timeSlots.length; i++){
            if (dailyTimetable[i] == extracurricular){
                dailyTimetable[i] = null;
            }
            if (i == slot && dailyTimetable[i] == null){
                dailyTimetable[i] = extracurricular;
              return true;
            }
          }
          return false;
    }


    /**
     * @param slot represents the timeslot which hlds the desired extracurricular activity
     * @return returns a boolean depending on wheter the extracurricular removal ws successful or not. 
     */
    public boolean removeExtracurricular(int slot){
        for (int i = 0; i < timeSlots.length; i++){
            if (i == slot && dailyTimetable[i] != null){
                dailyTimetable[i] = null;
                return true;
            }
          }
        return false;
    }
}