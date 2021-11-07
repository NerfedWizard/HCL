package com.day4;

public class Circle extends Shape {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRadius() {
		return this.radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	private Integer radius;

	public Circle(String name, Integer radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public float calculateArea() {
//		float area = (float) ((this.radius * this.radius) * 3.14);
		return (float) (3.14 * Math.pow(radius, 2));
	}

}
