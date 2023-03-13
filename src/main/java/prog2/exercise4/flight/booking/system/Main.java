package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        String sdepart = "2023-03-12";
        LocalDate depart = LocalDate.parse(sdepart);
        String sreturn = "2023-03-14";
        LocalDate returnDate = LocalDate.parse(sreturn);


        FlightBooking fb = new FlightBooking(null, null, null, 0, 0);
        fb.setTripSource("1");
        fb.setTripDestination("1", "2");
        fb.setTripType("1");
        fb.setBookingClass("1");
        String expectedTicketNumber = "11FASDFDOM";
        String expectedSubstring1 = expectedTicketNumber.substring(0,2);
        String expectedSubstring2 = expectedTicketNumber.substring(7, 9);
        String ticketNumber = fb.getTicketNumber();



        System.out.println(ticketNumber);
    }
}


        /*System.out.println("Dear " +fb.getPassengerFullName()+". Thank you for booking your flight with " +
                fb.getFlightCompany() + ". Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + fb.getTicketNumber() + "\n" +
                "From " + fb.getTripSource() + " to " + fb.getTripDestination() + "\n" +
                "Date of departure: " + fb.getDepartureDate() + "\n" +
                "Date of return: " + fb.getReturnDate() + "\n" +
                "Total passengers: " + fb.getTotalPassengers() + "\n" +
                "Total ticket price in Euros: " + fb.getTotalTicketPrice());
        
    }



}*/
