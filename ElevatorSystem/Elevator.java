package ElevatorSystem;
import java.util.*;

public class Elevator {
    private String elevatorId;
    private Direction currDirection;
    private int currFloor;
    private Queue<Integer> upFloors;
    private Queue<Integer> downFloors;
    private Set<Integer> floors;
    
    public Elevator(String elevatorId, int currFloor){
        this.elevatorId = elevatorId;
        this.currDirection = Direction.UP;
        this.currFloor = currFloor;
        this.upFloors = new PriorityQueue<>();
        this.downFloors = new PriorityQueue<>(Comparator.reverseOrder());
        this.floors = new HashSet<>();
    }

    public Direction getElevatorDirection(){
        return this.currDirection;
    }

    public int getElevatorFloor(){
        return this.currFloor;
    }

    public void selectFloor(int floor){
        if(floors.contains(floor) || this.currFloor == floor) return;
        floors.add(floor);
        if(floor < this.currFloor){
            downFloors.offer(floor);
        }
        else if(floor > this.currFloor){
            upFloors.offer(floor);
        }   
    }

    public int moveToNextFloor(){
        if(this.currDirection == Direction.UP){
            if(upFloors.isEmpty()){
                this.currDirection = Direction.DOWN;
                if(downFloors.isEmpty()){
                    return this.currFloor;
                }
                else{
                    this.currFloor = downFloors.peek();
                    downFloors.poll();
                    floors.remove(this.currFloor);
                    return this.currFloor;
                }
            }
            else{
                this.currFloor = this.upFloors.peek();
                upFloors.poll();
                floors.remove(this.currFloor);
                return this.currFloor;
            }
        }
        else{
            if(downFloors.isEmpty()){
                this.currDirection = Direction.UP;
                if(upFloors.isEmpty()){
                    return this.currFloor;
                }
                else{
                    this.currFloor = upFloors.peek();
                    upFloors.poll();
                    floors.remove(this.currFloor);
                    return this.currFloor;
                }
            }
            else{
                this.currFloor = this.downFloors.peek();
                downFloors.poll();
                floors.remove(this.currFloor);
                return this.currFloor;
            }
        }
    }

}
