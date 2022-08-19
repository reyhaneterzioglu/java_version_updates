package com.cydeo.task;

import java.util.Collection;
import java.util.List;

import static com.cydeo.task.EmployeeData.readAll;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println("print all emails");

        readAll() // EmployeeData.readAll() without static import // Stream<Employee>
                .map(Employee::getEmpEmail) // Stream<String> // employee->employee.getEmpEmail()
                .forEach(System.out::println); // Stream closed

        System.out.println("-----------------------------------------------------------");

        System.out.println("print all phone numbers");

        readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");

        System.out.println("print all phone numbers with double colon");

        readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
