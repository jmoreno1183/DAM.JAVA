public class Persona{
  private String nombre;
  private String dni;

  //CONSTRUCTOR
  public Persona(){
    this.nombre = "jose";
    this.dni = "123456789R"
  }
  public Persona(String nombre, String dni){
    this.nombre = nombre;
    this.dni = dni;
  }

  //Get
  public String getNombre(){
    return this.nombre;
  }
  public String getDni(){
    return this.dni;
  }

  // Set
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setDni(String dni){
    this.dni = dni;
  }

  public String toString(){
    return "Me llamo " + this.nombre + " y mi dni es " + this.dni + ".";
  }
}
