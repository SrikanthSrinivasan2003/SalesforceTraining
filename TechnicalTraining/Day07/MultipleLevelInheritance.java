//country
public class country {
	private String countryName;
	private String capital;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + "]";
	}
	
	
}

//state
public class state extends country
{
	private String stateName;
	private String language;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", language=" + language + ", getCountryName()=" + getCountryName()
				+ ", getCapital()=" + getCapital() + "]";
	}

}


//city
public class city extends state
{
	private String cityName;
	private float area;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Override
	
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", StateName=" + getStateName() + ", Language= "
				+ getLanguage() + ", CountryName=" + getCountryName() + ", Capital=" + getCapital() + "]";
	}

}


public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		city obj=new city();
		obj.setCityName("Nashik");
		obj.setArea(264.2f);
		obj.setStateName("Maharashtra");
		obj.setLanguage("Marathi");
		obj.setCountryName("India");
		obj.setCapital("Delhi");
		System.out.println(obj);
	}
}
