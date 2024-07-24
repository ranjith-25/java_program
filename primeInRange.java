import java.util.*;
public class primeInRange{
	public static boolean check(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0)return false;
		}
		return true;
	}
	public static void main(String arg[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the starting and ending range:");
		int st=s.nextInt();
		int ed=s.nextInt();
		for(int i=st;i<=ed;i++){
			if(check(i) && i!=1)
			System.out.print(i+" ");
		}
	}
}