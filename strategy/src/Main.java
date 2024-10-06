import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    // The main method handles user input, processes it, and outputs the corresponding route information.
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String origin = "Montreal";
            String destination = "New York";
            System.out.println(origin + " -> " + destination);
            System.out.print("Route preference [1] walking, [2] cycling, [3] driving, [4] transit, [5] flights: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 5) {
                    RoutePreference routePreference = RoutePreference.fromInt(choice);
                    Route route = null;

                    switch (routePreference) {
                        case WALKING:
                            findFastestRoute();
                            route = getWalkingRoute(origin, destination);
                            break;
                        case CYCLING:
                            findFastestRoute();
                            route = getCyclingRoute(origin, destination);
                            break;
                        case DRIVING:
                            findFastestRoute();
                            route = getDrivingRoute(origin, destination);
                            break;
                        case TRANSIT:
                            findFastestRoute();
                            route = getTransitRoute(origin, destination);
                            break;
                        case FLIGHT:
                            findFastestRoute();
                            route = getFlightRoute(origin, destination);
                            break;
                    }
                    System.out.println(route); // Will output the result of route.toString()
                } else {
                    System.out.println("INVALID CHOICE!!! Press any key to continue");
                }
            } catch (NumberFormatException e) {
                System.out.println("INVALID CHOICE!!! Press any key to continue");
            }
        }
    }

    static Route getWalkingRoute(String origin, String destination) {
        List<String> directions = new ArrayList<>();
        directions.add(origin);
        directions.add("Head northeast on Boulevard René-Lévesque O S/Bd René-Lévesque toward Blvd Robert-Bourassa");
        directions.add("Turn right onto Côte du Beaver Hall");
        directions.add("Continue onto Rue du Square-Victoria");
        directions.add("Turn left onto Rue Saint-Jacques");
        directions.add("Turn right onto Pl. d'Armes/Rue Saint-Sulpice");
        directions.add("......");
        directions.add("Turn right onto QC-221 S Entering New York");
        directions.add("....");
        directions.add("Turn left onto City Hall Pk Path");
        directions.add(destination);

        return new Route("via US-9 N", origin, destination, TimeUnit.HOURS.toMinutes(123), 601, RoutePreference.WALKING, directions);
    }

    static Route getCyclingRoute(String origin, String destination) {
        List<String> directions = new ArrayList<>();
        directions.add(origin);
        directions.add("Head southeast on Blvd Robert-Bourassa toward Boulevard René-Lévesque O/Bd René-Lévesque");
        directions.add("Turn left onto Boulevard René-Lévesque O/Bd René-Lévesque");
        directions.add("Continue onto Rue du Square-Victoria");
        directions.add("......");
        directions.add("Turn left onto NY-100 S/NY-133 W/Saw Mill River Rd");
        directions.add("....");
        directions.add("Slight left toward 12th Ave/Empire State Trl/Hudson River Greenway");
        directions.add("Continue onto City Hall Pk Path");
        directions.add(destination);

        return new Route("via Empire State Trl", origin, destination, TimeUnit.HOURS.toMinutes(37), 696, RoutePreference.CYCLING, directions);
    }

    static Route getDrivingRoute(String origin, String destination) {
        List<String> directions = new ArrayList<>();
        directions.add(origin);
        directions.add("Head southeast on Blvd Robert-Bourassa toward Boulevard René-Lévesque O/Bd René-Lévesque [3 min.] (1.1 km)");
        directions.add("Follow A 15 S, I-87 S and NJ-17 S to Holland Tunnel in Jersey City, United States [5 hr 43 min.] (590 km)");
        directions.add("Continue on Holland Tunnel to your destination in Manhattan, New York [10 min.] (4.6 km)");
        directions.add(destination);

        return new Route("via l-87 S", origin, destination, TimeUnit.HOURS.toMinutes(6) + 15, 596, RoutePreference.DRIVING, directions);
    }

    static Route getTransitRoute(String origin, String destination) {
        List<String> directions = new ArrayList<>();
        directions.add(origin);
        directions.add("Montreal Greyhound");
        directions.add("Port Authority Bus Terminal (9 hr 20 min)");
        directions.add(destination);

        return new Route("Greyhound", origin, destination, TimeUnit.HOURS.toMinutes(9) + 20, 598, RoutePreference.TRANSIT, directions);
    }

    static Route getFlightRoute(String origin, String destination) {
        List<String> directions = new ArrayList<>();
        directions.add(origin);
        directions.add("Montréal-Pierre Elliott Trudeau International Airport (YUL)");
        directions.add("John F. Kennedy International Airport (JFK)");
        directions.add(destination);

        return new Route("Montreal QC - NEW York, USA", origin, destination, TimeUnit.HOURS.toMinutes(1) + 20, 538, RoutePreference.FLIGHT, directions);
    }

    static void findFastestRoute() throws InterruptedException {

        System.out.print("Finding fastest route considering distance, weather, and safety");
        Thread.sleep(750);
        for (int i = 0; i < 10; i++) {
            Thread.sleep(350);
            System.out.print(".");
        }
    }
}

class Route {
    private String title;
    private String origin;
    private String destination;
    private long duration;
    private int distanceInKM;
    private RoutePreference routePreference;
    private List<String> directions;

    public Route(String title, String origin, String destination, long duration, int distanceInKM, RoutePreference routePreference, List<String> directions) {
        this.title = title;
        this.origin = origin;
        this.destination = destination;
        this.duration = duration;
        this.distanceInKM = distanceInKM;
        this.routePreference = routePreference;
        this.directions = directions;
    }

    @Override
    public String toString() {
        String formattedDuration = String.format("%d hr %d min", TimeUnit.MINUTES.toHours(duration), TimeUnit.MINUTES.toMinutes(duration) % 60);
        String formattedDistance = distanceInKM + " km";

        StringBuilder result = new StringBuilder(title + "\t [" + formattedDuration + "] (" + formattedDistance + ")\n");
        for (String direction : directions) {
            result.append("-").append(direction).append("\n");
        }

        return result.toString();
    }
}

enum RoutePreference {
    // In Java, an enum is a special type used to define a set of predefined constants.
    WALKING(1),
    CYCLING(2),
    DRIVING(3),
    TRANSIT(4),
    FLIGHT(5);

    // The field is final, meaning that once it is set (in the constructor), it cannot be changed.
    private final int value;

    RoutePreference(int value) {
        this.value = value;
    }

    public static RoutePreference fromInt(int value) {
        // In Java, enums automatically have a method called values(). This method returns an array of all the constants
        // defined in the enum.
        for (RoutePreference preference : RoutePreference.values()) {
            if (preference.value == value) {
                return preference;
            }
        }
        return null;
    }


}
