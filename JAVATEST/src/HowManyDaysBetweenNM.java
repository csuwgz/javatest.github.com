public class HowManyDaysBetweenNM {

	public void getDays(String string, String string2) {
//		System.out.println("  ----");
		int totalDays = 0;
		String[] str1 = string.split("-");
		String[] str2 = string2.split("-");
		int[] date = new int[] { Integer.parseInt(str1[0]),
				Integer.parseInt(str1[1]), Integer.parseInt(str1[2]) };
		int[] MaxDate = new int[] { Integer.parseInt(str2[0]),
				Integer.parseInt(str2[1]), Integer.parseInt(str2[2]) };
		

		while (!(date[0] == MaxDate[0] && date[1] == MaxDate[1]
				&& date[2] == MaxDate[2])) {
			
			
			if (date[2] < maxDaysOfTheMonth(date[0], date[1])) {
				date[2]++;
			} else {
				date[2] = 1;
				if (date[1] < 12) {
					date[1]++;
				} else {
					date[0]++;
					date[1] = 1;
				}
			}
			// 总天数加1
			totalDays++;
		}
		
		System.out.println("TotalDays:"+totalDays);

	}

	private int maxDaysOfTheMonth(int i, int j) {
		// TODO Auto-generated method stub
		switch (j) {
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
			return (IsleapYear(i)?29:28);
		default:
			return -1;
		
		}
	}

	private boolean IsleapYear(int year) {
		// TODO Auto-generated method stub
		return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
	}

}
