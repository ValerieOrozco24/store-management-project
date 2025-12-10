public class Book extends Item {
  private boolean paperBack;

  public Book(){
    this("Untitled Book", 7.99, false);
  }
  public Book(String title, double price, boolean paperBack){
    super(title, price);
    this.paperBack = paperBack;
  }
  public void setPaperBack(boolean paperBack){
    this.paperBack = paperBack;
  }
  public boolean getPaperBack(){
    return paperBack;
  }
  public String toString(){
    return super.toString() + "\npaperBack?" + paperBack;
  }
}