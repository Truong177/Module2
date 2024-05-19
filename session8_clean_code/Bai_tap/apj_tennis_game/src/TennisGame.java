public class TennisGame {

    private static final String[] SCORE_NAMES = {"Love", "Fifteen", "Thirty", "Forty"};
    private static final int MINIMUM_ADVANTAGE_SCORE = 4;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getTieScore(player1Score);
        }
        if (player1Score >= MINIMUM_ADVANTAGE_SCORE || player2Score >= MINIMUM_ADVANTAGE_SCORE) {
            return getEndGameScore(player1Score, player2Score);
        }
        return getStandardScore(player1Score, player2Score);
    }

    private static String getTieScore(int score) {
        switch (score) {
            case 0: return "Love-All";
            case 1: return "Fifteen-All";
            case 2: return "Thirty-All";
            case 3: return "Forty-All";
            default: return "Deuce";
        }
    }

    private static String getEndGameScore(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) return "Advantage player1";
        if (scoreDifference == -1) return "Advantage player2";
        if (scoreDifference >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getStandardScore(int player1Score, int player2Score) {
        return SCORE_NAMES[player1Score] + "-" + SCORE_NAMES[player2Score];
    }
}
