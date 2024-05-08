package test;

import code_a.ViDu;

public class TestViDu {
	public static void main(String[] args) {
		ViDu vd = new ViDu(5, 6);
		
		System.out.println(vd.getA());
		
		code_b.ViDu vd2 = new code_b.ViDu(10, 12, 14);
		
		System.out.println(vd2.getC());
		
		
	}
}
