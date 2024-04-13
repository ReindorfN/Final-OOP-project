package final_oop_project;

import java.util.*;

public class Subject extends Event {

    //class specific instance variables
    private int numModules;
   private ArrayList<String> modules = new ArrayList<String>(); 
   private double progress;

   public Subject(String subjectName, String time, ArrayList<String> modules, double progress) {
       super(subjectName, time); // calling the constructor of the main event abstract class 
       this.modules = modules;
       this.progress = progress;
   }

   public Subject(String subjectName, String time){
    super(subjectName, time);
   }

   public ArrayList<String> getModules() { //getter 
       return modules;
   }
   
   public String getModule(int n){
        return this.modules.get(n);
   }

   public void setModules(ArrayList<String> modules) {  //setter
       this.modules = modules;
   }

   public double getProgress() { //getter
       return progress;
   }

   public void setProgress(double progress) { //setter 
       this.progress = progress;
   }

   // Implementation of the abstract method from Event
   @Override
   public void displayEventDetails() {
       System.out.println("Subject Name: " + this.eventName);
       System.out.println("Time: " + this.eventTime);
       System.out.println("Modules: " + this.modules);
       System.out.println("Progress: " + this.progress + "%");
   }
}
