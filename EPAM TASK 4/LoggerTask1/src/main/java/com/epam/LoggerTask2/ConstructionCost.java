package com.epam.LoggerTask2;

import java.io.IOException;

public class ConstructionCost {

	public double constructionCostValue(double area,int choice) throws IOException
	{
		switch(choice) {
		case 1:
			return 1200*area;
		case 2:
			return 1500*area;
		case 3:
			return 1800*area;
		default:
			return 2500*area;
		}
	}
}
