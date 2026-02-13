class Employee {
    String employeeId;
    String name;
    String role;
    double baseSalary;
    double salary;

    Employee(String id, String n, String r, double b) {
        employeeId = id;
        name = n;
        role = r;
        baseSalary = b;
    }

    void calculateSalary() {
        switch(role) {
            case "Manager":
                salary = baseSalary + baseSalary * 0.20;
                break;
            case "Developer":
                salary = baseSalary + baseSalary * 0.10;
                break;
            case "Designer":
                salary = baseSalary + baseSalary * 0.05;
                break;
            case "Intern":
                salary = 1000;
                break;
        }
    }

    void applyDeduction(double amount) {
        salary = salary - amount;
    }

    void display() {
        System.out.println(employeeId + " " + name + " " + role + " Salary: " + salary);
    }
}

class Payroll {
    Employee emp[] = new Employee[5];
    int count = 0;

    void addEmployee(Employee e) {
        emp[count] = e;
        count++;
    }

    void calculateAllSalaries() {
        for(int i=0;i<count;i++) {
            emp[i].calculateSalary();
            emp[i].display();
        }
    }

    Employee findEmployeeById(String id) {
        for(int i=0;i<count;i++)
            if(emp[i].employeeId.equals(id))
                return emp[i];
        return emp[0];
    }
}

public class MainEmp {
    public static void main(String[] args) {

        Payroll p = new Payroll();

        p.addEmployee(new Employee("1","Asha","Manager",5000));
        p.addEmployee(new Employee("2","Rahul","Developer",4000));
        p.addEmployee(new Employee("3","Riya","Intern",2000));

        p.calculateAllSalaries();

        Employee e = p.findEmployeeById("1");
        e.applyDeduction(500);

        System.out.println("After Deduction:");
        e.display();
    }
}
