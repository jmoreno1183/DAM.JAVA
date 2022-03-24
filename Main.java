class Main {
    public static void main(String[] args) {
      Ventana ventanaDercoche = new Ventana();
      Coche miCoche = new Coche();
      System.out.println(miCoche);
      System.out.println(Ventana);
      System.out.println(miCoche.getMotor);
      System.out.println(micoche.getPuertaDer());
      miCoche.getPuertaDer().abrir();
      System.out.println(miCoche.getPuertaDer());
      System.out.println(miCoche.getPuertaDer().getVentana());
      miCoche.getPuertaDer().getVentana().abrir();
      System.out.println(miCoche.getPuertaDer().getVentana());
      ventanaDercoche = miCoche.getPuertaDer().getVentana();
      ventanaDercoche.abrir();
      System.out.println(ventanaDerCoche);
      ventanaDerCoche.cerrar();
      System.out.println(ventanaDerCoche);
    }
}
