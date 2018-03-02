package theatre;

import java.awt.*;
import java.util.ArrayList;

public class Theatre {
	
	private final String theatreName;
	private List seats = new ArrayList<Seat>();
	
	public Theatre(String theatreName, int numRows, int seatsPerRow){
		this.theatreName = theatreName;
		int lastRow = 'A' + (numRows -1);
	}

}
