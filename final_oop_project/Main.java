package final_oop_project;

import java.util.NoSuchElementException;
import java.util.Scanner;
//import java.io.*;

//MAIN PROGRAM
public class Main {
	public static void main(String args[]) {

		//LogIn app1 = new LogIn();
		//app1.begin();
		//Extracurricular test1 = new Extracurricular("Painting", "5pm", 30);
		

		Tips t = new Tips();
		
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Ashesi Student Planner.");
        System.out.println("Let's begin by creating an account.");
		System.out.print("Enter your name: "); String studentName = input.nextLine();

		System.out.print("Enter your student ID number: "); String studentID = input.nextLine();

		System.out.print("Enter the course you are studying: "); String studentCourse = input.nextLine();

		System.out.print("Enter your password: "); String studentPassword = input.nextLine();

		Student currentStudent = new Student(studentName, studentID, studentCourse, studentPassword);
		//currentStudent.addExtracurricular(4,3, test1);

		try{
		if ((currentStudent.checkPassword(studentPassword)) == true) {
			while (true) {
				System.out.println("Welcome " + currentStudent.getStudentName() + " to your Planner");
				System.out.println("Enter a number to continue");
				System.out.println("1) View your planner for the week");
				System.out.println("2) Add an event");
				System.out.println("3) Reschedule an event");
				System.out.println("4) Cancel an event");

				int menu = input.nextInt();
				input.nextLine();

				// Switch Loop to run menu selection
				switch (menu) {
					case 1:
						currentStudent.displayWeeklyTimetable();
						break;

					case 2:
						System.out.println("ADD AN EVENT");
						System.out.println(
								"What type of event are you adding? SUBJECT, GROUP SESSION or EXTRACURRICULAR(Type in caps)");
						String event = input.nextLine(); //input.nextLine(); // Changed nextLine() to next()

						int index = 0;
						int index2 = 0;

						if (event.equals("SUBJECT")) {
							System.out.println("What is the subject name?");
							String subjectName = input.nextLine();

							System.out.println("What is the subject times?");
							String times = input.nextLine();

							System.out.println("How many modules are there?");
							int modules = input.nextInt();
							input.nextLine();

							System.out.println("What is your progress?");
							double progress = input.nextDouble();
							input.nextLine();

							System.out.println("What is the course code?");
							String courseCode = input.nextLine();

							System.out.println("Who is your lecturer?");
							String lecturer = input.nextLine();

							System.out.println("Who is your faculty Intern?");
							String facultyIntern = input.nextLine();

							System.out.println("What is the class location");
							String location = input.nextLine();

							Subject currentSubject;
							currentSubject = new Subject(subjectName, modules, progress, courseCode, lecturer,
									facultyIntern, location, times); // Removed assignment

							System.out.println(
									"What day do you want to add your event to from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
							index = input.nextInt();
							input.nextLine();

							System.out.println(
									"What time do you want to add your event to from? Enter a number from 0-14 (8am(0) - 10pm(14))?");
							index2 = input.nextInt();
							input.nextLine();

							currentStudent.addSubject(index, index2, currentSubject);

							t.getTip();

						} else if (event.equals("GROUP SESSION")) {
							System.out.println("What is the name of your group session?");
							String GroupSessionName = input.nextLine();
							System.out.println("What time is your group session?");
							String time = input.nextLine();
							System.out.println("What is the purpose of the course");
							String purpose = input.nextLine();

							GroupSession newGroupSession;
							newGroupSession = new GroupSession(GroupSessionName, time, purpose); // Removed
																												// assignment
							System.out.println(
									"What day do you want to add your event to from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
							index = input.nextInt();
							input.nextLine();

							System.out.println(
									"What time do you want to add your event to from? Enter a number from 0-7 (8am(0) - 10pm(14))?");
							index2 = input.nextInt();
							input.nextLine();

							currentStudent.addGroupSession(index, index2, newGroupSession);

							t.getTip();

						} else if (event.equals("EXTRACURRICULAR")) {
							System.out.println("What is the name of your extracurricular?");
							String extraCurricular = input.nextLine();

							System.out.println("What time is your activity?");
							String activityTime = input.nextLine();

							System.out.println("How much time do you plan to spend");
							double timeSpent = input.nextDouble();
							input.nextLine();

							Extracurricular newExtracurricular;
							newExtracurricular = new Extracurricular(extraCurricular, activityTime,
									timeSpent); // Removed assignment

							System.out.println(
									"What day do you want to add your event to from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
							index = input.nextInt();
							input.nextLine();

							System.out.println(
									"What time do you want to add your event to from? Enter a number from 0-14 (8am(0) - 10pm(14))?");
							index2 = input.nextInt();
							input.nextLine();

							currentStudent.addExtracurricular(index, index2, newExtracurricular);

							t.getTip();

						} else {
							System.out.println("Invalid Input");
						}
						break;

					case 3:
						System.out.println("RESCHEDULE AN EVENT");

						int dayIndex;
						int eventTime;
						String rescheduledEvent;
						String rescheduledEventTimes;
						String rescheduledEventPurpose;

						System.out.println(
								"What type of event are you adding? SUBJECT, GROUP SESSION or EXTRACURRICULAR(Type in caps)");
						rescheduledEvent = input.nextLine();


						if (rescheduledEvent.equals("SUBJECT")) {
							System.out.println(
								"When do you normally have this event?");
							rescheduledEventTimes = input.nextLine();

							Subject rescheduledSubject = new Subject(rescheduledEvent,rescheduledEventTimes);
							System.out.println(
								"What day would you want to reschedule the event from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
							dayIndex = input.nextInt();
							input.nextLine();

							System.out.println(
								"What time do you want to reschedule your event from? Enter a number from 0-7 (8am(0) - 10pm(14))?");
							eventTime = input.nextInt();
							input.nextLine();

							currentStudent.rescheduleSubject(dayIndex, eventTime, rescheduledSubject);

						} else if (rescheduledEvent.equals("GROUP SESSION")) {
							System.out.println(
								"When do you normally have this event?");
							rescheduledEventTimes = input.nextLine();

							System.out.println(
								"What is the purpose of this event?");
							rescheduledEventPurpose = input.nextLine();

							GroupSession rescheduledGroupSession = new GroupSession(rescheduledEvent,rescheduledEventTimes,rescheduledEventPurpose);
							System.out.println(
								"What day would you want to reschedule the event from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
							dayIndex = input.nextInt();
							input.nextLine();
							
							System.out.println(
								"What time do you want to reschedule your event from? Enter a number from 0-7 (8am(0) - 10pm(14))?");
							eventTime = input.nextInt();
							input.nextLine();

							currentStudent.rescheduleGroupSession(dayIndex, eventTime, rescheduledGroupSession);

						} else if (rescheduledEvent.equals("EXTRACURRICULAR")) {
							System.out.println(
								"When do you normally have this event?");
							rescheduledEventTimes = input.nextLine();

							System.out.println(
								"How long would you want to spend at this event the event from?");
							double timeSpent = input.nextDouble();
							input.nextLine();

							Extracurricular rescheduledExtracurricular = new Extracurricular(rescheduledEvent, rescheduledEventTimes, timeSpent);

							System.out.println(
								"What day would you want to reschedule the event from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
							dayIndex = input.nextInt();
							input.nextLine();
							
							System.out.println(
								"What time do you want to reschedule your event from? Enter a number from 0-7 (8am(0) - 10pm(14))?");
							eventTime = input.nextInt();
							input.nextLine();


							currentStudent.rescheduleExtracurricular(dayIndex, eventTime,rescheduledExtracurricular);

						} else {
							System.out.println("Invalid Input");
						}

						break;

					case 4:
						System.out.println("CANCEL AN EVENT");

						System.out.println(
								"What type of event are you removing? SUBJECT, GROUP SESSION or EXTRACURRICULAR(Type in caps)");
						String cancelEvent = input.nextLine();

						if (cancelEvent.equals("SUBJECT")) {
							System.out.println(
								"What day would you want to cancel the event from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
							dayIndex = input.nextInt();
							input.nextLine();

							System.out.println(
								"What time do you want to cancel your event to from? Enter a number from 0-7 (8am(0) - 10pm(14))?");
							eventTime = input.nextInt();
							input.nextLine();

							currentStudent.removeSubject(dayIndex, eventTime);
							t.getTip();

						} else if (cancelEvent.equals("GROUP SESSION")) {
							System.out.println(
								"What day would you want to cancel the event from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
							dayIndex = input.nextInt();
							input.nextLine();

							System.out.println(
								"What time do you want to cancel your event to from? Enter a number from 0-7 (8am(0) - 10pm(14))?");
							eventTime = input.nextInt();
							input.nextLine();

							currentStudent.removeGroupSession(dayIndex, eventTime);
							t.getTip();

						} else if (cancelEvent.equals("EXTRACURRICULAR")) {
							System.out.println(
								"What day would you want to cancel the event from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
							dayIndex = input.nextInt();
							input.nextLine();

							System.out.println(
								"What time do you want to cancel your event to from? Enter a number from 0-7 (8am(0) - 10pm(14))?");
							eventTime = input.nextInt();
							input.nextLine();

							currentStudent.removeExtracurricular(dayIndex, eventTime);
							t.getTip();

						} else {
							System.out.println("Invalid Input");
						}

						break;

					default:
						System.out.println("Please select an option that is included in the menu options ");
						break;
				}
				break;
			}
	}
	else{
		System.out.println("You cannot be logged In. Incorrect credentials!!");
	}}
	catch(IllegalStateException e){
		System.out.println("Illegal ENTRY");
	}
	catch(NullPointerException e){
		System.out.println("Null pointer");
	}
	catch(NoSuchElementException e){
		System.out.println("No such element");
	}
	finally{
		input.close();
	}

}
}
