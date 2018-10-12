package Activity5;

import java.util.ArrayList;
import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  Car() {
    super();
    Feature[] f = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.feature = f;
    carAxle = 2;
  }

  Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, VehicleChassis chassisName, String vehicleType, String driveTrain,
      ManufacturedEngine myEngine, Feature[] feature, int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, chassisName,
        vehicleType, driveTrain, myEngine);

    for (int i = 0; i < feature.length; i++) {
      this.feature[i] = feature[i];
    }
    this.carAxle = carAxle;
  }

  public String getInteriorFeatures() {
    String output = "Interior Features   : ";

    ArrayList<Feature> interArray = new ArrayList<Feature>();
    for (Feature elem : feature) {
      if (elem instanceof InteriorFeature) {
        interArray.add(elem);
      }
    }

    for (int i = 0; i < interArray.size(); i++) {
      if (i != 0) {
        output += "\n                    : ";
      }
      output += interArray.get(i).toString();
    }
    return output;
  }

  public String getExteriorFeatures() {
    String output = "Exteriror Features  : ";

    ArrayList<Feature> exterArray = new ArrayList<Feature>();
    for (Feature elem : feature) {
      if (elem instanceof ExteriorFeature) {
        exterArray.add(elem);
      }
    }

    for (int i = 0; i < exterArray.size(); i++) {
      if (i != 0) {
        output += "\n                    : ";
      }
      output += exterArray.get(i).toString();
    }

    return output;
  }

  @Override
  public String toString() {
    /*
    return super.toString() +
        "\n" + getInteriorFeatures() +
        "\n" + getExteriorFeatures() +
        "\nCar Axle            : " + carAxle;
    */
    String output = super.toString() + "\nFeatures            : ";

    for (int i = 0; i < feature.length && feature[i] != null; i++) {
      if (i == 0) {
        output += feature[i].toString();
      } else {
        output += "\n                    : " + feature[i].toString();
      }
    }
    output += "\nCar Axle            : " + carAxle;

    return output;
  }
/*
  public static void main(String[] args) {
    Feature[] features = new Feature[4];

    features[0] = new ExteriorFeature("Wood Panels");
    features[1] = new InteriorFeature("AM/FM Radio");
    features[2] = new ExteriorFeature("Moonroof");
    features[3] = new InteriorFeature("Air Conditioning");

    Car car1 = new Car(new Date(115, 0, 3, 7, 13, 19), "Honda", "Honda", "Prelude",
        "Not even used", null, "2WD: Two-Wheel Drive", "Honda", new Date(115, 1, 2, 1, 38, 31),
        "H-Series", "H23A1", 4, "88 AKI", features, 2);
    Car car2 = new Car();

    System.out.println(car1);
    System.out.println();
    System.out.println(car2);
  }
  */
}
