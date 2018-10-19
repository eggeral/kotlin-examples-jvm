package ese.kotlin.basics.ao_java_interop;

import java.util.ArrayList;
import java.util.List;

public class JavaFlightDb {

    private List<String> flightNumbers = new ArrayList<>();

    public void addFlightNumber(String flightNumber) {
        flightNumbers.add(flightNumber);
    }

    public List<String> getFlightNumbers() {
        return flightNumbers;
    }
}
