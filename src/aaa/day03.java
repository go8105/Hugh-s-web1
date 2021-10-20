package aaa;

public class day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건문 
		//조건문은 조건에 따라서 참과 거짓을 처리하는 구문입니다.
		//조건은 식으로 작성하며 식은 반드시 참과 거짓으로 구분합니다.
		//다음과 같은 조건이 있다. 조건으로 사용 할수 있는것을 고르시오.
		/*
		 * 1. a>b o
		 * 2. a+b x
		 * 3. a<=b o
		 * 4. a-b x
		 * 5. a=b x ---??//자바스크립은 o지만  자바는 두개를써야해서 불가능(==)		 * 6. a>= o
		 */
		/*  >,  < ,  <=,     >= ,  ==,  != 
		 * 크다 작다 작거나같다 크거나같다 같다 같지않다*/
		int a=20;
		int b=10;
		if(a==b) {   //조건에 따라 참만 처리하겠다.
			System.out.println("같다");
		}
		//첫번쨰 if절
		if(a!=b) {
			System.out.println("같지않다");
		}
		//두번째 if절
		int point =0;
		if(point>30) {
			System.out.println("레벨업");
			System.out.println("비행기교체");
		}else {
			System.out.println("같지않다");
			System.out.println("사양나춤");
			//세번째 if
			int javaPoint=70; //자바 점수> 수우미양가
			if(javaPoint >=90) {
				System.out.println("수");
			}else if(javaPoint >= 80) {
				System.out.println("우");
			}else if(javaPoint >= 70) {
				System.out.println("미");
			}else if(javaPoint >= 60) {
				System.out.println("양");
			}else {
				System.out.println("가");
		}
		}
		
			//sample 예제를 풀어서 제출
			int aa=30;
			if(aa>=60) {
				System.out.println("합격입니다");
			}else {
				System.out.println("불합격입니다");
			}
			aa=30;
			if(aa>=80) {
				System.out.println("우수학생입니다");
			}else if(aa>=70) {
				System.out.println("보통학생입니다");
			}else if(aa>=60){
				System.out.println("열심히해야하는학생입니다");
			}else {
				System.out.println("탈락");
			}
			//1.aa가 60 이상이면 합격을 출력 60미만이면 불합격 추력
			//2.aa가 80이상이면  우수학생 
			//3.    70이상 보통학생, 60학생 열심히 학생 출력
	
			int aaa=60;
			
			if(aaa%2 ==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
			
			if(aaa%3 ==0 && aaa%5 == 0) {
				System.out.println("합격입니다");
			}else {
				System.out.println("불합격입니다");
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
			
			//5번	: 0~100 중에 4의배수 이면서 5의 배수인 값을 출력하시오
		 	 for(int i=0; i<=100; i++){
		 		 if(i%4==0 && i%5==0) {	 			 
		 	//		 sum+=i;
		 	 	 	System.out.println(i);
		 		 }
		 	 }
	}
	
	
}
