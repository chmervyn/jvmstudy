package com.sap.mervyn.oom;

/*
 * -Xss2m please run in 32 bit os
 */
public class JavaVMStackSOF2 {
	private void dontStop() {
		while (true) {}
	}
	
	public void stackLeakByThread() {
		while (true) {
			new Thread(() -> dontStop()).start();
		}
	}
	
	public static void main(String[] args) {
		JavaVMStackSOF2 oom = new JavaVMStackSOF2();
		oom.stackLeakByThread();
	}
}
