public class App {
  /**
   * Aunque queramos crear varias instancias de Singleton el objeto no nos dejará.
   */
  public static void main(String[] args){
    Singleton singleton1 = Singleton.getInstance("patata1", 1);
    Singleton singleton2 = Singleton.getInstance("patata2", 2);
    Singleton singleton3 = Singleton.getInstance("patata3", 3);

    System.out.println(singleton1);
    System.out.println(singleton2);
    System.out.println(singleton3);
  }
}
