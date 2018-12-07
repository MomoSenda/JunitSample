package junit_sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathUnitTest {

	private double answer;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()の呼出し。全テスト実行前に１度だけ実行される");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()の呼び出し。全テスト実行後に一度だけ実行される");
	}

	@Before
	public void setUp() throws Exception {
		answer = 0.0;
		System.out.println("setUp()の呼び出し。各テスト実行前に毎回実行される");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()の呼び出し。各テスト実行後に毎回実行される");
	}

	@Test
	public void testPower1() {
		answer = MathUtil.power(0, -2);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(Double.POSITIVE_INFINITY));
	}

	@Test
	public void testPower2() {
		answer = MathUtil.power(0, -1);
		assertThat("TC2:期待値と実際の結果が異なります", answer, is(Double.POSITIVE_INFINITY));
	}

	@Test
	public void testPower3() {
	      answer = MathUtil.power(0, 0);
	      assertThat("TC3:期待値と実際の結果が異なります", answer, is(1.0));
	  }

	@Test
	public void testPower4() {
		answer = MathUtil.power(0, 1);
		assertThat("TC4:期待値と実際の結果が異なります", answer, is(0.0));
	}

	@Test
	public void testPower5() {
		answer = MathUtil.power(0, 2);
		assertThat("TC5:期待値と実際の結果が異なります", answer, is(0.0));
	}

	@Test
	public void testPower6() {
		answer = MathUtil.power(1, -2);
		assertThat("TC6:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower7() {
		answer = MathUtil.power(1, -1);
		assertThat("TC7:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower8() {
		answer = MathUtil.power(1, 0);
		assertThat("TC8:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower9() {
		answer = MathUtil.power(1, 1);
		assertThat("TC9:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower10() {
		answer = MathUtil.power(1, 2);
		assertThat("TC10:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower11() {
		answer = MathUtil.power(-1, -2);
		assertThat("TC11:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower12() {
		answer = MathUtil.power(-1, -1);
		assertThat("TC12:期待値と実際の結果が異なります", answer, is(-1.0));
	}

	@Test
	public void testPower13() {
		answer = MathUtil.power(-1, 0);
		assertThat("TC13:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower14() {
		answer = MathUtil.power(-1, 1);
		assertThat("TC14:期待値と実際の結果が異なります", answer, is(-1.0));
	}

	@Test
	public void testPower15() {
		answer = MathUtil.power(-1, 2);
		assertThat("TC15:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower16() {
		answer = MathUtil.power(2, -2);
		assertThat("TC16:期待値と実際の結果が異なります", answer, is(0.25));
	}

	@Test
	public void testPower17() {
		answer = MathUtil.power(2, -1);
		assertThat("TC17:期待値と実際の結果が異なります", answer, is(0.5));
	}

	@Test
	public void testPower18() {
		answer = MathUtil.power(2, 0);
		assertThat("TC18:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower19() {
		answer = MathUtil.power(2, 1);
		assertThat("TC19:期待値と実際の結果が異なります", answer, is(2.0));
	}

	@Test
	public void testPower20() {
		answer = MathUtil.power(2, 2);
		assertThat("TC20:期待値と実際の結果が異なります", answer, is(4.0));
	}

	/**
	 * 例外が発生するか検証
	 */
	@Test
	public void testPower21() {
		try {
			answer = MathUtil.power(100, 0);
			fail("TC21:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("メッセージが一致しません", e.getMessage(), is("100以上の値は不正です"));
		}
	}

	/**
	 * 例外が発生するか検証
	 */
	@Test
	  public void testPower22() {
	      try {
	          answer = MathUtil.power(0, 1000);
	          fail("TC22:例外が発生しなければなりません");
	      } catch (IllegalArgumentException e) {
	          assertThat("メッセージが一致しません", e.getMessage(), is("100以上の値は不正です"));
	      }
	}
}
