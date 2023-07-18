# Polish Draughts

## Description

This repository contains a console-based implementation of Polish Draughts, a variation of the Checkers game. It allows two players to play against each other, and optionally provides an AI opponent for single-player mode.

## Rules

### Main Rules:
- There are two players: white and black.
- White moves first.
- The size of the board can be chosen before the game starts, but it must be an integer between 10 and 20.
- All moves and captures are made diagonally.
- Pawns can capture both forward and backward.

### Optional Rules:
- Multiple successive jumps forward or backward in a single turn can and must be made if there is an unoccupied square immediately beyond the enemy pawn after each jump.
- A piece is crowned if it stops on the far edge of the board at the end of its turn (reaching the edge without needing to jump backward).

### Winning and Draws:
- A player with no valid moves remaining loses.
- Optional: The game is considered a draw when the same position repeats itself for the third time (not necessarily consecutive), with the same player having the move each time.
- A king-versus-king endgame is automatically declared a draw.

## Installation

To play Polish Draughts, follow these steps:

1. Clone the repository:
2. Navigate to the project directory.
3. Compile the Java source files.

## Usage

Once you have compiled the source files, you can start playing Polish Draughts.
Run the main file to start the game. Follow the on-screen instructions to play the game. The game will prompt players for their moves and display the current state of the board after each move.

## AI Opponent

The game includes an optional AI opponent for single-player mode. When playing against the AI, the computer will automatically make its moves based on a simple algorithm.
To play against the AI, choose the appropriate option when prompted.

## Contributing

Contributions to Polish Draughts are welcome! If you have any bug fixes, enhancements, or new features to propose, please feel free to submit a pull request. Ensure that your code follows the project's coding conventions and includes relevant tests.
   
