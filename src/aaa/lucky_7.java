package aaa;

public class lucky_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id="abcdefghijklmnopqrstuvwxyz";
		String nowMemo ="ilove youz";
	//	String newMemo ="ps       g";	
		String newMemo ="";
		
		//암호문을 바꾸세요.
		
		//행운의 숫자는 7이다 i라는 문자열 index에서 7을 더한 인덱스의 문자로 치환이 된다.
		// 변경된 문자를 출력하세요
		
		//nowMemo의 문자 하나를 id의 문자열에 비교해서 찾은후 +7를 해준다.
		
		for(int i=0; i<nowMemo.length();i++) {
			for(int j=0; j<id.length();j++) {
				if(nowMemo.charAt(i)==id.charAt(j)) {	//i를 id의 문자를 하나씩 비교후 찾느다.
				//	System.out.println("앞"+j);
										//찾은 값에서 7을 더해준다.	여기서 z다음의 인덱스가 없으므로 에러가발생함 어떻해 할것인까?						
											//id길이가 26(z)가 넘어 갈떄 z를 a로 해준다
				//	System.out.println("뒤"+j);
					if(j<25) {
						newMemo+=id.charAt(j+1);
					//	System.out.println("작동");
				//	System.out.println(newMemo);					
					}else if(j>=25) {
						
						newMemo+=id.charAt(-1+1) ;
						
					//	System.out.println("안녕");
					//	System.out.println(newMemo);
						
					}
				}
			}
		}
			System.out.println(newMemo);
			
		
		
		
	}

}
