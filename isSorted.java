//*******************************************************************
//By: Kaito Ogata
//Date: March 9 2020
//*******************************************************************

import java.io.*;
public class isSorted
{
  public static void main(String[] args)
  {
    //declare variables
	double []list1={16.1,12.3,22.2,14.4};
    double []list2={1.5,4.3,7.0,19.5,25.1,46.2};
    //test List1
    if(isSorted(list1))
    	System.out.println("List 1:sorted");
    else
    	System.out.println("List 1:not sorted");
    //test List2
    if(isSorted(list2))
    	System.out.println("List 2:sorted");
    else
    	System.out.println("List 2:not sorted");
    
  }
  //define function
  public static boolean isSorted(double [] arr)
  {
	  for(int i=0;i< arr.length -1 ;i++)
	  {
		  if(arr[i+1]<arr[i])
		  {
			  return false;
		  }
	  }
	  return true;
  }
}
