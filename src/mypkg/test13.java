package mypkg;

public class test13 {
	
	public void method1(int t){
		int counter = 0;
		
		for(int i = 2; i<=t ; i++){
			
			if(t%i==0){
				counter++;
			}
			
			
		}
		if(counter==1){
			
			System.out.println("Prime");
			
		}
		else{
			System.out.println("Notprime");
		}
			
	}
	
	public static void main(String[] args) {
		
		test13 obj = new test13();
		obj.method1(7);
		
		
	}

}
