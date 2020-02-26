package com.epam.LoggingTask4;

import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;



public class SimpleAndCompundInterestApplication 
{
	private static final Logger logger=Logger.getLogger("SimpleAndCompoundInterestApplication.class");
    public static void main( String[] args ) throws IOException
    {
    	
    	logger.info("Simple and Compound Interest Calculation");
    	       Scanner sc = new Scanner(System.in);
    	       double amount=  sc.nextDouble();
    	       logger.info("Prinicpal Amount is: "+amount);
    	       double rateOfInterest=sc.nextDouble();
    	       logger.info("Rate of Interest is:"+rateOfInterest);
    	       double years=sc.nextDouble();
    	       logger.info("Time period (in years)"+years);
    	       
    	       // object for SimpleInterestCalculation class
    	       SimpleInterestCalculation simpleInterest=new SimpleInterestCalculation();
    	       logger.info("Simple Interest for the given data is :"+simpleInterest.simpleInterest(amount, rateOfInterest, years));
    	       
    	       //object for CompoundInterestCalculation class
    	     CompoundInterestCalculation compoundInterest=new CompoundInterestCalculation();
    	     
    	     logger.info("Compund Interest for the given data is:"+compoundInterest.compoundInterest(amount, rateOfInterest, years));
    	       
    	   
    }
}
