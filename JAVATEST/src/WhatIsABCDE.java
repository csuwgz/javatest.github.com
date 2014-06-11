
public class WhatIsABCDE {
	int i = 0;
	boolean flag;

	public void getTheABCDE() {
		// TODO Auto-generated method stub
		for(int i=10000;i<99999;i++) {
			this.falg_Num(i);
			if(flag) {
				System.out.println(i+":"+System.currentTimeMillis());
			}
		}
	}

	private void falg_Num(int num) {
		// TODO Auto-generated method stub
		int num5,num4,num3,num2,num1,temp;
		num5 = num/10000;
		temp = num%10000;
		num4 = temp/1000;
		temp %=1000;
		num3 = temp/100;
		temp %=100;
		num2 = temp/10;
		num1 = temp%10;
		
		if(num*4 == num1*10000+num2*1000+num3*100+num4*10+num5) {
		 flag = true;	
		}else {
			flag = false;
		}
		
		 
	}

}
