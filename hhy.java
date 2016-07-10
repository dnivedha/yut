import java.util.Scanner;
import java.lang.Integer.*;
class CKP_15
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
int num[]=new int[n];
for(i=0;i<n;i++)
{
num[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(num[i]<num[j])
{
int temp=num[i];
num[i]=num[j];
num[j]=temp;
}
}
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if((Integer.bitCount(num[i])) < (Integer.bitCount(num[j])))
{
int temp=num[i];
num[i]=num[j];
num[j]=temp;
}
}
}
for(i=0;i<n;i++)
{
System.out.print(num[i]+" ");
}
}
}
