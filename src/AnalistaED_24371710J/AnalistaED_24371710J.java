/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalistaED_24371710J;

/**
 *
 * @author Pedro
 */
public class AnalistaED_24371710J {

   static final double FACTOR_HORA_EXTRA = 1.2;
   private String nombreCompleto, dni;
   private double salarioBasePorHora = 10.56;

   /**
    * Constructor con tres parametros
    *
    * @param nombreCompleto
    * @param dni
    */
   public AnalistaED_24371710J(String nombreCompleto, String dni) {
      this.nombreCompleto = nombreCompleto;
      this.dni = dni;
   }

   /**
    * Calcula el salario bruto mensual en función del salario base por hora y
    * las horas extras El precio por hora de la hora extra se determina con las
    * constante FACTOR_HORA_EXTRA
    *
    *
    * @param horasExtra
    * @return devuelve el salario bruto mensual en euros con dos decimales
    */
   public double getSalarioEsteMes(int horasExtra) {
      double cantidadExtra, salarioFinal;
      cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
      salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
      salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
      return salarioFinal;
   }

   // Este método no lo comentaremos con JavaDoc
   public static void main(String[] args) {
      // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA
      AnalistaED_24371710J emp = new AnalistaED_24371710J("PEDRO SÁNCHEZ", "24371710J");
      int horasExtra = 2;
      System.out.println("El salario de " + emp.nombreCompleto
         + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
         + " euros, al hacer " + horasExtra + " horas extra.");
   }

}
