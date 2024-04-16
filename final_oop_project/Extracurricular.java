package final_oop_project;

public class Extracurricular extends Event {

    // class specific instance variables
    private double timeSpent;

    public Extracurricular(String extraCurricular, String time, double timeSpent) {
        super(extraCurricular, time); // reference to superclass constructor
        this.timeSpent = timeSpent;
    }

    public double getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(double timeSpent) {
        this.timeSpent = timeSpent;
    }

    // Implementation of the abstract method from Event
    @Override
    public void displayEventDetails() {
        System.out.println("Extra-Curricular event name: " + this.eventName);
        System.out.println("Time: " + this.eventTime);
        System.out.println("Time spent: " + this.timeSpent);
    }
}
