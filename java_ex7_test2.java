ㅓㅗ허허ㅏㅠㅘㅓㅣㅗㅝㅏㅣㅓㅣㅓㅣ


import java.util.*;

public class java_ex7_test2 {

	public static void main(String[] args) {
		int answer = 0;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome! Zootopia!!");
		System.out.println("[현재 시간 8시 00분]");
		System.out.println("오늘은 당신의 첫 출근날입니다.");
		System.out.println("회사 출근을 하시겠습니까? (번호를 입력해주세요.)");
		System.out.println("1.예 2.아니오");
		answer = scanner.nextInt();
		
		if(answer==1) {
			System.out.println("출근하기로 한 당신! 근면한 토끼로군요!!");
			System.out.println("씻고 출발하시겠습니까? (번호를 입력해주세요.)");
			System.out.println("1.예 2.아니오");
			answer = scanner.nextInt();
			
			if(answer==1) {
				System.out.println("[현재 시간 8시 20분]");
				System.out.println("근면하고 깔끔하기 까지?!");
				System.out.println("오늘은 활기찬 하루가 될 것 같아요!!");
				System.out.println("출근은 9시까지 해야합니다.");
				System.out.println("당신의 집은 회사에서 도보로 20분 거리입니다.");
				System.out.println();
				System.out.println("출근하시겠습니까? (번호를 입력해주세요.)");
				System.out.println("1.도보(20분) 2.지하철(5분) 3.방에서 쉬기");
				answer = scanner.nextInt();

				if(answer==1) {
					System.out.println("당신은 집에서 회사로 출발합니다.");
					System.out.println("가는 도중에 커피를 사시겠습니까? (번호를 입력해주세요.)");
					System.out.println("1.예 2.아니오");
					answer = scanner.nextInt();
					
					if(answer==1) {
						System.out.println("아침부터 커피를 찾는 당신!");
						System.out.println("진정한 회사인이로군요!!");
						System.out.println("모든 카페는 회사가는 길 직선상에 있습니다.");
						System.out.println("어느 카페로 가시겠습니까? (번호를 입력해주세요.)");
						System.out.println("1.투썸플레이스(5분 거리) 2.엔젤인어스(7분 거리) 3.스타벅스(10분 거리)");
						answer = scanner.nextInt();
						
						if(answer==1) {
							System.out.println("[현재 시간 8시 25분]");
							System.out.println("투썸플레이스에 도착했습니다.");
							System.out.println("무엇을 시키겠습니까?");
							System.out.println("1.아메리카노 2.카라멜마키아또 3.티 4.물");
							answer = scanner.nextInt();
							
							if(answer==1) {
								Cafe coffee = new ATwosomeplace();
								coffee.Americano();
							}
							else if(answer==2) {
								Cafe coffee = new ATwosomeplace();
								coffee.Caramel_Makiato();
							}
							else if(answer==3) {
								Cafe coffee = new ATwosomeplace();
								coffee.Tea();
							}
							else if(answer==4) {
								Cafe coffee = new ATwosomeplace();
								coffee.WTR();
							}
							
						}
						else if(answer==2) {
							System.out.println("[현재 시간 8시 27분]");
							System.out.println("엔젤인어스에 도착했습니다.");
							System.out.println("무엇을 시키겠습니까?");
							System.out.println("1.아메리카노 2.카라멜마키아또 3.티 4.물");
							answer = scanner.nextInt();
							
							if(answer==1) {
								Cafe coffee = new Angel_in_us();
								coffee.Americano();
							}
							else if(answer==2) {
								Cafe coffee = new Angel_in_us();
								coffee.Caramel_Makiato();
							}
							else if(answer==3) {
								Cafe coffee = new Angel_in_us();
								coffee.Tea();
							}
							else if(answer==4) {
								Cafe coffee = new Angel_in_us();
								coffee.WTR();
							}
							
						}
						else if(answer==3) {
							System.out.println("[현재 시간 8시 30분]");
							System.out.println("스타벅스에 도착했습니다.");
							System.out.println("무엇을 시키겠습니까?");
							System.out.println("1.아메리카노 2.카라멜마키아또 3.티 4.물");
							answer = scanner.nextInt();
							
							if(answer==1) {
								Cafe coffee = new Starbucks();
								coffee.Americano();
							}
							else if(answer==2) {
								Cafe coffee = new Starbucks();
								coffee.Caramel_Makiato();
							}
							else if(answer==3) {
								Cafe coffee = new Starbucks();
								coffee.Tea();
							}
							else if(answer==4) {
								Cafe coffee = new Starbucks();
								coffee.WTR();
							}
							
						}
				}  
				else if(answer==2) {
					System.out.println("열정으로 아침을 이겨내는 당신!");
					System.out.println("역시 신입의 패기는 다르군요!!");
					System.out.println("회사로 바로 갑니다.");
				}
					
			}
			else if(answer==2) {
				System.out.println("효율적인 삶을 사는군요!!");
				System.out.println("지하철을 타러 이동합니다.");
				System.out.println("회사로 바로 갑니다.");
			}
			else if(answer==3) {
				System.out.println("벌써부터 퇴근을 바라는 당신!!");
				System.out.println("신입이지만 마음은 벌써 2년차 사회인이군요!!");
				System.out.println("하지만 엄마가 방으로 찾아와 회사를 가라며 보냅니다.");
			}
			
			
			}
			else if(answer==2) {
				System.out.println("씻지 않고 출근하는 당신!!");
				System.out.println("꾸안꾸를 사회생활에 시전하시는군요!!");
				System.out.println("출근은 9시까지 해야합니다.");
				System.out.println("당신의 집은 회사에서 도보로 20분 거리입니다.");
				System.out.println();
				System.out.println("출근하시겠습니까? (번호를 입력해주세요.)");
				System.out.println("1.도보(20분) 2.지하철(5분) 3.방에서 쉬기");
				answer = scanner.nextInt();
				
				if(answer==1) {
					System.out.println("당신은 집에서 회사로 출발합니다.");
					System.out.println("길을 가는 도중에 팀장님을 만났습니다.");
					System.out.println("당신에게 말을 걸어옵니다.");
					System.out.println("인사를 하시겠습니까?");
					System.out.println("1.예 2.아니오");
					answer = scanner.nextInt();
				
					if(answer==1) {
						System.out.println("회사동료가 당신의 행색을 보고 어이없다는 눈을 하고 있습니다.");
						System.out.println("회사에 도착해서 모든 동료들이 당신을 보고 쑥덕입니다.");
						System.out.println("회사에서 당신의 별명은 \"꽃거지\"가 되었습니다.");
						System.out.println();
						System.out.println("End");
					}
					else if(answer==2) {
						System.out.println("인사를 무시한 당신!!");
						System.out.println("회사에서 어느새 왕따를 당하게 되었습니다.");
						System.out.println("인사 한마디의 파급력을 깨닫게 되었지만 늦었습니다.");
						System.out.println("결국 당신은 견디지 못해 퇴사했습니다.");
						System.out.println();
						System.out.println("End");
					}
				}
				else if(answer==2) {
					System.out.println("만원 지하철을 탄 당신");
					System.out.println("주변 사람들이 당신의 정수리 냄새를 맡고 기절했습니다.");
					System.out.println("당신은 경찰에게 잡혀 깜빵에 들어갔습니다.");
					System.out.println("출근하지 못하였기에 회사도 잘렸습니다.");
					System.out.println();
					System.out.println("End");
				}
				else if(answer==3) {
					System.out.println("벌써부터 퇴근을 바라는 당신!!");
					System.out.println("신입이지만 마음은 벌써 2년차 사회인이군요!!");
					System.out.println("하지만 엄마가 방으로 찾아와 회사를 가라며 보냅니다.");
				}
			}

		}
		else if(answer==2) {
			System.out.println("회사를 가지않아 다시 백수가 되었습니다.");
			System.out.println("취업준비를 하시겠습니까? (번호를 입력해주세요.)");
			System.out.println("1.예 2.아니오");
			answer = scanner.nextInt();
			
			if(answer==1) {
				System.out.println("\"진작에 회사를 갔더라면 다시 취업준비를 하지않았을텐데..\"");
				System.out.println("라는 생각을 하며 당신은 다시 취준을 시작합니다.");
				System.out.println();
				System.out.println("End");
				
			}
			else if(answer==2) {
				System.out.println("캥거루족으로 전직했습니다.");
				System.out.println("엄마가 도끼눈을 하며 항상 당신을 지켜보게됩니다.");
				System.out.println("현명한 선택을 하셨길 바랍니다...");
				System.out.println();
				System.out.println("End");
			}
		}
		
	}

}

