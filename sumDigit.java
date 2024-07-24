import java.util.*;
public class sumDigit{
	public static void main(String arg[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n=s.nextInt();
		int sum=0;
		while(n!=0){
		sum+=n%10;
		n/=10;
		}
		System.out.print(sum);
	}
}