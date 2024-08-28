package baitap.bt03;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Department> departments = new ArrayList<>();
        departments.add(new Department("D001", "IT Department", 10));
        departments.add(new Department("D002", "HR Department", 5));
        departments.add(new Department("D003", "Finance Department", 40));
        departments.add(new Department("D004", "Marketing Department", 35));
        departments.add(new Department("D005", "Operations Department", 20));

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("E001", "John Doe", LocalDate.of(1990, 5, 15), true, 5000.0, null, departments.get(0)));
        employees.add(new Employee("E002", "Jane Smith", LocalDate.of(1985, 8, 20), false, 6000.0, employees.get(0), departments.get(0)));
        employees.add(new Employee("E003", "Michael Johnson", LocalDate.of(1982, 10, 10), true, 7000.0, employees.get(0), departments.get(1)));
        employees.add(new Employee("E004", "Emily Brown", LocalDate.of(1995, 3, 25), false, 5500.0, employees.get(2), departments.get(1)));
        employees.add(new Employee("E005", "David Wilson", LocalDate.of(1988, 12, 5), true, 8000.0, employees.get(2), departments.get(0)));
        employees.add(new Employee("E006", "Sarah Lee", LocalDate.of(1993, 6, 30), false, 6500.0, employees.get(2), departments.get(0)));
        employees.add(new Employee("E007", "Chris Martin", LocalDate.of(1987, 9, 18), true, 7500.0, employees.get(2), departments.get(1)));

        // tim ra 5 phong co so luong nhan vien dong nhat
            List<Department> sortdepartment = departments.stream().sorted(Comparator.comparing(Department::getTotalMembers).reversed()).toList();
            List<Department> topDepartments = sortdepartment.stream()
                .limit(5)
                .toList();
        for (Department department: topDepartments){
            System.out.println(department.getDepartmentName() +" | Member: " +department.getTotalMembers());
        }
        // Tìm ra người quản lý nhiều nhân viên nhất
        Employee managerWithMostEmployees = findManagerWithMostEmployees(employees);

        if (managerWithMostEmployees != null) {
            System.out.println("Người quản lý có nhiều nhân viên nhất là: " + managerWithMostEmployees.getEmployeeName());
        } else {
            System.out.println("Không có người quản lý nào.");
        }
        //Tim ra 5 nhan vien co tuoi cao nhat cong ty
            List<Employee> sortEmpoyeeAge = employees.stream().sorted(Comparator.comparing(Employee::getBirthday)).limit(5).toList();
            for (Employee employee: sortEmpoyeeAge){
                System.out.println(employee.getEmployeeName() + " Age: " + employee.getBirthday());
            }
        }
    public static Employee findManagerWithMostEmployees(List<Employee> employees) {
        Map<Employee, Integer> managerEmployeeCount = new HashMap<>();

        // Đếm số lượng nhân viên mỗi người quản lý
        for (Employee employee : employees) {
            Employee manager = employee.getManager();
            if (manager != null) {
                managerEmployeeCount.put(manager, managerEmployeeCount.getOrDefault(manager, 0) + 1);
            }
        }

        // Tìm người quản lý có số lượng nhân viên nhiều nhất
        Employee managerWithMostEmployees = null;
        int maxEmployees = 0;

        for (Map.Entry<Employee, Integer> entry : managerEmployeeCount.entrySet()) {
            if (entry.getValue() > maxEmployees) {
                maxEmployees = entry.getValue();
                managerWithMostEmployees = entry.getKey();
            }
        }

        return managerWithMostEmployees;
    }
}
