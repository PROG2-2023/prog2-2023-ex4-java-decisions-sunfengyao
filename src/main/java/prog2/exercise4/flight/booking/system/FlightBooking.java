package prog2.exercise4.flight.booking.system;

import java.lang.ProcessBuilder.Redirect.Type;
import java.time.LocalDate;


public class FlightBooking {
    private String flightCompany = "Flights-of-Fancy";  //恒定航班
    private String flightID;     //飞机号
    private String passengerFullName;     //乘客姓名
    private TripSource tripSource ;    //飞机出发站
    private SourceAirport sourceAirport ;     //出发机场
    private TripDestination tripDestination ;  //落地地点
    private DestinationAirport destinationAirport ;  //落地机场
    private LocalDate departureDate;  //出发日期
    private LocalDate returnDate;   //返回日期
    private int childPassengers;   //儿童数量
    private int adultPassengers;   //成人数量
    private int totalPassengers;   //总人数
    public double departingTicketPrice;  //出发机费
    public double returnTicketPrice;     //返程机费
    private double totalTicketPrice;     //总票价
    private String ticketNumber;         //票号
    public BookingClass bookingClass;         //舱位
    private TripType tripType;


    public FlightBooking(String passengerFullName, LocalDate departureDate, LocalDate returnDate, int childPassengers, int adultPassengers) {
        this.passengerFullName = passengerFullName;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
    }

    enum BookingClass{
        FIRST,BUSINESS,ECONOMY
    }

    enum TripType{
        ONE_WAY,RETURN
    }

    enum TripSource{
         NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }

    enum SourceAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport, HelsinkiAirport, ParisCharlesdeGaulleAirport
    }

    enum TripDestination{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }

    enum DestinationAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport, HelsinkiAirport, ParisCharlesdeGaulleAirport
    }

    public String getFlightCompany() {
        return flightCompany;
    }
    
    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }
    
    public String getFlightID() {
        return flightID;
    }
    
    public void setPassengerFullName(String PassengerFullName) {
        this.passengerFullName = PassengerFullName;
    }
    
    public String getPassengerFullName() {
        return passengerFullName;
    }
    
    public String getTripSource() {
        return tripSource;
    }
    
    public String getTripDestination() {
        return tripDestination;
    }
    
    public LocalDate setDepartingDate(LocalDate departureDate) {
        return this.departureDate = departureDate;
    }
    
    public LocalDate getDepartingDate() {
        return departureDate;
    }
    
    public LocalDate setReturnDate(LocalDate returnDate) {
        return this.returnDate = returnDate;
    }
    
    public LocalDate getReturnDate() {
        return returnDate;
    }
    
    public int getChildrenPassengers() {
        return childPassengers;
    }
    
    public int getAdultPassengers() {
        return adultPassengers;
    }
    
    public void setTotalPassengers(int childPassengers, int adultPassengers) {
        this.totalPassengers = childPassengers + adultPassengers;
    }
    
    public int getTotalPassengers() {
        return totalPassengers;
    }
    
    public LocalDate getdepartingDate() {
        return departureDate;
    }
    
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    
    public String getTicketNumber() {
        return ticketNumber;
    }
    
    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }
    
    public void settotalTicketPrice(int departingTicketPrice, int returnTicketPrice) {
        this.totalTicketPrice = departingTicketPrice + returnTicketPrice;
    }

    public BookingClass getBookingClass() {
        return this.bookingClass;
    }
   
    public void setBookingClass(String a) {
        if(a.equals("1")){
            this.bookingClass = BookingClass.FIRST;
        }
        if(a.equals("2")){
            this.bookingClass = BookingClass.BUSINESS;
        }
        if(a.equals("3")){
            this.bookingClass = BookingClass.ECONOMY;
        }
    }
    public TripType getTripType(){
        return this.tripType;
    }
    
    public void setTripType(String t){
        if(t.equals("1")){
            this.tripType = TripType.ONE_WAY;
        }
        if(t.equals("2")){
            this.tripType = TripType.RETURN;
        }
    }
    






    @Override
    public String toString() {
        return "Dear" + passengerFullName + ". Thank you for booking your flight with " + flightCompany +".Following are the details of your booking and the trip:" + "\n" +
                "TicketNumber:" + ticketNumber + "\n" +
                "From" + tripSource + "to" + tripDestination + "\n" +
                "Date of departure: " + departureDate + "\n" +
                "Date of return: " + returnDate + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " + totalTicketPrice;    
    

    public TripSource getTripsource(){
        return this.tripSource;
    }
                
    public void setTripSource (String r){
        if(r.equals("1")){
            this.tripSource = TripSource.NANJING;
         }
        if(r.equals("2")){
            this.tripSource = TripSource.BEIJING;
        }
        if(r.equals("3")){
            this.tripSource = TripSource.OULU;
        }
        if(r.equals("4")){
            this.tripSource = TripSource.HELSINKI;
        }
    }

    public TripDestination getTripDestination();{
        return this.tripDestination;
    }
                
    public void setTripDestination(String s){
        if(s.equals("1")){
            this.tripDestination = TripDestination.NANJING;
         }
        if(s.equals("2")){
            this.tripDestination = TripDestination.BEIJING;
        }
        if(s.equals("3")){
            this.tripDestination = TripDestination.OULU;
        }
        if(s.equals("4")){
            this.tripDestination = TripDestination.HELSINKI;
        }
    }

    public LocalDate getDepartureDate(){
        return this.departureDate;
    }
    public void  setDepartureDate(LocalDate 1 ){
        this.departureDate = 1;
    }
    public LocalDate getReturnDate(){
        return this.returnDate;
    }
    public void setReturnDate(LocalDate returnDate){
        int result = returnDate.compareTo(departureDate);
        if(result>=2){
            this.returnDate = returnDate;
        }else if(result == 1){
            this.returnDate = returnDate.plusDays(1);
        }else if(result == 0){
            this.returnDate = returnDate.plusDays(2);
        }
    }
                
   


    }

    public void setTripSource(String trip) {
    }

    public void setTripDestination(String des) {
    }
}
