package Activity5;

public class ExteriorFeature implements Feature{
  private String exteriorFeature;

  ExteriorFeature(){
    exteriorFeature = "Generic";
  }

  ExteriorFeature(String exteriorFeature){
    this.exteriorFeature = exteriorFeature;
  }

  public String getFeature(){
    return exteriorFeature;
  }

  public void setFeature(String exteriorFeature){
    this.exteriorFeature = exteriorFeature;
  }

  @Override
  public String toString(){
    return "Exterior [" + exteriorFeature + "]";
  }

  public static void main(String[] args){
    ExteriorFeature exter1 = new ExteriorFeature();
    ExteriorFeature exter2 = new ExteriorFeature("Fog Lamps");

    System.out.println(exter1);
    System.out.println(exter2);
  }
}
