# Hospital Management System

## Objective

Design a Hospital Management System that allows patients to book
appointments with doctors while ensuring scheduling constraints are
maintained.

---

## Functional Requirements

### Doctor

A doctor has:

- Doctor ID
- Name
- Specialization

A doctor should support:

- Viewing details

---

### Patient

A patient has:

- Patient ID
- Name
- Age

A patient should support:

- Viewing details

---

### Appointment

An appointment has:

- Appointment ID
- Doctor
- Patient
- Date
- Start Time
- Status

Status can be one of:

- Scheduled
- Completed
- Cancelled

An appointment should support:

- Mark as completed
- Cancel appointment

---

### Hospital

The hospital maintains:

- Doctors
- Patients
- Appointments

It should support:

- Add doctor
- Add patient
- Book appointment
- Cancel appointment
- Complete appointment
- Display all doctors
- Display all patients
- Display all appointments
- Display appointments for a particular doctor
- Display appointments for a particular patient

---

## Scheduling Rules

- A doctor **can have multiple appointments in a single day**.
- Every appointment is assumed to last **30 minutes**.
- Two appointments conflict if they have:
  - The same doctor
  - The same date
  - The same start time
- If a doctor already has an appointment for that slot, booking must
  fail.

---

## Appointment Rules

- A cancelled appointment cannot be completed.
- A completed appointment cannot be cancelled.
- A patient must exist before booking.
- A doctor must exist before booking.

---

## Constraints

- Use Java.
- No inheritance.
- No interfaces.
- Use collections appropriately.
- No exception handling required.
- Use constructors wherever appropriate.
- Override `toString()` where useful.
- Keep fields private.

---

## Think Before Coding

Before implementing, decide:

1.  Should `Appointment` store references to `Doctor` and `Patient`, or
    just their IDs?
2.  Which class should validate appointment conflicts?
3.  How will you represent appointment status?
4.  Which collections are best suited for storing doctors, patients, and
    appointments?
5.  Which class owns the responsibility for booking and cancelling
    appointments?

---

## Deliverables

    03-Hospital-Management/
    │
    ├── Doctor.java
    ├── Patient.java
    ├── Appointment.java
    ├── Hospital.java
    ├── Main.java
    └── README.md
