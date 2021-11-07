package com.day4;

public class Square extends Shape {
	private Integer side;
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSide() {
		return this.side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

	public Square(String name, Integer side) {
		super(name);
		this.side = side;
	}

	@Override
	public float calculateArea() {
		
		return (float)Math.pow(side,2);
	}

}
