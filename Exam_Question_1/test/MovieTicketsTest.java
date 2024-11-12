/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTicketsTest {

    @Test
    void CalculateTotalSales_ReturnsExpectedTotalSales() {
        MovieTickets analyzer = new MovieTickets();
        int[] sales = {3000, 1500, 1700}; 
        int expectedTotal = 6200; 

        int actualTotal = analyzer.TotalMovieSales(sales);

        assertEquals(expectedTotal, actualTotal, "TotalMovieSales will be printed");
    }
// Top movie test
    @Test
    void TopMovieSales_ReturnsTopMovie() {
        MovieTickets analyzer = new MovieTickets();
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300}; 
        String expectedTopMovie = "Oppenheimer"; 

        String actualTopMovie = analyzer.TopMovie(movies, totalSales);

        assertEquals(expectedTopMovie, actualTopMovie, "TopMovie will be printed.");
    }
}