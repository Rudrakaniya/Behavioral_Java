import java.util.*

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
