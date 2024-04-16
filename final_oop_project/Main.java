package final_oop_project;

import java.util.Scanner;

//MAIN PROGRAM
public class Main {
	public static void main(String args[], String studentName) {

		Student weeklyPlanner = new Student();
		Student currentStudent = new Student("Maame", "54552026", "MIS", "abc123");
		Student name = currentStudent;

		if (currentStudent.passwordChecker()) {
			while (true) {
				System.out.println("Welcome" + name + "to your Planner");
				System.out.println("Enter a number to continue");
				System.out.println("1) View your planner for the week");
				System.out.println("2) Add an event");
				System.out.println("3) Reschedule an event");
				System.out.println("4) Cancel an event");

				Scanner input = new Scanner(System.in);
				int menu = input.nextInt();

				// Switch Loop to run menu selection
				switch (menu) {
					case 1:
						currentStudent.displayWeeklyTimetable();
						break;

					case 2:
						System.out.println("ADD AN EVENT");
						System.out.println(
								"What type of event are you adding? SUBJECT, GROUP SESSION or EXTRACURRICULAR(Type in caps)");
						String event = input.nextLine(); // Changed nextLine() to next()

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

							System.out.println("What is your lecturer?");
							String lecturer = input.nextLine();

							System.out.println("Who is your faculty Intern?");
							String facultyIntern = input.nextLine();

							System.out.println("What is the class location");
							String location = input.nextLine();

							Subject currentSubject = new Subject(subjectName, modules, progress, courseCode, lecturer,
									facultyIntern, location, times); // Removed assignment
							System.out.println(
									"What day do you want to add your event to from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
							index = input.nextInt();
							input.nextLine();

							System.out.println(
									"What time do you want to add your event to from? Enter a number from 0-7 (8am(0) - 10pm(14))?");
							index2 = input.nextInt();
							input.nextLine();

							currentStudent.addSubject(index, index2, currentSubject);

						} else if (event.equals("GROUP SESSION")) {
							System.out.println("What is the name of your group session?");
							String GroupSessionName = input.nextLine();
							System.out.println("What time is your group session?");
							String time = input.nextLine();
							System.out.println("What is the purpose of the course");
							String purpose = input.nextLine();

							GroupSession newGroupSession = new GroupSession(GroupSessionName, time, purpose); // Removed
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

						} else if (event.equals("EXTRACURRICULAR")) {
							System.out.println("What is the name of your extracurricular?");
							String extraCurricular = input.nextLine();

							System.out.println("What time is your activity?");
							String activityTime = input.nextLine();

							System.out.println("How much time do you plan to spend");
							double timeSpent = input.nextDouble();
							input.nextLine();

							Extracurricular newExtracurricular = new Extracurricular(extraCurricular, activityTime,
									timeSpent); // Removed assignment

							System.out.println(
									"What day do you want to add your event to from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
							index = input.nextInt();
							input.nextLine();

							System.out.println(
									"What time do you want to add your event to from? Enter a number from 0-7 (8am(0) - 10pm(14))?");
							index2 = input.nextInt();
							input.nextLine();

							currentStudent.addExtracurricular(index, index2, newExtracurricular);

						} else {
							System.out.println("Invalid Input");
						}
						break;

					case 3:
						System.out.println("RESCHEDULE AN EVENT");

						System.out.println(
								"What day would you want to reschedule the event from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
						int dayIndex = input.nextInt();

						System.out.println(
								"What type of event are you adding? SUBJECT, GROUP SESSION or EXTRACURRICULAR(Type in caps)");
						String rescheduledEvent = input.nextLine();

						System.out.println(
								"What time do you want to reschedule your event from? Enter a number from 0-7 (8am(0) - 10pm(14))?");
						int eventTime = input.nextInt();
						input.nextLine();

						System.out.println(
								"What day would you want to reschedule the event to? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
						int dayIndex = input.nextInt();

						System.out.println(
								"What time do you want to reschedule your event to? Enter a number from 0-7 (8am(0) - 10pm(14))?");
						int eventTime = input.nextInt();
						input.nextLine();

						if (cancelEvent.equals("SUBJECT")) {

							weeklyPlanner.removeSubject(dayIndex, eventTime);

						} else if (cancelEvent.equals("GROUP SESSION")) {

							weeklyPlanner.removeGroupSession(dayIndex, eventTime);

						} else if (cancelEvent.equals("EXTRACURRICULAR")) {

							weeklyPlanner.removeExtracurricular(dayIndex, eventTime);

						} else {
							System.out.println("Invalid Input");
						}

						break;

					case 4:
						System.out.println("CANCEL AN EVENT");

						System.out.println(
								"What day would you want to cancel the event from? Enter a number from 0-7 (Sunday(0) - Saturday(7))?");
						int dayIndex = input.nextInt();

						System.out.println(
								"What type of event are you adding? SUBJECT, GROUP SESSION or EXTRACURRICULAR(Type in caps)");
						String cancelEvent = input.nextLine();

						System.out.println(
								"What time do you want to cancel your event to from? Enter a number from 0-7 (8am(0) - 10pm(14))?");
						int eventTime = input.nextInt();
						input.nextLine();

						if (cancelEvent.equals("SUBJECT")) {

							weeklyPlanner.removeSubject(dayIndex, eventTime);

						} else if (cancelEvent.equals("GROUP SESSION")) {

							weeklyPlanner.removeGroupSession(dayIndex, eventTime);

						} else if (cancelEvent.equals("EXTRACURRICULAR")) {

							weeklyPlanner.removeExtracurricular(dayIndex, eventTime);

						} else {
							System.out.println("Invalid Input");
						}

						break;

					default:
						System.out.println("Please select an option that is included in the menu options ");
						break;
				}
				input.close();
			}
		}
	}
}
