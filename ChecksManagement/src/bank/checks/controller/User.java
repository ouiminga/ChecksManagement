package bank.checks.controller;

import java.util.HashMap;
import java.util.Map;

public class User {
	
	int userId;
	String name;
	String firstname;
	String bank;
	String accountNumber;
	Map<Integer,Check> checkbooks = new HashMap<Integer,Check>();
	
}
