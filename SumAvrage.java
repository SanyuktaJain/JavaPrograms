package Jan2125;

public class SumAvrage {
	public static void main(String[] args) {
		int[]num= {2,4,6,8,10};
		int sum=0;
		float avrage=0;
		
		for(int i=0; i<num.length;i++)
		{
			sum = sum+num[i];
			avrage=sum/2;
			
		}
		
		System.out.println("sum:-" +sum);
		System.out.println("avrage:-" +avrage);
	}

}
