package aaa;

public class day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음과 같은 프로그램을 작성하시오.
		//단 오늘 배운 내용만 사용하세요(if.for 등 금지)
		// 고객의 정보를 관리하는 샘플 프로그램
		//고객은 아이디, 이름 ,나이, 포인트로 구성된다.
		//아이디는 고객을 식별하는데 사용
		//이믈도 고개긍ㄹ 식별하는데 사용
		//나이는 고객의 연령층을 사용하는데 사용, 추후에 분석용으로 사용
		//포인트는 고객의 활동에 따라증가, 감소가 될 수 있다.
		
		//고객의 정보를 관리하는 변수를 선언하고
		//샘플로 선언된 변수를 구현(테스팅하고)
		//관련 고객의 정보를 출력하시오.
		
		//upgrade문제  구글링
		//나이를 출력할 떄 성인과 미성년자를 구분하여 같이 출력하시오.
		//예를 들어 나이가 23세 이면 나이를 출력하고 24(성인) 출력하시오.
		//if문 for문 금지..
		//연산자가능
		//자바 삼항연산자
		String name ="a" ;
		
		String id="b";
		

		int age = 20;
		
		int point = 10;
		
		String gender = age> 20? "성인":"미성년자";
		name = "조덕춘";
		
		id= "zone";
		
		age= 28;
		
		point = 20;
		
		System.out.println("이름은 : "+name);
		System.out.println("아이디 : "+id);
		System.out.println("age : "+age+gender);
		System.out.println("point : "+point);
			
		name = "김기덕";
		
		id = "gind";
		
		age = 15;
		
		point = 40;
	
		System.out.println("이름은 : "+name);
		System.out.println("아이디 : "+id);
		System.out.println("age : "+age+(age >24?"성인입니다":"청소년입니다"));
		System.out.println("point : "+point);
		//아래는 문제 풀이
		//선언문
		String id1="aaa";
		String name1="aaa";
		int age1=1;
		int point1=10;
		
		//구현
		id1="ac";
		name1="wqe";
		age1=11;
		
		//String gender = age> 20? "성인":"미성년자";
		//출력
		System.out.println();
		
	}
}

