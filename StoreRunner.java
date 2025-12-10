import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

 Item randomItem = new Item();
    System.out.println(randomItem);
    System.out.println();

    Book hgBook = new Book("Hunger Games", 10.99, true);
    System.out.println(hgBook);
    System.out.println();

    Film clFilm = new Film("Clueless", 9.99, 2);
    System.out.println(clFilm);
    System.out.println();
    
    
    
    




    // Closes the Scanner object
    input.close();
    
  }
}