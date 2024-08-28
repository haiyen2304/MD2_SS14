package baitap.bt03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employee {
    private String employeeId,employeeName;
    private LocalDate birthday;
    private boolean sex;
    private double salary;
    private Employee manager;
    private Department department;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, LocalDate birthday, boolean sex, double salary, Employee manager, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.sex = sex;
        this.salary = salary;
        this.manager = manager;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao Employee Id: ");
        this.employeeId = sc.nextLine();
        System.out.println("Nhap vao Employee Name: ");
        this.employeeName = sc.nextLine();
        System.out.println("Nhap vao birthday");
        String day = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.birthday = LocalDate.parse(day,formatter);
        System.out.println("Nhap vao gioi tinh");
        this.sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhap vao luong co ban");
        this.salary = Double.parseDouble(sc.nextLine());
        this.manager = null;
    }
}
