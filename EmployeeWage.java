package com.bridgelabz.Java_Day8;

public class EmployeeWage {
    static final int IS_ABSENT = 0;
    static final int IS_PRESENT = 1;
    static final int IS_PART_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_MONTHLY_HOURS = 100;
    int empHrs = 0;
    int totalEmpHrs = 0;
    int totalWorkingDays = 0;
    int dailyWage = 0;
    int totalWage = 0;

    public void attendanceCheck(int empCheck){
        if(empCheck == IS_ABSENT){
            System.out.println("Employee is Absent!");
        }else if(empCheck == IS_PRESENT) {
            System.out.println("Employee is Present!");
        }else {
            System.out.println("Employee is Part-time!");
        }
    }

    public void calcDailyWage(int empCheck) {
        if (empCheck == IS_PRESENT) {
            empHrs = FULL_DAY_HOUR;
        } else if (empCheck == IS_PART_TIME) {
            empHrs = PART_TIME_HOUR;
        }else {
            empHrs = 0;
        }
        totalEmpHrs += empHrs;
        dailyWage = (WAGE_PER_HOUR * empHrs);
        totalWage += dailyWage;
        System.out.println("Employee wage Today: " + dailyWage);
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();

        System.out.println("Welcome to Employee Wage Computation Program using OOP Concept");
        while(employeeWage.totalEmpHrs <= MAX_MONTHLY_HOURS && employeeWage.totalWorkingDays <= MAX_WORKING_DAYS){
            int empCheck = (int)Math.floor(Math.random()*3);
            employeeWage.totalWorkingDays++;

            System.out.println("Attendance Check:");
            employeeWage.attendanceCheck(empCheck);

            System.out.println("Calculating Daily Wage: ");
            employeeWage.calcDailyWage(empCheck);
        }
        System.out.println("Employee's this month salary: "+employeeWage.totalWage);
    }
}
