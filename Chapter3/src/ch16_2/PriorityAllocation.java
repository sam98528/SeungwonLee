package ch16_2;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 우선순위가 높은 고객우선 숙련도 높은 상담원이 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담 전화를 다음 우선순위 높은 상담원에게 전달합니다.");
		
	}

}
