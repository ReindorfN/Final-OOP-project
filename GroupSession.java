public class GroupSession extends Event {
    //class specific instance variables
    private String purpose;

    public GroupSession(String GroupSessionName, double time, String purpose) {
        super(GroupSessionName, time); //reference to the superclass' constructor 
        this.purpose = purpose;
        
        //Maisy: shouldn't the groupSessionName be small g because it is a variable?
    }
    public String getPurpose(){ //getter
        return purpose; 
    } 

    public void setPurpose(String purpose){ //setter
        this.purpose = purpose; 
    }

    // Implementation of the abstract method from Event
    @Override
    public void displayEventDetails() {
        System.out.println("Group session: " + this.eventName);
        System.out.println("Time: " + this.eventTime);
        System.out.println("Purpose for meeting: " + this.purpose);
    }
}