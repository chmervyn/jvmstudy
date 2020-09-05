package com.sap.mervyn.oom;

import java.util.HashSet;
import java.util.Set;

/*
 * -XX:PermSize=6M -XX:MaxPermSize=6M  java version should be less than 7
 * -Xms6m -Xms6m
 */
public class RuntimConstantPoolOOM {
	
	public static void main(String[] args) {		
		//	使用Set保持着常量池引用，避免Full GC回收常量池行为
		Set<String> set = new HashSet<String>();
		//	在short范围内足以让6MB的PermSize产生OOM
		short i = 0;
		
		while (true) {
			set.add(String.valueOf(i++).intern());
		}
	} 
}
