package EventManagementSystem;

import java.time.LocalDate;
import java.util.*;
public class EventPlanner {

    ArrayList<Event> events;
    public EventPlanner() {
        events = new ArrayList<>();
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public static Event findEventByName(ArrayList<Event> events, String name) {
        for (Event event : events) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }

    public static Event findEventByDate(ArrayList<Event> events, LocalDate date) {
        ArrayList<Event> sortedEvents = EventSorter.mergeSortByDate(events);

        int lowerBound = 0;
        int upperBound = sortedEvents.size() - 1;

        while (lowerBound <= upperBound) {
            int middleIndex = (lowerBound + upperBound) / 2;
            Event middleEvent = sortedEvents.get(middleIndex);
            int comparison = middleEvent.getDate().compareTo(date);

            if (comparison == 0) {
                return middleEvent;
            } else if (comparison < 0) {
                lowerBound = middleIndex + 1;
            } else {
                upperBound = middleIndex - 1;
            }
        }

        return null; // If the event is not found
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void updateEvent(int index, Event updatedEvent) {
        if (index >= 0 && index < events.size()) {
            events.set(index, updatedEvent);
        } else {
            System.out.println("Index out of bounds!");
        }
    }

    public void deleteEvent(int index) {
        if (index >= 0 && index < events.size()) {
            events.remove(index);
        } else {
            System.out.println("Index out of bounds!");
        }
    }

    public ArrayList<Event> searchEvents(String searchTerm, String searchType) {
        ArrayList<Event> matchingEvents = new ArrayList<>();

        switch (searchType.toLowerCase()) {
            case "name":
                for (Event event : events) {
                    if (event.getName().equalsIgnoreCase(searchTerm)) {
                        matchingEvents.add(event);
                    }
                }
                break;
//            case "date":
//                LocalDate searchDate = LocalDate.parse(searchTerm);
//                int index = Collections.binarySearch(events, searchDate, Comparator.comparing(Event::getDate));
//                if (index >= 0) {
//                    matchingEvents.add(events.get(index));
//                }
//                break;
            case "location":
                for (Event event : events) {
                    if (event.getLocation().equalsIgnoreCase(searchTerm)) {
                        matchingEvents.add(event);
                    }
                }
                break;
            default:
                System.out.println("Invalid search type!");
        }

        return matchingEvents;
    }

    public static void displayMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1. Add an event");
        System.out.println("2. Update an event");
        System.out.println("3. Delete an event");
        System.out.println("4. Search for events");
        System.out.println("5. Sort events");
        System.out.println("6. Compare algorithms");
        System.out.println("7. Exit");
    }
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

}
