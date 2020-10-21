import java.util.*;
class MainFile{
	public static ArrayList<Doctor> doctor = new ArrayList<Doctor>();
	public static ArrayList<Patient> patient = new ArrayList<Patient>();
	public static ArrayList<String> doctorcity = new ArrayList<String>();
	public static ArrayList<Appointments> appointments= new ArrayList<Appointments>();

	public static Doctor currentDoctor;
	public static Patient currentPatient;


	public static void main(String args[])
	{

		commonMainMenu();

	}

	// Common Main Menu

	public static void commonMainMenu()
	{
		// Scanner Object

				Scanner scan = new Scanner(System.in);


				// Display Menu
				System.out.print(" \n \n \t \t WELCOME TO DOCTORS APPOINTMENT BOOKING SYSTEM \n");
				System.out.print(" \n \t \t Who are you...? (Select 1 or 2)");
				System.out.print(" \n \t \t 1. Patient");
				System.out.print(" \n \t \t 2. Doctor");

				int input = scan.nextInt();

				 switch(input)
				 {
					 case 1:  patientSection();
					 			break;
					 case 2:  doctorSection();
					 			break;

					 default: System.out.print("  \n \t \t INVALID INPUT");
					 break;
		 }

	}



	//Function for Patient
	public static void patientSection()
	{

		// Scanner Object

		Scanner scan = new Scanner(System.in);

				System.out.print(" \n\t \t WELCOME TO PATIENT SECTION");
					System.out.print(" \n \n \t \t What do you want to do...? (Select 1 or 2)");
						System.out.print("  \n \t \t 1. Login");
						System.out.print("  \n \t \t 2. Register ");

						int input = scan.nextInt();

						 switch(input)
						 {
							 case 1:  patientLogin();
							 			break;
							 case 2:  patientRegister();
							 			break;

							 default: System.out.print(" \n \n \t \t INVALID INPUT \n \n");
							 break;
		 }

	}



	// Patient Login

	public static void patientLogin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(" \n \n \t \t PATIENT LOGIN \n \n");
		System.out.print(" \n \n \t \t ENTER PID:");
		int pid = scan.nextInt();
		System.out.print(" \n \n \t \t ENTER Phone No.:");
		long phone = scan.nextLong();

		Iterator itr = patient.iterator();
		while(itr.hasNext())
		{
			 Patient ptn = (Patient)itr.next();
			 if(ptn.getPID() == pid && ptn.getPhone() ==phone)
			 {

				 // Updating Current Patient

				 currentPatient = new Patient();
				 currentPatient.setPID(ptn.getPID());
				 currentPatient.setName(ptn.getName());
				 currentPatient.setAge(ptn.getAge());
				 currentPatient.setCity(ptn.getCity());
				 currentPatient.setPhone(ptn.getPhone());

				 // Login Sucessfull
				 System.out.print(" \n Login Sucessfull...");

				 patientMainMenu();
			 }
			 if(ptn.getPID() == 000 && ptn.getPhone() ==0000)
			 			 {
			 				 // Login Sucessfull
			 				 System.out.print(" \n Login failed...");

			 				 commonMainMenu();
			 }
		 }

		 // Login Failed





	}
	// Patient Register

		public static void patientRegister()
		{
			// Scanner Object

		Scanner scan = new Scanner(System.in);

			System.out.print(" \n \n \t \t PATIENT REGISTER \n \n");


			// get patient details and put it in arraylist of patinet


			String name,city;
			int pid,age;
			long phone;

			System.out.print(" \n \t \t ENTER PATIENT DETAILS \n \n");
			System.out.print(" \n \t \t ENTER Patient ID: ");
			pid = scan.nextInt();

			System.out.print("  \n \t \t ENTER NAME: ");
			name = scan.next();
			System.out.print("  \n \t \t ENTER Age: ");
			age = scan.nextInt();
			System.out.print(" \n \t \t ENTER City:");
			city = scan.next();
			System.out.print("\n \t \t ENTER Phone: ");
			phone= scan.nextLong();

			// Calling Setter Method
			Patient ptn = new Patient();
			ptn.setPID(pid);
			ptn.setName(name);
			ptn.setAge(age);
			ptn.setCity(city);
			ptn.setPhone(phone);

			// Add Patinet in arraylist

			patient.add(ptn);



			// Last Element

			Patient lastElement = new Patient();
			lastElement.setPID(000);
			lastElement.setAge(000);
			lastElement.setName("aaaa");
			lastElement.setCity("aaaa");
			lastElement.setPhone(0000);

			patient.add(lastElement);


		// Updating current Patinet

			 currentPatient = new Patient();
							 currentPatient.setPID(pid);
							 currentPatient.setName(name);
							 currentPatient.setAge(age);
							 currentPatient.setCity(city);
				 currentPatient.setPhone(phone);

			System.out.print(" \n \n \t \t Registration Sucessfull...  \n \n");

			patientMainMenu();
	}


