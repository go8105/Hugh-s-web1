package aaa;

public class day00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a=5430;
		
		if(a >= 0){
			System.out.println("õ��¥�� : "+(a/1000)+"��");
			}	
		if(a >=0 ) {
			System.out.println("���¥�� : "+(a%1000)/100+"��");
		}
		if(a >=0) {
			System.out.println("�ʿ�¥�� : "+(a%100)/10+"��");
		}
		
		int b=5430;
		
		if(b >=0) {
			System.out.println("�ʿ�¥�� : "+(b%100)/10+"��");
		if(b >=0) {
				System.out.println("���¥�� : "+(b%1000)/100+"��");
				if(b >= 0){
					System.out.println("õ��¥�� : "+(b/1000)+"��");
					}
			}
		}
		int c=5430;
		
{	System.out.println("õ��¥�� : "+(c/1000)+"��");}	

{	System.out.println("���¥�� : "+(c%1000)/100+"��");}

{	System.out.println("�ʿ�¥�� : "+(c%100)/10+"��");}
		
		int a=5;
		for(int i=5; i>0;) {
			System.out.println(i+"����");// �������� �����Ƿ� ���5�̸� ���ѷ���
		}
		for(int i=0; i<a; i++) {
			System.out.println(i+"����");//0����5���� ����
		}
		for(int i=0; i<a; i++) {
			System.out.println(i+"����");//0�� ������ i���� 0���� ���� a=0;���ε�
		a=i;
		}
		for(int i=0; i<10;i++) {
			if(i%2==0) {
				System.out.println(i);//0����9�������� ������ 2�� �Ѱ��� ���������� 0�̶� �����ؼ� ������ ���
			}
		}
			//1���� 10���� ���Ѱ������ �ͷ��Ͻÿ�
			//�ݺ��ϴ� ���� :  1~10
			//�ݺ��ϴ¤� ���� : ������ �� >�������� > ����? ������ �̿��ϰڴ�..
			//�������� : ������ ������ ��ġ�� ����ؾ� �մϴ�..
			int sum=0; //������ ����> ���� ������Ű�ڴ�.
			//���� �߰� : ¦���� ���Ѵ�. > �������ʿ��Ѱ�? �ƴϿ� ���ǹ� �ʿ� ��� �����Ұ��ΰ�?
			for(int i=0; i<11; i++) {  //�ݺ��ϴ� ������ �ڵ�
				sum +=i;//�ڽ�
			}
			System.out.println(sum);
		
		
		*/
		
		/*
		 * int sum=0; for(int i=0; i<=100; i++){ sum+=i; }else if(sum<150) {
		 * 
		 * }
		 * 
		 * System.out.println(sum);
		 */
		 //1 ��  : 0���� 20���� Ȧ���� ���� ���Ͻÿ�
		int sum=0;
		 for(int i=0; i<=20;i++) {
			 if(i%2==1) {
				 sum+=i;
			 }
		 } 
			 System.out.println(sum);
		//2�� : 0~100 ������ Ȧ���� ���� ¦���� �E���� ���� ����Ͻÿ�
				 for(int i=0; i<100;i++) {
				 if(i%2==1) {
					 sum+=i;
				 }else{
					 
					 sum-=i;
				 }
			 }
			 	 System.out.println(sum);
		//3�� : 0~100 ������ Ȧ���� ���� ¦���� ���� ���� ��������Ͻÿ�
			 	 int sum1=0;

			 	 for(int i=0; i<=100; i++) {
			 		 if(i%2==1) {
			 			 sum-=i;
			 		 }
			 		 if(i%2==0) {
			 			 sum1+=i;
			 		 }
			 	 }
			 	 System.out.println(sum+" "+sum1);
		//4�� : 0~100 ������ 3�ǹ���� ������ �߷��Ͻÿ�
			 	 sum=0; //���� ���� ������ sum�� ������ �ʱⰪ�ʱ�ȭ
			 	 for(int i=0; i<=100; i++) {
			 		 if(i%3==0) {
			 			 sum+=1;

			 		 }
			 	 }
			 	 System.out.println(sum);
		//5��	: 0~100 �߿� 4�ǹ�� �̸鼭 5�� ����� ���� ����Ͻÿ�
			 	 for(int i=0; i<=100; i++){
			 		 if(i%4==0 && i%5==0) {	 			 
			 		//	 sum+=i; ���ص��ȴ� ����?
			 	 	 	System.out.println(i);
			 		 }
			 	 }
		//6��
			 	 for(int i=0; i<=100; i++) {
			 		 sum1=sum1+i;
			 		 if(sum1>150) {
			 		//	 break; �� �������� �������δ�
			 			 i=101;
			 		 }
			 	 }
			 	 System.out.println(sum);
		//7��	 	 
			 	 
			 	 
					// TODO Auto-generated method stub
					//���ǹ� :: if		���� ������ ���� ó���� �з��Ѵ�.
					//�ݺ��� ::for,while	���ǵ� �ڵ带 �ݺ��Ͽ� ó���Ѵ�.
					// 					���ǵ� �ڵ�� ����? �ݺ��� ��� ó���ұ�?
					//									�ݺ��� : ���� ����, ���� Ƚ���� ����(�ʱⰪ,����,������)
	}

}
