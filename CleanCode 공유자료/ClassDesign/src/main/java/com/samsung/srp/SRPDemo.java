package com.samsung.srp;

// 직원 데이터를 관리하는 클래스
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

// 직원 정보를 출력하는 책임을 가진 클래스
class EmployeePrinter {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("직원 이름: " + employee.getName());
        System.out.println("직원 급여: " + employee.getSalary());
    }
}

// 급여 계산을 담당하는 클래스
class SalaryCalculator {
    public double calculateAnnualSalary(Employee employee) {
        return employee.getSalary() * 12;
    }
}

// 메인 클래스 - SRP 데모
public class SRPDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("김철수", 5000);
        EmployeePrinter printer = new EmployeePrinter();
        SalaryCalculator calculator = new SalaryCalculator();

        // 직원 정보 출력
        printer.printEmployeeDetails(employee);

        // 연봉 계산 및 출력
        double annualSalary = calculator.calculateAnnualSalary(employee);
        System.out.println("연봉: " + annualSalary);
    }
}