package com.data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Execute {

	public static void main(String[] args) {

		BankingLoginPage a = new BankingLoginPage();
		a.setUserId(12345);
		a.setPassword("qwerty");

		BankingLoginPage b = new BankingLoginPage();
		b.setUserId(112233);
		b.setPassword("qqqee");

		BankingLoginPage c = new BankingLoginPage();
		c.setUserId(887766);
		c.setPassword("avbcd");

		// userDefine List
		List<BankingLoginPage> li = new ArrayList();
		li.add(a);
		li.add(b);
		li.add(c);

		for (int i = 0; i < li.size(); i++) {

			BankingLoginPage bank = li.get(i);
			int userId = bank.getUserId();
			String password = bank.getPassword();
			System.out.println(userId);
			System.out.println(password);
		}

	}

}
