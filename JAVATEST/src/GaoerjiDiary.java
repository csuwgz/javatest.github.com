

	
	public class GaoerjiDiary {
	/*
	 * ��˹�ռ�(�������ڣ����X��������)
	 */
		/*
		 * �Ƿ�������
		 */
		boolean IsleapYear(int year){
			return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
		}
		
		/*
		 * ���ĳ��ĳ�µ��������
		 */
		int GetMaxDay(int year,int month,int day){
			switch(month){
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
		/*
		 * ���X��������
		 */
		void GetXDays(int year,int month,int day,int X){
			for(int i = 1; i <= X; i++){
				if(day != GetMaxDay(year,month,day)){
					day++;
				}else{
					if(month != 12){
						month++;
						day = 1;
					}else{
						month = day = 1;
						year++;
					}
				}
					
			}
			System.out.println(X+"����������"+year+"-"+month+"-"+day);
		}

	}


