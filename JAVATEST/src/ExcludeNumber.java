
public class ExcludeNumber {  
/* 
 * ����ƽ���� 
 */  
    long PingNum = 0; //�洢ƽ��  
      
    /* 
     * �ж�һ�����Ƿ����ظ����� 
     */  
    public boolean IsSame(long x){  
        long store[] = new long[7];  
        long r;  
        int i = 0;  
        while(x != 0){ //���������ÿһλ������store����  
            r = x % 10;  
            x = x / 10;  
            store[i] = r;  
            i++;  
        }  
          
        long result;  
        for(int j = 0; j < 5; j++){ //�ж������ظ���  
            result = store[j];  
            for(int k = j+1; k < 6; k++){  
                if(result == store[k])  
                    return true;  
            }  
        }  
          
        return false;  
    }  
    public boolean IsSame2(long Num,long n){  
        long store[] = new long[7];  
        long r;  
        int i = 0;  
        while( n != 0){  
            r = n % 10;  
            n = n / 10;  
            store[i] = r;  
            i++;  
        }  
          
        long storeping[] = new long[18];  
        i = 0;  
        while(Num != 0){  
            r = Num % 10;  
            Num = Num / 10;  
            storeping[i] = r;  
            i++;  
        }  
                  
        for(int k = 0; k < 6; k++){   //��������ÿһλ����ƽ����ÿһλ�Ƚϣ����Ƿ�����ͬ����  
            for(int j = 0; j < i; j++){  
                if(store[k] == storeping[j])  
                    return true;  
            }  
        }  
          
        return false;  
    }  
      
    public void selectNum(){ //ɸѡ������  
          
        for(long n = 100000; n <= 999999;n++){  
            if(IsSame(n))  //����ͬ�����֣�������  
                continue;  
            else{  
                PingNum = n*n;  
                if(IsSame2(PingNum,n)) //������ƽ�����Ƿ����������ͬ������  
                    continue;  
                else                   //�������������ӡ  
                    System.out.println(n);  
            }  
        }  
    }  
} 
