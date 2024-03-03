import java.util.function.Predicate;

public class IsAcePredicate implements Predicate<Card> {
  @Override
  public boolean test(Card card) {
    return card.getRank() == 1;
  }
}

