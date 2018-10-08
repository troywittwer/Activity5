package Activity5;

public class Car extends Vehicle {
  private Feature[] feature = new Feature[10];
  private int carAxle;

  Car(){
    super();
    carAxle = 2;
  }

  Car(Feature[] feature, int carAxle){
    super();
    for (int i = 0; i < feature.length; i++){
      this.feature[i] = feature[i];
    }
    this.carAxle = carAxle;
  }

  public String getInteriorFeatures(){
    String output = "Interior Features";

    for (Feature elem: feature){
      output += "  : ";
      output += elem.getFeature() + "\n                  ";
    }

    return output;
  }

  public String getExteriorFeatures(){
    String output = "Exteriror Features";

    for (Feature elem: feature){
      output += "  : ";
      output += elem.getFeature() + "\n                  ";
    }

    return output;
  }

  @Override
  public String toString(){
    return super.toString() +
        "\n" + getInteriorFeatures() +
        "\n" + getExteriorFeatures();
  }

  public static void main(String[] args){

  }
}
