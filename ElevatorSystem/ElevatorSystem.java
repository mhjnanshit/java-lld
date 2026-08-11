package ElevatorSystem;
import java.util.*;

public class ElevatorSystem {
    private List<Elevator> elevators;

    public ElevatorSystem(){
        this.elevators = new ArrayList<>();
    }

    public void addElevator(Elevator elevator){
        elevators.add(elevator);
    }

    public Elevator assignElevator(int floor, Direction direction){
        // Choose best suitable in the user's direction
        if(direction == Direction.UP){
            for(Elevator elevator: elevators){
                if(elevator.getElevatorFloor() == floor && direction == elevator.getElevatorDirection()) return elevator;
                if(elevator.getElevatorDirection() == direction && elevator.getElevatorFloor() < floor){
                    return elevator;
                }
            }
            return elevators.get(0);
        }
        else{
            for(Elevator elevator: elevators){
                if(elevator.getElevatorFloor() == floor && direction == elevator.getElevatorDirection()) return elevator;
                if(elevator.getElevatorDirection() == direction && elevator.getElevatorFloor() > floor){
                    return elevator;
                }
            }
            return elevators.get(0);
        }
    }
}
