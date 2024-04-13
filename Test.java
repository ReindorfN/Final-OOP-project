public class Test{
    public static void main(String... args){
        Student student1 = new Student("Ama", 45432028, "MIS", "helloworld");
        student1.setStudentName("Abraham");
        student1.setStudentID(8854720);
        System.out.println(student1.getStudentName());
        System.out.println(student1.getPassword());
        System.out.println(student1.getStudentID());
        System.out.println(student1.getcourse());
    }
}