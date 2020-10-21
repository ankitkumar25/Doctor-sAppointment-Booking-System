public class Doctor{

	private int DID;
	private int age;
	private String name;
	private String city;
	private long phone;

	// Getter Setter
	public int getAge()
	{
		return age;
	}
	public int getDID()
	{
			return DID;
	}
	public long getPhone()
		{
			return phone;
	}
	public String getName()
		{
			return name;
	}
	public String getCity()
	{
		return city;
	}


	// Setter
	 public void setDID(int DID)
	 {
		 this.DID = DID;
	 }

	public void setName(String name)
	{
		this.name = name;
	}
	public void setCity(String city)
		{
			this.city = city;
	}
	public void setAge(int Age)
		{
			this.age = age;
	}
	public void setPhone(long phone)
		{
			this.phone = phone;
	}

}