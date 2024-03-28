/*This program prints the payroll program, this is also a practice program for initialization
Name: Ramie Theofil D. Pondar
Date: 02/20/24*/
public class PayrollProgram
{  
  public static void main ( String[] args )  
  {
    //declarations
    long hoursWorked;  
    double payRate, taxRate;
    //initializations             
    hoursWorked = 40;  
    payRate = 10.0;  
    taxRate = 0.10; //if we were to remove this initialization we will have a compiling error
    //output     
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}