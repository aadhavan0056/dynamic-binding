package Dyanmic;

class A2B
		{
	double tax(double billAmount)
	{
			double taxPercentage=10.0;
			double taxAmount=billAmount*taxPercentage/100.0;
			System.out.println(taxAmount);
			return taxAmount;
		}
		}	
class A2BUS extends A2B
{
double tax(double billAmount)
{
	double taxPercentage=20.0;
	double taxAmount=billAmount*taxPercentage/100.0;
	System.out.println("Your taxamount :"+ taxAmount);
	return taxAmount;
}
}	
class A2BUK extends A2B
{
double tax(double billAmount)
{
	double taxPercentage=30.0;
	double taxAmount=billAmount*taxPercentage/100.0;
	System.out.println("Your taxamount :"+ taxAmount);
	return taxAmount;
}
}	
class A2BIN extends A2B
{
double tax(double billAmount)
{
	double taxPercentage=5.0;
	double taxAmount=billAmount*taxPercentage/100.0;
	System.out.println("Your taxamount :"+taxAmount);
	return taxAmount;
}
}	
 public class Dynamic 
 {
public static void main(String[]args)
{
	A2B obj= new A2BUS();
	obj.tax(300.0);
	obj=new A2BUK();
	obj.tax(400.0);
	obj=new A2BIN();
	obj.tax(500.0);
	System.out.println();
	System.out.println("Thank you....");
}
}
 
	
