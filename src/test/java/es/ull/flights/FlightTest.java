package es.ull.flights;

import es.ull.passengers.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {

    private Flight tfn_lpa;
    private Flight mad_bcn;

    @BeforeEach
    void setUp(){
        tfn_lpa = new Flight("NT192",70);
        mad_bcn = new Flight("IB3002",189);
    }
    @Test
    @DisplayName("Check constructors and getters")
    public void testGetters(){
        assertAll("Check if information is okey",
                () -> assertEquals("NT192", tfn_lpa.getFlightNumber()),
                () -> assertEquals(70, tfn_lpa.getNumberOfSeats()),
                () -> assertEquals(0, tfn_lpa.getNumberOfPassengers()),
                () -> assertEquals("IB3002", mad_bcn.getFlightNumber()),
                () -> assertEquals(189, mad_bcn.getNumberOfSeats()),
                () -> assertEquals(0, mad_bcn.getNumberOfPassengers())
        );
    }
}