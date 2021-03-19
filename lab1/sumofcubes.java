/**
*Name : Anusha Varma
*Description : Code Practise
*Date : 3/15/21
*/
package lab1;
import java.util.*;
public class sumofcubes{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num = sc.nextInt();
int result=cubeSum(num);
System.out.println("sum of cubes of digits of given number is" +result);
}
public static int cubeSum(int n){
int sum=0;
While(n!=0){
int digit=n%10;
sum=sum+digit*digit*digit;
n=n/10;
}
return sum;
}
}