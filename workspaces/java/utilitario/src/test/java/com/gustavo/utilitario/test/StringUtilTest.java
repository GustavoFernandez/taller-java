package com.gustavo.utilitario.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.gustavo.utilitario.util.StringUtil;

public class StringUtilTest {

	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void capitalizeTest() {
		// test case o casos de prueba
		assertEquals(StringUtil.capitalize("java"), "Java"); // equals
		assertTrue(StringUtil.capitalize("hOLA").equals("Hola"));
		assertEquals(StringUtil.capitalize(" "), " ");
		assertEquals(StringUtil.capitalize(""), "");
		assertNull(StringUtil.capitalize(null));
	}
	
	@Test
	public void truncateTest() {
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
		assertEquals(StringUtil.times("*", 3), "***");
		assertEquals(StringUtil.times("", 3), "");
		assertEquals(StringUtil.times("null", 2), "nullnull");
		assertNull(StringUtil.times(null, 2));
	}

	// TODO validar demas metodos de clase StringUtil

	@Test
	public void stringReplaceTestEsperaNullPointerException() {
		thrown.expect(NullPointerException.class);
		"hola".replace("hola", null);
	}

}
