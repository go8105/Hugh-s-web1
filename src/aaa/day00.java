package aaa;

public class day00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a=5430;
		
		if(a >= 0){
			System.out.println("천원짜리 : "+(a/1000)+"개");
			}	
		if(a >=0 ) {
			System.out.println("백원짜리 : "+(a%1000)/100+"개");
		}
		if(a >=0) {
			System.out.println("십원짜리 : "+(a%100)/10+"개");
		}
		
		int b=5430;
		
		if(b >=0) {
			System.out.println("십원짜리 : "+(b%100)/10+"개");
		if(b >=0) {
				System.out.println("백원짜리 : "+(b%1000)/100+"개");
				if(b >= 0){
					System.out.println("천원짜리 : "+(b/1000)+"개");
					}
			}
		}
		int c=5430;
		
{	System.out.println("천원짜리 : "+(c/1000)+"개");}	

{	System.out.println("백원짜리 : "+(c%1000)/100+"개");}

{	System.out.println("십원짜리 : "+(c%100)/10+"개");}
		
		int a=5;
		for(int i=5; i>0;) {
			System.out.println(i+"실행");// 증감식이 없으므로 계속5이며 무한루프
		}
		for(int i=0; i<a; i++) {
			System.out.println(i+"실행");//0부터5까지 실행
		}
		for(int i=0; i<a; i++) {
			System.out.println(i+"실해");//0을 실행후 i값이 0으로 된후 a=0;으로됨
		a=i;
		}
		for(int i=0; i<10;i++) {
			if(i%2==0) {
				System.out.println(i);//0부터9까지에서 나누기 2를 한값에 나머지값을 0이랑 대입해서 맞으면 출력
			}
		}
			//1부터 10까지 합한결과값을 촐력하시오
			//반복하는 순서 :  1~10
			//반복하는ㄷ 동작 : 누적된 합 >합을저장 > 저장? 변수를 이용하겠다..
			//주의할점 : 변수의 선언은 위치를 고려해야 합니다..
			int sum=0; //선언한 이유> 합을 누적시키겠다.
			//조건 추가 : 짝수만 답한다. > 변수가필요한가? 아니요 조건문 필요 어디에 삽입할것인가?
			for(int i=0; i<11; i++) {  //반복하는 순서르 코딩
				sum +=i;//자신
			}
			System.out.println(sum);
		
		
		*/
		
		/*
		 * int sum=0; for(int i=0; i<=100; i++){ sum+=i; }else if(sum<150) {
		 * 
		 * }
		 * 
		 * System.out.println(sum);
		 */
		 //1 번  : 0부터 20까지 홀수의 합을 구하시오
		int sum=0;
		 for(int i=0; i<=20;i++) {
			 if(i%2==1) {
				 sum+=i;
			 }
		 } 
			 System.out.println(sum);
		//2번 : 0~100 까지에 홀수는 덧샘 짝수는 뺼셈후 값을 계산하시오
				 for(int i=0; i<100;i++) {
				 if(i%2==1) {
					 sum+=i;
				 }else{
					 
					 sum-=i;
				 }
			 }
			 	 System.out.println(sum);
		//3번 : 0~100 까지에 홀수는 뺴고 짝수는 더한 값을 각각출력하시오
			 	 int sum1=0;

			 	 for(int i=0; i<=100; i++) {
			 		 if(i%2==1) {
			 			 sum-=i;
			 		 }
			 		 if(i%2==0) {
			 			 sum1+=i;
			 		 }
			 	 }
			 	 System.out.println(sum+" "+sum1);
		//4번 : 0~100 까지에 3의배수의 갯수를 추력하시오
			 	 sum=0; //위에 문제 때문에 sum의 변수값 초기값초기화
			 	 for(int i=0; i<=100; i++) {
			 		 if(i%3==0) {
			 			 sum+=1;

			 		 }
			 	 }
			 	 System.out.println(sum);
		//5번	: 0~100 중에 4의배수 이면서 5의 배수인 값을 출력하시오
			 	 for(int i=0; i<=100; i++){
			 		 if(i%4==0 && i%5==0) {	 			 
			 		//	 sum+=i; 안해도된다 왜지?
			 	 	 	System.out.println(i);
			 		 }
			 	 }
		//6번
			 	 for(int i=0; i<=100; i++) {
			 		 sum1=sum1+i;
			 		 if(sum1>150) {
			 		//	 break; 를 하지마는 조건으로는
			 			 i=101;
			 		 }
			 	 }
			 	 System.out.println(sum);
		//7번	 	 
			 	 
			 	 
					// TODO Auto-generated method stub
					//조건무 :: if		참과 거짓에 따라 처리를 분류한다.
					//반복문 ::for,while	정의된 코드를 반복하여 처리한다.
					// 					정의돈 코드는 뭘까? 반복은 어떻게 처리할까?
					//									반복은 : 무한 루프, 수행 횟수를 지정(초기값,조건,증감식)
	}

}
