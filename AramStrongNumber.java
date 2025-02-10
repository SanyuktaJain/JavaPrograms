package Jan2125;

public class AramStrongNumber {
	
	//153= 1*1*1 + 5*5*5 + 3*3*3 =153
	//407= 4*4*4 + 0 + 7*7*7= 407
	//370,371
	
	public static void isAramstrongNumber(int num)
	{
		System.out.println("give number is " +num);
		int cube=0;
		int t;
		int r;
		t= num;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
					
			
		}
		if(t==cube)
		{
			System.out.println("this is armstrong number");
		}
		else {
			System.out.println("this is not armstrong number"); 
		
	}
	}
	
	public static void main(String[] args) {
		
		isAramstrongNumber(153);
		isAramstrongNumber(370);
		isAramstrongNumber(407);
		isAramstrongNumber(0);
		isAramstrongNumber(1);



		
		
		
	}	
		
	}
