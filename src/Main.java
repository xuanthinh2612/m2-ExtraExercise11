import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        System.out.println("nhap vao so luong hoc sinh can them");
        int j = 0;
        int i = scanner.nextInt();
        while (j<i){
            Student student = createStudent();
            studentList.add(student);
            j++;
        }
        System.out.println("Menu");
        System.out.println("1.Them hoc sinh\n2.Tim theo nam sinh\n3.Tim theo ten lop" +
                "\n0.Exit");
        int choice = scanner.nextInt();
        while (choice != 0) {
            Student student1 = new Student();
            switch (choice) {
                case 1:
                    Student student = createStudent();
                    student1.add(studentList, student);
                    break;
                case 2:
                    System.out.println("Nam sinh");
                    scanner.nextLine();
                    String dateOfBirth = scanner.nextLine();
                    student1.findByDateOfBirth(studentList, dateOfBirth);
                    break;
                case 3:
                    System.out.println("Ten lop");
                    scanner.nextLine();
                    String className = scanner.nextLine();
                    student1.findByClassName(studentList, className);
                    break;
            }
            System.out.println("Menu");
            System.out.println("1.Them hoc sinh\n2.Tim theo nam sinh\n3.Tim theo ten lop" +
                    "\n0.Exit");
            choice = scanner.nextInt();
        }
    }

    static public Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho va ten");
        String name = scanner.nextLine();
        System.out.println("Ngay sinh");

        String dateOfBirth = scanner.nextLine();
        System.out.println("Dia chi");

        String address = scanner.nextLine();
        System.out.println("Lop");

        String className = scanner.nextLine();
        System.out.println("Khoa hoc");
        String year = scanner.nextLine();
        System.out.println("Ky hoc (1 or 2)");
        int semester = scanner.nextInt();

        Student student = new Student(name, dateOfBirth, address, className, year, semester);
        return student;
    }

}
