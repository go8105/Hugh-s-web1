package forEX;

import java.util.Scanner;

public class first {
	static seconds add = new seconds(); // ��ü�� myUser�� ����Ͽ� �����
	static Scanner in = new Scanner(System.in);
	static seconds[] User = new seconds[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			menu();
			String sel = in.nextLine();
			if (sel.equals("1")) {
				addName(); // ���
			} else if (sel.equals("2")) {
				delName(); // ����
			} else if (sel.equals("3")) {
				vieName(); // ��ü����
			} else if (sel.equals("4")) {
				searchName();// �˻�
			} else if (sel.equals("5")) {
				fixName(); // ����
			}
		}
	}

	public static void addName() { // ȸ����� �żҵ�
	
		System.out.println("ȸ������� ���ּ��� ");
		System.out.println("�̸��� �Է����ּ���.");
		add.name = in.nextLine(); // �̸� ���
		System.out.println("���̸� �Է����ּ���.");
		add.age = in.nextInt(); // ���� ���
		in.nextLine();
		System.out.println("��ȭ��ȣ ���ڸ� 4�� �Է����ּ���");
		add.number = in.nextLine(); // ��ȣ ���				


			for (int i = 0; i < User.length; i++) { // User �迭�� ���̸�ŭ �ݺ��Ѵ�.
				if (User[i] == null) { // User �迭�ȿ� ���� null�� ��� �����Ѵ�.
	
					User[i] = add; // User�迭�� add�� ��� ���� �����Ѵ�.
					System.out.println("����Ǿ����ϴ� ");
					break; // �ݺ����� �����ϰԵȴ�.
				}
			}

	}

	public static void delName() { // ȸ�� ���� �޼ҵ�
		System.out.println("������ �̸��� �Է����ּ���");
		String tip = in.nextLine();
		for (int i = 0; i < User.length; i++) { // �迭�� ���� ��ŭ �ݺ��Ѵ�.
			if (User[i] != null) { // User�迭�ȿ� ���� null�� �ƴ� ��� �����Ѵ�.
				if (User[i].name.equals(tip)) { // User �迭�ȿ� name�� ���� �˻��� ���� ������� �����Ѵ�
					User[i] = null; // ���� null�� �ٲ��ֹǷ� ���� ����.
					System.out.println("�����Ǿ����ϴ�");
					break; // �ݺ����� �����ϰԵȴ�.
				}
			}
		}
	}

	public static void vieName() { // ��ü���� �޼ҵ�
		for (int i = 0; i < User.length; i++) { // �迭�� ���� ��ŭ �ݺ��Ѵ�.
			if (User[i] != null) { // User�迭�ȿ� ���� null�� �ƴ� ��� �����Ѵ�.
				System.out.println("ȸ�� �̸� : " + User[i].name); // ����� �̸��� ���� ����Ѵ�
				System.out.println("���� : " + User[i].age); // ����� ���̸� ���� ����Ѵ�
				System.out.println("ȸ���� ��ȭ��ȣ ���ڸ��� : " + User[i].number);// ����� ��ȣ�� ���� ����Ѵ�
				System.out.println("��ȣ" + i);
			}
		}
	}

	public static void searchName() { // �˻� �޼ҵ�
		System.out.println("�˻��Ͻ� �̸��� �Է����ּ���.");
		String tip = in.nextLine();
		for (int i = 0; i < User.length; i++) { // �迭�� ���� ��ŭ �ݺ��Ѵ�.
			if (User[i] != null) { // User�迭�ȿ� ���� null�� �ƴ� ��� �����Ѵ�.
				if (User[i].name.equals(tip)) { // User �迭�ȿ� name�� ���� �˻��� ���� ������� �����Ѵ�
					System.out.println("ȸ�� �̸� : " + User[i].name); // ���� �迭�� name���� ����Ѵ�.
					System.out.println("���� : " + User[i].age); // ���� �迭�� age�� ���� ����Ѵ�
					break; // �ݺ����� �����ϰԵȴ�.
				}
			}
		}
	}

	public static void fixName() { // ���� �޼ҵ�
		System.out.println("ã�� �̸��� �Է��ϼ���");
		String tip = in.nextLine();
		for (int i = 0; i < User.length; i++) { // �迭�� ���� ��ŭ �ݺ��Ѵ�.
			if (User[i] != null) { // User�迭�ȿ� ���� null�� �ƴ� ��� �����Ѵ�.
				if (User[i].name.equals(tip)) { // User �迭�ȿ� name�� ���� �˻��� ���� ������� �����Ѵ�
					System.out.println("������ �̸��� �Է��ϼ���");
					tip = in.nextLine(); // ������ �̸��� �Է�
					User[i].name = tip; // ������ �̸��� ���
					System.out.println("������ ���̸� �Է��ϼ���");
					int top = in.nextInt();
					in.nextLine(); // ������ ���̸� �Է�
					User[i].age = top; // ������ ���̸� ���
					System.out.println("������ ȸ�� �̸��� : " + User[i].name);
					System.out.println("������ ȸ�� ���̴� : " + User[i].age);
					break;
				}
			}
		}
	}

	public static void menu() {
		System.out.println("1.ȸ�� ���");
		System.out.println("2.ȸ�� ����");
		System.out.println("3.ȸ�� ��ü����");
		System.out.println("4.ȸ�� �˻�");
		System.out.println("5.ȸ�� ����");
	}
}