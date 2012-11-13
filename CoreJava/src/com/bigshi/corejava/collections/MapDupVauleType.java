package com.bigshi.corejava.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Input duplicate types of values into a map, omit generic
 * @author Robert Shi
 *	
 */
public class MapDupVauleType {

	private Map map;
	
	public MapDupVauleType() {
		map = new HashMap();
	}
	
	public void init() {
		map.put("K1", 1);
		map.put("K2", true);
		map.put("K3", "String");
		map.put("K4", new Person("Robert Shi","1"));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MapDupVauleType m = new MapDupVauleType();
		m.init();
	}

}
