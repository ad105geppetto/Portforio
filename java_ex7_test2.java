import java.util.*;

public class java_ex7_test2 {

	public static void main(String[] args) {
		int answer = 0;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome! Zootopia!!");
		System.out.println("[���� �ð� 8�� 00��]");
		System.out.println("������ ����� ù ��ٳ��Դϴ�.");
		System.out.println("ȸ�� ����� �Ͻðڽ��ϱ�? (��ȣ�� �Է����ּ���.)");
		System.out.println("1.�� 2.�ƴϿ�");
		answer = scanner.nextInt();
		
		if(answer==1) {
			System.out.println("����ϱ�� �� ���! �ٸ��� �䳢�α���!!");
			System.out.println("�İ� ����Ͻðڽ��ϱ�? (��ȣ�� �Է����ּ���.)");
			System.out.println("1.�� 2.�ƴϿ�");
			answer = scanner.nextInt();
			
			if(answer==1) {
				System.out.println("[���� �ð� 8�� 20��]");
				System.out.println("�ٸ��ϰ� ����ϱ� ����?!");
				System.out.println("������ Ȱ���� �Ϸ簡 �� �� ���ƿ�!!");
				System.out.println("����� 9�ñ��� �ؾ��մϴ�.");
				System.out.println("����� ���� ȸ�翡�� ������ 20�� �Ÿ��Դϴ�.");
				System.out.println();
				System.out.println("����Ͻðڽ��ϱ�? (��ȣ�� �Է����ּ���.)");
				System.out.println("1.����(20��) 2.����ö(5��) 3.�濡�� ����");
				answer = scanner.nextInt();

				if(answer==1) {
					System.out.println("����� ������ ȸ��� ����մϴ�.");
					System.out.println("���� ���߿� Ŀ�Ǹ� ��ðڽ��ϱ�? (��ȣ�� �Է����ּ���.)");
					System.out.println("1.�� 2.�ƴϿ�");
					answer = scanner.nextInt();
					
					if(answer==1) {
						System.out.println("��ħ���� Ŀ�Ǹ� ã�� ���!");
						System.out.println("������ ȸ�����̷α���!!");
						System.out.println("��� ī��� ȸ�簡�� �� ������ �ֽ��ϴ�.");
						System.out.println("��� ī��� ���ðڽ��ϱ�? (��ȣ�� �Է����ּ���.)");
						System.out.println("1.�����÷��̽�(5�� �Ÿ�) 2.�����ξ(7�� �Ÿ�) 3.��Ÿ����(10�� �Ÿ�)");
						answer = scanner.nextInt();
						
						if(answer==1) {
							System.out.println("[���� �ð� 8�� 25��]");
							System.out.println("�����÷��̽��� �����߽��ϴ�.");
							System.out.println("������ ��Ű�ڽ��ϱ�?");
							System.out.println("1.�Ƹ޸�ī�� 2.ī��ḶŰ�ƶ� 3.Ƽ 4.��");
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
							System.out.println("[���� �ð� 8�� 27��]");
							System.out.println("�����ξ�� �����߽��ϴ�.");
							System.out.println("������ ��Ű�ڽ��ϱ�?");
							System.out.println("1.�Ƹ޸�ī�� 2.ī��ḶŰ�ƶ� 3.Ƽ 4.��");
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
							System.out.println("[���� �ð� 8�� 30��]");
							System.out.println("��Ÿ������ �����߽��ϴ�.");
							System.out.println("������ ��Ű�ڽ��ϱ�?");
							System.out.println("1.�Ƹ޸�ī�� 2.ī��ḶŰ�ƶ� 3.Ƽ 4.��");
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
					System.out.println("�������� ��ħ�� �̰ܳ��� ���!");
					System.out.println("���� ������ �б�� �ٸ�����!!");
					System.out.println("ȸ��� �ٷ� ���ϴ�.");
				}
					
			}
			else if(answer==2) {
				System.out.println("ȿ������ ���� ��±���!!");
				System.out.println("����ö�� Ÿ�� �̵��մϴ�.");
				System.out.println("ȸ��� �ٷ� ���ϴ�.");
			}
			else if(answer==3) {
				System.out.println("������� ����� �ٶ�� ���!!");
				System.out.println("���������� ������ ���� 2���� ��ȸ���̱���!!");
				System.out.println("������ ������ ������ ã�ƿ� ȸ�縦 ����� �����ϴ�.");
			}
			
			
			}
			else if(answer==2) {
				System.out.println("���� �ʰ� ����ϴ� ���!!");
				System.out.println("�پȲٸ� ��ȸ��Ȱ�� �����Ͻô±���!!");
				System.out.println("����� 9�ñ��� �ؾ��մϴ�.");
				System.out.println("����� ���� ȸ�翡�� ������ 20�� �Ÿ��Դϴ�.");
				System.out.println();
				System.out.println("����Ͻðڽ��ϱ�? (��ȣ�� �Է����ּ���.)");
				System.out.println("1.����(20��) 2.����ö(5��) 3.�濡�� ����");
				answer = scanner.nextInt();
				
				if(answer==1) {
					System.out.println("����� ������ ȸ��� ����մϴ�.");
					System.out.println("���� ���� ���߿� ������� �������ϴ�.");
					System.out.println("��ſ��� ���� �ɾ�ɴϴ�.");
					System.out.println("�λ縦 �Ͻðڽ��ϱ�?");
					System.out.println("1.�� 2.�ƴϿ�");
					answer = scanner.nextInt();
				
					if(answer==1) {
						System.out.println("ȸ�絿�ᰡ ����� ����� ���� ���̾��ٴ� ���� �ϰ� �ֽ��ϴ�.");
						System.out.println("ȸ�翡 �����ؼ� ��� ������� ����� ���� �����Դϴ�.");
						System.out.println("ȸ�翡�� ����� ������ \"�ɰ���\"�� �Ǿ����ϴ�.");
						System.out.println();
						System.out.println("End");
					}
					else if(answer==2) {
						System.out.println("�λ縦 ������ ���!!");
						System.out.println("ȸ�翡�� ����� �յ��� ���ϰ� �Ǿ����ϴ�.");
						System.out.println("�λ� �Ѹ����� �ı޷��� ���ݰ� �Ǿ����� �ʾ����ϴ�.");
						System.out.println("�ᱹ ����� �ߵ��� ���� ����߽��ϴ�.");
						System.out.println();
						System.out.println("End");
					}
				}
				else if(answer==2) {
					System.out.println("���� ����ö�� ź ���");
					System.out.println("�ֺ� ������� ����� ������ ������ �ð� �����߽��ϴ�.");
					System.out.println("����� �������� ���� ������ �����ϴ�.");
					System.out.println("������� ���Ͽ��⿡ ȸ�絵 �߷Ƚ��ϴ�.");
					System.out.println();
					System.out.println("End");
				}
				else if(answer==3) {
					System.out.println("������� ����� �ٶ�� ���!!");
					System.out.println("���������� ������ ���� 2���� ��ȸ���̱���!!");
					System.out.println("������ ������ ������ ã�ƿ� ȸ�縦 ����� �����ϴ�.");
				}
			}

		}
		else if(answer==2) {
			System.out.println("ȸ�縦 �����ʾ� �ٽ� ����� �Ǿ����ϴ�.");
			System.out.println("����غ� �Ͻðڽ��ϱ�? (��ȣ�� �Է����ּ���.)");
			System.out.println("1.�� 2.�ƴϿ�");
			answer = scanner.nextInt();
			
			if(answer==1) {
				System.out.println("\"���ۿ� ȸ�縦 ������� �ٽ� ����غ� �����ʾ����ٵ�..\"");
				System.out.println("��� ������ �ϸ� ����� �ٽ� ������ �����մϴ�.");
				System.out.println();
				System.out.println("End");
				
			}
			else if(answer==2) {
				System.out.println("Ļ�ŷ������� �����߽��ϴ�.");
				System.out.println("������ �������� �ϸ� �׻� ����� ���Ѻ��Ե˴ϴ�.");
				System.out.println("������ ������ �ϼ̱� �ٶ��ϴ�...");
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
		System.out.println("�� 70% + ���������� 30%");
	}
	public void Caramel_Makiato() {
		System.out.println("�� 50% + ���������� 30% + ī��� �÷� 10% + ����ũ�� 10%");
	}
	public void Tea() {
		System.out.println("�� 95% + Ƽ �� 5%");
	}
	public void WTR() {
		System.out.println("�� 99% + ���� 1%");
	}
}

class Angel_in_us implements Cafe{
	public void Americano() {
		System.out.println("�� 75% + ���������� 25%");
	}
	public void Caramel_Makiato() {
		System.out.println("�� 50% + ���������� 25% + ī��� �÷� 5% + ����ũ�� 10%");
	}
	public void Tea() {
		System.out.println("�� 96% + Ƽ �� 4%");
	}
	public void WTR() {
		System.out.println("�� 98% + ���� 1% + ���� 1%");
	}
	
}
class Starbucks extends Product123 implements Cafe {
	public void Americano() {
		System.out.println("�� 65% + ���������� 35%");
	}
	public void Caramel_Makiato() {
		System.out.println("�� 45% + ���������� 35% + ī��� �÷� 10% + ����ũ�� 10%");
	}
	public void Tea() {
		System.out.println("�� 93% + Ƽ �� 7%");
	}
	public void WTR() {
		System.out.println("�� 98% + ���� 2%");
	}
}