/*ITC115 Kaito Ogata*/
public class java1 {
    public static void main(String[] args) {
    	/*Method to test first example*/
        System.out.println(printPowersOfN(2,7));
        /*Method to test second example*/
    	System.out.println(printPowersOfN(5,3));
}
    public static int printPowersOfN (int b, int e)
    {
    	int number = 1;
    	for (int i=0; i < e; i++)
           /*Calculate powers by using Math function*/
    	{System.out.print((int) Math.pow(b, i) + " ");
    		number*=b;
    	}
    	return number;
    }
    }
