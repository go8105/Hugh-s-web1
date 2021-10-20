package forEX;

import java.util.Scanner;

public class first {
	static seconds add = new seconds(); // 객체의 myUser를 출력하여 만든다
	static Scanner in = new Scanner(System.in);
	static seconds[] User = new seconds[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			menu();
			String sel = in.nextLine();
			if (sel.equals("1")) {
				addName(); // 등록
			} else if (sel.equals("2")) {
				delName(); // 삭제
			} else if (sel.equals("3")) {
				vieName(); // 전체보기
			} else if (sel.equals("4")) {
				searchName();// 검색
			} else if (sel.equals("5")) {
				fixName(); // 수정
			}
		}
	}

	public static void addName() { // 회원등록 매소드
	
		System.out.println("회원등록을 해주세요 ");
		System.out.println("이름을 입력해주세요.");
		add.name = in.nextLine(); // 이름 등록
		System.out.println("나이를 입력해주세요.");
		add.age = in.nextInt(); // 나이 등록
		in.nextLine();
		System.out.println("전화번호 뒷자리 4개 입력해주세요");
		add.number = in.nextLine(); // 번호 등록				


			for (int i = 0; i < User.length; i++) { // User 배열의 길이만큼 반복한다.
				if (User[i] == null) { // User 배열안에 값이 null일 경우 실행한다.
	
					User[i] = add; // User배열의 add의 모든 값을 저장한다.
					System.out.println("저장되었습니다 ");
					break; // 반복문을 종료하게된다.
				}
			}

	}

	public static void delName() { // 회원 삭제 메소드
		System.out.println("삭제할 이름을 입력해주세요");
		String tip = in.nextLine();
		for (int i = 0; i < User.length; i++) { // 배열의 길이 만큼 반복한다.
			if (User[i] != null) { // User배열안에 값이 null이 아닌 경우 실행한다.
				if (User[i].name.equals(tip)) { // User 배열안에 name의 값과 검색한 값이 같은경우 실행한다
					User[i] = null; // 값을 null로 바꿔주므로 값이 없다.
					System.out.println("삭제되었습니다");
					break; // 반복문을 종료하게된다.
				}
			}
		}
	}

	public static void vieName() { // 전체보기 메소드
		for (int i = 0; i < User.length; i++) { // 배열의 길이 만큼 반복한다.
			if (User[i] != null) { // User배열안에 값이 null이 아닌 경우 실행한다.
				System.out.println("회원 이름 : " + User[i].name); // 저장된 이름을 전부 출력한다
				System.out.println("나이 : " + User[i].age); // 저장된 나이를 전부 출력한다
				System.out.println("회원의 전화번호 뒷자리는 : " + User[i].number);// 저장된 번호를 전부 출력한다
				System.out.println("번호" + i);
			}
		}
	}

	public static void searchName() { // 검색 메소드
		System.out.println("검색하실 이름을 입력해주세요.");
		String tip = in.nextLine();
		for (int i = 0; i < User.length; i++) { // 배열의 길이 만큼 반복한다.
			if (User[i] != null) { // User배열안에 값이 null이 아닌 경우 실행한다.
				if (User[i].name.equals(tip)) { // User 배열안에 name의 값과 검색한 값이 같은경우 실행한다
					System.out.println("회원 이름 : " + User[i].name); // 현재 배열의 name값을 출력한다.
					System.out.println("나이 : " + User[i].age); // 현재 배열의 age의 값을 출력한다
					break; // 반복문을 종료하게된다.
				}
			}
		}
	}

	public static void fixName() { // 수정 메소드
		System.out.println("찾을 이름을 입력하세요");
		String tip = in.nextLine();
		for (int i = 0; i < User.length; i++) { // 배열의 길이 만큼 반복한다.
			if (User[i] != null) { // User배열안에 값이 null이 아닌 경우 실행한다.
				if (User[i].name.equals(tip)) { // User 배열안에 name의 값과 검색한 값이 같은경우 실행한다
					System.out.println("수정할 이름을 입력하세요");
					tip = in.nextLine(); // 수정할 이름을 입력
					User[i].name = tip; // 수정된 이름을 등록
					System.out.println("수정할 나이를 입력하세요");
					int top = in.nextInt();
					in.nextLine(); // 수정할 나이를 입력
					User[i].age = top; // 수정된 나이를 등록
					System.out.println("수정한 회원 이름은 : " + User[i].name);
					System.out.println("수정한 회원 나이는 : " + User[i].age);
					break;
				}
			}
		}
	}

	public static void menu() {
		System.out.println("1.회원 등록");
		System.out.println("2.회원 삭제");
		System.out.println("3.회원 전체보기");
		System.out.println("4.회원 검색");
		System.out.println("5.회원 수정");
	}
}