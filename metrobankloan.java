package problem3;

class Loan {

	int accNo;
	double accBal;
	double salary;
	String loantype;
	double loanExpect;
	double emiEx;
	
	public Loan(int accountNumber, double accountBalance, double salary, String loneType, double loanAmountAxpected,double noOfEmiExpected) {
		
		this.accNo = accountNumber;
		this.accBal = accountBalance;
		this.salary = salary;
		this.loantype = loneType;
		this.loanExpect = loanAmountAxpected;
		this.emiEx = noOfEmiExpected;
		
}
	public int getAccountNumber() {
		return accNo;
	}
	public void setAccountNumber(int accountNumber) {
		this.accNo = accountNumber;
	}
	public double getAccountBalance() {
		return accBal;
	}
	public void setAccountBalance(double accountBalance) {
		this.accBal = accountBalance;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLoneType() {
		return loantype;
	}
	public void setLoneType(String loneType) {
		this.loantype = loneType;
	}
	public double getLoanAmountAxpected() {
		return loanExpect;
	}
	public void setLoanAmountAxpected(double loanAmountAxpected) {
		this.loanExpect = loanAmountAxpected;
	}
	public double getNoOfEmiExpected() {
		return emiEx;
	}
	public void setNoOfEmiExpected(double noOfEmiExpected) {
		this.emiEx = noOfEmiExpected;
	}
	public void rule(){
	if(accNo>999&&accNo<2000)

	{
		if (accBal >= 1000) {
			if (salary > 25000 && loantype == "Car") {

				if (emiEx <= 36 && loanExpect <= 500000) {
					System.out.println("Eligible loan amount=" + 5000000);
					System.out.println("eligible emi=" + 36);
				} else {
					System.out.println("The customer is not eligible for the loan");
				}
			}
		} else if (accBal >= 1000) {
			if (salary > 50000 && loantype == "House") {

				if (emiEx <= 60 && loanExpect <= 6000000) {
					System.out.println("The customer can avail the amount of Rs." + loanExpect);
					System.out.println("eligible emi :" + 60);
					System.out.println("Requested loan amount=" + 6000000);
					System.out.println("Requested EMI's=" + emiEx);
				} else {
					System.out.println("The customer is not eligible for the loan");
				}
			}
		} else if (accBal >= 1000) {
			if (salary > 75000 && loantype == "Business") {

				if (emiEx <= 80 && loanExpect <= 7500000) {
					System.out.println("Eligible loan amount=" + 6000000);
					System.out.println("eligible emi=" + 60);

				} else {
					System.out.println("The customer is not eligible for the loan");
				}
			}

		}

	}else
	{
		System.out.println("Invalid account number");
	}
	}
	}
public class metrobankloan{
	public static void main(String[] args) {
		Loan Customer=new Loan(1001,40000,250000,"Car",300000,30);
		Customer.rule();
	
	}
}
