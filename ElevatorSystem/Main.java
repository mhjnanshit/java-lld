package ElevatorSystem;
public class Main {
    public static void main(String[] args){
        User user1 = new User("1",3);
        User user2 = new User("2",5);

        Elevator elevator1 = new Elevator("E1", 0);
        Elevator elevator2 = new Elevator("E2", 0);
        Elevator elevator3 = new Elevator("E3", 0);

        ElevatorSystem elevatorSystem = new ElevatorSystem();

        elevatorSystem.addElevator(elevator1);
        elevatorSystem.addElevator(elevator2);
        elevatorSystem.addElevator(elevator3);

        Direction user1Direction = Direction.UP;
        Direction user2Direction = Direction.UP;
        
        user1.setElevatorSystem(elevatorSystem);
        user2.setElevatorSystem(elevatorSystem);

        user1.requestElevator(user1Direction);
        user2.requestElevator(user2Direction);
        user1.selectFloor(4);
        user2.selectFloor(6);

        Elevator assignedElevator1 = user1.getElevator();
        Elevator assignedElevator2 = user2.getElevator();
        System.out.println(assignedElevator1.moveToNextFloor());
        System.out.println(assignedElevator2.moveToNextFloor());


    }
}
