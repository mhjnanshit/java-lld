# Parking Lot System

## Objective

Design a Parking Lot System capable of parking and unparking vehicles
while allocating the nearest compatible parking slot.

---

## Functional Requirements

### Vehicle

A vehicle has:

- Vehicle ID
- Vehicle Type

Supported vehicle types:

- Motorcycle
- Car
- Truck

---

### Parking Slot

A parking slot has:

- Slot ID
- Slot Type
- Occupancy Status

Supported slot types:

- Small
- Medium
- Large

Compatibility Rules:

Vehicle Allowed Slot

---

Motorcycle Small, Medium, Large
Car Medium, Large
Truck Large

---

### Parking Floor

A parking floor:

- Contains a fixed number of parking slots.
- Organizes parking slots on that floor.

---

### Ticket

A ticket has:

- Ticket ID
- Vehicle
- Slot ID
- Status

Ticket Status:

- Active
- Inactive

Rules:

- Active means the vehicle is currently parked.
- Inactive means the vehicle has exited.
- Tickets are retained after checkout for history.

---

### Parking Lot

The parking lot:

- Contains multiple parking floors.
- Allocates parking slots.
- Issues parking tickets.
- Handles vehicle exit.

---

## Allocation Rules

- Search begins from the first floor.
- Allocate the nearest compatible available slot.
- If no compatible slot exists on a floor, continue to the next floor.
- If no compatible slot exists anywhere, parking fails.

---

## Exit Rules

- Vehicle exits using its parking ticket.
- Only an Active ticket can be checked out.
- Successful checkout:
  - Frees the allocated slot.
  - Marks the ticket as Inactive.

---

## Constraints

- Ignore payment.
- Ignore reservations.
- Ignore concurrency.
- One vehicle occupies exactly one slot.
- One slot accommodates only one vehicle.
- Parking slots are initialized when the parking lot is created.

---

## Deliverables

    04-Parking-Lot/
    │
    ├── requirements.md
    ├── design.md
    ├── uml.png (or uml.drawio)
    ├── src/
    └── README.md

---

## Assumptions

- Every vehicle has a unique identifier.
- Every slot has a unique identifier.
- Every ticket has a unique identifier.
- Multiple floors are supported.
- Ticket history is maintained.

---

## Out of Scope

- Payment
- Reservations
- Notifications
- Multiple parking lots
- Admin dashboard
