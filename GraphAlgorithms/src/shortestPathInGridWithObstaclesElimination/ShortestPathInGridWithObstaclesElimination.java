package shortestPathInGridWithObstaclesElimination;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ShortestPathInGridWithObstaclesElimination {

	public static void main(String[] args) {
		int[][] grid1 = {
			{0, 0, 0},
			{1, 1, 0},
			{0, 0, 0},
			{0, 1, 1},
			{0, 0, 0}
		};

		int[][] grid2 = {
			{0, 1, 1},
			{1, 1, 1},
			{1, 0, 0}
		};

		System.out.println("Shortest path for sample 1: " + shortestPath(grid1, 1));
		System.out.println("Shortest path for sample 2: " + shortestPath(grid2, 1));
	}

	public static int shortestPath(int[][] grid, int k) {
		int rows = grid.length;
		int cols = grid[0].length;

		if (rows == 1 && cols == 1) {
			return 0;
		}

		if (k >= rows + cols - 2) {
			return rows + cols - 2;
		}

		int[][] bestRemaining = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			Arrays.fill(bestRemaining[i], -1);
		}

		Queue<State> queue = new ArrayDeque<State>();
		queue.offer(new State(0, 0, k, 0));
		bestRemaining[0][0] = k;

		int[][] directions = {
			{1, 0},
			{-1, 0},
			{0, 1},
			{0, -1}
		};

		while (!queue.isEmpty()) {
			State current = queue.poll();

			for (int[] direction : directions) {
				int nextRow = current.row + direction[0];
				int nextCol = current.col + direction[1];

				if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols) {
					continue;
				}

				int nextRemaining = current.remainingEliminations - grid[nextRow][nextCol];
				if (nextRemaining < 0) {
					continue;
				}

				if (nextRow == rows - 1 && nextCol == cols - 1) {
					return current.steps + 1;
				}

				if (bestRemaining[nextRow][nextCol] >= nextRemaining) {
					continue;
				}

				bestRemaining[nextRow][nextCol] = nextRemaining;
				queue.offer(new State(nextRow, nextCol, nextRemaining, current.steps + 1));
			}
		}

		return -1;
	}

	private static class State {
		int row;
		int col;
		int remainingEliminations;
		int steps;

		State(int row, int col, int remainingEliminations, int steps) {
			this.row = row;
			this.col = col;
			this.remainingEliminations = remainingEliminations;
			this.steps = steps;
		}
	}
}
