package aaa;

public class day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ּ� : �����ڰ� ������ �ۼ��Ѱ�..
		//java�� �������.. java�� ������ ��Ȯ�ϰ� �������!!
		System.out.println();  // �ֿܼ� ����϶���ǹ�(���ȭ�鿡 ���)
		//���� ����10�� ����ϰ�;��
		System.out.println(10);
		//���� �̸�(����)�� ����ϰ�ʹ�
		System.out.println("kkk");
		//���ڿ� ������ �����̴�. ����:���� ���� 10�� ����ϰ� �;��
		System.out.println("10");
		System.out.println("10"+"10");//+ : ������
		System.out.println(10+10); // + :��Ģ���� �� ���ϱ� ������
		System.out.println(10+"10");// ū ������ ����ȯ�� �Ͼ.. ����10�� ���ڷ� �ٲ�
		
		//1.�ڷ����� �����ؾ��մϴ�. �ڷ����� ������ ����
		int a=10; //int�� �����Ҽ��ִ� ������ �����ϰڴ�. �ʱⰪ�� 10�̴�.
		a=20; //������ ����� ���� �ٲ� ���ִ�. �׷��� �ڷ����� �ٲ� ���� ����.
		String b ="���ڿ�"; // a="sad"�� �Ұ����ϴ� ������ ���ڿ��� ����������
		System.out.println("a�� ����"+a);
		System.out.println("b�� ����"+b);
		//���� ���ڵ�����
		/* ������ ������ ����ϰڴٰ� ������. �̶� �ڷ����� �ʱⰪ�� ����
		 * 2. = ���Կ����� x =10; 10�� ���� �ؼ� �׸��� 10�� x�� �����Ѵ�.
		 * x=y+1;�� ���� ����ǰ� ����� x�� �����Ѵ�.
		 */
		//int �� ������ǰ� String �� ����� �Ҽ�����.
		int bb = 30; //���� : bb��� ������ ����,�ڷ����� ����(����),�ʱⰪ 30
		int kk = 60;
		bb=50;		//������ : ���Կ�����.. 50�� bb��� ������ �����϶�.
		kk=bb; 		//������ : ���Կ�����..bb(50)�� kk���� ������ �����϶� kk=50
		
		//ö���� ����ǥ�� ���
		double java=50.12;
		double html=60.12;

		html += 20;
		System.out.println("java"+(java+20));
		System.out.println("html"+html);
		
		/*�ڷ���(java)
		 * 1.����: ����(��������, ��������,0
		 * 2.���� : �ѹ���, ���� ����ǥ
		 * 3.�Ǽ� : �Ҽ���
		 * 4.boolean : ���� ����
		 * 5.���ڿ� : �ѹ��� �̻�, ū ����ǥ
		 */
		int d1 = 10;  //
		char d2 = 'A';
		double d3=78.12;  // �ֳ״� ��ü�̴�
		boolean d4=true;
		String d6="A";  //
		String d7="ABCE";
		
		System.out.println("A" + "\n");//html <br> ���� ȿ��.. ���๮��
		System.out.println("B" + "\t");
		System.out.println("C");
		System.out.println();
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");
	}

}
