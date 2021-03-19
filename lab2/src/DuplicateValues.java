/**
*Name : Anusha Penmetsa
*Description :Duplicate Values
*Date : 3/17/21
*/
public class DuplicateValues {

	public static void main(String[] args) {
	
		int[] arr= {1,2,2,3,4,3};
		System.out.print("the duplicate numbers are :");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if( (arr[i]==arr[j]) && (i!=j))
				{
					
					System.out.println(arr[j]+",");
				}
			
			}
	}
			
		
	
	}

}
