import java.util.List;
import java.util.Scanner;

public class Student extends Person {
    private String className;
    private String year;
    private int semester;

    public Student() {
    }

    public Student(String name, String dateOfBirth, String address, String className, String year, int semester) {
        super(name, dateOfBirth, address);
        this.className = className;
        this.year = year;
        this.semester = semester;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Student{" +
                "className='" + className + '\'' +
                ", year='" + year + '\'' +
                ", semester=" + semester +
                '}';
    }

    public void add(List<Student> students, Student student) {
        students.add(student);
    }

    public void findByName(List<Student> students, String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                System.out.println(s);
            }
        }
    }
    public void findByClassName(List<Student> students, String className) {
        for (Student s : students) {
            if (s.getClassName().equals(className)) {
                System.out.println(s);
            }
        }
    }
    public void findByDateOfBirth(List<Student> students, String dateOfBirth) {
        for (Student s : students) {
            if (s.getDateOfBirth().equals(dateOfBirth)) {
                System.out.println(s);
            }
        }
    }


}
