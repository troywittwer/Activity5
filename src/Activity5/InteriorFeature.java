package Activity5;

public class InteriorFeature implements Feature{
  private String interiorFeature;

  InteriorFeature(){
    interiorFeature = "Generic";
  }

  InteriorFeature(String interiorFeature){
    this.interiorFeature = interiorFeature;
  }

  public String getFeature(){
    return interiorFeature;
  }

  public void setFeature(String interiorFeature){
    this.interiorFeature = interiorFeature;
  }

  @Override
  public String toString(){
    return "Interior [" + interiorFeature + " ]";
  }
  /*
  public static void main(String[] args){
    InteriorFeature inter1 = new InteriorFeature();
    InteriorFeature inter2 = new InteriorFeature("Climate Control");

    System.out.println(inter1);
    System.out.println(inter2);
  }
  */
}
