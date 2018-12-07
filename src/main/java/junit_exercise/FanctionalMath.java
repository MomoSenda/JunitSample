package junit_exercise;

public class FanctionalMath {
	private static final int MAX_NUM = 13;

	public static int factorial(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("0�ȉ��̒l�͕s���ł��B");
		}

		if (MAX_NUM <= n) {
			throw new IllegalArgumentException("13�ȏ�̒l�͕s���ł��B");
		}

		int answer = 1;
		for (int i = 1; i <= n; i++) {
			answer *= i;
		}
		return answer;
	}
}
