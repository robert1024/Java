package com.bigshi.utils;

public class RLog {
	
	
	/**
	 * log a string
	 * @param s
	 */
	public static void log(String s){
		System.out.println(s);
	}
	
	/**
	 * log a int
	 * @param i
	 */
	public static void log(int i){
		log(String.valueOf(i));
	}
	
	public static void log(Integer i){
		log(String.valueOf(i));
	}
	
	public static void log(boolean b){
		log(String.valueOf(b));
	}
	
	
}
