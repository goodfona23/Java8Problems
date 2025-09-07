package com;

public class Case1 {

	public static void main(String[] args) {

		CustomFunctionalIntertface fi = (a, b) -> (a + b);
		System.out.println(fi.add(45, 50));

		Runnable thread1 = () -> {
			int count = 1;
			for (int i = 0; i < 10; i++) {
				System.out.println(count++);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(thread1);
		t1.start();

	}
}
