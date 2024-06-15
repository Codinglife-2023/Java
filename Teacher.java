package QAP3.Q1;

// Teacher.java
public class Teacher extends Person {
    private String mySubject; // subject the teacher teaches
    private double mySalary;  // teacher's annual salary

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    // Getter methods
    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    // Setter methods
    public void setSubject(String subject) {
        mySubject = subject;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: $" + mySalary;
    }
}
// The Teacher class extends the Person class. It has two additional instance variables, mySubject and mySalary, which represent the teacher's subject and annual salary, respectively. The constructor initializes these variables along with the inherited variables from the Person class. The class also provides getter and setter methods for the new variables, as well as an overridden toString method that includes the teacher's subject and salary in the output.