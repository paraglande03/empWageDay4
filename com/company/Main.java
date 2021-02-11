package com.company;

import java.util.Random;
public class Main {
    public static final int FULL_TIME=1;
    public static final int PART_TIME=2;
    public static final int WAGE_PER_HR=20;
    public static final int MAX_WORKING_DAYS=20;
    public static final int MAX_WORKING_HRS=100;

    public static void main(String[] args) {
        int dailyWage=0;
        int empHr=0;
        int salary=0;
        int totalDays=0;
        int totalHrs=0;
        while (totalDays<=MAX_WORKING_DAYS && totalHrs<=MAX_WORKING_HRS ) {
            totalDays++;
            totalHrs++;
            int random = (int) (Math.random() * 10) % 2;
            switch (random) {
                case 0:
                    System.out.println("employee is fulltime");
                    empHr = 8;
                    break;
                case 1:
                    System.out.println("employee is parttime");
                    empHr = 4;
                    break;
            }
            dailyWage = (WAGE_PER_HR * empHr);
            System.out.println("Daily wage is = " + dailyWage);
            salary+=dailyWage;
        }

        System.out.println("Salary of the employee is: "+salary);


    }

}

