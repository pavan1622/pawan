package inheritance;

public class Sim2g {
	
	 
	 public static void main(String[] args) {
		Sim2g obj1=new Sim2g();
		obj1.user1();
		user2();
	}
	 public void user1() {
			System.out.println("Non static method");

}
	 public static void user2() {
		 System.out.println("Static  method ");
	 }
}