package com.cg.junitproject;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapClass {
	public HashMap<String, Integer> list = new HashMap<String,Integer>();
	static TreeMap<String,Integer>sort=new TreeMap<>();
	public  Boolean valueInHasMap() {
		list.put("Jeyaprakash", 22);
		list.put("Sandip",25);
		list.put("Murugasamy",23);
		list.put("Shiva",24);
		list.put("Umar", 22);
		return list.isEmpty();
		
	}
	public int calculateAge(Map<String,Integer> person) {
		list.put("Jeyaprakash", 22);
		list.put("Sandip",25);
		list.put("Murugasamy",23);
		list.put("Shiva",24);
		list.put("Umar", 22);
		int sum = 0;
		for (int value: person.values()) {
		sum += value;
		}
			
		return sum;
	}
	static void Sorting(Map<String,Integer> person)

	{
	
	sort.putAll(person);
	for (Map.Entry<String, Integer> entry : sort.entrySet())
	System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
	


	}
	public static void main(String[] args) {
		HashMapClass hmc = new HashMapClass();
		System.out.print(hmc.valueInHasMap());
		System.out.println(hmc.list);
		hmc.Sorting(hmc.list);
		hmc.calculateAge(hmc.list);
		
	}

}
