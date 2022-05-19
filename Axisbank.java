package org.college;

public class Axisbank extends Bankinfo {
	public void deposit()
	{
	System.out.println("my deposit is 667");	
	}
	public static void main(String[] args) {
		Bankinfo info=new Bankinfo();
		info.deposit();
		info.fixed();
	    info.savings();
	    
	    Axisbank axis=new Axisbank();
	    axis.deposit();
	    
	}

}
