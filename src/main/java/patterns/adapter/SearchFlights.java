package patterns.adapter;

import patterns.adapter.gateway.H2HSearchGateway;
import patterns.adapter.gateway.SearchGateway;
import patterns.adapter.type.H2HType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchFlights {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter your preferred flight service provider");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        H2HType type = H2HType.valueOf(input.toUpperCase());

        SearchGateway searchGateway = new H2HSearchGateway(type);
        searchGateway.populateFlightResults();
        for (Flight flight : searchGateway.getFlightResults()) {
            System.out.println(flight.getType() + " " + flight.getName());
        }
    }
}
