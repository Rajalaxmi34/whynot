package mypkg;

public class test11 {
	
	public void method1(){
		
		String S = "Selenium";
		
		char[] arr1 = S.toCharArray();
		
		System.out.println(arr1.length);
		
        for(int i = arr1.length-1; i>=0; i--){
			
			System.out.print(arr1[i]);
		}
	}
	public void method2(){
		
		String p = "Expresssilencer";
		
		String[] arr2 = p.split("i");
		
		System.out.println(arr2[0]);
		
	}
	public static void main(String[] args) {
		
		
		test11 obj= new test11();
		
		obj.method2();
	}
	
	

}
