package ss08_cleancode_refactoring.exercise.model;

public class TennisGame {

        public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
            String score = "";
            int tempScore = 0;
            if (firstPlayerScore == secondPlayerScore) {
                return result(firstPlayerScore);
            }

            if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
                return win(firstPlayerScore, secondPlayerScore);
            }

            return currentScore(firstPlayerScore, secondPlayerScore, score);
        }

        public static String result(int firstPlayerScore) {
            switch (firstPlayerScore) {
                case 0:
                    return "Love-All";
                case 1:
                    return "Fifteen-All";
                case 2:
                    return "Thirty-All";
                case 3:
                    return "Forty-All";
                default:
                    return "Deuce";
            }
        }


        public static String win(int firstPlayerScore, int secondPlayerScore) {
            int minusResult = firstPlayerScore - secondPlayerScore;
            if (minusResult == 1) {
                return "Advantage player1";
            }

            if (minusResult == -1) {
                return "Advantage player2";
            }

            if (minusResult >= 2) {
                return "Win for player1";
            }

            return "Win for player2";
        }

        public static String currentScore(int firstPlayerScore, int secondPlayerScore, String score) {
            int tempScore;
            StringBuilder scoreBuilder = new StringBuilder(score);
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = firstPlayerScore;
                else {
                    scoreBuilder.append("-");
                    tempScore = secondPlayerScore;
                }
                switch (tempScore) {
                    case 0:
                        scoreBuilder.append("Love");
                        break;
                    case 1:
                        scoreBuilder.append("Fifteen");
                        break;
                    case 2:
                        scoreBuilder.append("Thirty");
                        break;
                    case 3:
                        scoreBuilder.append("Forty");
                        break;
                }
            }
            score = scoreBuilder.toString();
            return score;
        }
}