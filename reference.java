import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reference {
    public static void main(String[] args) {
        int numOfPlayers = 5;

        Deck deck = new Deck();
        deck.shuffle();

        List<Card> communityCards = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            communityCards.add(deck.drawCard());
        }

        List<List<Card>> playerHands = new ArrayList<>();
        for (int i = 0; i < numOfPlayers; i++) {
            List<Card> hand = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                hand.add(deck.drawCard());
            }
            playerHands.add(hand);
        }

        System.out.println("Community cards:");
        for (Card card : communityCards) {
            System.out.println(card);
        }

        System.out.println("\nPlayers' hands:");
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (Card card : playerHands.get(i)) {
                System.out.println(card);
            }

            PokerHandRanking handRanking = evaluatePokerHand(playerHands.get(i), communityCards);
            System.out.println("Hand Ranking: " + handRanking);

            System.out.println();
        }
    }

    // 포커 족보를 판별하는 메서드 (간략한 예시)
    public static PokerHandRanking evaluatePokerHand(List<Card> playerHand, List<Card> communityCards) {
        List<Card> allCards = new ArrayList<>(playerHand);
        allCards.addAll(communityCards);
        Collections.sort(allCards);

        // 여기서 실제로 포커 족보를 평가하고 순위를 반환하는 로직을 구현합니다.
        // 이 예제에서는 단순히 로얄 플러시, 스트레이트 플러시, 풀 하우스 등의 족보만 간략히 고려하겠습니다.

        // 예시: 핸드와 커뮤니티 카드를 기반으로 포커 족보를 판별하고 반환
        if (isRoyalFlush(allCards)) {
            return PokerHandRanking.ROYAL_FLUSH;
        } else if (isStraightFlush(allCards)) {
            return PokerHandRanking.STRAIGHT_FLUSH;
        } else if (isFullHouse(allCards)) {
            return PokerHandRanking.FULL_HOUSE;
        }
        // ... 나머지 족보 검사

        return PokerHandRanking.HIGH_CARD; // 기본적으로 하이 카드로 처리
    }
}

// 포커 족보 열거형
enum PokerHandRanking {
    ROYAL_FLUSH, STRAIGHT_FLUSH, FOUR_OF_A_KIND, FULL_HOUSE, FLUSH,
    STRAIGHT, THREE_OF_A_KIND, TWO_PAIR, ONE_PAIR, HIGH_CARD
}

// 나머지 클래스들은 이전 예제 코드와 동일하므로 중복해서 기재하지 않습니다.
