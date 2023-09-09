package com.mphasis.billSystem;

public class BillCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit = 280;
		double billTopay = 0;
		
		if(unit <100)
		{
			billTopay = unit*1.20;
			
		}
		else if(unit <300)
		{
			billTopay = 100*1.20+(unit - 100)*2;
			
		}
		
		System.out.println("The electricity bill for " +unit+ " is : " + billTopay);
	}

}
