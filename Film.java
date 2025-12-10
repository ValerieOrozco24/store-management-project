public class Film extends Item{
  private int numHours;

  public Film(){
    this("Untitled Film", 5.99, 2);
  }
  public Film(String title, double price, int numHours){
    super(title, price);
    this.numHours = numHours;
  }
  public void setNumHours(int numHours){
    this.numHours = numHours;
  }
  public int getNumHours(){
    return numHours;
  }
  public String toString(){
    return super.toString() + "\nHours: " + numHours + " hours.";
  }
}