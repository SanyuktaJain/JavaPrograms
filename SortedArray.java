package Jan2125;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]intArray=new int[] {20,45,6,89,23,56,78,90,43,76,65,21};
		int temp=0;
		System.out.println("Original Array:");
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]+" ");
		}
		for(int i=0;i<intArray.length;i++)
		{
			for(int j=i+1;j<intArray.length;j++)
		
		{
				if(intArray[i]>intArray[j])
				{
					temp=intArray[i];
					intArray[i]=intArray[j];
					intArray[j]=temp;
					
				}
		}
		

	}
		
		System.out.println("\n Arraysorted in assendening order ");
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]+" ");}
		}

}
