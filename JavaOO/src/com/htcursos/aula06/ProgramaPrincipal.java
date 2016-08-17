package com.htcursos.aula06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Map<String, Integer> mesesAno = new HashMap<>();
		mesesAno.put("Janeiro", 31);
		mesesAno.put("Fevereiro", 28);
		mesesAno.put("Março", 31);
		mesesAno.put("Abril", 30);
		mesesAno.put("Maio", 31);
		mesesAno.put("Junho", 30);
		mesesAno.put("Julho", 31);
		mesesAno.put("Agosto", 31);
		mesesAno.put("Setembro", 30);
		mesesAno.put("Outubro", 31);
		mesesAno.put("Novembro", 30);
		mesesAno.put("Dezembro", 31);
		
		
		
		
		
		Collection<Integer> valores =	mesesAno.values();
		for (Integer i : valores) {
			System.out.println(i);
		}
		
		mesesAno.replace("Agosto", 20);
		
		List<Float> list = new ArrayList<>();
		
		
		System.out.println(mesesAno.get("Agosto"));
		System.out.println(mesesAno.get("Fevereiro"));
	
		
		
	}
	
}
