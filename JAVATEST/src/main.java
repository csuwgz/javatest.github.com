
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.0高尔基日记
		 */
//		new GaoerjiDiary().GetXDays(1989, 4, 29, 8809);
		
		/*
		 *1.1 xxxx-xx-xx 前n天是什么日期 
		 */
//		new WhatIsTheDateBeforeN().getDate(2013,6,10,10000);
		
		/*
		 * 1.2 xxxx-xx-xx 到xxxx-xx-xx 共有多少天
		 */
//		new HowManyDaysBetweenNM().getDays("1989-4-29","2013-6-11");
		
		
		/*
		 * 2.互异平方数
		 */
		//new ExcludeNumber().selectNum();
		/*
		 * 3.振兴中华游戏
		 */
//		new Zhenxingzhonghua().test();
		/*
		 * 4.倒置数字
		 */
		//new ReverseNumber().selectNum();
		/*
		 * 类之间的传值
		 * 1.
		 */
//		new GetandSet().setCs(9);
//		new GetandSet().getCs();
		/*
		 * 2.
		 */
//		GetandSet getadnSet = new GetandSet();
//		getadnSet.setCs(6);
//		getadnSet.getCs();
		
		/*
		 * 汉字点阵表示
		 */
//		new main().CharCode();
		
		/*
		 * 将字符串转换成二进制字符串，以空格相隔
		 */
//		System.out.println(new main().StrToBinstr("这是一个测试o"));
		
		
		/*
		 * 测试优先级
		 */
//		new main().testProperty();
		
		/*
		 * 下一秒的日期
		 */
//		new TheNextSeconds(2014, 2, 28, 23, 59, 59).getTheNextSeconds();
		
		/*
		 * ABCDE*4 = EDCBA
		 */
//		new WhatIsABCDE().getTheABCDE();
		
		
	}

	public void CharCode() {
			String str = "我";
			try {
				byte[] b = str.getBytes("GB2312");
				for (int i = 0; i < b.length; i++) {
					System.out.println(Integer.toHexString(b[i]));
				}
			} catch (Exception ex) {
			}
	}
	
	 //将字符串转换成二进制字符串，以空格相隔
    private String StrToBinstr(String str) {
        char[] strChar=str.toCharArray();
        String result="";
        for(int i=0;i<strChar.length;i++){
            result +=Integer.toBinaryString(strChar[i])+ " ";
        }
        return result;
    }
    
    //优先级
    public void testProperty() {
    	 int x=20, y=30; 
    	  boolean b; 
    	 b=x>50&&y>60||x>50&&y<-60||x<-50&&y>60||x<-50&&y<-60; 
    	 System.out.println(b);
    }
   


}
