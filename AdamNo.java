import java.util.*;
public class AdamNo{
	public static void main(String arg[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n=s.nextInt();
		int sqnum=n*n,ans=0,sqans=0;
		while(n!=0){
		ans=(ans*10)+(n%10);
		n/=10;
		}
		ans*=ans;
		while(ans!=0){
		sqans=(sqans*10)+(ans%10);
		ans/=10;
		}
		if(sqnum==sqans)
		System.out.print("This is Adam number");
		else
		System.out.print("This is not Adam number");
		}
		}
		 