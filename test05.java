// package project11;

public class test05 {

	public static void main(String[] args) {
		//자기만의 프로그램 -> 상속, 오버라이딩, 오버로딩...
		//카드게임(카드덱, 승률, 상금, 플레이어) -> blackjack(딜러, 카드받기, A특수성), poker(공용카드, 카드받기, 카드제출)
		test05_Cardgame player1 = new test05_Cardgame("player1");
		test05_Cardgame player2 = new test05_Cardgame("player2");
		test05_Poker deck = new Carddeck();
		
		deck.shuffle();

		for(int i = 0; i<5; i++){
			test05_Cardgame card1 = deck.drawCard();
			test05_Cardgame card2 = deck.drawCard();

			System.out.println(player1+"drew"+card1);
			System.out.println(player2+"drew"+card2);
		}


	}

}
