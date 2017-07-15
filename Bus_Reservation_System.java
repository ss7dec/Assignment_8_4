//Assignment 8.4
	//Write a Program to reserve tickets in an online bus reservation system using synchronization. 
	//Program must have option for single thread to book multiple seats. For each seat, the program must
	//take a passenger name. Program should print number of seats booked at the end as report.


// Bus tickets reservation system will cater to booking requests of three passengers simultaneously. 
// The method reserveSeat of Reservation class is responsible for execution of the booking requests
// made by the concerned passenger and thereby the Bus Reservation System is made possible 
// due to Synchronization

//When the work of the first thread completes, then only second thread is allowed to work.
// This restriction is called as synchronization.
// We can use synchronized keyword with variables, methods and we even can make synchronized blocks like above.
// We will not be able to say that which Thread will execute first on synchronized block,
// But we can say that at a  particular time, Only one thread will be working on that block. 


package assignment_8_4;

public class Bus_Reservation_System {
	public static void main(String[] args) {
		Reservation reserve = new Reservation();
		// Invoke booking of first passenger
		Passenger passenger1 = new Passenger(reserve, 5, "Sameer");
		passenger1.start();

		// Invoke booking of second passenger simultaneously/same time
		Passenger passenger2 = new Passenger(reserve, 4, "Sharnali");
		passenger2.start();

		// Invoke booking of third passenger simultaneously/same time
		Passenger passenger3 = new Passenger(reserve, 6, "Sheena");
		passenger3.start();

	}

}
