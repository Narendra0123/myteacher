package com.web.DwnUpCasting;

public class ChildClass2 extends ParentClass{
	
	public void mc1(){
		System.out.println("child class method");
	}
	public void mc2(){
		System.out.println("child class method2");
	}

	public static void main(String[] args) {
		
		ChildClass2 c=new ChildClass2();
		ParentClass p=new ParentClass();
		c.mc1();
		p.mp1();
		
		
		//upcasting 
		ParentClass p1=new ChildClass2();
		p1.mp1();
		
	/*	//down casting
		ParentClass p2=new ChildClass();
		ChildClass c2=(ChildClass) p2;
		c2.m2();
		
		
	*/	
	
	
		
		
	
		
		
		
		
	}
	
}
