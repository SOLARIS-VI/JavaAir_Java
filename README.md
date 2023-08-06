# Airline Management System

## Introduction

This project models a system for the world-renowned airline JavaAir, allowing them to manage their flights. The goal is to practice different programming concepts, including Test-Driven Development (TDD). Please note that JavaAir is a fictional airline, and this exercise is purely for educational purposes.

## Assumptions

1. Each passenger bag weighs the same.
2. Planes reserve half of their total weight for passenger bags.
3. The weight of bags per person is the weight reserved for passenger bags divided by the capacity.
4. Passengers exist for a single flight only.

## MVP (Minimum Viable Product)

### Passenger

A `Passenger` has:

- Name
- Number of bags

### CabinCrewMember

A `CabinCrewMember` has:

- Name
- Rank (e.g., Captain/First Officer/Purser, Flight Attendant)

### Pilot

A `Pilot` has:

- Name
- Rank
- Pilot license number (stored as a String)

### Plane

A `Plane` has:

- Plane type (e.g., BOEING747) which stores capacity and total weight.

### Flight

A `Flight` has:

- At least one Pilot
- A list of CabinCrewMembers (number can vary)
- An empty list of booked Passengers
- A Plane
- Flight number (e.g., "FR756")
- Destination (e.g., GLA, EDI)
- Departure airport (e.g., GLA, EDI)
- Departure time (stored as a String)

The `Flight` should be able to:

- Return the number of available seats.
- Book a passenger if there are remaining seats.

The `Pilot` should be able to:

- Fly the plane (a simple method that returns a String is sufficient).

The `CabinCrewMember` should be able to:

- Relay messages to the passengers (a simple method that returns a String is sufficient).

## Extensions

### FlightManager

Create a `FlightManager` which can:

- Calculate how much baggage weight should be reserved for each passenger for a flight.
- Calculate how much baggage weight is booked by passengers of a flight.
- Calculate how much overall weight reserved for baggage remains for a flight.

## More Extensions

1. Refactor the Flight's departure time to use the Date class (HINT: Look into Type Migration in IntelliJ to refactor faster).
2. Add a 'flight' property to the `Passenger` which is assigned when a passenger is added to a flight.
3. Add a 'seat number' property to the `Passenger` as an integer. Set it to a random number assigned when a Passenger is booked on a flight.
4. Make sure the flight doesn't double book the same seat number to more than one passenger.

## PDA Reminder

As part of this homework, you are required to show snippets:

### Encapsulation

An example of encapsulation in a program.

### Testing

Demonstrate testing in your program by showing snippets:

1. Example of test code.
2. The test code failing to pass.
3. Example of the test code once errors have been corrected.
4. The test code passing.
