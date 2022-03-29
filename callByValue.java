package practiceproject;

public class callByValue {
int val=150;
int operation(int val) {
	val=val*10/100;
	return(val);
}
public static void main(String[] args) {
	callByValue d=new callByValue();
	System.out.println("before operation value is"+d.val);
	d.operation(100);
	System.out.println("after operatiov value is"+d.val);
}
}
