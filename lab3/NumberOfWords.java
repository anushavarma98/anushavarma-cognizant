/**
*Name : Anusha Penmetsa
*Description:To Find Number Of Words
*Date : 3/19/21
*/

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the string");
			String str=sc.nextLine();
			int lineLength=str.split("\\.").length;
			int wordLength=str.split(" ").length+lineLength-1;
			int characterCount=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!=' '&&str.charAt(i)!='.')
					characterCount++;
					
			}
			System.out.println(lineLength);
			System.out.println(wordLength);
			System.out.println(characterCount);
	}

}
