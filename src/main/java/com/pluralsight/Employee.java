package com.pluralsight;

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int startTime;
    private int endtime;

    //!Creating my object
    public Employee(String name, String department, double payRate, double hoursWorked, int startTime, int endtime) {
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = startTime;
        this.endtime = endtime;
    }

    //?Creating getters and setters to get the info and set the info
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

    //?Derived getters that get their info from other info
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

    //?Derived getters that get their info from other info
    public double getRegularHours(){
        double regularHours = 0;
        if (hoursWorked <= 40) {
            regularHours = hoursWorked;
        }else if (hoursWorked > 40){
            regularHours = 40;
        }
        return  regularHours;
    }

    //?Derived getters that get their info from other info
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

    //?Derived getters that get their info from other info
    public void punchIn(){

        Scanner scanner = new Scanner(System.in);

        int clockInHour = LocalDateTime.now().getHour();
        int clockInMin = LocalDateTime.now().getMinute();

        System.out.println("What's your punch in time: ");
        this.startTime = scanner.nextInt();

        System.out.printf("Hour; %d\nMinutes: %d\n", clockInHour, clockInMin );

    }

    //?Derived getters that get their info from other info
    public void punchOut(){

        Scanner scanner = new Scanner(System.in);

        int clockOutHour = LocalDateTime.now().getHour();
        int clockOutMin = LocalDateTime.now().getMinute();

        System.out.println("What's your punch out time: ");
        this.endtime = scanner.nextInt();

        System.out.printf("Hour; %d\nMinutes: %d\n", clockOutHour, clockOutMin );


    }

    //?Derived getters that get their info from other info
    public double punchOut(int time){
        hoursWorked = time - startTime;
        return this.endtime = time ;

    }

    //?Derived getters that get their info from other info
    public PrintStream punchTimeCard(){
        int punchInTime = getStartTime();

        int punchOutTime = getEndtime();

        hoursWorked = punchOutTime - punchInTime;

        return System.out.printf("Hours Worked: %.2f\nPunchIn time: %d\nPunchout time: %d ", hoursWorked, punchInTime, punchOutTime );


    }

    //?Creating getters and setters to get the info and set the info
    public int getStartTime() {
        return startTime;
    }

    public int getEndtime() {
        return endtime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndtime(int endtime) {
        this.endtime = endtime;
    }
}
