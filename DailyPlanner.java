public class DailyPlanner{
    public String[] timeSlots={"8am","9am","10am","11am","12pm","1pm","2pm","3pm","4pm","5pm","6pm","7pm","8pm","9pm","10pm"}; //Total study slots

    //Creating Daily Planner
    public DailyPlanner(String timeSlots){
        Event[] dailyTimetable = new Event[timeSlots.length]; 
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
        if (dailyTimetable[slot] != null){
            dailyTimetable[slot] = subject;
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

    public boolean removeSubject(int slot){
        for (int i = 0; i < timeSlots.length; i++){
            if (i == slot && dailyTimetable[i] != null){
                dailyTimetable[i] = null;
              return true;
            }
          }
          return false;
    }

    public boolean addGroupSession(GroupSession groupSession, int slot){
        if (dailyTimetable[slot] != null){
            dailyTimetable[slot] = groupSession;
            return true;
        }else return false;
    }

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

    public boolean removeGroupSession(int slot){
        for (int i = 0; i < timeSlots.length; i++){
            if (i == slot && dailyTimetable[i] != null){
                dailyTimetable[i] = null;
              return true;
            }
          }
          return false;
    }
 
    public boolean addExtracurricular(Extracurricular extracurricular){
        if (dailyTimetable[slot] != null){
            dailyTimetable[slot] = extracurricular;
            return true;
        }else return false;
    }

    public boolean rescheduleExtracurricular(Extracurricular extracurricular){
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