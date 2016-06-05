package com.gustavo.ejercicio01.test;

import com.gustavo.utilitario.util.StringUtil;

public class PruebaTruncate {

	public static void main(String[] args) {
		System.out.println(StringUtil.truncate("hola mundo", 7));
		System.out.println(StringUtil.truncate("java", 10));
		System.out.println(StringUtil.truncate("universidad", 2));
		System.out.println(StringUtil.truncate("laptop", 6));
	}

}
