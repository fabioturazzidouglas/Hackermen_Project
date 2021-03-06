package com.csis3275.model;


/**
 * @author Hackermen
 * Hotel Management System
 */

public class Room {

	private int roomId;
	private int roomNumber;
	private String roomType;
	private int floor;
	private String housekeepingStatus;
	
	/**
	 * Customized Constructor
	 * @param roomNumber
	 * @param roomType
	 * @param floor
	 * @param housekeepingStatus
	 * @param roomId
	 */
	public Room(int roomNumber, String roomType, int floor, String housekeepingStatus, int roomId) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.floor = floor;
		this.housekeepingStatus = housekeepingStatus;
		this.roomId = roomId;
	}
	
	/**
	 * Default Constructor
	 */
	public Room() {

	}
	
	/**
	 * Getters and Setters
	 */
	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getHousekeepingStatus() {
		return housekeepingStatus;
	}

	public void setHousekeepingStatus(String housekeepingStatus) {
		this.housekeepingStatus = housekeepingStatus;
	}



}
