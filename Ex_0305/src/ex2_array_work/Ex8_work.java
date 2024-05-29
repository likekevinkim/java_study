package ex2_array_work;

import java.util.Random;

public class Ex8_work {
	public static void main(String[] args) {
		
		//변수 money를 만들고 10~5000사이의 난수를 넣는다
		//단, 발생된 난수는 3450, 2100과 같이 1의 자리가 반드시 0이되어야한다.
		//500, 100, 50, 10원짜리 동전이 각각 몇개씩 필요한지 출력
		//가능한 적은 수의 동전을 사용해야 함
			
		
		int[] coin = {500, 100, 50, 10};
		
		//난수 10~5000원 사이의 난수 발생
		/*int money = 0;
		for (int i = 0; i < 5000; i++) {
			money = new Random().nextInt(5001);
			if(money % 10 == 0) {
				System.out.println(money);
				break;
			}
		}
		
		//동전 몇개 필요한지 계산
		int[] count = {money / coin[0], 
					   money % coin[0] / coin[1],
					   money % coin[0] % coin[1] / coin[2],
					   money % coin[0] % coin[1] % coin[2] / coin[3]};
					   
		
		System.out.printf("필요한 코인수는 500원 - %d개, 100원 - %d개, 50원 - %d개, 10원 - %d개 입니다.", count[0], count[1], count[2],count[3]);
		System.out.println("----------------");
		
		//동전 갯수가 0일때는 출력X
		for (int i = 0; i < count.length; i++) {
			if(count[i] != 0) {
				System.out.printf("필요한 코인수는 \n%d 코인은 %d개 입니다.\n", coin[i], count[i]);
			}
		}*/
		
		//teacher's code
		
		int money1 = new Random().nextInt(500) + 1;
		money1 *= 10;

		System.out.println("금액 : " + money1);
		
		for (int i = 0; i < coin.length; i++) {
			
			int res = money1 /coin[i];
			
			if (res > 0) {
				System.out.println(coin[i] + "원 : " + res);
				money1 %= coin[i];
			}
		}
		
	}// main
}
