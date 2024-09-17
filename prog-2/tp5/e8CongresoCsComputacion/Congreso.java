package tp5.e8CongresoCsComputacion;

import java.util.*;

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

   public void asignarTrabajo(Evaluador ev, Trabajo t) {
      System.out.println("Asignando el trabajo: " + t.toString() + " a: " + t.toString());

      ev.soyIdoneo(t);
   }

   public void ponerALaburarATodos() {

      Set<Trabajo> trabajosAsignados = new HashSet<>();

      for (Evaluador evaluador : evaluadorList) {
         for (Trabajo trabajo : trabajosList) {
            if (!trabajosAsignados.contains(trabajo) && evaluador.soyIdoneo(trabajo)) {
               asignarTrabajo(evaluador, trabajo);
               trabajosAsignados.add(trabajo);
               break;
            }
         }
      }
   }
}
