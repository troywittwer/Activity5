package Activity5;

public class VehicleFrame implements Chassis {

  private String vehicleFrameType;

  VehicleFrame() {
    vehicleFrameType = "Unibody";
  }

  VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public Chassis getChassisType() {
    return this;
  }

  public void setChassisType(String vehicleChassisType) {
    vehicleFrameType = vehicleChassisType;
  }

  @Override
  public String toString() {
    return "Chassis       : " + chassis +
        "\nVehicle Frame : " + vehicleFrameType;
  }
}
