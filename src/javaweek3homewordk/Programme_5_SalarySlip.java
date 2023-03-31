package javaweek3homewordk;

import java.util.Scanner;

public class Programme_5_SalarySlip {

    public static void main(String [] args){

        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your EmployeeID: ");
        int employeeId = scanner.nextInt();

        System.out.print( "Enter your Salary: ");
        double basicSalary = scanner.nextDouble();

        //Calculating HRA,DA,TA and PF
        double HRA = calculateHRA(basicSalary);
        double DA = calculateDA(basicSalary);
        double TA = calculateTA(basicSalary);
        double PF = calculatePF(basicSalary);

        //Calculating yhe gross salary
        double grossSalary= basicSalary + HRA + TA - PF;
        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + employeeId + "                     |");
        System.out.println("|Employee Name:" + name + "                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + basicSalary + "                |");
        System.out.println("|HRA 10%     : " + HRA + "                 |");
        System.out.println("|TA 8%       : " + TA + "                 |");
        System.out.println("|DA 9%       : " + DA + "                 |");
        System.out.println("|PF -20%     : " + PF + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "                |");
        System.out.println("|-------------------------------------|");
        // Closing scanner object
        scanner.close();
    }
    //Calculating HRA
    public static double calculateHRA(double basicSalary){
        return (basicSalary * 10) /100;
    }
    //Calculating DA
    public static double calculateDA(double basicSalary){
        return (basicSalary * 8) / 100;
    }
    //Calculating TA
    public static double calculateTA(double basicSalary){
        return (basicSalary * 9) / 100;
    }
    //Calculating PF
    public static double calculatePF(double basicSalary){
        return(basicSalary * 20) / 100;
    }
}
