public class Patient{

	private int PID;
	private int age;
	private String name;
	private String city;
	private long phone;

	// Getter Setter
	public int getAge()
	{
		return age;
	}
	public int getPID()
	{
			return PID;
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
	 public void setPID(int PID)
	 {
		 this.PID = PID;
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