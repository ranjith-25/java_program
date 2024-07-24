import java.util.*;
public class revNum{
	public static void main(String arg[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n=s.nextInt();
		int ans=0;
		while(n!=0){
		ans=(ans*10)+(n%10);
		n/=10;
		}
		System.out.print(ans);
		}
		}