class Product123 {
	String dnd = "Bottle";
	
}

interface Cafe {
	void Americano();
	void Caramel_Makiato();
	void Tea();
	void WTR();
}

class ATwosomeplace implements Cafe{
	public void Americano() {
		System.out.println("물 70% + 에스프레소 30%");
	}
	public void Caramel_Makiato() {
		System.out.println("물 50% + 에스프레소 30% + 카라멜 시럽 10% + 휘핑크림 10%");
	}
	public void Tea() {
		System.out.println("물 95% + 티 팩 5%");
	}
	public void WTR() {
		System.out.println("물 99% + 레몬 1%");
	}
}

class Angel_in_us implements Cafe{
	public void Americano() {
		System.out.println("물 75% + 에스프레소 25%");
	}
	public void Caramel_Makiato() {
		System.out.println("물 50% + 에스프레소 25% + 카라멜 시럽 5% + 휘핑크림 10%");
	}
	public void Tea() {
		System.out.println("물 96% + 티 팩 4%");
	}
	public void WTR() {
		System.out.println("물 98% + 레몬 1% + 라임 1%");
	}
	
}
class Starbucks extends Product123 implements Cafe {
	public void Americano() {
		System.out.println("물 65% + 에스프레소 35%");
	}
	public void Caramel_Makiato() {
		System.out.println("물 45% + 에스프레소 35% + 카라멜 시럽 10% + 휘핑크림 10%");
	}
	public void Tea() {
		System.out.println("물 93% + 티 팩 7%");
	}
	public void WTR() {
		System.out.println("물 98% + 레몬 2%");
	}
}
