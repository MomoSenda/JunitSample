package junit_exercise;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

public class FanctionalMathTest {
	private int answer = 0;

	@Test
	public void testFactorial1() {
		try {
			answer = FanctionalMath.factorial(-1);
			fail("TC1:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC1:メッセージが一致しません", e.getMessage(), is("0以下の値は不正です。"));
		}
	}

	@Test
	public void testFactorial2() {

		try {
			answer = FanctionalMath.factorial(0);
			fail("TC2:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC2:メッセージが一致しません", e.getMessage(), is("0以下の値は不正です。"));
		}
	}

	@Test
	public void testFactorial3() {
		answer = FanctionalMath.factorial(1);
		System.out.println(answer);
		assertThat("TC3:値が一致しません", answer, is(1));
	}

	@Test
	public void testFactorial4() {
		answer = FanctionalMath.factorial(2);
		assertThat("TC4:値が一致しません", answer, is(2));
	}

	@Test
	public void testFactorial5() {
		answer = FanctionalMath.factorial(3);
		assertThat("TC5:値が一致しません", answer, is(6));
	}

	@Test
	public void testFactorial6() {
		answer = FanctionalMath.factorial(4);
		assertThat("TC6:値が一致しません", answer, is(24));
	}

	@Test
	public void testFactorial7() {
		answer = FanctionalMath.factorial(11);
		assertThat("TC7:値が一致しません", answer, is(39916800));
	}

	@Test
	public void testFactorial8() {
		answer = FanctionalMath.factorial(12);
		assertThat("TC8:値が一致しません", answer, is(479001600));
	}

	@Test
	public void testFactorial9() {
		try {
			answer = FanctionalMath.factorial(13);
			fail("TC9:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC9:メッセージが一致しません", e.getMessage(), is("13以上の値は不正です。"));
		}
	}

	@Test
	public void testFactorial10() {
		try {
			answer = FanctionalMath.factorial(14);
			fail("TC10:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC10:メッセージが一致しません", e.getMessage(), is("13以上の値は不正です。"));
		}
	}

}
