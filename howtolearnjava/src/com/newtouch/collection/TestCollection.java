package com.newtouch.collection;

import java.util.ArrayList;

public class TestCollection {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("list1");
		list.add("list2");
		list.add("list3");
		list.add("list4");
		System.out.println("集合的长度"+list.size());
		System.out.println("集合的第二个元素是"+list.get(1));
	}
}
