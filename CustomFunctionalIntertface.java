package com;

@FunctionalInterface
public interface CustomFunctionalIntertface {
	/*A Functional Interface will have exactly one abstract method 
	 * if public abstract  is not present compiler b y default add it if explicitly @FunctionalInterface 
	 * annotation is added over a Interface
	 */
	int add(int a , int b);

}
