package practiceproject;
public class MethodExecution {
public int multiplynumbers(int a,int b) {
	int z=a*b;
	return z;
}
public static void main(String[] args) {
	MethodExecution a=new MethodExecution();
	int ans=a.multiplynumbers(10,2);
	System.out.println("multiply is:"+ans);
}
}
