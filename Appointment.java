
 public class Appointment{

	 // Doctor Details
	 	private int DID;
	 	private int Dage;
	 	private String Dname;
	 	private String Dcity;
	private long Dphone;

	 // Patient Details
		 	private int PID;
		 	private int Page;
		 	private String Pname;
		 	private String Pcity;
	private long Pphone;


	// Getter Setter For Doctor Details
		public int getDAge()
		{
			return Dage;
		}
		public int getDID()
		{
				return DID;
		}
		public long getDPhone()
			{
				return Dphone;
		}
		public String getDName()
			{
				return Dname;
		}
		public String getDCity()
		{
			return Dcity;
		}


		// Setter for Doctor Details
		 public void setDID(int DID)
		 {
			 this.DID = DID;
		 }

		public void setDName(String Dname)
		{
			this.Dname = Dname;
		}
		public void setDCity(String Dcity)
			{
				this.Dcity = Dcity;
		}
		public void setDAge(int DAge)
			{
				this.Dage = Dage;
		}
		public void setDPhone(long Dphone)
			{
				this.Dphone = Dphone;
	}





// Getter Setter For Patient Details
	public int getPAge()
	{
		return Page;
	}
	public int getPID()
	{
			return PID;
	}
	public long getPPhone()
		{
			return Pphone;
	}
	public String getPName()
		{
			return Pname;
	}
	public String PgetCity()
	{
		return Pcity;
	}


	// Setter
	 public void setPID(int PID)
	 {
		 this.PID = PID;
	 }

	public void setPName(String Pname)
	{
		this.Pname = Pname;
	}
	public void setPCity(String Pcity)
		{
			this.Pcity = Pcity;
	}
	public void setPAge(int PAge)
		{
			this.Page = Page;
	}
	public void setPPhone(long Pphone)
		{
			this.Pphone = Pphone;
	}
}

