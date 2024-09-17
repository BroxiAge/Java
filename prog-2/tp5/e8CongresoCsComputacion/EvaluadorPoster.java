package tp5.e8CongresoCsComputacion;

public class EvaluadorPoster extends Evaluador {

    @Override
    public boolean soyIdoneo(Trabajo t) {

        for (String tema : t.getPalabrasClaveList()) {
            if (super.conozcoElTema(tema)) {
                System.out.println("EvaluadorPoster: Al menos conozco este tema:  " + tema + ". Soy idoneo");
                return false;
            }
        }
        System.out.println("EvaluadorPoster: No soy idoneo, no conozco ni un tema " + t.getPalabrasClaveList().toString());
        return true;
    }
}
