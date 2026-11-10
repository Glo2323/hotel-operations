package com.pluralsight;

import java.time.LocalTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int startTime;

    public Employee(String name, String department, double payRate, double hoursWorked) {
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        double regularPay = this.getRegularHours() * this.payRate;
        double overtimePay = this.getOvertimeHours() * this.payRate;

        return regularPay + overtimePay;
    }

    public void setTotalPay(double totalPay) {
    }

    public double getRegularHours(){
        double regularHours = 0;
        if (hoursWorked <= 40) {
            regularHours = hoursWorked;
        }else if (hoursWorked > 40){
            regularHours = 40;
        }
        return  regularHours;
    }

    public double  getOvertimeHours() {

        double overtimeHours = 0;
        if (hoursWorked > 40){
            overtimeHours = hoursWorked - 40;
        }

        return overtimeHours;
    }

    public double punchIn(int time){

        return this.startTime = time;

    }

    public  double punchOut(int time){
        hoursWorked = time - startTime;
        return time ;

    }

    public void punchTimeCard(){



    }






}
