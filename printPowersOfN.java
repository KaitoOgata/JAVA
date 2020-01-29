public class java1 {
    public static void main(String[] args) {
    	System.out.println(printPowersOfN(2,7));
    	System.out.println(printPowersOfN(5,3));
}
    public static int printPowersOfN (int b, int e)
    {
    	int number = 1;
    	for (int i=0; i < e; i++)
    	{System.out.print((int) Math.pow(b, i) + " ");
    		number*=b;
    	}
    	return number;
    }
    }
