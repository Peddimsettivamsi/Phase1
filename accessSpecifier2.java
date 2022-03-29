package practiceproject;
class priaccessspecifier{
	private void display() {
	System.out.println("You are using private access specifier");
	}
}
public class accessSpecifier2 {
public static void main(String[] args) {
	//private
	System.out.println("private access specifier");
	priaccessspecifier obj=new priaccessspecifier();
	//obj.display();
}
}
