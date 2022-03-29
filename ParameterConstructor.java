package practiceproject;
class Std{
	int id;
	String name;
	Std(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class ParameterConstructor {
public static void main(String[] args) {
	Std std1=new Std(2,"alex");
	Std std2=new Std(3,"vam");
	std1.display();
	std2.display();
}
}
