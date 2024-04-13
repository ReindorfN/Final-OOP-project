package final_oop_project;

import java.util.*;

public class Tips{
    //class variables
    static private ArrayList<String> adviceCategory = new ArrayList<String>();
    static {
        adviceCategory.add("Don't cram, take your time to understand!");
        adviceCategory.add("Ask for help when you get stuck");
        adviceCategory.add("Study in groups so you can understand better");
        adviceCategory.add("Find your learning style and study accordingly");
        adviceCategory.add("Go into a study session with a plan of what you want to do");
        adviceCategory.add("Take breaks in between study sessions(It boosts information retention!)");
        adviceCategory.add("Find/Create a distraction-free space for studying");
        adviceCategory.add("Reward yourself to remain motivated during study sessions");
        adviceCategory.add("Dedicate a portion of your study session to reviewing what you've learnt");
        adviceCategory.add("Set specific goals to make your study sessions more effective");
    }

    
    public Tips(){} //constructor

    public String getTip(){
        Random random = new Random();
        int n = random.nextInt(adviceCategory.size());
        return adviceCategory.get(n);
    }
}