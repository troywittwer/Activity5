/*
This class implements two interfaces: Engine and Chassis. This means the class needs to overload
every method listed under each interface. The instructions only requested private variables
relating to the vehicle class, but also expects Chassis and Engine objects (one of each).

Since one cannot create an instance of an interface, I set them to new instances of classes that
implemented the interface. For example, the vehicleChassis object was declared as a Chassis object,
but instantiated as a new VehicleChassis object. Likewise, the vehicleEngine object (declared as an
Engine object) was instantiated as a new ManufacturedEngine object.
 */
package Activity5;

import java.util.Date;

public class Vehicle implements Engine, Chassis {

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

  /**
   * A default constructor for the vehicle class. vehicleFrame and vehicleEngine receive
   */
  Vehicle() {
    vehicleManufacturedDate = new Date();
    vehicleManufacturer = "Generic";
    vehicleMake = "Generic";
    vehicleModel = "Generic";
    vehicleFrame = new VehicleChassis();
    vehicleType = "Generic";
    driveTrain = "Generic";
    vehicleEngine = new ManufacturedEngine();
  }

  /**
   * Allows user to create a custom instance by passing in all values relevant to the vehicle and
   * engine
   *
   * @param vehicleManufacturedDate the date the vehicle was manufactured
   * @param vehicleManufacturer the manufacturer of the vehicle
   * @param vehicleMake the name of the company who made the vehicle
   * @param vehicleModel the model name of the vehicle
   * @param chassisName the name of the chassis used by the vehicle
   * @param vehicleType the type of vehicle
   * @param driveTrain the drive train of the vehicle / engine (2 wheel drive, 4 wheel drive, etc.)
   * @param engineManufacturer the manufacturer of the engine
   * @param engineManufacturedDate the date the engine was manufactured
   * @param engineMake the name of the company who made the engine
   * @param engineModel the model name of the engine
   * @param engineCylinders the number of cylinders in the engine
   * @param engineType the type of engine
   */
  Vehicle(Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      VehicleChassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      ManufacturedEngine myEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    vehicleEngine = myEngine;
  }

  public Date getVehicleManufacturedDate() {
    return vehicleManufacturedDate;
  }

  public String getVehicleManufacturer() {
    return vehicleManufacturer;
  }

  public String getVehicleMake() {
    return vehicleMake;
  }

  public String getVehicleModel() {
    return vehicleModel;
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  public void setEngineManufacturer(String manufacturer) {
    vehicleEngine.setEngineManufacturer(manufacturer);
  }

  public void setEngineMake(String engineMake) {
    vehicleEngine.setEngineMake(engineMake);
  }

  public void setEngineModel(String engineModel) {
    vehicleEngine.setEngineModel(engineModel);
  }

  public void setDriveTrain(String driveTrain) {
    vehicleEngine.setDriveTrain(driveTrain);
  }

  public void setEngineType(String fuel) {
    vehicleEngine.setEngineType(fuel);
  }

  public Chassis getChassisType() {
    return vehicleFrame;
  }

  public void setChassisType(String chassisType) {
    vehicleFrame = new VehicleFrame(chassisType);
  }

  /**
   * Allows user to print all values in a toString format for both vehicle variables and engine
   * variables. Since the Engine interface doesn't have any get methods to overload, I was forced to
   * call the ManufacturedEngine class's toString method to retrieve those variables.
   *
   * @return returns all variables related to the vehicle and engine classes related to this
   * instance.
   */
  @Override
  public String toString() {
    return "Manufacturer Name   : " + vehicleManufacturer +
        "\nManufactured Date   : " + vehicleManufacturedDate +
        "\nVehicle Make        : " + vehicleMake +
        "\nVehicle Model       : " + vehicleModel +
        "\nVehicleType         : " + vehicleType + "\n" + vehicleEngine.toString();
  }
/*

  public static void main(String[] args) {
    Vehicle veh1 = new Vehicle();
    Vehicle veh2 = new Vehicle(new Date(115, 0, 3, 7, 13, 19), "Honda", "Honda", "Prelude",
        "Not even used", null, "2WD: Two-Wheel Drive", "Honda", new Date(115, 1, 2, 1, 38, 31),
        "H-Series", "H23A1", 4, "88 AKI");

    System.out.println(veh1 + "\n");
    System.out.println(veh2);
  }
  */
}
