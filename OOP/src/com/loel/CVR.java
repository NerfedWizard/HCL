package com.loel;

class Test {
	Test get() {
		return this;
	}
}

//Covariant Return Type
public class CVR extends Test {

	CVR get() {
		return this;
	}

	void print() {
		System.out.println("Something......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CVR cvr = new CVR();
//		cvr.print();
		new CVR().get().print();
	}

}
