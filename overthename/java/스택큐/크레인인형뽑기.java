package main;
import java.util.*;
//0 1 2 3 4  n=5
public class Main {
	public int solution(int[][] board, int[] moves) {

		int answer=0;
		//행이 내려감
		Stack<Integer> st = new Stack<Integer>();
		for(int pos:moves) {
			//행의 크기 board.length 열의 크기 board[0].length
			for(int i=0; i<board.length; i++) {
				if(board[i][pos-1]!=0) {
					int tmp=board[i][pos-1];
					board[i][pos-1]=0;
					if(!st.isEmpty() && tmp==st.peek()) {
						answer +=2; //두개 터트림
						st.pop();
					}
					else st.push(tmp);
					break;
				}
			}

		}
		return answer;
	}



	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][]board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m; i++) {
			moves[i]=kb.nextInt();
		}

		System.out.print(T.solution(board,moves));}}

