package practiceproject;
class defAccessSpecifier
{
	void display()
	{
		System.out.println("you are using default access specifiers");
	}
}
public class AccessSpecifier1 {
public static void main(String[] args) {
	System.out.println("default access specifier");
	defAccessSpecifier obj=new defAccessSpecifier();
	obj.display();
	
}
}
