import java.util.*;

/*
Q2: Write a program to define two interfaces UGC and AICTE both having a default method
int getAdmission() to take the admission and an abstract method String payFee().getAdmission() 
in UGC must ask the percentage in qualifying exam and if the percentage >= 60 then generate 
the registration number and return.getAdmission() is AICTE must ask the user to join the counseling 
after 5 days and display the date of counseling and return the counseling token number.
Create a class University which inherits both UGC and AICTE and overrides the getAdmission() 
method only such that it will ask the percentage and if direct admission through UGC is possible 
then proceed otherwise proceed through AICTE.University must have attribute fee_due and it should be assigned 
the due amount accordingly.(E.g fee through UGC is 25000 & fee through AICTE is 34000)
Create a class LPU which inherits University and overrides all the methods. 
Ask the user to deposit the fee and display the fee due. After depositing the fee display 
the remaining due fee and return the receipt number. Avoid copying from given solution on website. 

Solution must be unique for each student.
Roll Number: 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24

*/

interface UGC {
    Scanner scan = new Scanner(System.in);
    String payFee();
    default int getAdmission() {
        System.out.println("What is your precentage in qualifying exam?");
        int percentage = scan.nextInt();
        Random rand = new Random();
        if (percentage  >= 60)
            return rand.nextInt(10000);
        else
            return 0;
    }
}

interface AICTE {
    String payFee();

    default int getAdmission() {
        Random rand = new Random();
        System.out.println("Join Your Counseling after 5 day and date of counseling is June-12-2020");
        System.out.println("Your counseling token is");
        return rand.nextInt(100000);
    }
}

class University implements UGC, AICTE {
    private static Scanner scan = new Scanner(System.in);
    public int fee_due;
    private static Random rand = new Random();

    @Override
    public String payFee() {
        System.out.println("Please deposit your fee and Your Due Fee is Rs. " + fee_due);
        System.out.println("Enter your fee:");
        int fee = scan.nextInt();
        if (fee != fee_due)
            System.out.println("The remaining due fee is Rs. " + (fee_due - fee));
        else
            System.out.println("You have no due fee in your account");
        return "Your receipt number is -> LPU" + rand.nextInt(1000) + "ADM";
    }

    @Override
    public int getAdmission() {
        int regno = UGC.super.getAdmission();
        if (regno == 0) {
            fee_due = 34000;
            System.out.println("Admission through UGC is not possible. Marks must greater than 60");
            return AICTE.super.getAdmission();
        } else {
            fee_due = 25000;
            System.out.println("Admission through UGC done. Your registration number is");
            return regno;
        }
    }

}

public class LPU extends University {

    @Override
    public String payFee() {
        return super.payFee();
    }

    @Override
    public int getAdmission() {
        return super.getAdmission();
    }

    public static void main(String[] args) {
        LPU lpu = new LPU();
        System.out.println(lpu.getAdmission());
        System.out.println(lpu.payFee());
    }
}
