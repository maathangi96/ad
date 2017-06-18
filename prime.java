import java.io.*;
import java.util.Scanner;
class prime
{
public static void main(String args[])
{
Scanner s=new Scanner (System.in);
int a=s.nextInt();
int flag =0;
int m=0;
m=a/2;
for(int i=2;i<=m;i++)
{
if(a%i==0)
{
System.out.println("not a prime number");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("prime number");
}
}
}
