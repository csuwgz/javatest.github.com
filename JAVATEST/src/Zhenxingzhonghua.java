
public class Zhenxingzhonghua {

	/*
	 * 振兴中华
	 */
		int array[][] = 
			   {{0,1,2,3,4},
				{1,2,3,4,5},
				{2,3,4,5,6},
				{3,4,5,6,7}};
		int copyarray[][] = new int[4][5]; //显示路径的拷贝数组
		int startI = 0, startJ = 0;  // 入口
		int endI = 3, endJ = 4;  // 出口
		int success = 0;
		int count = 0;

		
		/*
		 * 初始化拷贝数组
		 */
		public void initcopy(){ 
			for(int k = 0; k < 4; k++){
				for(int d = 0; d < 5; d++){
					copyarray[k][d] = 10;
				}
			}
		}
		/*
		 * 遍历访问
		 */
		public void visit(int i,int j){
				copyarray[i][j] = array[i][j];
			if(i == endI &&  j == endJ){
				count++;
				System.out.print("\n 显示路径：\n");
				for(int k = 0; k < 4; k++){
					for(int d = 0; d < 5; d++){
						if(copyarray[k][d] == 0)
							System.out.print("从");
						else if(copyarray[k][d] == 1)
							System.out.print("我");
						else if(copyarray[k][d] == 2)
							System.out.print("做");
						else if(copyarray[k][d] == 3)
							System.out.print("起");
						else if(copyarray[k][d] == 4)
							System.out.print("振");
						else if(copyarray[k][d] == 5)
							System.out.print("兴");
						else if(copyarray[k][d] == 6)
							System.out.print("中");
						else if(copyarray[k][d] == 7)
							System.out.print("华");	
						else if(copyarray[k][d] == 10)
							System.out.print("一");	
		                else 
		                	System.out.print("一");	

					}
					System.out.println();
				}
			}
			if(j != 4 && array[i][j+1] == array[i][j]+1) visit(i,j+1);
			if(i != 3 && array[i+1][j] == array[i][j]+1) visit(i+1,j);
			
			copyarray[i][j] = 10;
		}
		/*
		 * 主调方法
		 */
		public void test(){

			initcopy();
			visit(startI,startJ);
			System.out.println("共有 "+count+" 种");
		}
		
}
