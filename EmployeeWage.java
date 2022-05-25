package com.bridgelabz.Java_Day8;

public class EmployeeWage {
    static final int IS_ABSENT = 0;
    static final int IS_PRESENT = 1;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static int empHrs = 0;
    static int dailyWage = 0;
    int empCheck = (int)Math.floor(Math.random()*2);
    public void attendanceCheck(){
        if(empCheck == IS_ABSENT){
            System.out.println("Employee is Absent!");
        }else{
            System.out.println("Employee is Present!");
        }
    }

    public void calcDailyWage() {
        if (empCheck != IS_ABSENT) {
            empHrs = FULL_DAY_HOUR;
        }
        dailyWage += (WAGE_PER_HOUR * empHrs);
        System.out.println("Employee wage Today: " + dailyWage);
    }

    public static void main(String[] args) {
        EmpWage empWage = new EmpWage();

        System.out.println("Welcome tqo Employee Wage Computation Program using OOP Concept");

        System.out.println("Attendance Check:");
        empWage.attendanceCheck();

        System.out.println("Calculating Daily Wage: ");
        empWage.calcDailyWage();
    }
}
