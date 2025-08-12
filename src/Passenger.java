class Passenger{
    String name;
    String bookingId;
    int age;
    int seats;
    public Passenger(String bookingId,String name,int age,int seats){
        this.bookingId=bookingId;
        this.name = name;
        this.age=age;
        this.seats=seats;
    }
    public String getBookingId(){
        return bookingId;
    }
    public int getSeatsbooked(){
        return seats;
    }
    public String toString(){
        return "NAME: "+name+", AGE:"+age+", BOOKING ID"+bookingId+",SEATS BOOKED:"+seats;
    }

}