package aaa;

public class day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주석 : 개발자가 설명을 작성한것..
		//java를 사랑하자.. java의 문법을 정확하게 사용하자!!
		System.out.println();  // 콘솔에 출력하라는의미(흑백화면에 출력)
		//나는 슛자10을 출력하고싶어요
		System.out.println(10);
		//나는 이름(문자)를 출력하고싶다
		System.out.println("kkk");
		//숫자와 문자의 구분이다. 문제:나는 문자 10을 출력하고 싶어요
		System.out.println("10");
		System.out.println("10"+"10");//+ : 연결자
		System.out.println(10+10); // + :사칙연산 중 더하기 연산자
		System.out.println(10+"10");// 큰 범위의 형변환이 일어남.. 숫자10이 문자로 바뀜
		
		//1.자료형을 공부해야합니다. 자료형과 변수를 공부
		int a=10; //int를 저장할수있는 변수를 선언하겠다. 초기값은 10이다.
		a=20; //변수의 저장된 값을 바뀔 수있다. 그러나 자료형은 바꿀 수가 없다.
		String b ="문자열"; // a="sad"는 불가능하다 정수에 문자열을 담을수없다
		System.out.println("a의 값은"+a);
		System.out.println("b의 값은"+b);
		//문제 손코딩으로
		/* 선언문은 변수를 사용하겠다고 정의함. 이때 자료형과 초기값으 기입
		 * 2. = 대입연산자 x =10; 10이 먼저 해석 그리고 10을 x에 저장한다.
		 * x=y+1;이 먼저 실행되거 결과를 x에 저장한다.
		 */
		//int 는 산수가되고 String 은 산수를 할수없다.
		int bb = 30; //선언문 : bb라는 변수를 선언,자료형은 숫자(정수),초기값 30
		int kk = 60;
		bb=50;		//구현문 : 대입연산자.. 50을 bb라는 변수에 저장하라.
		kk=bb; 		//구현문 : 대입연산자..bb(50)를 kk란는 변수에 저장하라 kk=50
		
		//철수의 성적표를 출력
		double java=50.12;
		double html=60.12;

		html += 20;
		System.out.println("java"+(java+20));
		System.out.println("html"+html);
		
		/*자료형(java)
		 * 1.숫자: 정수(음의정수, 양의정수,0
		 * 2.문자 : 한문자, 작은 따음표
		 * 3.실수 : 소수점
		 * 4.boolean : 참과 거짓
		 * 5.문자열 : 한문자 이상, 큰 따음표
		 */
		int d1 = 10;  //
		char d2 = 'A';
		double d3=78.12;  // 애네는 객체이다
		boolean d4=true;
		String d6="A";  //
		String d7="ABCE";
		
		System.out.println("A" + "\n");//html <br> 같은 효과.. 개행문자
		System.out.println("B" + "\t");
		System.out.println("C");
		System.out.println();
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");
	}

}
