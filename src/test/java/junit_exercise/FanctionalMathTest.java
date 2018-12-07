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
			fail("TC1:��O���������Ȃ���΂Ȃ�܂���");
		} catch (IllegalArgumentException e) {
			assertThat("TC1:���b�Z�[�W����v���܂���", e.getMessage(), is("0�ȉ��̒l�͕s���ł��B"));
		}
	}

	@Test
	public void testFactorial2() {

		try {
			answer = FanctionalMath.factorial(0);
			fail("TC2:��O���������Ȃ���΂Ȃ�܂���");
		} catch (IllegalArgumentException e) {
			assertThat("TC2:���b�Z�[�W����v���܂���", e.getMessage(), is("0�ȉ��̒l�͕s���ł��B"));
		}
	}

	@Test
	public void testFactorial3() {
		answer = FanctionalMath.factorial(1);
		System.out.println(answer);
		assertThat("TC3:�l����v���܂���", answer, is(1));
	}

	@Test
	public void testFactorial4() {
		answer = FanctionalMath.factorial(2);
		assertThat("TC4:�l����v���܂���", answer, is(2));
	}

	@Test
	public void testFactorial5() {
		answer = FanctionalMath.factorial(3);
		assertThat("TC5:�l����v���܂���", answer, is(6));
	}

	@Test
	public void testFactorial6() {
		answer = FanctionalMath.factorial(4);
		assertThat("TC6:�l����v���܂���", answer, is(24));
	}

	@Test
	public void testFactorial7() {
		answer = FanctionalMath.factorial(11);
		assertThat("TC7:�l����v���܂���", answer, is(39916800));
	}

	@Test
	public void testFactorial8() {
		answer = FanctionalMath.factorial(12);
		assertThat("TC8:�l����v���܂���", answer, is(479001600));
	}

	@Test
	public void testFactorial9() {
		try {
			answer = FanctionalMath.factorial(13);
			fail("TC9:��O���������Ȃ���΂Ȃ�܂���");
		} catch (IllegalArgumentException e) {
			assertThat("TC9:���b�Z�[�W����v���܂���", e.getMessage(), is("13�ȏ�̒l�͕s���ł��B"));
		}
	}

	@Test
	public void testFactorial10() {
		try {
			answer = FanctionalMath.factorial(14);
			fail("TC10:��O���������Ȃ���΂Ȃ�܂���");
		} catch (IllegalArgumentException e) {
			assertThat("TC10:���b�Z�[�W����v���܂���", e.getMessage(), is("13�ȏ�̒l�͕s���ł��B"));
		}
	}

}
