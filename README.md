# HDSDEV_SEP-Software_Development-TABA

Assignment Description
For this assignment, you should develop an application that allows 2 users to play the “Find Computer Words
Game”. “Find Computer Words Game” is a turn-based game, where the players take turns to provide one
word at a time according to the rules of the game.
The “Find Computer Words Game” works as follows:
• At the start of the game, the game should inform the players how they can acquire points (note that details
for awarding the points are presented later in this document). The game is formed from multiple rounds.
Please see below the section named Instructions and Checklist for details about the approach you
have to implement in order to provide multiple rounds for the game.
o Per round:

 At the start of each round, the application (i.e. computer) randomly selects 12 letters from the
English alphabet and displays the 12 letters to the players (note that there are 26 letters in the
English alphabet). The 12 letters do not have to be unique (i.e. the same letter can be randomly
selected multiple times at the beginning of a certain round).

 Next, each player takes turn to try to make a word using as many of the 12 letters as the player can
but using each letter only once (note that in the case that a randomly selected letter has multiple
occurrences then the players can use that letter as many times as occurrences the letter has). Input
(i.e. word) validation is required according to the rules of the game, including the following rules:

 The word has to be formed only from the 12 letters randomly selected for that round (i.e. no
other letters can be used).

 The words provided by the players have to be valid computer-related words in English. Each
time a player enters a word the game must check the word against an array of valid words. The
word the player entered should be displayed back on the screen with the message whether that
word is valid or not. For the purposes of this game, use the following 100 computer-related
words, store them in an array and use that array to validate the words provided by the players:
algorithm, application, backup, bit, buffer, bandwidth, broadband, bug, binary, browser, bus,
cache, command, computer, cookie, compiler, cyberspace, compress, configure, database,
digital, data, debug, desktop, disk, domain, decompress, development, download, dynamic,
email, encryption, firewall, flowchart, file, folder, graphics, hyperlink, host, hardware, icon,
inbox, internet, kernel, keyword, keyboard, laptop, login, logic, malware, motherboard, mouse,
mainframe, memory, monitor, multimedia, network, node, offline, online, path, process,
protocol, password, phishing, platform, program, portal, privacy, programmer, queue,
resolution, root, restore, router, reboot, runtime, screen, security, shell, snapshot, spam,
screenshot, server, script, software, spreadsheet, storage, syntax, table, template, thread,
terminal, username, virtual, virus, web, website, window, wireless. In this game, only the words
stored in the array of words are considered valid words.

 Per round a word can be entered only once (i.e. the two users cannot provide the very same
word in the same round).

 Each time a player provides a valid word, the player receives points according to the rule for
awarding points. Please see below the section named Instructions and Checklist for details
about the rule you have to implement. The points received for that word should be displayed on
the screen. Also, the total points received should be displayed on the screen.
• At the end of the game, the game displays who the winner is, and the number of points received by
each player. The winner of the game is the player who has received more points.

Note that the application should work irrespective of how the players provide the words i.e. using upper
case letters, lower case letters or a combination of both upper case and lower case letters.

Next, is presented a short example for the players taking turns and providing words according to the rules
of the game. Note that for simplicity of exposition the example below does not present the validations you
are required to implement such as checking that the word is a valid word. For a game, let’s assume:
• An example for a round:
o At the beginning of the round the application (i.e. computer) randomly selects 12 letters, and
then displays them. Let’s assume the randomly selected letters are t, o, e, i, b, l, f, d, e, n,
f, s 
o Next, each player takes turn to try to make a word using as many of the 12 letters (i.e. t, o,
e, i, b, l, f, d, e, n, f, s) as the player can but using each letter only once (note that in the
case that a randomly selected letter has multiple occurrences then the players can use that
letter as many times as occurrences the letter has; for instance, in this example, letter ‘f’ has
two occurrences, therefore, it can be used up to two times in a word). Input (i.e. word)
validation is required according to the rules of the game.

 Player 1: The first player enters a word formed from as many of the 12 letters as the
player can. Let’s assume the player enters the word “offline”. The player receives
points, if any, according to the rule you have been assigned to implement. The points
received for that word should be displayed on the screen. Also, the total points
received should be displayed on the screen.

 Player 2: Next, the second player enters another word formed from as many of the
12 letters as the player can. Let’s assume the player enters the word “node”. The
player receives points, if any, according to the rule you have been assigned to
implement. The points received for that word should be displayed on the screen.
Also, the total points received should be displayed on the screen.

• Another round is started
o At the beginning of the round the application (i.e. computer) randomly selects 12 letters, and
then displays them. Let’s assume the randomly selected letters are y, k, w, o, e, l, r, n, d, r,
n, e
o Next, each player takes turn to try to make a word using as many of the 12 letters (i.e. y, k,
w, o, e, l, r, n, d, r, n, e) as the player can but using each letter only once (note that in the
case that a randomly selected letter has multiple occurrences then the players can use that
letter as many times as occurrences the letter has; for instance, in this example, letter ‘e’ has
two occurrences, therefore, it can be used up to two times in a word). Input (i.e. word)
validation is required according to the rules of the game.

 Player 1: The first player enters a word formed from as many of the 12 letters as the
player can. Let’s assume the player enters the word “keyword”. The player receives
points, if any, according to the rule you have been assigned to implement. The points
received for that word should be displayed on the screen. Also, the total points
received should be displayed on the screen.

 Player 2: Next, the second player enters another word formed from as many of the
12 letters as the player can. Let’s assume the player enters “kernel”. The player
receives points, if any, according to the rule you have been assigned to implement.
The points received for that word should be displayed on the screen. Also, the total
points received should be displayed on the screen.

• Another round is started, and the game is played as described above until all the rounds have been
played. The multiple rounds functionality has to work according to the multiple rounds approach you
have been assigned to implement.
• At the end of the game, the game displays who the winner is, and the number of points received by
each player. The winner of the game is the player who has received more points.

Ask the players at the beginning of the game how many
rounds they would like to play, and allow the players to
play that amount of rounds.

The player receives the same amount of
points as the number of characters in the
word excluding the letters ‘i’, ‘u’ and ‘s’

“bit” – 2 points
“security” – 5 points

Your application should make use of instantiable classes and demonstrate your ability to use other
programming concepts, which we have covered in the Software Development module.
