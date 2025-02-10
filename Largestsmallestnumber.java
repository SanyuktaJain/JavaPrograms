package Jan2125;

public class Largestsmallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {11,12,22,21,23,33,32,34,44,43,45,55,67,78,98,99,100};
		int largest =array[0];
		int smallest= array[0];
		
		for(int i=1; i<array.length;i++) {
			if(array[i]>largest)
			{
				largest=array[i];
				
				if(array[i]<smallest) {
					smallest=array[i];
				}
			}
		}
		System.out.println("largest element is :- " +largest);
		System.out.println("smallest element is:- " +smallest);
		

	}

}
