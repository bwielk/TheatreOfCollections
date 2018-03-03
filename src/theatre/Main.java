package theatre;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import theatre.Theatre.Seat;


public class Main {
	
	public static void main(String[] args){
		Theatre theatre = new Theatre("Cameo", 2, 10);
		//Array with exactly the same data like the one in the instance of Theatre.theatre
		//ArrayList<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
		ArrayList<Theatre.Seat> seatCopy = (ArrayList<Seat>) theatre.getArrayOfSeats();
		printList(seatCopy);
		
		if(theatre.reserveSeat("A05")){
			System.out.println("You've reserved your seat");
		}else{
			System.out.println("The seat is already reserved by someone else");
		}
		
		if(theatre.reserveSeat("B05")){
			System.out.println("You've reserved your seat");
		}else{
			System.out.println("The seat is already reserved by someone else");
		}
		
		
		
		/*
		System.out.println("/////////////////////REVERSED////////////////////////");
		Collections.reverse(seatCopy);
		printList(seatCopy);
		
		System.out.println("/////////////////////SHUFFLED////////////////////////");
		Collections.shuffle(seatCopy);
		printList(seatCopy);
		
		System.out.println("/////////////////////MIN AND MAX VALUE////////////////////////");
		Theatre.Seat minSeat = Collections.min(seatCopy);
		Theatre.Seat maxSeat = Collections.max(seatCopy);
		System.out.println("MIN SEAT : " + minSeat.getSeatNumber());
		System.out.println("MAX SEAT : " + maxSeat.getSeatNumber());
		
		System.out.println("/////////////////////SORTING////////////////////////");
		Collections.shuffle(seatCopy);
		printList(seatCopy);
		sortList(seatCopy);
		System.out.println("After SORTING");
		printList(seatCopy);
		
		System.out.println("/////////////////////DEEP COPIES////////////////////////");
		
		theatre.getSeats();
		*/
		
	}
	
	public static void printList(Collection<Theatre.Seat> list){
		for(Theatre.Seat seat : list){
			System.out.println(" " + seat.getSeatNumber() + " PRICE : " + seat.getSeatPrice());
		}
	}
	/*
	public static void sortList(ArrayList<Theatre.Seat> list){
		for(int i=0; i<list.size() -1; i++){
			for(int j=0; j<list.size(); j++){
				//ascending sorting
				if(list.get(i).compareTo(list.get(j)) <0){
				//descending sorting
			////if(list.get(i).compareTo(list.get(j)) >0){
					Collections.swap(list, i, j);
				}
			}
		}
	}
	*/
}
