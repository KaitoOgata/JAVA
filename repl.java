//*******************************************************************

//  
//
// Description of the class or method purpose
//By: 
//Feb 2 2020
//*******************************************************************
import java.io.*;
import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
    	//decrare variable
    	String str, output;
    	
    	Scanner input =new Scanner(System.in);
    	//example
        output=repl("hello", 3);
    	//output the result
        System.out.println(output);
    }
    //define repl()
    public static String repl(String str,int times)
    {
    	String newStr="";
    	if(times<=0)
    		return newStr;
    	else
    	{
    		for (int i=1;i<=times; i++ )
    			newStr=newStr+str;
    		return newStr;
    	}
    }
}
