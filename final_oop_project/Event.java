package final_oop_project;

//created an abstract class claled event that will be implemented in our Subject, 
//ExtraCurricular and Groupsession concrete classes 

public abstract class Event {

    //made these protected so that the other classes in the package can use them
    protected String eventName;
    protected double eventTime; // Will probably have to use the time class for this 

    public Event(String eventName, double eventTime) {
        this.eventName = eventName;
        this.eventTime = eventTime;
    }
    
    //method to be overriden in the other classes 
    public abstract void displayEventDetails();{

    }
}