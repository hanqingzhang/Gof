/**
 * 
 */
package com.zhanghanqing;

/**
 * @author zhanghanqing
 *
 */
public class OperationDiv extends Operation {

	
	@Override
	public double getResult()  {
		if(numberB==0) {
			try {
				throw new Exception("��������Ϊ0");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return numberA/numberB;
	
	}

}
