
public class Zhenxingzhonghua {

	/*
	 * �����л�
	 */
		int array[][] = 
			   {{0,1,2,3,4},
				{1,2,3,4,5},
				{2,3,4,5,6},
				{3,4,5,6,7}};
		int copyarray[][] = new int[4][5]; //��ʾ·���Ŀ�������
		int startI = 0, startJ = 0;  // ���
		int endI = 3, endJ = 4;  // ����
		int success = 0;
		int count = 0;

		
		/*
		 * ��ʼ����������
		 */
		public void initcopy(){ 
			for(int k = 0; k < 4; k++){
				for(int d = 0; d < 5; d++){
					copyarray[k][d] = 10;
				}
			}
		}
		/*
		 * ��������
		 */
		public void visit(int i,int j){
				copyarray[i][j] = array[i][j];
			if(i == endI &&  j == endJ){
				count++;
				System.out.print("\n ��ʾ·����\n");
				for(int k = 0; k < 4; k++){
					for(int d = 0; d < 5; d++){
						if(copyarray[k][d] == 0)
							System.out.print("��");
						else if(copyarray[k][d] == 1)
							System.out.print("��");
						else if(copyarray[k][d] == 2)
							System.out.print("��");
						else if(copyarray[k][d] == 3)
							System.out.print("��");
						else if(copyarray[k][d] == 4)
							System.out.print("��");
						else if(copyarray[k][d] == 5)
							System.out.print("��");
						else if(copyarray[k][d] == 6)
							System.out.print("��");
						else if(copyarray[k][d] == 7)
							System.out.print("��");	
						else if(copyarray[k][d] == 10)
							System.out.print("һ");	
		                else 
		                	System.out.print("һ");	

					}
					System.out.println();
				}
			}
			if(j != 4 && array[i][j+1] == array[i][j]+1) visit(i,j+1);
			if(i != 3 && array[i+1][j] == array[i][j]+1) visit(i+1,j);
			
			copyarray[i][j] = 10;
		}
		/*
		 * ��������
		 */
		public void test(){

			initcopy();
			visit(startI,startJ);
			System.out.println("���� "+count+" ��");
		}
		
}
