package studentsinformation;

public class Student {
    
private String name;
    private String course;
    private double grade;

    public Student(String name, String course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    
    public String toString() {
        return "Name: " + name + ", Course: " + course + ", Grade: " + grade;
    }
}
