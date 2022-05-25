package com.bridgelabz.Java_Day8;

public class EmployeeWage {
    static final int IS_ABSENT = 0;
    static final int IS_PRESENT = 1;
    int empCheck = (int)Math.floor(Math.random()*3);
    public void attendanceCheck(){
        if(empCheck == IS_ABSENT){
            System.out.println("Employee is Absent!");
        }else if(empCheck == IS_PRESENT) {
            System.out.println("Employee is Present!");
        }else {
            System.out.println("Employee is Part-time!");
        }
    }

    public static void main(String[] args) {
        EmpWage empWage = new EmpWage();

        System.out.println("Welcome tqo Employee Wage Computation Program using OOP Concept");

        System.out.println("Attendance Check:");
        empWage.attendanceCheck();
    }
}
