package final_oop_project;

import java.io.*;
import java.util.Scanner;

//import Student.java;


public class LogIn{
    public static void main(String... args){
       LogIn app1 = new LogIn();
       app1.begin();
    }

    public Student begin(){
        //boolean loggedin = false;
        Scanner input; String text; BufferedReader br; int userInput;  BufferedWriter bw; String signin; String passw = "";
        Scanner logins; Student student1 = new Student("","","","");

        String file = "C:/Users/ok/esktop/codes/Final-OOP-project/final_oop_project/info.txt";
        System.out.println("Welcome to the ....");
        System.out.println("Choose an option:");
        System.out.println("1 - Login(Already have an account)");
        System.out.println("2 - Signup(Create new account)");

        input = new Scanner(System.in);
        userInput = input.nextInt();
        input.nextLine();
        //input.close();

        switch (userInput) {
            case 2:

                //Creating a new student object
                logins = new Scanner(System.in);
                System.out.println("Enter your name: "); String name = logins.nextLine();
                System.out.println("Enter your ID: "); String ID = logins.nextLine();
                System.out.println("Enter Course of study: "); String course = logins.nextLine();
                System.out.println("Set a password: "); String password = logins.nextLine();


                student1 = new Student(name, ID, course, password);
                System.out.println("You have successfull created an account!!");
                //loggedin = true;

                try{bw = new BufferedWriter(new FileWriter(file));
                    bw.write("Name: "+ student1.getStudentName() +"\n");
                    //String idConvert = Integer.toString(Student1.get)
                    bw.write("ID: "+  ID + "\n");
                    bw.write("Course: "+ student1.getCourse() + "\n");
                    bw.write("password: "+ student1.getpassword()+ "\n");
                    
                    bw.close();

                }
                catch(FileNotFoundException e){
                    System.out.println("File not found");
                }
                catch(IOException e){
                    System.out.println("File reading Exception!!");
                }
                break;

            case 1:
                System.out.print("Please enter your password: ");
                signin = input.nextLine();

                try{
                    br = new BufferedReader(new FileReader(file));
                    while((text = br.readLine()) != null){
                        if(text.startsWith("password: ")){
                            passw = text.substring("password: ".length());
                            break;
                        }
                    }
                    
                    if(signin.equals(passw)){
                        System.out.println("You have logged in Successfully");
                    }
                    else{System.out.println("Incorrect password!!");}
                
                    br.close();
                }
            
                catch(FileNotFoundException e){
                    System.out.println("File not found");
                }
                catch(IOException e){
                    System.out.println("File reading Exception!");
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("Please select an option that is in the list");
                break;
        }
        input.close();
        return student1;
    }
}