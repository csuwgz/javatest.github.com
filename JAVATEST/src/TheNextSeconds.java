/**
 * 
 */

/**
 * @author apple
 *
 */
public class TheNextSeconds {
	public TheNextSeconds(int year, int month, int date, int hour, int minites,
			int seconds) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
		this.hour = hour;
		this.minites = minites;
		this.seconds = seconds;
	}

	int year,month,date,hour,minites,seconds;

	public void getTheNextSeconds() {
		// TODO Auto-generated method stub
		if(!flag_formate()) {
			System.out.println("格式错误！");
			return;
		}
		
		//deal seconds
		if(seconds < 59) {
			seconds +=1;
		}else{
			seconds = 0;
			
			//deal minites
			if(minites<59) {
				minites +=1;
			}else {
				minites = 0;
				
				//deal hour
				if(hour<23) {
					hour += 1;
				}else {
					hour = 0;
					
					//deal date
					if (datePlus()) {
						date += 1;
					}else {
						date = 1;
						
						//deal month
						if(month <12) {
							month++;
						}else {
							month = 1;
							//deal year
							year++;
						}
					}
					
					
					
				}
			}
		}
		
		System.out.println(String.format("下一秒是：%d-%d-%d %d时%d分%d秒", year,month,date,hour,minites,seconds));
	}

	private boolean datePlus() {
		// TODO Auto-generated method stub
		if((1==month||3==month||5==month||7==month||8==month||10==month||12==month)&&(date<31)) {
			return true;
		}
		
		if((4==month||6==month||9==month||11==month)&&(date<30)) {
			return true;
		}
		
		if(2==month&&isLeapYear()&&date<29) {
			return true;
		}else if (2==month&&date<28) {
			return true;
		}
		
		return false;
	}

	private boolean isLeapYear() {
		// TODO Auto-generated method stub
		if(year%400 == 0 || (year%4 ==0 &&year %100 != 0)) {
			return true;
		}
		return false;
	}

	private boolean flag_formate() {
		// TODO Auto-generated method stub
		if(month>12||month<1||date<1||date>31||hour<0||hour>24||minites>59||minites<0||seconds<0||seconds>59) {
			return false;
		}else {

			return true;
		}
	}

	

}
