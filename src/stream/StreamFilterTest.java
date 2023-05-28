package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterTest {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(10,"Akshay",new Address("Pune",1500)));
        employeeList.add(new Employee(11,"Sachin",new Address("Satara",1600)));
        employeeList.add(new Employee(12,"Surabhi",new Address("Patana",1700)));
        employeeList.add(new Employee(13,"Neha",new Address("Patana",1700)));
        employeeList.add(new Employee(14,"Manoj",new Address("Patana",1700)));
        employeeList.add(new Employee(15,"Akash",new Address("Pune",1500)));

        //1] Filter:  The filter method is used to select elements as per the Predicate passed as an argument.
        //Find the list of employees whose address is patana.

        System.out.println("list of all emps are as follows:::=================================");
        for(Employee employee:employeeList)
        {
            System.out.println(employee);
        }

        System.out.println("list of emps who are from patana (Without using java 8):::=================================");
        for(Employee employee:employeeList)
        {
            if(employee.getEaddress().getCity().equals("Patana"))
                        System.out.println(employee);
        }
        System.out.println("list of emps who are from patana (using stream but without using lamda):::=================================");
       /* employeeList.stream()
                .filter(new Predicate<Employee>() {
                    @Override
                    public boolean test(Employee employee) {
                        if(employee.getEaddress().getCity().equals("Patana"))
                            return true;
                       else
                           return false;
                    }
                }).forEach(emp-> System.out.println(emp));*/

        employeeList.stream()
                .filter(new Predicate<Employee>() {
                    @Override
                    public boolean test(Employee employee) {
                        if(employee.getEaddress().getCity().equals("Pune"))
                            return true;
                        else
                            return false;
                    }
                }).forEach(System.out::println);

        System.out.println("list of emps who are from patana (using stream using lamda):::=================================");
       /* employeeList.stream()
                .filter(emp->emp.getEaddress().getCity().equals("Pune"))
                .forEach(System.out::println);*/
       List filteredList= employeeList.stream()
                .filter(emp->emp.getEaddress().getCity().equals("Pune"))
                .collect(Collectors.toList());
       System.out.println(filteredList);

       //find list of emps whose name starts with 'A'.
        System.out.println("list of emps whose name starts with 'A as below:" );
      /* Long count= employeeList.stream()
                .filter(e->e.getEname().startsWith("A"))
                .count();
        System.out.println(count);*/

        employeeList.stream()
                .filter(e->e.getEname().startsWith("A"))
                .forEach(System.out::println);


        // 2] sorted: The sorted method is used to sort the stream.
      /*  List<Integer> nums=Arrays.asList(15,5,4,5,1,15,8,4,58,21);


        System.out.println("list of nums in ascending order:");
        nums.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("list of nums in descending order:");
      *//*  nums.stream()
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                })
                .forEach(System.out::println);*//*
        nums.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);*/

        //get all employees in ascending order.
        System.out.println("list of emps in ascending order::");
      /* 1.
       employeeList.stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getEname().compareTo(o2.getEname());
                    }
                }).forEach(System.out::println);*/

     /*   2.
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getEname))
                .forEach(System.out::println);
*/
        employeeList.stream()
                .sorted((e1,e2)->e1.getEname().compareTo(e2.getEname()))
                .forEach(System.out::println);

        System.out.println("list of emps in descending order::");
        employeeList.stream()
                .sorted((e2,e1)->e1.getEname().compareTo(e2.getEname()))
                .forEach(System.out::println);


      //map: The map method is used to return a stream consisting of the results of applying the given function to the elements of this stream.

       //convert all names of emps in upperCase.
        System.out.println("all names in capital letter is as follows.");
        employeeList.stream()
            .map(name->name.getEname().toUpperCase())
            .forEach(System.out::println);

        employeeList.stream()
          .filter(e->e.getEaddress().getCity().equals("Pune"))
          .map(emp->emp.toString().toUpperCase())
          .forEach(System.out::println);

        System.out.println("list of square of sorted numbers");
        List<Integer> nums=Arrays.asList(15,5,4,5,1,15,8,4,58,21);
        nums.stream()
                .map(n->n*n)
                .sorted()
                .forEach(System.out::println);
    }
}
