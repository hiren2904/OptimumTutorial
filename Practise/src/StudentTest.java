import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {

    public static void  main(String [] args ){

        List<Student> stlist =  new ArrayList<>();

        stlist.add(new Student("1","Hiren","MATHS",82));
        stlist.add(new Student("2","ravi","MATHS",96));
        stlist.add(new Student("3","Mohan","MATHS",97));
        stlist.add(new Student("4","Roy","MATHS",88));
        stlist.add(new Student("5","Aditya","MATHS",96));

        List<Student> stulist = stlist.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
                .limit(3)
                .collect(Collectors.toList());

        for( Student st: stulist){
            System.out.println( st.getName());
        }

    }
}
class Student{

    private String id;
    private String name;
    private String subject;
    private double percentage;

    public Student() {
    }

    public Student(String id, String name, String subject, double percentage) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.percentage = percentage;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", percentage='" + percentage + '\'' +
                '}';
    }
}