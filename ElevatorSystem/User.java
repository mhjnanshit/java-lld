package ElevatorSystem;

public class User {
    private String userId;
    private Elevator assignedElevator;
    private ElevatorSystem elevatorSystem;
    private int currFloor;

    public User(String userId, int currFloor){
        this.userId = userId;
        this.currFloor = currFloor;
    }

    public Elevator getElevator(){
        return this.assignedElevator;
    }

    public void setElevatorSystem(ElevatorSystem elevatorSystem){
        this.elevatorSystem = elevatorSystem;
    }

    public void requestElevator(Direction direction){
        this.assignedElevator = elevatorSystem.assignElevator(currFloor, direction);
    }

    public void selectFloor(int floor){
        this.assignedElevator.selectFloor(floor);
    }
}
