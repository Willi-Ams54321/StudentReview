package ie.atu.OOP;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        Student first = new Student( "1","Paul");
        students.add(first);
        Student second  = new Student( "2","John");

        for(Student s: students)
        {
            System.out.println("details of student"+ s);
        }
    }
}