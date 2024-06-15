package QAP3.Q1;

// CollegeStudent.java
public class CollegeStudent extends Student {
    private String myMajor; // major of the student
    private int myYear;     // current level in college

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }

    // Getter methods
    public String getMajor() {
        return myMajor;
    }

    public int getYear() {
        return myYear;
    }

    // Setter methods
    public void setMajor(String major) {
        myMajor = major;
    }

    public void setYear(int year) {
        myYear = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year: " + myYear + ", Major: " + myMajor;
    }
}
// The CollegeStudent class extends the Student class. It has two additional instance variables, myMajor and myYear, which represent the student's major and current year in college, respectively. The constructor initializes these variables along with the inherited variables from the Student class. The class also provides getter and setter methods for the new variables, as well as an overridden toString method that includes the student's major and year in the output.
