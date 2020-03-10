//*******************************************************************
//By: Kaito Ogata
//Date: March 9 2020
//*******************************************************************

import java.io.*;
import java.util.Scanner;

public class season
{
    public static void main(String[] args)
    {
      //decrare variable
      int  month, day;
      //declare scanner object
      Scanner input = new Scanner(System.in);
      //input month
      System.out.println("Month:");
      month = input.nextInt();
      //input day
      System.out.println("Day:");
      day = input.nextInt();
      //display season
      System.out.println(season(month, day));
    }

public static String season(int month, int day)
{
  String Seson;

  if (month < 3 || (month == 3 && day <= 15))
  {
    Seson = "Winter";
  }
  else if (month < 6 || (month == 6 && day <= 15))
  {
    Seson = "Spring";
  }
  else if (month < 9 || (month == 9 && day <= 15))
  {
    Seson = "Summer";
  }
  else if (month < 12 || (month == 12 && day <= 15))
  {
    Seson = "Fall";
  }
  else
  {
	  Seson = "Winter";
  }
