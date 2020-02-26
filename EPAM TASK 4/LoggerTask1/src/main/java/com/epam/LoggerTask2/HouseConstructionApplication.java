package com.epam.LoggerTask2;

import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class HouseConstructionApplication {
private static final Logger logger=Logger.getLogger("HouseConstructionApplication.class");

public static void main(String args[]) throws IOException
{
	Scanner scanner =new Scanner(System.in);
      double areaOfConstruction=scanner.nextDouble();
      double costValue=0.0;
      logger.info("Area of Construction is:"+areaOfConstruction+" in sq.mts");
      logger.info("Type of Materials available 1:standard materials 2:above standard materials 3:high standard materials 4:high standard and fully automated");
      int choice=scanner.nextInt();
      ConstructionCost cost=new ConstructionCost();
      if(choice==1)
      {
    	  logger.info("User selected for the material of type: standard materials");
    	 costValue=cost.constructionCostValue(areaOfConstruction,choice);
      }
      else if(choice==2)
      {
    	  logger.info("User selected for the material of type: above standard materials");
     	 costValue=cost.constructionCostValue(areaOfConstruction,choice);
      }
      else if(choice==3)
      {
    	  logger.info("user selected for the material of type: high standard materials");
     	 costValue=cost.constructionCostValue(areaOfConstruction,choice);
      }
      else if(choice==4)
      {
    	  logger.info("User selected for the material of type: high standard materials and fully automated");
     	 costValue=cost.constructionCostValue(areaOfConstruction,choice);
      }
      
      logger.info("Total Cost for the construction of house is:"+costValue+"(Rs/-)");
}
}
