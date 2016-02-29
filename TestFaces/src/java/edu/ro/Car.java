/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ro;


public class Car {
    
        public String  Id;
        public String Brand;
	public int year;
	public String color;
        public int price;
        public boolean sold;

    public Car(String Id, String Brand, int year, String color, int price, boolean sold) {
                this.Id = Id;
		this.Brand = Brand;
		this.year = year;
		this.color = color;
		this.price = price;
                this.sold = sold;
	}

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
	
        
   
    
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		
		if(!(obj instanceof Car))
			return false;
		
		Car compare = (Car) obj;
	
		return compare.Brand.equals(this.Brand);
	}

	@Override
	public int hashCode() {
		int hash = 1;
		
	    return hash * 31 + Brand.hashCode();
	}

    @Override
    public String toString() {
        return "Car{" + "model=" + Brand + ", year=" + year + ", color=" + color + ", price=" + price + '}';
    }
}