package com.bigshi.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 *  vm Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *	Use of Memory Analyzer. Eclipse Plug-in.
 * @author syh
 *
 */
public class HeapOOM {

	/**
	 * Inner class
	 */
	static class OOMObject{
		
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}
	
}
