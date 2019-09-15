package com.jengstrom;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
// ANONYMOUS CLASS:
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the Runnable");
//            }
//        }).start();
//    }

// USING A LAMBDA EXPRESSION:
// Accomplishes the same thing as using classes, but more concisely
//        new Thread(()-> System.out.println("Printing from the Runnable")).start();

// Every Lambda expression has three parts:
//1. Argument list: ()
//2. Arrow token: ->
//3. Body: System.out.println("Printing from the Runnable")

        new Thread(() -> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n", 3);
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee jordan = new Employee("Jordan Engstrom", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(jordan);
        employees.add(jack);
        employees.add(snow);

//        for(Employee employee : employees) {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        }

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

//        SORTING WITHOUT A LAMBDA EXPRESSION (using an anonymous class instead):
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

//      SORTING WITH A LAMBDA EXPRESSION:
//        Collections.sort(employees, (employee1, employee2) ->
//                employee1.getName().compareTo(employee2.getName()));
//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//        }

//      WITHOUT USING A LAMBDA EXPRESSION (using an anonymous class instead):
//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        },
//        employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

//      USING A LAMBDA EXPRESSION:
//        UpperConcat uc = (s1, s2)-> s1.toUpperCase() + s2.toUpperCase();

//      MULTILINE LAMBDA
//        UpperConcat uc = (s1, s2)-> {
//            String result = s1.toUpperCase() + s2.toUpperCase();
//            return result;
//        };

//        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }

}

// USING A SEPARATE CLASS:
//class CodeToRun implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("Printing from the Runnable");
//    }
//};

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething() {
        int i = 0;
        UpperConcat uc = (s1, s2)-> {
            System.out.println("The lambda expression's class is: " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            System.out.println("i in the lambda expression = " + i);
            return result;
        };
        System.out.println("The AnotherClass's class name is: " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");
    }

    public void printValue() {
        int number = 25;
        Runnable r = () -> {
            try {
                Thread.sleep(5000);

            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is: " + number);
        };
        new Thread(r).start();
    }
}