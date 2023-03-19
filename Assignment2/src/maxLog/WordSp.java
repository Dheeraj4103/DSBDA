package maxLog;

import java.util.Scanner;

public class WordSp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String iput = in.next();
		System.out.println(check(iput));
	}
	private static boolean check(String token) {
		boolean dot = false;
		while (!token.isEmpty()) {
			char first = token.charAt(0);
			System.out.println(first);
			if (first == '.') {
				dot = true;
			}
			if (!Character.isDigit(first) && first != '.') {
				return false;
			}
			token = token.substring(1);
		}
		return dot;
	}

}