// Patinet Main Menu
		public static void patientMainMenu()
		{

			Scanner scan = new Scanner(System.in);
			System.out.print(" \n \n \t \t ......WELCOME TO PATIENT MAIN MENU ........  \n \n");


 				// direct book
 				// select doctor city wise
 				// select doctor from doctor list
 			System.out.print(" \n \n \t \t Enter your choice... ");
 			System.out.print(" \n  \t \t 1. Direct Book Appointment");
 			System.out.print(" \n  \t \t 2. Select Doctor (City Wise)");
 			System.out.print(" \n  \t \t 3. Select Doctor from Doctor List");
 			System.out.print(" \n  \t \t 4. Log out");

 			int input = scan.nextInt();

 			switch(input)
 			{
				case 1: directBooking();
						break;
				case 2: // selectCityDoctor();
						break;
				case 3: //showDoctor();
						break;
				case 4: commonMainMenu();
						break;

				default : System.out.print(" \n  \t \t Invalid Input");
				break;
			}
			// Dummy
			//commonMainMenu();

		}


		// Direct Booking
		public static void directBooking()
		{
			Scanner scan = new Scanner(System.in);

						System.out.print(" \n \n \t \t DIRECT BOOKING \n \n");


						// get patient details


						/*

						String pname,pcity;
						int pid,page;
						long pphone;

						System.out.print(" \n \t \t ENTER PATIENT DETAILS \n \n");
						System.out.print(" \n \t \t ENTER Patient ID: ");
						pid = scan.nextInt();

						System.out.print("  \n \t \t ENTER NAME: ");
						pname = scan.next();
						System.out.print("  \n \t \t ENTER Age: ");
						page = scan.nextInt();
						System.out.print(" \n \t \t ENTER City:");
						pcity = scan.next();
						System.out.print("\n \t \t ENTER Phone: ");
						pphone= scan.nextLong();

						Patient appPatient = new Patient();
						appPatient.setPID(pid);
						appPatient.setName(pname);
						appPatient.setAge(page);
						appPatient.setCity(pcity);
						appPatient.setPhone(pphone);

						*/

						// get doctor details
						String dname,dcity;
						int did,dage;
						long dphone;

						System.out.print(" \n \t \t ENTER DOCTOR DETAILS \n \n");
						System.out.print(" \n \t \t ENTER DOCTOR ID: ");
						did = scan.nextInt();

						System.out.print("  \n \t \t ENTER NAME: ");
						dname = scan.next();
						System.out.print("  \n \t \t ENTER Age: ");
						dage = scan.nextInt();
						System.out.print(" \n \t \t ENTER City:");
						dcity = scan.next();
						System.out.print("\n \t \t ENTER Phone: ");
						dphone= scan.nextLong();

						Doctor appDoctor = new Doctor();
						appDoctor.setDID(did);
						appDoctor.setName(dname);
						appDoctor.setAge(dage);
						appDoctor.setCity(dcity);
						appDoctor.setPhone(dphone);

						Appointments aptmnts  = new Appointments();

						aptmnts.setDoctor(currentDoctor);
						aptmnts.setPatient(currentPatient);





						appointments.add(aptmnts);

						System.out.print("\n \t \t Appointment Booked Sucessfully... ");
						commonMainMenu();

		}




















