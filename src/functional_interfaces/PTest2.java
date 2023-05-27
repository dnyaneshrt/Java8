package functional_interfaces;

import lamda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PTest2 {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Akash","Ingale"));
        students.add(new Student("Manoj","Sonawane"));
        students.add(new Student("Shekhar","Padalkar"));
        students.add(new Student("Neha","Dubey"));
        students.add(new Student("Sushant","Gajmal"));
        students.add(new Student("Akshay","Dambre"));

        System.out.println("student list without using predicates:");
        for (Student s:students)
        {
            System.out.println(s);
        }
        Predicate<Student> predicate=s->s.getFirstname().startsWith("A");

        System.out.println("student list after using predicates........................:");
        for (Student s:students)
        {
            if(predicate.test(s))
                System.out.println(s);
        }

        /* Predicate without using lamda.
         Predicate<Student> predicate2=new Predicate<Student>() {
                @Override
                public boolean test(Student student) {
                    if(student.getLastname().startsWith("D"))
                        return  true;
                    else
                      return false;
                }
            };
    */
        Predicate<Student> predicate2=s->s.getLastname().startsWith("D");
        System.out.println("student list after using predicates........................:");
        for (Student s:students)
        {
            if(predicate2.test(s))
                System.out.println(s);
        }

     //Predicate Joining
        System.out.println("student fname should starts with 'A' AND Lastname sthould starts with 'D'........................:");
        for (Student s:students)
        {
            if(predicate.and(predicate2).test(s))
                System.out.println(s);
        }

        System.out.println("student fname should starts with 'A' OR Lastname sthould starts with 'D'........................:");
        for (Student s:students)
        {
            if(predicate.or(predicate2).test(s))
                System.out.println(s);
        }


    }
}
