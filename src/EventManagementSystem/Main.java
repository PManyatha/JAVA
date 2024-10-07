package EventManagementSystem;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of events
        ArrayList<Event> events = new ArrayList<>();

        // Add events with title, date, start time, and end time
        events.add(new Event("Conference", LocalDate.of(2023, 6, 15), LocalTime.of(9, 0), LocalTime.of(12, 0), "New York"));
        events.add(new Event("Birthday", LocalDate.of(2023, 5, 21), LocalTime.of(10, 0), LocalTime.of(13, 0), "Los Angeles"));
        events.add(new Event("Meeting", LocalDate.of(2023, 7, 30), LocalTime.of(11, 0), LocalTime.of(14, 0), "India"));
        events.add(new Event("Event", LocalDate.of(2023, 6, 1), LocalTime.of(8, 0), LocalTime.of(10, 0), "San Francisco"));


        EventSorter.selectionSortByLocation(events);

        System.out.println("\n Events after sorting using Selection sort");
        for (Event event : events) {
            System.out.println(event);
        }

        EventSorter.insertionSortByName(events);

        System.out.println("\n Events after sorting using Insertion sort");
        for (Event event : events) {
            System.out.println(event);
        }

        EventSorter.mergeSortByDate(events);

        System.out.println("\n Events after sorting using Merge sort");
        for (Event event : events) {
            System.out.println(event);
        }

        EventSorter.quickSortByName(events);

        System.out.println("\n Events after sorting using Quick sort");
        for (Event event : events) {
            System.out.println(event);
        }

        System.out.println("\n " + EventPlanner.findEventByDate(events, LocalDate.of(2023, 5, 21)));
        System.out.println("\n " + EventPlanner.findEventByName(events, "Conference"));

        EventPlanner planner = new EventPlanner();

        Event event1 = new Event("Birthday party", LocalDate.of(2023, 6, 10), LocalTime.of(9, 0), LocalTime.of(12, 0), "John's House");
        Event event2 = new Event("Wedding", LocalDate.of(2023, 9, 20), LocalTime.of(9, 0), LocalTime.of(12, 0), "Ocean View");



        EventPlanner eventPlanner = new EventPlanner();
        boolean exit = false;
        while (!exit) {
            EventPlanner.displayMenu();
            int choice = EventPlanner.getUserInput();

            switch (choice) {
                case 1:
                    // Call the method responsible for adding events
                    planner.addEvent(event1);
                    planner.addEvent(event2);

                    System.out.println(planner.getEvents());
                    break;
                case 2:
                    // Call the method responsible for updating events
                    Event updatedEvent = new Event("Birthday party", LocalDate.of(2023, 6, 11), LocalTime.of(9, 0), LocalTime.of(12, 0), "John's House");
                    planner.updateEvent(0, updatedEvent);

                    System.out.println(planner.getEvents());
                    break;
                case 3:
                    // Call the method responsible for deleting events
                    planner.deleteEvent(0);

                    System.out.println(planner.getEvents());
                    break;
                case 4:
                    // Call the method responsible for searching events
                    ArrayList<Event> searchResults = planner.searchEvents("Ocean View", "location");

                    System.out.println(searchResults);
                    break;
                case 5:
                    // Call the method responsible for sorting events
                    // Print the events before sorting
                    System.out.println("Events before sorting:");
                    for (Event event : events) {
                        System.out.println(event);
                    }

                    // Sort events by date using bubbleSortByDate method
                    EventSorter.bubbleSortByDate(events);

                    // Print the events after sorting
                    System.out.println("\nEvents after sorting Using Bubble Sort:");
                    for (Event event : events) {
                        System.out.println(event);
                    }

                    break;
                case 6:
                    // Call the method responsible for comparing algorithms
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;

            }
        }
    }
}

