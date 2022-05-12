package ch16_2;

public class LeastJob implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 대기가 적은 상담원 우선으로 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담 전화를 다음 대기가 적은 상담원에게 전달합니다.");
		
	}
}
