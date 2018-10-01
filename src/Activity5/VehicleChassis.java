package Activity5;

public class VehicleChassis implements Chassis {

  private String chassisName;

  public VehicleChassis() {
    chassisName = chassis;
  }

  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  public Chassis getChassisType() {
    return this;
  }

  public void setChassisType(String vehicleChassis) {
    chassisName = vehicleChassis;
  }

  @Override
  public String toString() {
    return "Chassis Name\t: " + chassisName;
  }
  /*
  public static void main(String[] args){
    VehicleChassis def = new VehicleChassis();
    VehicleChassis veh = new VehicleChassis("Kia");

    System.out.println(def);
    System.out.println(veh);
  }
  */
}
