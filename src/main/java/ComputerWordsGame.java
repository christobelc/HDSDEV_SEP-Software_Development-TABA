import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ComputerWordsGame {
    private char[] randomLetters;
    private String[] computerWords;
    private double score;

    // ---------constructor--------------
    public ComputerWordsGame() {
        randomLetters = new char[12];
        computerWords = new String[] { "algorithm", "application", "backup", "bit", "buffer", "bandwidth", "broadband",
                "bug", "binary", "browser", "bus", "cache", "command", "computer", "cookie", "compiler", "cyberspace",
                "compress", "configure", "database", "digital", "data", "debug", "desktop", "disk", "domain",
                "decompress", "development", "download", "dynamic", "email", "encryption", "firewall", "flowchart",
                "file", "folder", "graphics", "hyperlink", "host", "hardware", "icon", "inbox", "internet", "kernel",
                "keyword", "keyboard", "laptop", "login", "logic", "malware", "motherboard", "mouse", "mainframe",
                "memory", "monitor", "multimedia", "network", "node", "offline", "online", "path", "process",
                "protocol", "password", "phishing", "platform", "program", "portal", "privacy", "programmer", "queue",
                "resolution", "root", "restore", "router", "reboot", "runtime", "screen", "security", "shell",
                "snapshot", "spam", "screenshot", "server", "script", "software", "spreadsheet", "storage", "syntax",
                "table", "template", "thread", "terminal", "username", "virtual", "virus", "web", "website", "window",
                "wireless" };
    }

    // ----------getters -------------
    public char[] getRandomLetters() {
        return randomLetters;
    }

    public String[] getComputerWords() {
        return computerWords;
    }

    public double getScore() {
        return score;
    }

    // --------methods ------------------
    // method to generate the random letters
    public void generateRandomLetters() {
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = alphabetString.toCharArray();
        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < randomLetters.length; i++) {
            randomNumber = random.nextInt(26);
            randomLetters[i] = alphabet[randomNumber];
        }
    }

    // method to validate that the random letters have been used to generate the
    // players word
    public boolean usedLetters(String word) {
        List<Character> randomLettersList = new ArrayList<>();
        int count = 0;
        int wordLength = 0;

        // getting the length of the inputted word
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                wordLength++;
            }
        }

        // copying the array of chars to the arraylist obj randomLettersList
        for (int i = 0; i < randomLetters.length; i++) {
            randomLettersList.add(randomLetters[i]);
        }

        // for each character of the word. each occurance is removed from the
        // randomLettersList and the count is incremented
        for (int i = 0; i < wordLength; i++) {
            if (randomLettersList.contains(word.charAt(i))) {
                int index = randomLettersList.indexOf(word.charAt(i));
                randomLettersList.remove(index);
                count++;
            }
        }
        // if the wordLength is equal to the count. The player used valid letters from
        // the list
        if (wordLength == count) {
            return true;
        }
        return false;
    }

    // method to check if the inputted word is a valid computer word
    public boolean wordExists(String word) {
        // lets do it the olde brute force iterative search way
        for (int i = 0; i < computerWords.length; i++) {
            if (computerWords[i].equals(word)) {
                return true;
            }
        }
        return false;
    }

    // mthod to calculate the score
    public void computeScore(String word) {
        int wordLength = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                wordLength++;
            }
        }
        if (wordLength > 5) {
            score = wordLength;
        } else {
            score = ((double) wordLength) * 0.75;
        }
    }
}