package use;

import used.Calculator;
import used.SubCalc;

public class Call {
	public static void main(String[] args) {
//		Calculator calculator = new AddCalc();
//		Integer result = calculator.calc(10, 5);
//		System.out.println("計算結果：" + result);
		
		Calculator calculator = new SubCalc();
		Integer result = calculator.calc(10, 5);
		System.out.println("計算結果：" + result);
	}
}
