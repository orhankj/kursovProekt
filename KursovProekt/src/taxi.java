
public class taxi {
 private String brand;
 private String model;
 private int age;
 private short  seats;
 private double loadcap;
 private double fuelspent;
public taxi(String brand, String model, int age, short seats, double loadcap,
		double fuelspent) {
	super();
	this.brand = brand;
	this.model = model;
	this.age = age;
	this.seats = seats;
	this.loadcap = loadcap;
	this.fuelspent = fuelspent;
}
@Override
public String toString() {
	return "taxi [brand=" + brand + ", model=" + model + ", age=" + age
			+ ", seats=" + seats + ", loadcap=" + loadcap + ", fuelspent="
			+ fuelspent + "]";
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public short getSeats() {
	return seats;
}
public void setSeats(short seats) {
	this.seats = seats;
}
public double getLoadcap() {
	return loadcap;
}
public void setLoadcap(double loadcap) {
	this.loadcap = loadcap;
}
public double getFuelspent() {
	return fuelspent;
}
public void setFuelspent(double fuelspent) {
	this.fuelspent = fuelspent;
}
 
}
