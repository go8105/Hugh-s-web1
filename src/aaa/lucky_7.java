package aaa;

public class lucky_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id="abcdefghijklmnopqrstuvwxyz";
		String nowMemo ="ilove youz";
	//	String newMemo ="ps       g";	
		String newMemo ="";
		
		//��ȣ���� �ٲټ���.
		
		//����� ���ڴ� 7�̴� i��� ���ڿ� index���� 7�� ���� �ε����� ���ڷ� ġȯ�� �ȴ�.
		// ����� ���ڸ� ����ϼ���
		
		//nowMemo�� ���� �ϳ��� id�� ���ڿ��� ���ؼ� ã���� +7�� ���ش�.
		
		for(int i=0; i<nowMemo.length();i++) {
			for(int j=0; j<id.length();j++) {
				if(nowMemo.charAt(i)==id.charAt(j)) {	//i�� id�� ���ڸ� �ϳ��� ���� ã����.
				//	System.out.println("��"+j);
										//ã�� ������ 7�� �����ش�.	���⼭ z������ �ε����� �����Ƿ� �������߻��� ��� �Ұ��α�?						
											//id���̰� 26(z)�� �Ѿ� ���� z�� a�� ���ش�
				//	System.out.println("��"+j);
					if(j<25) {
						newMemo+=id.charAt(j+1);
					//	System.out.println("�۵�");
				//	System.out.println(newMemo);					
					}else if(j>=25) {
						
						newMemo+=id.charAt(-1+1) ;
						
					//	System.out.println("�ȳ�");
					//	System.out.println(newMemo);
						
					}
				}
			}
		}
			System.out.println(newMemo);
			
		
		
		
	}

}
