import java.util.*;
class Flight{
    private String flightname;
    private int availableseats;
    private int ticketprice;
    private int idcounter;
    private Map<String,Passenger> bookings;
    public Flight(String flightname){
        this.flightname=flightname;
        this.availableseats=50;
        this.ticketprice=5000;
        this.bookings= new HashMap<>();
        this.idcounter=1;
    }
    public String bookTicket(String name,int age,int  seats){
        if(seats<=availableseats){
            String bookingId = "F"+idcounter++;
            Passenger passenger = new Passenger(bookingId,name,age,seats);
            bookings.put(bookingId,passenger);
            availableseats-=seats;
            ticketprice+=200*seats;
            bookings.put(bookingId,passenger);
            return bookingId;
        }
        System.out.println("No available count of seats");
        return null;
    }
    public boolean cancelTickets(String bookingId){
        if(bookings.containsKey(bookingId)){
            Passenger passenger = bookings.get(bookingId);
            int seats = passenger.seats;
            availableseats+=seats;
            ticketprice-=200*seats;
            bookings.remove(bookingId);
            System.out.println("Booking cancelled successfully");
            return true;
        }
        System.out.println("Booking id not found");
        return false;
    }
    public void displayDetails() {
        System.out.println("Flight: " + flightname);
        System.out.println("Available Seats: " + availableseats);
        System.out.println("Current Ticket Price: ₹" + ticketprice);
    }

    public void printDetails() {
        System.out.println("Flight: " + flightname);
        System.out.println("Available Seats: " + availableseats);
        System.out.println("Current Ticket Price: ₹" + ticketprice);
        System.out.println("Passengers:");
        for (Passenger passenger : bookings.values()) {
            System.out.println(passenger);
        }
    }
}

