package homeWork2_Moe;
public class CarDealer { 
private String dealerID;
private Car[] cars;
public CarDealer (String ID, Car[] cars) {
	dealerID = ID;
	this.cars = cars;
}
public void setDealerID(String ID) {
	dealerID = ID;
	
}
 public String getDealerID() {
	 return dealerID;
 }
 public void setCars(Car[] cars) {
	this.cars = cars;
 }
 public Car[] getCars() {
	 return cars;
 }
}
