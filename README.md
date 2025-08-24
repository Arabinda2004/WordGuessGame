# Word Guessing Game

A fun and interactive command-line word guessing game written in Java, similar to Hangman. Players attempt to guess a hidden word by entering one letter at a time, with only 7 wrong attempts allowed.

## 🎮 Game Features

- **20 Different Categories**: Words are organized into themed categories including Fruits, Animals, Sports, Technology, and more
- **Random Word Selection**: Each game randomly selects a category and word for maximum replayability  
- **Visual Progress Tracking**: See your guessed letters fill in the word as you play
- **Attempt Counter**: Track your remaining attempts with a clear counter
- **Instant Feedback**: Get immediate visual feedback (✅/❌) for correct and incorrect guesses
- **Case Insensitive**: Enter letters in any case - the game handles conversion automatically

## 📋 How to Play

1. **Start the Game**: Run the program and you'll see a welcome message
2. **View the Category**: A random category will be displayed to give you a hint
3. **See the Word Pattern**: The hidden word appears as dashes (e.g., `- - - - -`)
4. **Make Your Guess**: Enter a single letter when prompted
5. **Track Progress**: 
   - ✅ Correct guesses reveal the letter(s) in the word
   - ❌ Wrong guesses count against your 7 attempts
6. **Win or Lose**:
   - **Win**: Guess all letters before running out of attempts
   - **Lose**: Use all 7 attempts without completing the word

## 🏗️ Technical Overview

### Categories Available
The game includes 20 categories with 10 words each:
- **Fruits**: apple, banana, orange, grape, mango, etc.
- **Animals**: dog, cat, bird, fish, horse, etc.
- **Sports**: football, basketball, tennis, cricket, etc.
- **Technology**: computer, laptop, tablet, smartphone, etc.
- And 16 more categories...

### Key Methods
- `index()`: Tracks which letters have been correctly guessed
- `isPresent()`: Checks if a character exists in an array
- `view()`: Displays the current state of the guessed word

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line access

### Installation & Running

1. **Clone or Download** the `Game.java` file

2. **Compile the Program**:
   ```bash
   javac Game.java
   ```

3. **Run the Game**:
   ```bash
   java Game
   ```

## 🎯 Game Rules

- You have **7 wrong attempts** maximum
- Only single letters are accepted as guesses
- Repeated correct guesses don't count against you
- The game is case-insensitive
- You must guess the complete word to win

## 📸 Sample Gameplay

```
=== Welcome to the Word Guessing Game! ===
You have to guess the hidden word, one letter at a time.
You have 7 wrong attempts. Let's begin!

Category: FRUITS
The word: - - - - -

Attempts left: 7
Enter your guess (single letter): a
✅ Good guess!
- - - - a

Attempts left: 7
Enter your guess (single letter): e
❌ Wrong guess!
- - - - a

Attempts left: 6
Enter your guess (single letter): m
✅ Good guess!
m - - - a
```

## 🔧 Customization

You can easily customize the game by:

1. **Adding New Categories**: Extend the `categorizedWords` array with new categories
2. **Adding More Words**: Add words to existing categories
3. **Changing Difficulty**: Modify `max_attempt` to increase/decrease allowed wrong guesses
4. **Visual Enhancements**: Customize the emoji feedback or display format

## 🛠️ Code Structure

- **Main Game Loop**: Handles user input and game state
- **Word Selection**: Random category and word selection
- **Progress Tracking**: Boolean arrays track guessed letters
- **Utility Methods**: Helper functions for common operations

## 📝 Future Enhancements

Potential improvements could include:
- Difficulty levels (easy/medium/hard)
- Score tracking across multiple games
- Hint system
- Multiplayer support
- GUI implementation

---

**Enjoy playing the Word Guessing Game!** 🎉
