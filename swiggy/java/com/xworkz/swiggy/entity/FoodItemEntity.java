package com.xworkz.swiggy.entity;

import com.xworkz.swiggy.constants.FoodType;

public class FoodItemEntity {
	private String name;
	private double price;
	private int quantity;
	private FoodType type;
	private int rating;
	private boolean healthy;
	private String falvor;
	private int mfd;
	private int exd;
	private String color;

	public FoodItemEntity() {
		System.out.println("invoked FoodItemEntity");
	}

	public FoodItemEntity(String name, double price, int quantity, FoodType type, int rating, boolean healthy,
			String falvor, int mfd, int exd, String color) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
		this.rating = rating;
		this.healthy = healthy;
		this.falvor = falvor;
		this.mfd = mfd;
		this.exd = exd;
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + exd;
		result = prime * result + ((falvor == null) ? 0 : falvor.hashCode());
		result = prime * result + (healthy ? 1231 : 1237);
		result = prime * result + mfd;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		result = prime * result + rating;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItemEntity other = (FoodItemEntity) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (exd != other.exd)
			return false;
		if (falvor == null) {
			if (other.falvor != null)
				return false;
		} else if (!falvor.equals(other.falvor))
			return false;
		if (healthy != other.healthy)
			return false;
		if (mfd != other.mfd)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		if (rating != other.rating)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FoodItemEntity [name=" + name + ", price=" + price + ", quantity=" + quantity + ", type=" + type
				+ ", rating=" + rating + ", healthy=" + healthy + ", falvor=" + falvor + ", mfd=" + mfd + ", exd=" + exd
				+ ", color=" + color + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isHealthy() {
		return healthy;
	}

	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}

	public String getFalvor() {
		return falvor;
	}

	public void setFalvor(String falvor) {
		this.falvor = falvor;
	}

	public int getMfd() {
		return mfd;
	}

	public void setMfd(int mfd) {
		this.mfd = mfd;
	}

	public int getExd() {
		return exd;
	}

	public void setExd(int exd) {
		this.exd = exd;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}
