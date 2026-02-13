class Student {
    String name;
    double grades[] = new double[10];
    int count = 0;

    Student(String name) {
        this.name = name;
    }

    void addGrade(double grade) {
        grades[count] = grade;
        count++;
    }

    double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + grades[i];
        }
        return sum / count;
    }

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.print("Grades: ");
        for (int i = 0; i < count; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println("\nAverage: " + calculateAverage());
    }
}

class GradeManager {
    Student students[] = new Student[10];
    int count = 0;

    void addStudent(Student s) {
        students[count] = s;
        count++;
    }

    void findStudentByName(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].name.equals(name)) {
                students[i].displayStudentDetails();
            }
        }
    }

    void displayAllStudents() {
        for (int i = 0; i < count; i++) {
            students[i].displayStudentDetails();
        }
    }
}

public class MainGrade {
    public static void main(String[] args) {

        GradeManager g = new GradeManager();

        Student s1 = new Student("Asha");
        Student s2 = new Student("Rahul");

        g.addStudent(s1);
        g.addStudent(s2);

        s1.addGrade(80);
        s1.addGrade(90);
        s1.addGrade(85);

        s2.addGrade(70);
        s2.addGrade(75);
        s2.addGrade(65);

        g.displayAllStudents();

        System.out.println("\nSearch Result:");
        g.findStudentByName("Asha");
    }
}
