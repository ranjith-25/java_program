import java.util.*;
public class calc{
	public static int powerInt(int num1,int num2){
		return (int)Math.pow(num1,num2);
	}
	public static double powerDouble(double num1,double num2){
		return (double)Math.pow(num1,num2);
	}
	public static void main(String[] arg){
		System.out.println("Power func in Int "+powerInt(23,24));
		System.out.print("Power func in Double "+powerDouble(2.0,24.0));
	}
}
	