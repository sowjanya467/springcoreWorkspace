package com.bridgelabz.constructorInjectionUsingList;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<String> ans;

	public Question() {

	}

	public Question(int id, String name, List<String> ans) {
		super();
		this.id = id;
		this.name = name;
		this.ans = ans;
		System.out.println("list parameterized constuctor");

	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println("the answers are");
		Iterator<String> it = ans.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
