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
		System.out.println("setUpBeforeClass()�̌ďo���B�S�e�X�g���s�O�ɂP�x�������s�����");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()�̌Ăяo���B�S�e�X�g���s��Ɉ�x�������s�����");
	}

	@Before
	public void setUp() throws Exception {
		answer = 0.0;
		System.out.println("setUp()�̌Ăяo���B�e�e�X�g���s�O�ɖ�����s�����");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()�̌Ăяo���B�e�e�X�g���s��ɖ�����s�����");
	}

	@Test
	public void testPower1() {
		answer = MathUtil.power(0, -2);
		assertThat("TC1:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(Double.POSITIVE_INFINITY));
	}

	@Test
	public void testPower2() {
		answer = MathUtil.power(0, -1);
		assertThat("TC2:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(Double.POSITIVE_INFINITY));
	}

	@Test
	public void testPower3() {
	      answer = MathUtil.power(0, 0);
	      assertThat("TC3:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
	  }

	@Test
	public void testPower4() {
		answer = MathUtil.power(0, 1);
		assertThat("TC4:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(0.0));
	}

	@Test
	public void testPower5() {
		answer = MathUtil.power(0, 2);
		assertThat("TC5:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(0.0));
	}

	@Test
	public void testPower6() {
		answer = MathUtil.power(1, -2);
		assertThat("TC6:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
	}

	@Test
	public void testPower7() {
		answer = MathUtil.power(1, -1);
		assertThat("TC7:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
	}

	@Test
	public void testPower8() {
		answer = MathUtil.power(1, 0);
		assertThat("TC8:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
	}

	@Test
	public void testPower9() {
		answer = MathUtil.power(1, 1);
		assertThat("TC9:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
	}

	@Test
	public void testPower10() {
		answer = MathUtil.power(1, 2);
		assertThat("TC10:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
	}

	@Test
	public void testPower11() {
		answer = MathUtil.power(-1, -2);
		assertThat("TC11:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
	}

	@Test
	public void testPower12() {
		answer = MathUtil.power(-1, -1);
		assertThat("TC12:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(-1.0));
	}

	@Test
	public void testPower13() {
		answer = MathUtil.power(-1, 0);
		assertThat("TC13:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
	}

	@Test
	public void testPower14() {
		answer = MathUtil.power(-1, 1);
		assertThat("TC14:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(-1.0));
	}

	@Test
	public void testPower15() {
		answer = MathUtil.power(-1, 2);
		assertThat("TC15:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
	}

	@Test
	public void testPower16() {
		answer = MathUtil.power(2, -2);
		assertThat("TC16:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(0.25));
	}

	@Test
	public void testPower17() {
		answer = MathUtil.power(2, -1);
		assertThat("TC17:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(0.5));
	}

	@Test
	public void testPower18() {
		answer = MathUtil.power(2, 0);
		assertThat("TC18:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
	}

	@Test
	public void testPower19() {
		answer = MathUtil.power(2, 1);
		assertThat("TC19:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(2.0));
	}

	@Test
	public void testPower20() {
		answer = MathUtil.power(2, 2);
		assertThat("TC20:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(4.0));
	}

	/**
	 * ��O���������邩����
	 */
	@Test
	public void testPower21() {
		try {
			answer = MathUtil.power(100, 0);
			fail("TC21:��O���������Ȃ���΂Ȃ�܂���");
		} catch (IllegalArgumentException e) {
			assertThat("���b�Z�[�W����v���܂���", e.getMessage(), is("100�ȏ�̒l�͕s���ł�"));
		}
	}

	/**
	 * ��O���������邩����
	 */
	@Test
	  public void testPower22() {
	      try {
	          answer = MathUtil.power(0, 1000);
	          fail("TC22:��O���������Ȃ���΂Ȃ�܂���");
	      } catch (IllegalArgumentException e) {
	          assertThat("���b�Z�[�W����v���܂���", e.getMessage(), is("100�ȏ�̒l�͕s���ł�"));
	      }
	}
}
