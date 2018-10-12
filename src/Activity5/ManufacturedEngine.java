package Activity5;

import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  ManufacturedEngine() {
    engineManufacturer = "Generic";
    engineManufacturedDate = new Date();
    engineMake = "Generic";
    engineModel = "Generic";
    engineCylinders = 0;
    engineType = "85 AKI";
    driveTrain = "2WD: Two-Wheel Drive";
  }

  ManufacturedEngine(String engManu, Date engManuDate, String engMake, String engModel,
      String engType, int engCyl, String driTrain) {
    engineManufacturer = engManu;
    engineManufacturedDate = engManuDate;
    engineMake = engMake;
    engineModel = engModel;
    engineCylinders = engCyl;
    engineType = engType;
    driveTrain = driTrain;
  }

  ManufacturedEngine(String engManu, Date engManuDate, String engMake, String engModel, int engCyl,
      String engType, String driTrain){
    engineManufacturer = engManu;
    engineManufacturedDate = engManuDate;
    engineMake = engMake;
    engineModel = engModel;
    engineCylinders = engCyl;
    engineType = engType;
    driveTrain = driTrain;
  }

  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  public void setEngineManufacturedDate(Date engineManufacturedDate) {
    this.engineManufacturedDate = engineManufacturedDate;
  }

  public void setEngineManufacturer(String engineManufacturer) {
    this.engineManufacturer = engineManufacturer;
  }

  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  public void setEngineType(String fuel) {
    engineType = fuel;
  }

  @Override
  public String toString() {
    return "Engine Manufacturer : " + engineManufacturer +
        "\nEngine Manufactured : " + engineManufacturedDate +
        "\nEngine Make         : " + engineMake +
        "\nEngine Model        : " + engineModel +
        "\nEngine Type         : " + engineType +
        "\nEngine Cylinders    : " + engineCylinders +
        "\nDrive Train         : " + driveTrain;
  }
/*
  public static void main(String[] args) {
    ManufacturedEngine manu1 = new ManufacturedEngine();
    ManufacturedEngine manu2 = new ManufacturedEngine("Honda", new Date(112, 0, 3, 7, 13, 19), "H-Series", "H23A1", 4,
        "88 AKI", "2WD: Two-Wheel Drive");

    System.out.println(manu1);
    System.out.println("\n" + manu2);
  }
  */
}
