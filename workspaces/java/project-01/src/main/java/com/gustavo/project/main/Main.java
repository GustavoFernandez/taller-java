package com.gustavo.project.main;

import com.gustavo.utilitario.util.StringUtil;

public class Main {

	public static void main(String[] args) {
		String nombres[] = { "JuLio", "marcOs", "roBerto", "LUIS" };

		for (String nombre : nombres) {
			System.out.println(StringUtil.capitalize(nombre));
		}
	}

}
