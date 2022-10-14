package com.valtech;

//import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	private int id;
	private String make;
	private String model;
	private int yearmanufactured;
	private float price;
	private String color;
	@Version
	private int version;
	
	@Embedded
	private CarDetails cardetails;
	
	public CarDetails getCardetails() {
		return cardetails;
	}



	public void setCardetails(CarDetails cardetails) {
		this.cardetails = cardetails;
	}



	public int getVersion() {
		return version;
	}



	public void setVersion(int version) {
		this.version = version;
	}



	public Car(){
	}
	
	
	
	public Car( String make, String model, int yearmanufactured, float price, String color,CarDetails carDetails) {
		super();
		
		this.make = make;
		this.model = model;
		this.yearmanufactured = yearmanufactured;
		this.price = price;
		this.color = color;
		this.cardetails = carDetails;
	}



	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", yearmanufactured=" + yearmanufactured
				+ ", price=" + price + ", color=" + color + ", version=" + version + ", cardetails=" + cardetails + "]";
	}



	public Car(int id, String make, String model, int yearmanufactured, float price, String color,int version,CarDetails cardetails) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearmanufactured = yearmanufactured;
		this.price = price;
		this.color = color;
		this.version = version;
		this.cardetails= cardetails;
		
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearmanufactured() {
		return yearmanufactured;
	}
	public void setYearmanufactured(int yearmanufactured) {
		this.yearmanufactured = yearmanufactured;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}



	/*public static void update(Car car) {
		// TODO Auto-generated method stub
		
	}*/

	
	
	

}
