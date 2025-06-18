/*1.
import java.util.Scanner;
class A  
{
public static void main(String[] args)

{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();

for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * * */

/*2.numbersquare pattern
import java.util.Scanner;
class A  
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
for(int i=1;i<=6;i++)
{
for(int j=1;j<=6;j++)
{
System.out.print(i + " ");
}
System.out.println();
}
}
}*/

/*3.numbers
 import java.util.Scanner;
class A  
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j +" ");
}
System.out.println();
}
}
}*/

/* 4.whole numbers
class A  
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print( num +" ");
num++;
}
System.out.println();
}
}
}*/

/*5. pattern
class A  
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print( num +" ");
num++;
if(num>9)
{
num=1;
}
}
System.out.println();
}
}
}*/

/*6. pattern
class A  
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print( num +" ");
num+=2;
}
System.out.println();
}
}
}*/

/*7.10101
      10101
      10101
      10101
      10101

public class A
 {
    public static void main(String[] args)
 {
        String pattern = "10101"; 
        System.out.println(pattern);
        for (int i = 0; i < 5; i++)
 {
            System.out.println("      " + pattern);
        }
    }
}
*/
  
/*8. stars pattern
import java.util.Scanner;
public class A
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();

for(int i=0;i<=n;i++)
{
for(int j=n-i;j>1;j--)
{

System.out.print(" ");
}
{
for(int j=0;j<=i;j++)

System.out.print("* ");
}
System.out.println();
}
}
}*/

/*9.
import java.util.Scanner;
public class A
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=n-i;j>1;j--)
{

System.out.print(" ");
}
{
for(int j=1;j<=i;j++)

System.out.print(2*j+" ");
}
System.out.println();
}
}
}*/
/*10
import java.util.Scanner;
public class A {
    public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
System.out.println("enter the word  :");
        String word = sc.nextline();
        
        for (int i = 1; i <= word.length(); i++) {
            
            if (i == word.length()) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j) + " ");
            }

            System.out.println();
        }
    }
}
*/
/*11
import java.util.Scanner;
public class A{
    public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
        int rows = 5;
        for (int i = 1; i <= rows; i++) 
{  
            for (int j = i; j < rows; j++)
 {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++)
 {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/
/*12.public class A 
{
    public static void main(String[] args) 
{
        int n = 4;
        for (int i = 0; i <= n; i++)
 {
            for (int j = n - i; j > 0; j--) 
          {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++)
 {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*13.
















