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

    public int getYears(){
        return years;
    }

    public double getLoanAmount(){
        return loan;
    }

    public void setLoanAmount(double loanAmount){

        loan=loanAmount;
    }

    public void setInterestRate(double interest){
        interestRate=interest;

    }
    public double getInterestRate(){
        return interestRate;
    }

    
    public String toString() {
        return customerName + " " + "wants to borrow " + loan +"\u20AC"+ " for a period of " + years + " years and pay " + String.format("%.2f", monthlyMortgage) + "\u20AC" + " each month";
    }

    public void calculateMortgage() {   //E = U[b(1 + b)^p]/[(1 + b)^p - 1]
       //interest for a month
       interestRate= (interestRate /100)/12;

       //time in months
       int time=years*12;

       // E = U[b(1 + b)^p]/[(1 + b)^p - 1]
       monthlyMortgage = loan * (  (interestRate * Math.pow(1+interestRate, time))
                             / (Math.pow(1+interestRate, time) - 1) ); 
    }
}