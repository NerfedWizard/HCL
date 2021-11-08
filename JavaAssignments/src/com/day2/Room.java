package com.day2;
//Q4
public class Room {
	private int roomNo;
	private String roomType;
	private double roomArea;
	private int ACMachine;

	public Room(int roomNo, String roomType, double roomArea, int ACMachine) {
		this.setRoomNo(roomNo);
		this.setACMachine(ACMachine);
		this.setRoomArea(roomArea);
		this.setRoomType(roomType);
	}

	public static void main(String[] args) {

	}

	public int displayACMachine() {
		return ACMachine;
	}

	public void setACMachine(int aCMachine) {
		ACMachine = aCMachine;
	}

	public double displayRoomArea() {
		return roomArea;
	}

	public void setRoomArea(double roomArea) {
		this.roomArea = roomArea;
	}

	public String displayRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int displayRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

}
