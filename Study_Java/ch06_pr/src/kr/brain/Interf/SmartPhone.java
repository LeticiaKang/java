package kr.brain.Interf;

public class SmartPhone implements Camera, Messenger, Timer, Phone {

//===================== Messenger========================= 
	@Override
	public void sendMsg(String phoneNumber, String msg) {
		System.out.printf("[%s]로 %s메세지 전송\n", phoneNumber, msg);
	}

	@Override
	public void receiveMsg() {
		System.out.printf("메세지가 도착했습니다.");
	}

//===================== Phone ========================= 
	@Override
	public void call(String phoneNumber) {
		System.out.println(phoneNumber + "에 전화를 겁니다.");
	}

	@Override
	public void receive() {
		System.out.println("전화를 받습니다.");
	}

//===================== Timer ========================= 
	@Override
	public void playBeep() {
		System.out.println("알람 : 비프음 재생");
	}

	@Override
	public void playMusic(String title) {
		System.out.printf("알람 : %s 음악 재생\n", title );
	}

	@Override
	public void takeaPicture() {
		System.out.println("사진을 찍습니다.");
		
	}

}
