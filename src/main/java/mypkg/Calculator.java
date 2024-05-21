package mypkg;

public class Calculator {

	
    public int sum(int a, int b)
    {
        return(a+b);
    }

    public int sub(int a, int b)
    {
        return(a-b);
    }
    public static void main(String[] args)
    {
        Calculator ob = new Calculator();
        System.out.println("sum is "+ob.sum(20,10));
    }
	

}
