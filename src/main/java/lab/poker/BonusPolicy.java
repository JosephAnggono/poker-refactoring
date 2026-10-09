package lab.poker;
import java.util.List;

/** House rule: a straight flush or a full house earns a bonus. */
public class BonusPolicy {
    private final PokerHandEvaluator evaluator = new PokerHandEvaluator();
    public boolean qualifies(List<Card> hand) {
        boolean straight = evaluator.isStraight(hand);
        boolean flush = evaluator.isFlush(hand);
        boolean fullHouse = evaluator.isFullHouse(hand);
        return (straight && flush) || fullHouse;
    }
}
