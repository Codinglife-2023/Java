package QAP3.Q1;

// Student.java
public class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA;   // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter methods
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setter methods
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
// The Student class extends the Person class. It has two additional instance variables, myIdNum and myGPA, which represent the student's ID number and grade point average, respectively. The constructor initializes these variables along with the inherited variables from the Person class. The class also provides getter and setter methods for the new variables, as well as an overridden toString method that includes the student's ID number and GPA in the output.
