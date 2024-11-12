/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam_question_1;


class MovieTickets implements IMovieTickets {
    // Calculate total ticket sales
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int sales : movieTicketSales) {
            total += sales;
        }
        return total;
    }

    // Identify the top movie
    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        if (movies.length == 0 || totalSales.length == 0) {
            return "Not available";
        }

        int maxSales = totalSales[0];
        String topMovie = movies[0];
        
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topMovie = movies[i];
            }
        }
        return topMovie;
    }
}
public class MovieTicketsReport {
    public static void main(String[] args) {
        // Impleiment 1D an 2D arrays
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[][] sales = {
            {3000, 1500, 1700}, // Sales for Napoleon
            {3500, 1200, 1600}  // Sales for Oppenheimer
        };

        // Create MovieTicket object
        MovieTickets movieTickets = new MovieTickets();
        
// Methode to display  movie ticket information
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("--------------------------------------------------");
        System.out.println("               JAN     FEB     MAR");
        
        int[] totalSales = new int[movies.length];
        
        // Method to display and calculate sales totals
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%-11s", movies[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%8d", sales[i][j]);
            }
            totalSales[i] = movieTickets.TotalMovieSales(sales[i]);
            System.out.println();
        }
        
        // Method to print out total movie sales
        System.out.println("\n--------------------------------------------------");
        System.out.println("Total movie ticket sales for " + movies[0] + ": " + totalSales[0]);
        System.out.println("Total movie ticket sales for " + movies[1] + ": " + totalSales[1]);

        // Method to print the best preforming movie
        String topMovie = movieTickets.TopMovie(movies, totalSales);
        System.out.println("                                      ");
        System.out.println("Top performing movie: " + topMovie);
    }
}