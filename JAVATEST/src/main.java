
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.0�߶����ռ�
		 */
//		new GaoerjiDiary().GetXDays(1989, 4, 29, 8809);
		
		/*
		 *1.1 xxxx-xx-xx ǰn����ʲô���� 
		 */
//		new WhatIsTheDateBeforeN().getDate(2013,6,10,10000);
		
		/*
		 * 1.2 xxxx-xx-xx ��xxxx-xx-xx ���ж�����
		 */
//		new HowManyDaysBetweenNM().getDays("1989-4-29","2013-6-11");
		
		
		/*
		 * 2.����ƽ����
		 */
		//new ExcludeNumber().selectNum();
		/*
		 * 3.�����л���Ϸ
		 */
//		new Zhenxingzhonghua().test();
		/*
		 * 4.��������
		 */
		//new ReverseNumber().selectNum();
		/*
		 * ��֮��Ĵ�ֵ
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
		 * ���ֵ����ʾ
		 */
//		new main().CharCode();
		
		/*
		 * ���ַ���ת���ɶ������ַ������Կո����
		 */
//		System.out.println(new main().StrToBinstr("����һ������o"));
		
		
		/*
		 * �������ȼ�
		 */
//		new main().testProperty();
		
		/*
		 * ��һ�������
		 */
//		new TheNextSeconds(2014, 2, 28, 23, 59, 59).getTheNextSeconds();
		
		/*
		 * ABCDE*4 = EDCBA
		 */
//		new WhatIsABCDE().getTheABCDE();
		
		
	}

	public void CharCode() {
			String str = "��";
			try {
				byte[] b = str.getBytes("GB2312");
				for (int i = 0; i < b.length; i++) {
					System.out.println(Integer.toHexString(b[i]));
				}
			} catch (Exception ex) {
			}
	}
	
	 //���ַ���ת���ɶ������ַ������Կո����
    private String StrToBinstr(String str) {
        char[] strChar=str.toCharArray();
        String result="";
        for(int i=0;i<strChar.length;i++){
            result +=Integer.toBinaryString(strChar[i])+ " ";
        }
        return result;
    }
    
    //���ȼ�
    public void testProperty() {
    	 int x=20, y=30; 
    	  boolean b; 
    	 b=x>50&&y>60||x>50&&y<-60||x<-50&&y>60||x<-50&&y<-60; 
    	 System.out.println(b);
    }
   


}
