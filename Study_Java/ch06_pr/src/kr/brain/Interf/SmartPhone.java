package kr.brain.Interf;

public class SmartPhone implements Camera, Messenger, Timer, Phone {

//===================== Messenger========================= 
	@Override
	public void sendMsg(String phoneNumber, String msg) {
		System.out.printf("[%s]�� %s�޼��� ����\n", phoneNumber, msg);
	}

	@Override
	public void receiveMsg() {
		System.out.printf("�޼����� �����߽��ϴ�.");
	}

//===================== Phone ========================= 
	@Override
	public void call(String phoneNumber) {
		System.out.println(phoneNumber + "�� ��ȭ�� �̴ϴ�.");
	}

	@Override
	public void receive() {
		System.out.println("��ȭ�� �޽��ϴ�.");
	}

//===================== Timer ========================= 
	@Override
	public void playBeep() {
		System.out.println("�˶� : ������ ���");
	}

	@Override
	public void playMusic(String title) {
		System.out.printf("�˶� : %s ���� ���\n", title );
	}

	@Override
	public void takeaPicture() {
		System.out.println("������ ����ϴ�.");
		
	}

}