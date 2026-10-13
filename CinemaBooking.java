class CinemaBooking {
    String customerName, movieName;
    double ticketPrice;
    int tickets;

    // Default constructor
    CinemaBooking() {
        customerName = "Arjun";
        movieName = "Avatar";
        ticketPrice = 200;
        tickets = 2;
    }

    // Parameterized constructor
    CinemaBooking(String c, String m, double p, int t) {
        customerName = c;
        movieName = m;
        ticketPrice = p;
        tickets = t;
    }

    // Method overloading
    void bookTickets(int t) {
        tickets = t;
        display();
    }

    void bookTickets(String c, int t) {
        customerName = c;
        tickets = t;
        display();
    }

    // Display booking summary
    void display() {
        System.out.println("\nCustomer Name : " + customerName.toUpperCase());
        System.out.println("Movie Name : " + movieName.toUpperCase());

        if (tickets <= 0) {
            System.out.println("Booking Status : Invalid Tickets");
            return;
        }

        double total = ticketPrice * tickets;
        double discount = tickets >= 5 ? total * 0.10 : 0;
        double finalAmount = total - discount;

        System.out.printf("Ticket Price : Rs. %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Booking Status : Booking Successful");
        System.out.printf("Total Amount : Rs. %.2f%n", total);
        System.out.printf("Discount : Rs. %.2f%n", discount);
        System.out.printf("Final Amount : Rs. %.2f%n", finalAmount);
    }

    public static void main(String[] args) {
        System.out.println("========== CINEMA TICKET BOOKING ==========");

        CinemaBooking b1 =
            new CinemaBooking("Sneha", "Avatar", 200, 5);
        b1.display();

        CinemaBooking b2 = new CinemaBooking();
        b2.display();

        // Compare customer names
        if (b1.customerName.equalsIgnoreCase(b2.customerName))
            System.out.println("Same customer");
        else
            System.out.println("Different customers");

        // Call overloaded method
        b1.bookTickets(3);
    }
}