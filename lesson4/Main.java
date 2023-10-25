package ru.geekbrains.JDK.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Employee employee = new Employee(1, "89991234566", "Василий", 10);
        Employee employee1 = new Employee(2, "89873246788", "Егор", 15);
        Employee employee2 = new Employee(3, "89229875432", "Кузьма", 7);
        Employee employee3 = new Employee(4, "89191246745", "Пётр", 18);
        Employee employee4 = new Employee(4, "89191246745", "Пётр", 18);

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        System.out.println(list);

        System.out.println("Поиск сотрудника по стажу: " + findEmployeeByExperience2(list, 15));
        System.out.println("Поиск номера телефона по имени: " + findEmployeeByPhone(list, "Егор"));
        System.out.println("Поиск сотрудника по id: " + findEmployeeById(list, 3));

        System.out.println("Добавление нового сотрудника: " +
                addNewEmployee(list, 5, "89345679832", "Иван", 12));
    }

    public static List<Employee> findEmployeeByExperience2(List<Employee> employeeList, int exper) {
        List<Employee> emp = new ArrayList<>();
        for (Employee e : employeeList) {
            if (e.getExperience() == exper) {
                emp.add(e);
                return emp;
            }
        }
        return null;
    }


    public static String findEmployeeByPhone(List<Employee> phoneList, String name) {
        for (Employee e : phoneList) {
            if (e.getName().equals(name)) {
                return "телефон сотрудника " + e.getName() + " : " + e.getPhoneNumber();
            }
        }
        return "такого сотрудника нет";
    }


    public static Employee findEmployeeById(List<Employee> nameList, int id) {
        for (Employee e : nameList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public static List<Employee> addNewEmployee(List<Employee> list1, int id, String phone,
                                                String name, int experience) {
        list1.add(new Employee(id, phone, name, experience));
        return list1;
    }
}
