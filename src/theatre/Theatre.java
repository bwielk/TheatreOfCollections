package theatre;

import java.awt.*;
import java.util.ArrayList;

public class Theatre {
	
	private final String theatreName;
	private ArrayList<Seat> seats = new ArrayList<Seat>();
	
	public Theatre(String theatreName, int numRows, int seatsPerRow){
		this.theatreName = theatreName;
		int lastRow = 'A' + (numRows -1);
		for(char row = 'A'; row <= lastRow; row++){
			for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}
	
	public String getTheatreName(){
		return theatreName;
	}
	
	public boolean reserveSeat(String seatNumber){
		Seat requestedSeat = null;
		for(Seat seat : seats){
			if(seat.getSeatNumber().equals(seatNumber)){
				requestedSeat = seat;
				break;
			}
		}
		if(requestedSeat == null){
			return false;
		}else{
			return requestedSeat.reserve();
		}
	}
	
	private class Seat{
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
	}
}
