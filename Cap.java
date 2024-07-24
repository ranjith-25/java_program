import java.util.*;
public class Cap{
	public static void main(String arg[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n=s.nextInt();
		if(isKapreker(n))
			System.out.print(n+" is Kapreker number");
		else
			System.out.print(n+" is not a Kapreker number");
	}
	static boolean isKapreker(int num){
		int sq=num*num;
		int div=1;
		while(sq/div>0){
			int left=sq/div;
			int right=sq%div;
			if(right!=0 && left+right==num)
				return true;
			div*=10;
		}
		return false;
	}
}
