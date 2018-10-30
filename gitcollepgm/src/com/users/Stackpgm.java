package com.users;

import java.util.Stack;

public class Stackpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(10);
		s.push(1);
		s.push(100);
		s.push("a");
		s.push("s");
		s.push("g");
		s.push("v");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.search(100));
		System.out.println(s.search(1));
		System.out.println(s.search("z"));
		System.out.println(s.empty());
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                System.out.println(s);
	}
	}


