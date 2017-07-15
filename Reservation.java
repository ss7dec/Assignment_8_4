//Assignment 8.4
	//Write a Program to reserve tickets in an online bus reservation system using synchronization. 
	//Program must have option for single thread to book multiple seats. For each seat, the program must
	//take a passenger name. Program should print number of seats booked at the end as report.


package assignment_8_4;

class Reservation {

	static int availableSeats = 14;

	// synchronized reserveSeat method to book tickets.
	synchronized void reserveSeat(int requestedSeats) {

		System.out.println("Available Seats : " + availableSeats + "\n\nRequested  Seats : " + requestedSeats);
		//Book tickets if available seats are  greater that requested seats.
		if (availableSeats >= requestedSeats) {
			System.out.println("Seats are available on first-cum-first-serve basis. \nKindly reserve your seats now");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
			System.out.println(requestedSeats + " seats are booked.");
			availableSeats = availableSeats - requestedSeats;
		} else {
			System.out.println("Bookings declined due to Non-Availability of Seats. \nRegret the inconvenience caused.\n"
					            + "Kindly select another date for your journey.  ");
			
		}

		System.out.println("*************************************************");
	}
}
