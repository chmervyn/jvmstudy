package com.sap.mervyn.util;

public class GenerateString {
	public static void main(String[] args) {
		String prefix = "unused";
		
		int length = 1;
		StringBuilder sb = new StringBuilder();
		while (length < 101) {
			sb.append(prefix).append(length).append(" = ");
			if (length == 100) {
				sb.append("0;");
			} 
			
			length++;
		}
		
		System.out.println(sb.toString());
	}
}
