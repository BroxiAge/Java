package tp5.farmacia;

import tp5.farmacia.filtros.*;

import java.util.*;

public class Farmacia {

    private List<Medicamento> medicamentoList;

    public Farmacia() {
        this.medicamentoList = new ArrayList<>();
    }

    public void addMedicamento (Medicamento m) {
        this.medicamentoList.add(m);
        System.out.println("Medicamento: " + m + " agregado a la lista.");
    }

//    public void buscarMedicamentoPorFarmacia(String nombreMedicamento) {
//
//        boolean encontrado = false;
//
//        for (Medicamento medicamento : medicamentoList) {
//            if (medicamento.getLaboratorio().equalsIgnoreCase(nombreMedicamento)) {
//                System.out.println("Su medicamento '" + nombreMedicamento + "' se encuentra disponible." + " Es : " + medicamento);
//                encontrado = true;
//            }
//        }
//        if (!encontrado) {
//            System.out.println("Medicamento con laboratirio:  '" + nombreMedicamento + "' no encontrado.");
//        }
//    }
//
//    public void buscarMedicamentosPorPalabraEnNombre(String palabra) {
//        boolean encontrado = false;
//        for (Medicamento medicamento : medicamentoList) {
//            if (medicamento.getNombre().toLowerCase().contains(palabra.toLowerCase())) {
//                System.out.println("Medicamento encontrado: " + medicamento.getNombre());
//                encontrado = true;
//            }
//        }
//        if (!encontrado) {
//            System.out.println("No se encontraron medicamentos con la palabra '" + palabra + "' en el nombre.");
//        }
//    }
//
//    public void buscarMedicamentosPorPrecioMenorA(int precio) {
//        boolean encontrado = false;
//        for (Medicamento medicamento : medicamentoList) {
//            if (medicamento.getPrecio() < precio) {
//                System.out.println("Medicamento encontrado: " + medicamento.getNombre());
//                encontrado = true;
//            }
//        }
//        if (!encontrado) {
//            System.out.println("No se encontraron medicamentos con el precio menor a :  '" + precio);
//        }
//    }
//
//    public void buscarPorSintoma(String sintoma) {
//
//        boolean encontrado = false;
//
//        for (Medicamento medicamento : medicamentoList) {
//            if (medicamento.tratasSintoma(sintoma)) {
//                System.out.println("El medicamento" + medicamento.getNombre() + " se encuentra disponible.");
//                encontrado = true;
//            }
//        }
//
//        if (!encontrado) {
//            System.out.println("No se encontrom edicamento para su sintoma: " + sintoma);
//        }
//    }

    public void buscarMedicamento (Filtro filtro) {

        boolean encontrado = false;

        for (Medicamento medicamento : medicamentoList) {
            if (filtro.acepta(medicamento)) {
                System.out.println("El medicamento" + medicamento.getNombre() + " se encuentra disponible.");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro medicamento para su filtro");
        }

    }
}
