package com.taylorroberts;

import java.util.Scanner;
import java.io.InputStream;
import java.util.ArrayList;

public class MortgagePlan {

	public static void main(String[] args) {
		handleData();

	}

	public static void handleData() {

		// load in text file
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("prospects.txt");

		// UTF-8: character encoding
		Scanner scan = new Scanner(in, "UTF-8");

		// create a customer array list
		ArrayList<Customers> customers = new ArrayList<Customers>();
		scan.nextLine(); //skip first line
	
		// this section cleans up the file data, removes unnecessary symbols
		while (scan.hasNextLine()) {
			String singleLine = scan.nextLine();
			String cleanLines = singleLine;
			cleanLines = singleLine.replaceAll("[\"]", "");

			//fix the last line
			if (singleLine.startsWith("\"")) {
				cleanLines=cleanLines.replaceFirst(",", " ");
			}
			if (singleLine.equals("")) {
				break;
			}
			
			String[] info = cleanLines.split(",");
			String customerName = info[0];
			double loanAmount = Double.parseDouble(info[1]);
			double interestRate = Double.parseDouble(info[2]);
			int years = Integer.parseInt(info[3]);
			customers.add(new Customers(customerName, years, loanAmount, interestRate)); //create a new customer
		}
		
		printCustomers(customers);
		scan.close();

	}

	public static void printCustomers(ArrayList<Customers> customers) {
		for (Customers customer : customers) {
			System.out.println(customer);
		}
	}

}




