package com.nauka.spring5.DI_constr;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Z�a wr�ba";
	}
}