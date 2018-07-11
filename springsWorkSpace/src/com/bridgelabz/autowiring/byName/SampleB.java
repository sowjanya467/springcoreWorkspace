package com.bridgelabz.autowiring.byName;

public class SampleB 
{
	Sample s;
	public SampleB() 
	{
		System.out.println("constructor of sample b is created");
	}
	public Sample getSample()
	{
		return s;
		
	}
	public void setSample(Sample s)
	{
		this.s=s;
	}
	public void print()
	{
		System.out.println("hello sample b");
	}
	public void display()
	{  
	    print();  
	    s.print(); 
	}

}
