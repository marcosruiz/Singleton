import lombok.Getter;

public class Singleton {
  private static Singleton singleton;

  @Getter
  private String atributoUno;

  @Getter
  private int atributoDos;

  /**
   * Creamos el constructor de manera privada para evitar que se instancie desde fuera de la clase
   */
  private Singleton(String atributoUno, int atributoDos){
    this.atributoUno = atributoUno;
    this.atributoDos = atributoDos;
  }

  /**
   * Este es el único método con el podemos obtener y crear instancias de Singleton
   */
  public static Singleton getInstance(String atributoUno, int atributoDos){
    if(singleton == null){
      singleton = new Singleton(atributoUno,atributoDos);
    }
    return singleton;
  }

  public String toString(){
    return "{" + atributoUno + "," + atributoDos + "}";
  }

}
