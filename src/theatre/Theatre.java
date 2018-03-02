package theatre;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Theatre {
	
	private final String theatreName;
	public ArrayList<Seat> seats = new ArrayList<Seat>();
	
	public Theatre(String theatreName, int numRows, int seatsPerRow){
		this.theatreName = theatreName;
		int lastRow = 'A' + (numRows -1);
		for(char row = 'A'; row <= lastRow; row++){
			for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				((List<Seat>) seats).add(seat);
			}
		}
	}
	
	public String getTheatreName(){
		return theatreName;
	}
	
	public boolean reserveSeat(String seatNumber){
		Seat requestedSeat = new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		if(foundSeat >= 0){
			return ((ArrayList<Seat>) seats).get(foundSeat).reserve();
		}else{
			return false;
		}
	}
	
	public void getSeats() {
		for(Seat seat : seats){
			System.out.println(seat.getSeatNumber());
		}
	}
	
	public class Seat implements Comparable<Seat>{
		private final String seatNumber;
		private boolean reserved = false;
		
		public Seat(String seatNumber){
			this.seatNumber = seatNumber;
		}
		
		public boolean reserve(){
			if(!this.reserved){
				this.reserved = true;
				return true;
			}else{
				return false;
			}
		}
		
		public boolean cancel(){
			if(this.reserved){
				this.reserved = false;
				return true;
			}else{
				return false;
			}
		}
		
		public String getSeatNumber(){
			return this.seatNumber;
		}

		@Override
		public int compareTo(Seat seatToCompare) {
			return this.seatNumber.compareToIgnoreCase(seatToCompare.getSeatNumber());
		}
	}
}
