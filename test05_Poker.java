import java.util.ArrayList;
import java.util.Collections;

public class test05_Poker extends test05_Cardgame{
    //자기만의 프로그램 -> 상속, 오버라이딩, 오버로딩...
	//카드게임(카드덱, 승률, 상금, 플레이어) -> blackjack(딜러, 카드받기, A특수성), poker(공용카드, 카드받기, 카드제출)
    private ArrayList<test05_Cardgame> cards;

    public Carddeck(){
        cards = new ArrayList<>();
        String[] patterns = {"스페이드", "하트", "클로버", "다이아"};
        String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for(String pattern : patterns){
            for(String num : nums){
                cards.add(new test05_Cardgame(pattern,num));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public test05_Cardgame drawCard(){
        if(cards.isEmpty()){
            return null;
        }
        return cards.remove(0);
    }


}
