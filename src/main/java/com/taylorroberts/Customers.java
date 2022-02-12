package com.taylorroberts;
public class Customers{

    public String customerName;
    public double loan;
    public int years;
    public double interestRate;
    public double monthlyMortgage;


    public Customers() {
    }
    
    public Customers( String customerName, int years, double loan, double interestRate){

        this.customerName= customerName;
        this.years=years;
        this.loan=loan;
        this.interestRate= interestRate;
        calculateMortgage();


    }

    public String toString() {
        return customerName + " " + "wants to borrow " + loan + "€ for a period of " + years + " years and pay " + String.format("%.2f", monthlyMortgage) + "€ each month";
    }

    public void calculateMortgage() {   
    	/*
    	    E = U[b(1 + b)^p]/[(1 + b)^p - 1]
    	 	E = Fixed monthly payment
			b = Interest on a monthly basis
			U = Total loan
			p = Number of payments

    	 */
       //interest for a month
       interestRate= (interestRate /100)/12;
       // E = U[b(1 + b)^p]/[(1 + b)^p - 1]   
       monthlyMortgage = loan * (  (interestRate * getPower())
               / (getPower() -1) ); 
    }
    
    public double  getPower() {
    	int power=years*12;
    	double result=1;
    	double base=1+interestRate;
    	for(power= years*12; power!=0; power--) {
    		result=result*base;
    		
    	}
    	return result;
    }
    
}