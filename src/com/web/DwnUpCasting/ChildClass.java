package com.web.DwnUpCasting;

public class ChildClass extends ParentClass{
	
	int a=10;
	
	
	public void mc1(){
		System.out.println("child class method        ");
	}
	public void mc2(){
		System.out.println("child class method2    ");
	}
	
	public void mc3(){
		System.out.println("Child class method 3");
	}
	
	public void mc4(){
		System.out.println("Child class method 3");
	}

	
	
	

	public static void main(String[] args) {
		
		ChildClass c=new ChildClass();
		ParentClass p=new ParentClass();
		c.mc1();
		p.mp1();
		
		
		//upcasting 
		ParentClass p1=new ChildClass();
		p1.mp1();
		
	/*	//down casting
		ParentClass p2=new ChildClass();
		ChildClass c2=(ChildClass) p2;
		c2.m2();
		
		
	*/	
	
	
		
		
	
		
		
		
		
	}
	
}
