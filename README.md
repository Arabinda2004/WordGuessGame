# Word Guessing Game 🎯

A classic console-based word guessing game implemented in Java where players attempt to guess a hidden word letter by letter, similar to Hangman.

## 🎮 Game Description

The Word Guessing Game challenges players to discover a hidden word by guessing individual letters. Players have a limited number of attempts (7 wrong guesses) before the game ends. The game provides immediate feedback for each guess and tracks the player's progress.

## ✨ Features

- **Random Word Selection**: Choose from a collection of 90+ common English words
- **Interactive Gameplay**: Letter-by-letter guessing with real-time feedback
- **Attempt Tracking**: Limited to 7 wrong attempts with clear counter display
- **Visual Feedback**: 
  - ✅ Correct guess indicators
  - ❌ Wrong guess indicators
  - 🎉 Success celebration
- **Progress Display**: Shows current state of the word with guessed letters revealed
- **Case Insensitive**: Accepts both uppercase and lowercase letter inputs

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A terminal/command prompt or Java IDE

### Installation & Running

1. **Clone the repository**
   ```bash
   git clone https://github.com/Arabinda2004/WordGuessGame.git
   cd WordGuessGame
   ```

2. **Compile the Java file**
   ```bash
   javac Game.java
   ```

3. **Run the game**
   ```bash
   java Game
   ```

## 🎯 How to Play

1. **Start the Game**: Run the program to see the welcome message and game rules
2. **View the Hidden Word**: The word appears as dashes (e.g., `- - - - -` for a 5-letter word)
3. **Make Guesses**: Enter single letters when prompted
4. **Track Progress**: 
   - Correct letters will be revealed in their positions
   - Wrong guesses will decrease your remaining attempts
   - Current attempts left are displayed after each guess
5. **Win Condition**: Guess all letters in the word before running out of attempts
6. **Lose Condition**: Make 7 wrong guesses and the game ends

### Example Gameplay

```
=== Welcome to the Word Guessing Game! ===
You have to guess the hidden word, one letter at a time.
You have 7 wrong attempts. Let's begin!

The word: - - - - - 

Attempts left: 7
Enter your guess (single letter): a
✅ Good guess!
- - a - - 

Attempts left: 7
Enter your guess (single letter): x
❌ Wrong guess!
- - a - - 

Attempts left: 6
Enter your guess (single letter): ...
```

## 🛠️ Technical Details

### Code Structure

- **Main Game Loop**: Handles user input and game state management
- **Helper Methods**:
  - `index()`: Updates the result array when a correct letter is guessed
  - `isPresent()`: Checks if a character exists in an array
  - `view()`: Displays the current state of the word

### Word Collection

The game includes 90+ carefully selected common English words across various categories:
- Everyday objects (apple, water, phone)
- Transportation (train, plane, cycle)
- Colors (green, white, black)
- Actions (write, read, build)
- Emotions (happy, tired, fresh)

## 🔧 Customization

You can easily customize the game by modifying:

- **Word List**: Add or remove words from the `words` array in the main method
- **Attempts Limit**: Change the `max_attempt` variable (default: 7)
- **Display Format**: Modify the `view()` method to change how the word is displayed

## 📋 Requirements

- Java 8+
- Console/Terminal environment
- Keyboard input capability

## 🤝 Contributing

Feel free to contribute to this project by:

1. Forking the repository
2. Creating a feature branch (`git checkout -b feature/amazing-feature`)
3. Making your changes
4. Committing your changes (`git commit -m 'Add some amazing feature'`)
5. Pushing to the branch (`git push origin feature/amazing-feature`)
6. Opening a Pull Request

## 📝 Future Enhancements

Some ideas for future improvements:
- GUI implementation using JavaFX or Swing
- Difficulty levels with different word categories
- Score tracking and high scores
- Multiplayer functionality
- Hint system
- Word definitions display
- Save/load game state

## 📜 License

This project is open source and available under the [MIT License](LICENSE).

## 👨‍💻 Author

**Arabinda2004**
- GitHub: [@Arabinda2004](https://github.com/Arabinda2004)

---

⭐ If you enjoyed this game, please consider giving it a star on GitHub!

## 🎮 Happy Gaming!
