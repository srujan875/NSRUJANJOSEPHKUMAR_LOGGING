package com.epam.LoggingTask4;

import java.io.IOException;

public class CompoundInterestCalculation {

	public double compoundInterest(double principalAmount,double rateOfInterest,double years) throws IOException
	{
			double Amount=Math.pow((1+(rateOfInterest/100)),years);
			double compoundInterest=Amount*principalAmount;
			return compoundInterest;
				
	}
	

}
