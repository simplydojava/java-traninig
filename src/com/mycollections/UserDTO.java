package com.mycollections;

import java.util.ArrayList;

public class UserDTO {
	
	private String name;
	private Integer age;
	private char gender;
	private ArrayList<String> list;
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @return the list
	 */
	public ArrayList<String> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	private Float height;
	private int weight;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	/**
	 * @return the height
	 */
	public Float getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Float height) {
		this.height = height;
	}
	

}
