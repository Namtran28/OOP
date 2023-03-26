public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    public MotorBike(String brand, String modle, String registrationNumber, Person owner, boolean hasSidecar){
        super(brand, modle, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public String getInfo(){
        String s="";
        s+=String.format("Motor Bike:\n  Brand: %s\n  Model: %s\n  Registration Number: %s\n", brand, model, registrationNumber);
        s+=String.format("  Number of Doors: %s\n  Belongs to %s - %s\n", hasSidecar, owner.getName(), owner.getAddress());
        return s;  
    }
}
