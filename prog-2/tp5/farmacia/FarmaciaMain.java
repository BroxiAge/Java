package tp5.farmacia;

public class FarmaciaMain {

    public static void main(String[] args) {

        Farmacia farmacia = new Farmacia();
        Medicamento mBayer = new Medicamento("levotiroxina", "bayer", 10);
        Medicamento mBayer2 = new Medicamento("levotiroxina mas cara", "bayer", 20);

        Medicamento mRaffo = new Medicamento("levotiroxina ivo", "raffo", 10);
        mRaffo.addSintoma("Tos");

        farmacia.addMedicamento(mBayer);
        farmacia.addMedicamento(mBayer2);

        farmacia.addMedicamento(mRaffo);

        //farmacia.buscarMedicamentoPorNombre("11");
        //farmacia.buscarMedicamentosPorPalabraEnNombre("levo");

        //farmacia.buscarMedicamentosPorPrecioMenorA(31);

        farmacia.buscarPorSintoma("tos");
    }
}