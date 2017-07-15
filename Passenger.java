//Assignment 8.4
	//Write a Program to reserve tickets in an online bus reservation system using synchronization. 
	//Program must have option for single thread to book multiple seats. For each seat, the program must
	//take a passenger name. Program should print number of seats booked at the end as report.


package assignment_8_4;

class Passenger extends Thread {

	Reservation reserve;
	int requestedSeats;
	String passengerName;

	public Passenger(Reservation reserve, int requestedSeats, String passengerName) {
		this.reserve = reserve;
		this.requestedSeats = requestedSeats;
	}

	@Override
	// Invoke the reservation method
	public void run() // LINE C
	{
		reserve.reserveSeat(requestedSeats);
	}

}
