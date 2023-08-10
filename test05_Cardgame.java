import java.util.ArrayList;
import java.util.Collections;

public class test05_Cardgame {
    //자기만의 프로그램 -> 상속, 오버라이딩, 오버로딩...
	//카드게임(카드덱, 승률, 상금, 플레이어) -> blackjack(딜러, 카드받기, A특수성), poker(공용카드, 카드제출)
    private int rate;
    private int prize;
    private String player;
    private String pattern;
    private String num;

    test05_Cardgame(){
        player = "?";
        rate = 0;
        prize = 0;
    }

    test05_Cardgame(String num, String pattern){
        this.num = num;
        this.pattern = pattern;
    }

    test05_Cardgame(String player){
        this.player = player;
        rate = 0;
        prize = 0;
    }

    test05_Cardgame(String player, int rate){
        this.player = player;
        this.rate = rate;
        prize = 0;
    }

    test05_Cardgame(String player, int rate, int prize){
        this.player = player;
        this.rate = rate;
        this.prize = prize;
    }

    @Override
    public String toString(){
        return pattern + " " + num;
    }

    






}
