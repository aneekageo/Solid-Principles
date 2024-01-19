package com.ilp.entity;

public class Game {
	private String title;
    private double price;
    private String genre;
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Game(String title, double price, String genre) {
		super();
		this.title = title;
		this.price = price;
		this.genre = genre;
	}

}
