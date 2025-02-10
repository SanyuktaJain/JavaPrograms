package Jan2125;

public class Duplicatenumber {
	public static void main(String[] args) {
		int []array= {1,2,3,4,5,8,4,9,7,6,9};
		
		for(int i=0;i<array.length;i++)
		{
	   for (int j=i+1;j<array.length;j++)
				{
					if(array[i]==array[j])
					{
						System.out.println(array[j]);
					}
				}
				
			}
			
			
		}
	}


