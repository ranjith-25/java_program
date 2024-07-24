import java.util.*;
public class upLow{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	char ch = s.next().charAt(0);
	if(ch>=65 && ch<=90){
	System.out.print((char)(ch+32));}
	else{
	System.out.print((char)(ch-32));}
	
}
}