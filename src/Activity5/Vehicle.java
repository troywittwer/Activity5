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

  Vehicle() {
    vehicleManufacturedDate = new Date();
    vehicleManufacturer = "Generic";
    vehicleMake = "Generic";
    vehicleModel = "Generic";
    vehicleFrame = new VehicleChassis();
    vehicleType = "None";
    driveTrain = "2WD: Two-Wheel Drive";
    vehicleEngine = new ManufacturedEngine(); // run the methods to set variables
  }

  Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, String chassisName, String vehicleType, String driveTrain,
      String engineManufacturer, Date engineManufacturedDate, String engineMake, String engineModel,
      int engineCylinders, String engineType) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    vehicleFrame = new VehicleChassis(chassisName);
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    vehicleEngine = new ManufacturedEngine(engineManufacturer, engineManufacturedDate, engineMake,
        engineModel, engineCylinders, engineType, driveTrain);
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

  @Override
  public String toString() {
    return "Manufacturer Name   : " + vehicleManufacturer +
        "\nManufactured Date   : " + vehicleManufacturedDate +
        "\nVehicle Make        : " + vehicleMake +
        "\nVehicle Model       : " + vehicleModel +
        "\nVehicleType         : " + vehicleType + "\n" + vehicleEngine.toString();
  }

  public static void main(String[] args) {
    Vehicle veh1 = new Vehicle();
    Vehicle veh2 = new Vehicle(new Date(115, 0, 3, 7, 13, 19), "Honda", "Honda", "Prelude",
        "Not even used", null, "2WD: Two-Wheel Drive", "Honda", new Date(115, 1, 2, 1, 38, 31),
        "H-Series", "H23A1", 4, "88 AKI");

    System.out.println(veh1 + "\n");
    System.out.println(veh2);
  }
}
