package forEX;

public class forEx000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// 
	//		
	//	1. 먼저 id를 앞에서 부터 하나씩 분리해서 보겠죠?
		
	//	2.방금 분리한것이a 라면 그 다음부터 카운팅을 하고 아니면 카운팅을 안하겠다
	//				<샘플로 테스트 해봐야죠>
	//	3.이렇게 해서 다 돌면 가장 긴 값을 찾아 낸다.
		
		for(int i=0; i <9; i++) {
			for(int j=0; j<=8; j++) {
				if(j >=8-i) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	
	}
	}


