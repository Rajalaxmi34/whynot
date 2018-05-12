package mypkg;

public class test14 {
	
	public test14(){
		
		System.out.println("why should i change myself");
	}
	
	public test14(int t, String s){
		
		System.out.println(t);
		
		System.out.println(s);
		
	}
	public void method1(String s){
		
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		test14 obj = new test14(10,"he he");
		
		obj.method1("whynot");
	}

}
