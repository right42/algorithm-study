package me.right42.level1;

import java.util.*;

public class Solution_64061 {

    public int solution(int[][] board, int[] moves) {
        ToyMachine toyMachine = new ToyMachine(board);
        toyMachine.moveStart(moves);
        return toyMachine.getScore();
    }

    private static class ToyMachine {
        private int[][] board;
        private Deque<Integer> pocketStack = new ArrayDeque<>();
        private int score = 0;
        private final int height;

        public ToyMachine(int[][] board) {
            this.board = board;
            this.height = board.length;
        }

        public int getScore() {
            return score;
        }

        public void moveStart(int[] moves) {
            for (int moveIndex : moves) {
                for (int i = 0; i < this.height; i++) {
                    if(board[i][moveIndex - 1] != 0) {
                        stackToy(board[i][moveIndex - 1]);
                        board[i][moveIndex - 1] = 0;
                        break;
                    }
                }
            }
        }

        private void stackToy(int toyId) {
            if (!this.pocketStack.isEmpty() && this.pocketStack.getLast() == toyId) {
                this.score += 2;
                this.pocketStack.removeLast();
            } else {
                this.pocketStack.add(toyId);
            }
        }
    }


    public static void main(String[] args) {
        ToyMachine toyMachine = new ToyMachine(
                new int[][] {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}
        );
        toyMachine.moveStart(new int[] {1,5,3,5,1,2,1,4});
        System.out.println(toyMachine.getScore());
    }

}
