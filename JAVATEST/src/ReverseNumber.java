
public class ReverseNumber {

	/*
	 * ʵ�����ֵķ�ת
	 */
	public int reverse(int n){
	
		int store[] = new int[4];
		int result = 0;
		int r;
		int i = 0;
		
		while( n != 0){ //����ÿ����������store��
			r = n % 10;
			n = n / 10;
			store[i] = r;
			i++;
		}
		for(int k = 0; k < i; k++){
			if(store[k] == 3 || store[k] == 4 || store[k] == 7)//��������3��4��7�Ĳ��ܷ�ת
				return -1;
			else if(store[k] == 6)//��������6,��תΪ9
				store[k] = 9;
			else if(store[k] == 9)//��������9,��תΪ6
				store[k] = 6;
		}
		for(int j = 0; j < i; j++){//���㷭ת�����
			if(store[0] == 0) //���һ������Ϊ0,���ܷ�ת
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
	
		for(int i = 1000; i <= 9999; i++){//��������4λ��
			
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
					System.out.println("��Ǯ����ȷ�۸�Ϊ��"+i);
					//System.out.println("׬Ǯ����ȷ�۸�Ϊ��"+j);
				}
			}
		}
		
	}
}

