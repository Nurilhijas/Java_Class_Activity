/**
 * 
 */

/**
 * @author Nuril Hijas
 *
 */
import java.util.*;
class Exercise3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int t=s.nextInt();
int sum=0; 
while(t!=0)
{
 	sum=sum+(t%10);
	t=t/10;
} 
System.out.println(sum);
}
} 
