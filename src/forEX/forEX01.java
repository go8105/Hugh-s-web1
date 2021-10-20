package forEX;

public class forEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //선언문,,문자열 변수, 초기값abcdaadd 를 저장하고 있다
		//id 변수에 a라는 문자만 출력하시오..
		//문자는 하나의 글자,, 문자열은 하나 이상의 글자를 문자열이라고 합니다.
		//a라는 문자를출력하기 위해서는 문자열의 앞부분부터 하나씩 잘라서 확인해야 합니다.
			// a   b   c   d   a   a   a   d   d 끈어준다
			// 비교 비교 비교 비교 비교 비교 비교 비교 비교
			// 출력			   출력 출력 출력
	//	System.out.println(id.charAt(2)); // id라는 문자열에서 2번쨰 문자를 잘라내고 출력하라
/*		
				int cnt=0;
				for(int i=0; i<=8; i++) {
					if('a'== id.charAt(i)) {
						cnt++;
				
					}
				}
				System.out.println(cnt);//문자까지는 잘라 냈죠? 이 문자가 a랑 같은지 판단
				if(cnt<2) {
					System.out.println("특수문자는 반드시 2개 이상이여야합니다.");
				}
	*/	String id="abc!!!daaadkaa!";
	//1번 a와 b문자만 출력하게하시오
	for(int i=0; i<=14; i++) {
		if('a'== id.charAt(i) ||'b'==id.charAt(i)) {
			
				System.out.println(id.charAt(i));
		}		
	}
	
			//2번 a문자와 b문자만을 합하여 별도의 문자열을 만들어서 출력하시오	
	//if문을 하나로 줄려라
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
	//3번 문자의 길이 찾기- 알고 있는것 총동원
	// a라는 문자의 깊이 문자의 갯수가 많을수록 깊이가 깊어진다 
	//큰것이 출력한다 결과 :3 ;
				
	int sum=0;
	for(int i=0; i<=id.length(); i++) {
		if('a'==id.charAt(i)&& id.charAt(i)=='a') {
			sum+=1;
			System.out.println(sum);
		}
		
	}
	}

}
