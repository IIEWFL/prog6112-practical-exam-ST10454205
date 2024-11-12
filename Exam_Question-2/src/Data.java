/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */

public class Data {
    private final String Movie;
    private final int NumberOfTickets;
    private int TicketPrice;

    public Data(String Movie, int NumberOfTickets, int TicketPrice) {
        this.Movie = Movie;
        this.NumberOfTickets = NumberOfTickets;
        this.TicketPrice = TicketPrice;

    }

    
    
    public String getMovie() {
        return Movie;
    }

    public int NumberOfTickets() {
        return NumberOfTickets;
    }

    public void setNumberOfTickets(int NumberOfTickets) {
        this.NumberOfTickets = NumberOfTickets;
    }

    public int getTicketPrice() {
        return TicketPrice;
    }

    
}
