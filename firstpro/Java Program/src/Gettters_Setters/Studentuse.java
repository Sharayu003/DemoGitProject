package Gettters_Setters;

public class Studentuse {
    public static void main(String[] args){
        student Student = new student();
        Student.name ="Sharayu";
        Student.setRoll_No(3);
        System.out.println("My name is "+Student.name+" and Roll No "+Student.getRoll_No());
    }
}
