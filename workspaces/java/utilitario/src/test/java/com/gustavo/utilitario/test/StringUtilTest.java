package com.gustavo.utilitario.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.gustavo.utilitario.util.StringUtil;

// @Ignore("Ignorado por que aun no he terminado")
public class StringUtilTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("---> beforeClass()");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("---> afterClass()");
	}

	@Before
	public void before() {
		// System.out.println("--> before each test");
	}

	@After
	public void after() {
		// System.out.println("--> after each test");
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void capitalizeTest() {
		System.out.println("capitalizeTest()");
		// test case o casos de prueba
		assertEquals(StringUtil.capitalize("java"), "Java"); // equals
		assertTrue(StringUtil.capitalize("hOLA").equals("Hola"));
		assertEquals(StringUtil.capitalize(" "), " ");
		assertEquals(StringUtil.capitalize(""), "");
		assertNull(StringUtil.capitalize(null));
	}

	@Test
	public void truncateTest() {
		System.out.println("truncateTest()");
		assertEquals(StringUtil.truncate("java", 1), "j");
		assertTrue(StringUtil.truncate("java", 3).length() == 3);
		assertFalse(StringUtil.truncate("java", 3).length() == 2);
		assertEquals(StringUtil.truncate("", 3), "");
		assertEquals(StringUtil.truncate("java", 100), "java");
		assertEquals(StringUtil.truncate("java", 0), "");
		assertNull(StringUtil.truncate(null, 12));
	}

	@Test
	public void timesTest() {
		System.out.println("timesTest()");
		assertEquals(StringUtil.times("*", 3), "***");
		assertEquals(StringUtil.times("", 3), "");
		assertEquals(StringUtil.times("null", 2), "nullnull");
		assertNull(StringUtil.times(null, 2));
	}

	@Test
	public void reverseTest() {
		System.out.println("reverseTest()");
		assertEquals(StringUtil.reverse("java"), "avaj");
		assertEquals(StringUtil.reverse("hola mundo"), "odnum aloh");
		assertEquals(StringUtil.reverse(" "), " ");
		assertEquals(StringUtil.reverse(""), "");
		assertNull(StringUtil.reverse(null));
		assertEquals(StringUtil.reverse("null"), "llun");
	}

	@Test
	public void capitalizeAllWordsTest() {
		System.out.println("capitalizeAllWordsTest()");
		assertEquals(StringUtil.capitalizeAllWords("hola mundo"), "Hola Mundo");
		assertEquals(StringUtil.capitalizeAllWords(" java wOrld"), " Java World");
		assertEquals(StringUtil.capitalizeAllWords(" 12 hOLA"), " 12 Hola");
		assertEquals(StringUtil.capitalizeAllWords(" "), " ");
		assertEquals(StringUtil.capitalizeAllWords(""), "");
		assertNull(StringUtil.capitalizeAllWords(null));
	}

	@Test
	public void fullTrimTest() {
		System.out.println("fullTrimTest()");
		assertEquals(StringUtil.fullTrim(" java "), "java");
		assertEquals(StringUtil.fullTrim(" hello   world "), "hello world");
		assertEquals(StringUtil.fullTrim(" caso   de   prueba 1 "), "caso de prueba 1");
		assertEquals(StringUtil.fullTrim(""), "");
		assertEquals(StringUtil.fullTrim("     "), "");
		assertNull(StringUtil.fullTrim(null));
	}

	@Test
	public void swapCaseTest() {
		System.out.println("swapCaseTest()");
		assertEquals(StringUtil.swapCase("java"), "JAVA");
		assertEquals(StringUtil.swapCase("JAVA"), "java");
		assertEquals(StringUtil.swapCase("jAvA"), "JaVa");
		assertEquals(StringUtil.swapCase(""), "");
		assertEquals(StringUtil.swapCase(" "), " ");
		assertNull(StringUtil.swapCase(null));
	}

	@Test
	public void stringReplaceTestEsperaNullPointerException() {
		System.out.println("stringReplaceTestEsperaNullPointerException()");
		thrown.expect(NullPointerException.class);
		"hola".replace("hola", null);
	}

	@Test
	public void assertSameAndEqualsTest() {
		String cadena1 = "java";
		String cadena2 = "java";
		String cadena3 = new String("java");
		assertSame(cadena1, cadena2); // cadena1 == cadena2
		assertEquals(cadena1, cadena2); // cadena1.equals(cadena2)
		// assertSame(cadena2, cadena3); // cadena2 == cadena3 // Fail!!!
		assertEquals(cadena2, cadena3); // cadena2.equals(cadena3)
	}

}
