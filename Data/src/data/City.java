
public class City {
	
	private int id;
	private int population;
	private String name;
	private String cc;
	private String district;
	
	// constructor for city object collected from the database 
	public City(int id, String name, String cc, String district, int population)
	{
		this.id = id;
		this.name = name;
		this.cc = cc;
		this.district = district;
		this.population = population;
	}
	
	// constructor for uploading city object to the database 
	public City( String name, String cc, String district, int population)
	{
		this.name = name;
		this.cc = cc;
		this.district = district;
		this.population = population;
	}
	
	
	/**
	 * 
	 * Methods for set and get 
	 */
	
	public int getID(){
		return id;
	}
	
	public int getPopulation(){
		return population;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCC(){
		return cc;
	}
	
	public String getDistrict(){
		return district;
	}
	
	// toString method
	public String toString(){
		return String.format("City [id=%s, name=%s, country-code=%s, district=%s]",
							id, name, cc, district);
	}
	

}




