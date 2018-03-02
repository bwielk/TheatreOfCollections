package theatre;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args){
		Theatre theatre = new Theatre("Cameo", 2, 10);
		//Array with exactly the same data like the one in the instance of Theatre.theatre
		ArrayList<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
		printList(seatCopy);
		
		System.out.println("/////////////////////REVERSED////////////////////////");
		Collections.reverse(seatCopy);
		printList(seatCopy);
		
		System.out.println("/////////////////////SHUFFLED////////////////////////");
		Collections.shuffle(seatCopy);
		printList(seatCopy);
		/*
		theatre.getSeats();
		if(theatre.reserveSeat("B05")){
			System.out.println("You've reserved your seat");
		}else{
			System.out.println("The seat is already reserved by someone else");
		}
		
		if(theatre.reserveSeat("B05")){
			System.out.println("You've reserved your seat");
		}else{
			System.out.println("The seat is already reserved by someone else");
		}
		*/
	}
	public static void printList(Collection<Theatre.Seat> list){
		for(Theatre.Seat seat : list){
			System.out.println(" " + seat.getSeatNumber());
		}
	}
}
