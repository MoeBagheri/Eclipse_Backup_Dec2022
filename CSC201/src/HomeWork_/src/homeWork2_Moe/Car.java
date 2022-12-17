package homeWork2_Moe;


public class Car {

	private int carNumber;
	private String make, dealerID;
	private String model;
	private int year;
	private String color;
	private double mpghwy;
	private double mpgcty;
	private int weight;
	private int nCylinders;
	private double tankSize;

	
	public void setDealerID(String dealerID) {
		this.dealerID = make;
	}

	public String getDealerID() {
		return dealerID;
	}
	
	
	
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getmodel() {
		return model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setMpghwy(double mpghwy) {
		this.mpghwy = mpghwy;
	}

	public double getMpghwy() {
		return mpghwy;
	}

	public void setMpgcty(double mpgcty) {
		this.mpgcty = mpgcty;
	}

	public double getMpgcty() {
		return mpgcty;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeght() {
		return weight;
	}

	public void setNCylinders(int nCylinders) {
		this.nCylinders = nCylinders;
	}

	public int getNCylinders() {
		return nCylinders;
	}

	public void setTankSize(double tankSize) {
		this.tankSize = tankSize;
	}

	public double getTankSize() {
		return carNumber;
	}

	public Car(String _dealerID, int _carNumber, String _make, String _model, int _year, String _color, double _mpghwy, double _mpgcty,
			int _weight, int _nCylinders, double _tankSize) {

		dealerID = _dealerID;
		carNumber = _carNumber;
		make = _make;
		model = _model;
		year = _year;
		color = _color;
		mpghwy = _mpghwy;
		mpgcty = _mpgcty;
		weight = _weight;
		nCylinders = _nCylinders;
		tankSize = _tankSize;
	}

	public String toString() {
		return 
//work on this one later:
		// " cars for "+ dealerA +" cars for " + dealerB + " and cars for " + dealerC+

				"\n" + " Car_" + carNumber + ", " + make + ", " + model + ", " + year + ", " + color + ", "
				+ mpghwy + ", " + mpgcty + ", " + weight + ", " + nCylinders + ", " + tankSize;
	}
}