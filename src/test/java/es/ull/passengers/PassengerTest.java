package es.ull.passengers;

import es.ull.flights.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    private Passenger juan;
    private Passenger alberto;
    private Flight tfn_lpa;
    private Flight mad_bcn;

    @BeforeEach
    void setUp(){
        juan = new Passenger("1234","Juan","ES");
        juan.setFlight(tfn_lpa);
        alberto = new Passenger("5678","Alberto","CO");
        alberto.setFlight(mad_bcn);
    }
    @Test
    @DisplayName("Check constructors and getters")
    public void testGetters(){
        assertAll("Check information is okey",
                () -> assertEquals("1234", juan.getIdentifier()),
                () -> assertEquals("Juan", juan.getName()),
                () -> assertEquals("ES", juan.getCountryCode()),
                () -> assertEquals(tfn_lpa, juan.getFlight()),
                () -> assertEquals("5678", alberto.getIdentifier()),
                () -> assertEquals("Alberto", alberto.getName()),
                () -> assertEquals("CO", alberto.getCountryCode())
        );
    }
}