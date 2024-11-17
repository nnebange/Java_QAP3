// CollegeStudent.java
public class CollegeStudent extends Student {
    private String major; // Major of the college student
    private int year;     // Current year (1 for Frosh, 2 for Soph, etc.)

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    // Getter and setter methods
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
