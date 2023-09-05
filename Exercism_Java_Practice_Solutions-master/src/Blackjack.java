public class Blackjack {
    public int parseCard(String card) {
        card = card.toLowerCase();
        //throw new UnsupportedOperationException("Please implement the Blackjack.parseCard method");
        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten" : case "jack" : case "queen" : case "king":
                return 10;

            default:
                return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        //throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
        int sum = parseCard(card1) + parseCard(card2);
        return (sum == 21);

    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        //throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
        if(isBlackjack){
            if(dealerScore < 10){
                return "W";
            } else
                return "S";
        } else
            return "P";
    }

    public String smallHand(int handScore, int dealerScore) {
        //throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
        /* - Stand (S)
           - Hit (H)
           - Split (P)
           - Automatically win (W)*/

      /* if(handScore < 17 && handScore >11 && dealerScore <= 6){
            return "S";
        } else if(handScore < 17 && handScore > 11 && dealerScore >= 7){
            return "H";
        } else if(handScore <= 11){
            return "H";
        } else
            return "S";*/

        if(handScore < 17 && handScore >11 && dealerScore <= 6){
            return "S";
        } else if((handScore < 17 && handScore > 11 && dealerScore >= 7) || (handScore <= 11)){
            return "H";
        } else
            return "S";
    }

    public static void main (String[] args) {
        Blackjack b = new Blackjack();
        System.out.println(b.isBlackjack("ace", "ace"));
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
