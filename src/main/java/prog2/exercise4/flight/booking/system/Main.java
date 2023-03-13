package prog2.exercise4.flight.booking.system;



import java.util.Scanner;
import java.time.LocalDate;


/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your fallname :");
        String passengerFullName =input.nextLine();
        input.close();


        String sdepart = "2023-03-08";
        LocalDate depart = LocalDate.parse(sdepart);
        String sreturn = "2023-03-15";
        LocalDate returnDate = LocalDate.parse(sreturn);


        FlightBooking fb = new FlightBooking(passengerFullName,null, null, 0, 0);
        fb.setFlightID("FOF"+"0345"+"IN");
        fb.setTicketNumber("110"+"A");
        fb.setPassengerFullName(passengerFullName);
        fb.setDepartingDate(depart);
        fb.setReturnDate(returnDate);
        fb.setTotalPassengers( 0, 3);
        fb.settotalTicketPrice(1234, 2121);
       

        String flightCompany = fb.getFlightCompany();
        LocalDate departureDate = fb.getDepartingDate();
        LocalDate returnDate1 = fb.getReturnDate();
        String tripSource = fb.getTripSource();
        String tripDestination = fb.getTripDestination();
        String ticketNumber = fb.getTicketNumber();
        int totalPassengers = fb.getTotalPassengers();
        double totalTicketPrice = fb.getTotalTicketPrice();

        System.out.println(
            "Dear" + " " + passengerFullName + ". Thank you for booking your flight with " + flightCompany +".Following are the details of your booking and the trip:" + "\n" +
                "TicketNumber:" + ticketNumber + "\n" +
                "From" + tripSource + "to" + tripDestination + "\n" +
                "Date of departure: " + departureDate + "\n" +
                "Date of return: " + returnDate1 + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " + totalTicketPrice );
    


    Scanner bc = new Scanner(System.in);
    System.out.println("Please select the booking class: 1. Fitst\n2. Bussiness\n3. Economy\n:");
    int bookingClass =bc.nextInt();
    String BookingClass = new String();
        
               
    switch(BookingClass){
        case "1" :BookingClass = "1" ; fb.setBookingClass(BookingClass);break;     
    }
    switch(BookingClass){
        case "2" :BookingClass = "2" ; fb.setBookingClass(BookingClass);break;     
    }
    switch(BookingClass){
        case "3" :BookingClass = "3" ; fb.setBookingClass(BookingClass);break;     
    }
    bc.close();
        
    Scanner b = new Scanner(System.in);
    System.out.println("Please select : 1. One Way\n2. Return");
    int c =b.nextInt();
    String y = new String();

    switch(y){
        case "1" :y = "1" ; fb.setTripType(y);break;     
    }
    switch(y){
        case "2" :y = "2" ; fb.setTripType(y);break;     
    }
    b.close();

    Scanner tr = new Scanner(System.in);
    System.out.println("请选择目的地: 1. Nanjing;\n2. Beijing\n3. Oulu\n4. Helsinki");
    int tri =b.nextInt();
    String trip = new String();

    switch(trip){
        case "1" :trip = "1" ; fb.setTripSource(trip);break;     
    }
    switch(trip){
        case "2" :trip = "2" ; fb.setTripSource(trip);break;     
    }
    switch(trip){
        case "3" :trip = "3" ; fb.setTripSource(trip);break;     
    }
    switch(trip){
        case "4" :trip = "4" ; fb.setTripSource(trip);break;     
    }
    tr.close();

    Scanner d = new Scanner(System.in);
    System.out.println("请选择目的地: 1. Nanjing;\n2. Beijing\n3. Oulu\n4. Helsinki");
    int de=b.nextInt();
    String des = new String();

    switch(des){
        case "1" :des = "1" ; fb.setTripDestination(des);break;     
    }
    switch(des){
        case "2" :des = "2" ; fb.setTripDestination(des);break;     
    }
    switch(des){
        case "3" :des = "3" ; fb.setTripDestination(des);break;     
    }
    switch(des){
        case "4" :des = "4" ; fb.setTripDestination(des);break;     
    }
    d.close();

    Scanner q =new Scanner(System.in);
    System.out.println("出发时间: ");
    int qw=q.nextInt();
    LocalDate qwe = LocalDate.parse(departingDate);
    fb.setDepartureDate(qwe);
    fb.getDepartureDate();

    LocalDate detePara = LocalDate.parse("2023-3-13");
    System.out.println("String => LocalDate :"+ dateParam);

    Scanner j =new Scanner(System.in);
    System.out.println("返程时间: ");
    int jk=j.nextInt();
    LocalDate jkl = LocalDate.parse(returnDate);
    fb.setReturnDate(jkl);
    fb.getReturnDate();



    }
}
