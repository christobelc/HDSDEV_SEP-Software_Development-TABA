import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComputerWordsGameApp {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        ComputerWordsGame game = new ComputerWordsGame();
        List<String> wordsList;
        char[] letters;
        int player, round, roundCounter = 1;
        double player1Score = 0, player2Score = 0;

        printWelcome();
        round = input.nextInt();

        // loop for the amount of inputted rounds there are
        for (int i = 0; i < round; i++) {

            printRounds(roundCounter);

            // add all the words into our arrayList
            wordsList = new ArrayList<String>();
            Collections.addAll(wordsList, game.getComputerWords());

            game.generateRandomLetters();
            letters = game.getRandomLetters();

            printLetters(letters);
            printWordList(wordsList);

            String inputWord, wordCheck = "";

            player = 1;
            while (true) {
                System.out.println("Player" + player + ", please enter your word: (type pass to skip turn)");
                inputWord = input.next().toLowerCase();
                // check if word exists and the random letters were used
                if (game.wordExists(inputWord) && game.usedLetters(inputWord)) {
                    wordCheck = inputWord;
                    game.computeScore(inputWord);
                    System.out.println("Player" + player + " scored " + game.getScore() + " points! Good Job!");
                    // add score to player1
                    player1Score = player1Score + game.getScore();

                    // remove the element from the arraylist
                    int index = wordsList.indexOf(inputWord);
                    wordsList.remove(index);
                    break;
                    // check if the player passes
                } else if (inputWord.equals("pass")) {
                    System.out.println("Player" + player + " passed!");
                    break;
                    // check if the player uses the random letters to make a word
                } else if (!game.usedLetters(inputWord)) {
                    System.out.println("Please use the letters provided.");
                } else {
                    // check if the word is in the valid computer words
                    System.out.println("Not a valid word");
                }
            }

            printLetters(letters);
            printWordList(wordsList);

            player = 2;
            while (true) {
                System.out.println("Player" + player + ", please enter your word:  (type pass to skip turn)");
                inputWord = input.next().toLowerCase();
                // check if the inputted word is not player1 inputted word
                if (!wordCheck.equals(inputWord)) {
                    // check if word exists and the random letters were used
                    if (game.wordExists(inputWord) && game.usedLetters(inputWord)) {
                        game.computeScore(inputWord);
                        System.out.println("Player" + player + " scored " + game.getScore() + " points! Good Job!");
                        // add score to player2
                        player2Score = player2Score + game.getScore();
                        break;
                        // check if the player passes
                    } else if (inputWord.equals("pass")) {
                        System.out.println("Player" + player + " passed!");
                        break;
                    } else if (!game.usedLetters(inputWord)) {
                        // check if the player uses the random letters to make a word
                        System.out.println("Please use the letters provided.");
                    } else {
                        // check if the word is in the valid computer words
                        System.out.println("Not a valid word");
                    }
                } else {
                    // check in the case that player on has used the word already
                    System.out.println("The word has been used already!");
                }
            }
            printScores(player1Score, player2Score);
            roundCounter++;
        }
        printResults(player1Score, player2Score);
        input.close();
    }

    static void printWelcome() {
        System.out.println();
        System.out.println("Welcome to the Find Computer Words Game! ");
        System.out.println();
        System.out.println("How to Play: ");
        System.out.println();
        System.out.println(
                "At the start of each round, 12 letters will be randomly selected. Each player will take turns in trying to make a computer word (from the list of given words) by using as many of the 12 letters as possible. The players are only allowed to use each letter only once (note that in the case that a randomly selected letter has multiple occurrences then the player can use that letter as many times as occurrences the letter has).");
        System.out.println();
        System.out.println("Rules:");
        System.out.println();
        System.out.println(
                "1. The word has to be formed only from the 12 letters randomly selected for that round (i.e. no other letters can be used).");
        System.out.println(
                "2. The words provided by the players have to be valid computer-related words in English. The List of valid words available will be displayed to both players at the beginning of each round.");
        System.out.println(
                "3. Per round a word can be entered only once (i.e. the two users cannot provide the very same word in the same round).");
        System.out.println(
                "4. The player receives the same amount of points as either the number of characters in the word for words longer than 5 characters, or the amount of characters times 0.75 for words that have at most 5 characters.");
        System.out.println("5. At the end of the game the player with the most points wins the game!");
        System.out.println();
        System.out.println("Are you ready?");
        System.out.println();
        System.out.println("How many rounds shall we play?");

    }

    static void printRounds(int roundCounter) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Lets start round " + roundCounter + "!");
    }

    static void printLetters(char[] letters) {
        System.out.println();
        System.out.println("The letters available are: ");
        System.out.print("[");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
            if (i != 11) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println();
    }

    static void printWordList(List<String> wordsList) {
        System.out.println("The words you can choose from are: ");
        System.out.println(wordsList);
        System.out.println();
    }

    static void printScores(double player1Score, double player2Score) {
        System.out.println();
        System.out.println("At the end of that round the total scores are");
        System.out.println("Player1: " + player1Score + " points");
        System.out.println("Player2: " + player2Score + " points");
        System.out.println("---------------------------------------------------------------");
        System.out.println();
    }

    static void printResults(double player1Score, double player2Score) {
        System.out.println("The at the end of the Game the results are: ");
        System.out.println("Player1: " + player1Score + " points");
        System.out.println("Player2: " + player2Score + " points");
        System.out.println();

        if (player1Score > player2Score) {
            System.out.println("Player1 is the Winner Congratulations!!!!!");
        } else if (player1Score < player2Score) {
            System.out.println("Player2 is the Winner Congratulations!!!!!");
        } else {
            System.out.println("It was a draw! Thanks for taking part!!!");
        }
        System.out.println();
    }

}
