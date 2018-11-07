/**
 * 
 */
package com.zhanghanqing;

/**
 * @author zhanghanqing
 *
 */
public class Calculator {
	public static void main(String args[]) {
		Operation oper=null;
		oper=OperationFactory.createOperation("+");
		oper.numberA=1.5;
		oper.numberB=1.9;
		System.out.println(oper.getResult());
	}
	
	

}
