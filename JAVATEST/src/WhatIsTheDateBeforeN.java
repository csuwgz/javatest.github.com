public class WhatIsTheDateBeforeN {

	public void getDate(int year, int month, int day, int days) {
		int temp = days;
		// TODO Auto-generated method stub
		for(;days>0;days--) {
			if(day >1) {
				day--;
			}else {
				if(month>1) {
					month--;
					day = maxDaysOfTheMonth(year, month);
				}else {
					year--;
					month = 12;
					day = 31;
				}
			}
		}
		
		System.out.println("前" + temp + "天是：" + year + "年" + month + "月" + day
				+ "日");
	}

	int maxDaysOfTheMonth(int year, int month) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return (IsleapYear(year)?29:28);
		default:
			return -1;
		}
	}

	private boolean IsleapYear(int year) {
		// TODO Auto-generated method stub
		return  (year % 400 == 0 || year %4 == 0 && year % 100 != 0);
	}

	

}
