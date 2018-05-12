package mypkg;

public class test15 {
	
	public void method1(){
	
	int[] marks = {10,30,70,80};
	
	int sum=0;
	
	float avg = 0.0f;
	
	for(int i=0;i<marks.length;i++){
		
		sum = sum + marks[i];
		
	}
	System.out.println("Sum is - " + sum);
	
	avg = (float)(sum)/marks.length;
	System.out.println("Average is - " + avg);
	}
	
	public static void main(String[] args) {
		
		test15 obj = new test15();
		obj.method1();
	}
	

}
