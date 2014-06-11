
public class ExcludeNumber {  
/* 
 * 排它平方数 
 */  
    long PingNum = 0; //存储平方  
      
    /* 
     * 判断一个数是否有重复数字 
     */  
    public boolean IsSame(long x){  
        long store[] = new long[7];  
        long r;  
        int i = 0;  
        while(x != 0){ //分离该数的每一位，存入store数组  
            r = x % 10;  
            x = x / 10;  
            store[i] = r;  
            i++;  
        }  
          
        long result;  
        for(int j = 0; j < 5; j++){ //判断有无重复数  
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
                  
        for(int k = 0; k < 6; k++){   //将该数的每一位与其平方的每一位比较，看是否有相同的数  
            for(int j = 0; j < i; j++){  
                if(store[k] == storeping[j])  
                    return true;  
            }  
        }  
          
        return false;  
    }  
      
    public void selectNum(){ //筛选排他数  
          
        for(long n = 100000; n <= 999999;n++){  
            if(IsSame(n))  //有相同的数字，则跳过  
                continue;  
            else{  
                PingNum = n*n;  
                if(IsSame2(PingNum,n)) //该数的平方中是否有与该数相同的数字  
                    continue;  
                else                   //符合条件，则打印  
                    System.out.println(n);  
            }  
        }  
    }  
} 
