public class findDiv{
	public static void main(String arg[]){
		int cnt=0,i=1;
		while(cnt<5){
			if(i%2==0 && i%3==0 && i%5==0){
			System.out.print(i+" ");
			cnt++;
			}
			i++;
		}
	}
}