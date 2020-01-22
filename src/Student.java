// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data
    private String name;
    private double test1;
    private double test2;
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        test1 = 0;
        test2 = 0;
        name = studentName;
        //add body of constructor
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {System.out.println("Please enter the student's score for test 1");
        Scanner input = new Scanner(System.in);
        test1 = input.nextDouble();
        System.out.println("Please enter the student's score for test 2");
        test2 = input.nextDouble();
        //add body of inputGrades
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
public double getAverage() {
    //add header for getAverage
    double num = (test1 + test2) / 2;
    return num;
    //add body of getAverage
}
public String printName(String studentName) {
    String print = studentName;
    return print;
    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------
    //add header for printName
        //add body of printName
    }

    public String toString(){
        return "Name: "+ name + " \n" + "Test1: " + test1 + "\n"+"Test2: "+ test2;
    }
    // toString method:  Output in the following format
    // Name: Joe  Test1: 85  Test2: 91
}
