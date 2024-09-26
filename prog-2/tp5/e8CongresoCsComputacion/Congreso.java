package tp5.e8CongresoCsComputacion;

import java.util.ArrayList;
import java.util.List;

public class Congreso {

   private List<Evaluador> evaluadorList;
   private List<Trabajo> trabajosList;

   public Congreso() {
      this.evaluadorList = new ArrayList<>();
      this.trabajosList = new ArrayList<>();
   }

   public void agregarEvaluador(Evaluador c) {
      evaluadorList.add(c);
   }

   public void agregarTrabajo(Trabajo c) {
      trabajosList.add(c);
   }

   private void asignarTrabajo(Trabajo t, Evaluador ev) {

      if (t.acepta(ev)) {
         System.out.println("Asignando el trabajo: " + t.toString() + " al evaluador: " + ev.toString());
         ev.agregarTrabajo(t);
      } else {
         System.out.println("El evaluador: " + ev.toString() + " no cumple con los requisitos para el trabajo: " + t.toString());
      }
   }

   public void asignarTrabajosAEvaluadores() {
      for (Trabajo t : trabajosList) {
         boolean asignado = false;
         for (Evaluador ev : evaluadorList) {
            if (t.acepta(ev)) {
               asignarTrabajo(t, ev);
               asignado = true;
               break;
            }
         }

         if (!asignado) {
            System.out.println("El trabajo " + t.toString() + " no pudo ser asignado a ningún evaluador.");
         }
      }
   }
}
