
public class ReverseNumber {

	/*
	 * 实现数字的翻转
	 */
	public int reverse(int n){
	
		int store[] = new int[4];
		int result = 0;
		int r;
		int i = 0;
		
		while( n != 0){ //分离每个数，存入store中
			r = n % 10;
			n = n / 10;
			store[i] = r;
			i++;
		}
		for(int k = 0; k < i; k++){
			if(store[k] == 3 || store[k] == 4 || store[k] == 7)//数字中有3、4、7的不能翻转
				return -1;
			else if(store[k] == 6)//数字中有6,则转为9
				store[k] = 9;
			else if(store[k] == 9)//数字中有9,则转为6
				store[k] = 6;
		}
		for(int j = 0; j < i; j++){//计算翻转后的数
			if(store[0] == 0) //最后一个数字为0,不能翻转
				return -1;
			
			if(j == 0)
				result = store[j];
			else
			    result = result*10 +store[j];
		}

	//	System.out.println(result);
		return result;
	}
	public void selectNum(){
		int sub = 0;
		int sub2 = 0;
	
		for(int i = 1000; i <= 9999; i++){//遍历所有4位数
			
		    if(reverse(i) == -1)
		    	continue;
		    sub = i-reverse(i);
		    
		    if(sub < 200 || sub >= 300)
		    	continue;
			for(int j = 1000; j <= 9999; j++){
				
				if(reverse(j) == -1)
					continue;
				sub2 = reverse(j)-j;
				
				if(sub2 < 800 || sub2 >= 900)
					continue;	
				if((sub2-sub) == 558){
					System.out.println("赔钱的正确价格为："+i);
					//System.out.println("赚钱的正确价格为："+j);
				}
			}
		}
		
	}
}

