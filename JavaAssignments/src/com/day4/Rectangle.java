package com.day4;

public class Rectangle extends Shape {
	private String name;
	private Integer length;
	private Integer breadth;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLength() {
		return this.length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getBreadth() {
		return this.breadth;
	}

	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}

	public Rectangle(String name, Integer length, Integer breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float calculateArea() {

		return (float) length * breadth;
	}

}
