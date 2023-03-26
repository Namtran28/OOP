import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public void removeVehicle(String registrationNumber){
        int n = vehicleList.size();
        for(int i=0;i<n;i++){
            if(vehicleList.get(i).registrationNumber == registrationNumber){
                vehicleList.remove(i);
                break;
            }
        }
    }

    public String getVehiclesInfo(){
        String s="";
        int n=vehicleList.size();
        if(n==0){
            s+=String.format("%s has no vehicle!\n", name);
        }else{
            s+=String.format("%s has:\n", name);
            for(int i=0;i<n;i++){
                s+=vehicleList.get(i).getInfo();
            }
        }
        return s;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Person nam = new Person("Tran Tien Nam", "Tuan Viet, Kim Thanh, Hai Duong");
        Vehicle c1 = new Car("Mercedes-Benz", "S400", "34A - 888.88"
        , nam, 4);
        Vehicle c2 = new Car("Windai", "S800", "34A - 958.88"
        , nam, 7);
        nam.addVehicle(c1);
        nam.addVehicle(c2);
        System.out.println(nam.getVehiclesInfo());
        Person khai = new Person("Bui Van Khai", "Muong, Hoa Binh");
        Vehicle m1 = new MotorBike("Yamaha", "M1014", "56B-343.43", khai, false);
        Vehicle c3 = new Car("Z1000", "M4245", "56B-787.50", khai, 5);
        khai.addVehicle(m1);
        khai.addVehicle(c3);
        System.out.println(khai.getVehiclesInfo());
        c3.transferOwnership(nam);
        System.out.println(nam.getVehiclesInfo());
        System.out.println(khai.getVehiclesInfo());
    }
}
