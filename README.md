# Bài kiểm tra OOP abstract
## Lớp Vehicle<<<Strong>abstract</Strong>>>
    #brand: String
    #model: String
    #registrationNumber: String
    #owner: Person
    +Vehicle(brand: String, model: String, registrationNumber: String, owner: Person) 
    +getInfo(): String
    +transferOwnership(newOwner: Person): void
    +getBrand(): String
    +setBrand(brand: String): void
    +getModel(): String
    +setModel(model: String): void
    +getRegistrationNumber(): String
    +setRegistrationNumber(registrationNumber: String): void
    +getOwner(): Person
    +setOwner(owner: Person): void
## Lớp Car<<em>extends Vehicle</em>>
    -numberOfDoors: int
    +Car(brand: String, model: String, registrantionNumber: String, owner: Person, numberOfDoors: int)
    +getInfo(): String
    +getNumberOfDoors(): int
    +setNumberOfDoors(numberOfDoors: int): void
## Lớp MotorBike<<em>extends Vehicle</em>>
    -hasSidecar: boolean
    +MotorBike(brand: String, model: String, registrationNumber: String, owner: Person, hasSidecar: boolean)
    +getInfo(): String
    +isHasSideCar(): boolean
    +setHasSideCar(hasSidecar: boolean): void
## Lớp Person
    -name: String
    -address: String
    -vehicleList: List<.Vehicle>
    +Person(name: String, address: String)
    +addVehicle(vehicle: Vehicle): void
    +removeVehicle(registrationNumber: String): void
    +getVehiclesInfo(): String
    +getName(): String
    +setName(name: String): void
    +getAddress(): String
    +setAddress(address: String): void
# Yêu cầu
1. Tạo các lớp, thuộc tính, getter, setter, contructor như biểu đồ lớp.
2. Phương thức <Strong>getInfo()</Strong> khai báo ở lớp <Strong>Vehicle</Strong> là <em>abstract</em>.Cài đặt bản ghi đè cho phương thức này ở các lớp <Strong>Car</Strong> và <Strong>MotorBike</Strong> trả về kiểu dữ liệu <Strong>String</Strong> theo định dạng lần lượt như các ví dụ dưới đây:
<div>

    Lớp Car

    Car:
        Brand: Mercedes-Benz
        Model: S400
        Registration Number: 30A - 888.88
        Number of Doors: 4
        Belongs to Nguyen Van A - 144 Xuan Thuy, Cau Giay, HN

    Lớp MotorBike
    
    Motor Bike:
        Brand: Yamaha
        Model: YZF-R6
        Registration Number: 29 - P1 686.68
        Has Side Car: false
        Belongs to Nguyen Van A - 144 Xuan Thuy, Cau Giay, HN
</div>
3. Trong lớp <Strong>Person</Strong> khai báo thuộc tính <Strong>vehicleList</Strong> có kiểu dữ liệu <em>List<Vehicle></em> để chứa danh sách phương tiện mà người này sở hữu. Cài đặt các phương thức <Strong>addVehicle()</Strong> và <Strong>removeVehicle()</Strong> để thêm và xóa phương tiện của người này.
4. Trong lớp <Strong>Person</Strong> cái đặt các phương thức <Strong>getVehiclesInfo()</Strong> để lấy ra dữ liệu các phương tiện mà người này sở hữu. Phương thức trả về kiểu dữ liệu <Strong>String</Strong> theo định dạng lần lượt như các ví dụ dưới đây:
<div>

    a. Nếu không có phương tiện nào thì trả về theo định dạng:
        Nguyen Van A has no vehicle!
    b.Nếu danh sách phương tiện không rỗng thì trả về theo định dạng:
        Nguyen Van A has:

        Car:
            Brand: Mercedes-Benz
            Model: S400
            Registration Number: 30A - 888.88
            Number of Doors: 4
            Belongs to Nguyen Van A - 144 Xuan Thuy, Cau Giay, HN   
        Motor Bike:
            Brand: Yamaha
            Model: YZF-R6
            Registration Number: 29 - P1 686.68
            Has Side Car: false
            Belongs to Nguyen Van A - 144 Xuan Thuy, Cau Giay, HN
</div>
5. Trong lớp <Strong>Vehicle</Strong> cái đặt phương thức <Strong>transferOwnership()</Strong> để chuyển quyền sở hữu phương tiện sang người khác.
<p>
    <em>Lưu ý: 1 kí tự <Strong>"\t"</Strong> bằng <Strong>4 kí tự space.</Strong></em>
</p>