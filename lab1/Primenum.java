/**
*Name : Anusha Varma
*Description : Code Practise
*Date : 3/15/21
*/
package lab1;
import java.util.*;
public class Primenum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n,i,j,c;
System.out.println("Enter any number");
int n=sc.nextInt();
System.out.println("Prime numbers are: ");
for(i=2;i<n;i++){
c=0;
for(j=1;j<=i;j++){
if(i%j==0){
c++;
}
if(c==2)
{
System.out.println(i+"");
}
}
}
}