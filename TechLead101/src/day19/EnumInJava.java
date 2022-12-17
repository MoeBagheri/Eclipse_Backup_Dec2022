package day19;

public class EnumInJava {
	enum Country {USA, UK, Canada, Brazil}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFreeCountry(Country.USA));
		System.out.println(getFreeCountry(Country.UK));
		System.out.println(getFreeCountry(Country.Canada));
	//	System.out.println(getFreeCountry(Country.India));
		

	}
public static double getFreeCountry(Country country) {
	if (country.equals(Country.USA)){
		return 10.00;
	}else if (country.equals(Country.Canada)){
		return 12.0;
	}else if (country.equals(Country.Canada)||country.equals(Country.Brazil)){
			return 9.0;
	}else {
		return 10.00;
	//	return System.out.println("NO");
	}
	
}
	
}