//////------------------------------------------DOCTOR SECTION ------------------------------------------

	//Function for Doctor
		public static void doctorSection()
		{



				// Scanner Object

					Scanner scan = new Scanner(System.in);

							System.out.print(" \n\t \t WELCOME TO DOCTOR SECTION");
								System.out.print(" \n \n \t \t What do you want to do...? (Select 1 or 2)");
									System.out.print("  \n \t \t 1. Login");
									System.out.print("  \n \t \t 2. Register ");

									int input = scan.nextInt();

									 switch(input)
									 {
										 case 1:  doctorLogin();
										 			break;
										 case 2:  doctorRegister();
										 			break;

										 default: System.out.print(" \n \n \t \t INVALID INPUT \n \n");
										 break;
		 }
	}

	// Doctor Login

		public static void doctorLogin()
		{


					Scanner scan = new Scanner(System.in);
					System.out.print(" \n \n \t \t DOCTOR LOGIN \n \n");
					System.out.print(" \n \n \t \t ENTER DID:");
					int did = scan.nextInt();
					System.out.print(" \n \n \t \t ENTER Phone No.:");
					long phone = scan.nextLong();

					Iterator itr = doctor.iterator();
					while(itr.hasNext())
					{
						 Doctor dctr = (Doctor)itr.next();
						 if(dctr.getDID() == did && dctr.getPhone() ==phone)
						 {

							  // Updating Current Doctor

							 				 currentDoctor = new Doctor();
							 				 currentDoctor.setDID(dctr.getDID());
							 				 currentDoctor.setName(dctr.getName());
							 				 currentDoctor.setAge(dctr.getAge());
							 				 currentDoctor.setCity(dctr.getCity());
				 currentPatient.setPhone(dctr.getPhone());
							 // Login Sucessfull
							 System.out.print(" \n Login Sucessfull...");

							 doctorMainMenu();
						 }
						 if(dctr.getDID() == 000 && dctr.getPhone() ==0000)
						 			 {
						 				 // Login Sucessfull
						 				 System.out.print(" \n Login failed...");

						 				 commonMainMenu();
						 }
					 }

		 // Login Failed

		}
		// Doctor Register

			public static void doctorRegister()
			{
				// Scanner Object

			Scanner scan = new Scanner(System.in);

				System.out.print(" \n \n \t \t DOCTOR REGISTER \n \n");


				// get patient details and put it in arraylist of patinet


				String name,city;
				int did,age;
				long phone;

				System.out.print(" \n \t \t ENTER DOCTOR DETAILS \n \n");
				System.out.print(" \n \t \t ENTER DOCTOR ID: ");
				did = scan.nextInt();

				System.out.print("  \n \t \t ENTER NAME: ");
				name = scan.next();
				System.out.print("  \n \t \t ENTER Age: ");
				age = scan.nextInt();
				System.out.print(" \n \t \t ENTER City:");
				city = scan.next();
				System.out.print("\n \t \t ENTER Phone: ");
				phone= scan.nextLong();

				// Calling Setter Method of DOCTOR CLASS
				Doctor dctr = new Doctor();
				dctr.setDID(did);
				dctr.setName(name);
				dctr.setAge(age);
				dctr.setCity(city);
				dctr.setPhone(phone);



		// add city in doctor city arrayList

		doctorcity.add(city);
				// Add Patinet in arraylist

				doctor.add(dctr);
				// Last Element

							Doctor lastElement = new Doctor();
							lastElement.setDID(000);
							lastElement.setAge(000);
							lastElement.setName("aaaa");
							lastElement.setCity("aaaa");
							lastElement.setPhone(0000);

			doctor.add(lastElement);

				System.out.print(" \n \n \t \t Registration Sucessfull...  \n \n");

				// Updating current Doctor

							 currentDoctor = new Doctor();
							 currentDoctor.setDID(did);
							currentDoctor.setName(name);
							currentDoctor.setAge(age);
							currentDoctor.setCity(city);
				 currentDoctor.setPhone(phone);

				doctorMainMenu();
		}


		// Doctor Main Menu
				public static void doctorMainMenu()
				{
					System.out.print(" \n \n \t \t ......WELCOME TO DOCTOR MAIN MENU ........  \n \n");


					Scanner scan = new Scanner(System.in);



					 				// direct book
					 				// select doctor city wise
					 				// select doctor from doctor list
					 			System.out.print(" \n \n \t \t Enter your choice... ");
					 			System.out.print(" \n  \t \t 1. Show Appointments");
					 			System.out.print(" \n  \t \t 2. Select Doctor (City Wise)");
					 			System.out.print(" \n  \t \t 3. Select Doctor from Doctor List");
					 			System.out.print(" \n  \t \t 4. Log out");

					 			int input = scan.nextInt();

					 			switch(input)
					 			{
									case 1: showAppointmentsDoctor();
											break;
									case 2: // selectCityDoctor();
											break;
									case 3: //showDoctor();
											break;
									case 4: commonMainMenu();
											break;
									default : System.out.print(" \n  \t \t Invalid Input");
									break;
			}

				}

				public static void showAppointmentsDoctor()
				{

					Iterator itr = appointments.iterator();

					while(itr.hasNext())
					{
						Appointments apt = (Appointments)itr.next();
						int count=0;

						if(apt.dctr.getDID() == currentDoctor.getDID())
						{    count++;
							System.out.print(" \n  \t \t Patinet "+count);
							System.out.print(" \n  \t \t Patinet ID:  "+apt.ptn.getPID());
							System.out.print(" \n  \t \t Patinet Name:  "+apt.ptn.getName());
							System.out.print(" \n  \t \t Patinet Age:  "+apt.ptn.getAge());
							System.out.print(" \n  \t \t Patinet City:  "+apt.ptn.getCity());
							System.out.print(" \n  \t \t Patinet Phone No. :  "+apt.ptn.getPhone());

						}






					}

				}


}