package lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Collection works with only object not with primitive types.
public class SortTest {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Akash","Ingale"));
        students.add(new Student("Manoj","Sonawane"));
        students.add(new Student("Shekhar","Padalkar"));
        students.add(new Student("Neha","Dubey"));
        students.add(new Student("Sushant","Gajmal"));
        students.add(new Student("Akshay","Dambre"));

//        System.out.println(students);

        for(Student student:students)
        {
            System.out.println(student);
        }
        System.out.println("after soring using comparable.....");

        Collections.sort(students);

        for(Student student:students)
        {
            System.out.println(student);
        }

        System.out.println("after sorting in desc order based on sir names--------------------------");
     /*   Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getLastname().compareTo(o1.getLastname());
            }
        });*/
        Collections.sort(students, (o1,o2)->o2.getLastname().compareTo(o1.getLastname()));
        for(Student student:students)
        {
            System.out.println(student);
        }
        System.out.println("after sorting in asc order based on first names-------------------");

//        Collections.sort(students, (o1,o2)->o1.getFirstname().compareTo(o2.getFirstname()));
        Collections.sort(students, Comparator.comparing(Student::getFirstname));
        for(Student student:students)
        {
            System.out.println(student);
        }

        System.out.println("after sorting in asc order based on last names-------------------");
        Collections.sort(students,Comparator.comparing(Student::getLastname));
        for(Student student:students)
        {
            System.out.println(student);
        }

        System.out.println("after sorting in asc order based on last names-------------------");
        Collections.sort(students,Comparator.comparing(Student->Student.getLastname()));
        for(Student student:students)
        {
            System.out.println(student);
        }
    }
}
