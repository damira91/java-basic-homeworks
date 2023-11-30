package ru.kudaiberdieva.homeworks.homework15;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMethods {
    public static List<String> getEmployeeNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    public static List<Employee> filterEmployeeByAge(List<Employee> employees, int minAge) {
        List<Employee> filteredList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                filteredList.add(employee);
            }
        }
        return filteredList;
    }

    public static boolean isAverageAgeAboveMin(List<Employee> employees, int minAverageAge) {
        if (employees.isEmpty()) {
            return false;
        }
        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.getAge();
        }
        int averageAge = totalAge / employees.size();
        return averageAge > minAverageAge;
    }
    public static Employee findYoungestEmployee(ArrayList<Employee> employees) {
        if (employees.isEmpty()) {
            return null;
        }

        Employee youngest = employees.get(0);

        for (Employee employee : employees) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }

        return youngest;
    }
}
