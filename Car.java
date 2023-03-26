public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand, String modle, String registrationNumber, Person owner, int numberOfDoors){
        super(brand, modle, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }
    
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    
    public void setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
    }

    public String getInfo(){
        String s="";
        s+=String.format("Car:\n  Brand: %s\n  Model: %s\n  Registration Number: %s\n", brand, model, registrationNumber);
        s+=String.format("  Number of Doors: %d\n  Belongs to %s - %s\n", numberOfDoors, owner.getName(), owner.getAddress());
        return s;        
    }
}
