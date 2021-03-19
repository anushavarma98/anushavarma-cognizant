
/**
*Name : Anusha Penmetsa
*Description : Code Practise
*Date : 3/15/21
*/

package lab6;
import java.util.Scanner;

public class Powerofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
   System.out.println(checkNumber(number));
}
public static  boolean checkNumber(int n)
{
	boolean status=false;
	int i=1,mul=1;
	while(i>0)
	{
		mul*=2;
		if(mul==n)
		{
			status=true;
			break;
		}
		else if(mul>n)
			break;
		i++;
	}
    
	return status;

	}

}
