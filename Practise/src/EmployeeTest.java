import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String []args){

        List<Employee> emplist = new ArrayList<>();

        emplist.add(new Employee("001","alice","Female","IT",50000));
        emplist.add(new Employee("002","Bob", "Male","HR", 60000));
        emplist.add(new Employee("003","Charlie", "Male", "HR",70000));
        emplist.add(new Employee("004","Diana", "Female", "IT",55000));
        emplist.add(new Employee("005","Eve", "Female", "admin",48000));

        Map<String, Double> collect = emplist.stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect);

    }
}

class Employee{
    String id;
    String name;
    String gender;
    String department;
    double salary;

    public Employee() {
    }

    public Employee(String id, String name, String gender, String department, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}




