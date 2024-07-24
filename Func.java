class Box{
int height,width,depth;
Box(int h,int w,int d){
height=h;
width=w;
depth=d;
}
int volume(){
return height*width*depth;
}
}
public class Func{
public static void main(String[] arg){
Box b=new Box(2,3,4);
System.out.print("Volume : "+b.volume());
}
}