package forEX;

public class forEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //����,,���ڿ� ����, �ʱⰪabcdaadd �� �����ϰ� �ִ�
		//id ������ a��� ���ڸ� ����Ͻÿ�..
		//���ڴ� �ϳ��� ����,, ���ڿ��� �ϳ� �̻��� ���ڸ� ���ڿ��̶�� �մϴ�.
		//a��� ���ڸ�����ϱ� ���ؼ��� ���ڿ��� �պκк��� �ϳ��� �߶� Ȯ���ؾ� �մϴ�.
			// a   b   c   d   a   a   a   d   d �����ش�
			// �� �� �� �� �� �� �� �� ��
			// ���			   ��� ��� ���
	//	System.out.println(id.charAt(2)); // id��� ���ڿ����� 2���� ���ڸ� �߶󳻰� ����϶�
/*		
				int cnt=0;
				for(int i=0; i<=8; i++) {
					if('a'== id.charAt(i)) {
						cnt++;
				
					}
				}
				System.out.println(cnt);//���ڱ����� �߶� ����? �� ���ڰ� a�� ������ �Ǵ�
				if(cnt<2) {
					System.out.println("Ư�����ڴ� �ݵ�� 2�� �̻��̿����մϴ�.");
				}
	*/	String id="abc!!!daaadkaa!";
	//1�� a�� b���ڸ� ����ϰ��Ͻÿ�
	for(int i=0; i<=14; i++) {
		if('a'== id.charAt(i) ||'b'==id.charAt(i)) {
			
				System.out.println(id.charAt(i));
		}		
	}
	
			//2�� a���ڿ� b���ڸ��� ���Ͽ� ������ ���ڿ��� ���� ����Ͻÿ�	
	//if���� �ϳ��� �ٷ���
	String sum="a";
	String sum1="a";
	for(int i=0; i<=14; i++) {
		if('a'==id.charAt(i)){ 
				sum+='a';
		}
		if('b'==id.charAt(i)){		
				sum1+='b';			
		}
	}
	System.out.println(sum+sum1);
	//3�� ������ ���� ã��- �˰� �ִ°� �ѵ���
	// a��� ������ ���� ������ ������ �������� ���̰� ������� 
	//ū���� ����Ѵ� ��� :3 ;
				
	int sum=0;
	for(int i=0; i<=id.length(); i++) {
		if('a'==id.charAt(i)&& id.charAt(i)=='a') {
			sum+=1;
			System.out.println(sum);
		}
		
	}
	}

}
