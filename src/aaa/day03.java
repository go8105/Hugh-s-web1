package aaa;

public class day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ǹ� 
		//���ǹ��� ���ǿ� ���� ���� ������ ó���ϴ� �����Դϴ�.
		//������ ������ �ۼ��ϸ� ���� �ݵ�� ���� �������� �����մϴ�.
		//������ ���� ������ �ִ�. �������� ��� �Ҽ� �ִ°��� ���ÿ�.
		/*
		 * 1. a>b o
		 * 2. a+b x
		 * 3. a<=b o
		 * 4. a-b x
		 * 5. a=b x ---??//�ڹٽ�ũ���� o����  �ڹٴ� �ΰ�������ؼ� �Ұ���(==)		 * 6. a>= o
		 */
		/*  >,  < ,  <=,     >= ,  ==,  != 
		 * ũ�� �۴� �۰ų����� ũ�ų����� ���� �����ʴ�*/
		int a=20;
		int b=10;
		if(a==b) {   //���ǿ� ���� ���� ó���ϰڴ�.
			System.out.println("����");
		}
		//ù���� if��
		if(a!=b) {
			System.out.println("�����ʴ�");
		}
		//�ι�° if��
		int point =0;
		if(point>30) {
			System.out.println("������");
			System.out.println("����ⱳü");
		}else {
			System.out.println("�����ʴ�");
			System.out.println("��糪��");
			//����° if
			int javaPoint=70; //�ڹ� ����> ����̾簡
			if(javaPoint >=90) {
				System.out.println("��");
			}else if(javaPoint >= 80) {
				System.out.println("��");
			}else if(javaPoint >= 70) {
				System.out.println("��");
			}else if(javaPoint >= 60) {
				System.out.println("��");
			}else {
				System.out.println("��");
		}
		}
		
			//sample ������ Ǯ� ����
			int aa=30;
			if(aa>=60) {
				System.out.println("�հ��Դϴ�");
			}else {
				System.out.println("���հ��Դϴ�");
			}
			aa=30;
			if(aa>=80) {
				System.out.println("����л��Դϴ�");
			}else if(aa>=70) {
				System.out.println("�����л��Դϴ�");
			}else if(aa>=60){
				System.out.println("�������ؾ��ϴ��л��Դϴ�");
			}else {
				System.out.println("Ż��");
			}
			//1.aa�� 60 �̻��̸� �հ��� ��� 60�̸��̸� ���հ� �߷�
			//2.aa�� 80�̻��̸�  ����л� 
			//3.    70�̻� �����л�, 60�л� ������ �л� ���
	
			int aaa=60;
			
			if(aaa%2 ==0) {
				System.out.println("¦���Դϴ�.");
			}else {
				System.out.println("Ȧ���Դϴ�.");
			}
			
			if(aaa%3 ==0 && aaa%5 == 0) {
				System.out.println("�հ��Դϴ�");
			}else {
				System.out.println("���հ��Դϴ�");
			}
//-------------------------------------------------------			
			int v=5430;
			if(v/1000 >=1) {
				System.out.println("1000 :"+v/1000%10);
			}
			
			if(v/100 >=1) {
				System.out.println("100 :"+v/100%10);
			}
			
			if(v/10 >=1) {
				System.out.println("10 :"+v/10%10 );
			}
//----------------------------------------------------------
			int o=40;
			int p=60;
			String sign="+";
			
			if(sign =="+") {
				System.out.println(o+p);
			}else
			if(sign =="-") {
				System.out.println(o-p);
			}else
			if(sign =="/") {
				System.out.println(o/p);
			}else	
			if(sign =="*") {
				System.out.println(o*p);
			}
			
			//5��	: 0~100 �߿� 4�ǹ�� �̸鼭 5�� ����� ���� ����Ͻÿ�
		 	 for(int i=0; i<=100; i++){
		 		 if(i%4==0 && i%5==0) {	 			 
		 	//		 sum+=i;
		 	 	 	System.out.println(i);
		 		 }
		 	 }
	}
	
	
}
