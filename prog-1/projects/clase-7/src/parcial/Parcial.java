package parcial;

class Parcial {
    final static int N = 19;
    final static int M = 6;

    static int miArreglo[] = { 0, 9, 7, 0, 3, 2, 5, 0, 6, 5, 4, 1, 0, 41, 5, 0, 3, 2, 0 };
    static int ejemplo[] = { 0, 0, 3, 8, 5, 0 };

    public static void main(String args[]) {
        int[] A = new int[N];
        int[] P = new int[M];

        // Inicializar estructuras
        InicArreglo(A);
        InicDato(P);

        // Mostrar los datos iniciales
        MostrarSecuencias(A,N);
        MostrarSecuencias(P,M);
        
        MostrarArreglo(A, N);
        MostrarArreglo(P, M);

        // Hacer algo con las estructuras
        DoItAll(A, N, P, M);

        // Mostrar los resultados
        MostrarSecuencias(A,N);
        MostrarSecuencias(P,M);

        MostrarArreglo(A, N);
        MostrarArreglo(P, M);

    }  // void main()

    //
    // Inicializaciones
    // 
    static void InicArreglo(int[] arr) {
        for (int i = 0; i < N; i++) {
            arr[i] = miArreglo[i];
        }
    } // InicArreglo()

    static void InicDato(int[] arr) {
        for (int i = 0; i < M; i++) {
            arr[i] = ejemplo[i];
        }
    } // InicDato()

    //
    // Utilidades
    //

    static int ComienzoSecu(int[] arr, int cmzo, int tamano) {
        int i = cmzo;

        while ((i < tamano) && (arr[i] == 0)) 
            i = i + 1; // i++;

        return (i);

    } // ComiezoSecu()

    static void MostrarSecu(int[] arr, int cmzo, int tamano) {
        int i = cmzo;

        while ((i < tamano) && (arr[i] != 0)) {
            System.out.print(String.format("%3d", arr[i++]));
        }
        System.out.println();
  
        return;

    } // void MostrarSecu()

    static int LongSecu(int[] arr, int cmzo, int tamano) {
        int i = cmzo;

        while ((i < tamano) && (arr[i] != 0)) i++;
  
        return(i - cmzo);

    } // LongSecu()

    static void MostrarSecuencias(int[] arr, int tamano) {
        int i, l;

        i = 0;
        while (i < tamano) {
            i = ComienzoSecu(arr, i, tamano);
            MostrarSecu(arr, i, tamano);
            l = LongSecu(arr, i, tamano);
            i = i + l; // i += l
        }
    } // MostrarSecuencias()

    static void MostrarArreglo(int[] arr, int tamano) {
        for (int i = 0; i < tamano; i++) {
            System.out.print(String.format("%3d", arr[i]));
        }
        System.out.println();
        return;

    } // void MostrarArreglo()

    static boolean EstaOrdenada(int[] arr, int cmzo, int lon) {
        boolean estaOrdenado = true;

        for (int i = 0; i < lon-1; i++) {
            if (arr[cmzo+i] > arr[cmzo+i+1])
                estaOrdenado = false;
        }

        return estaOrdenado;
    } // EstaOrdenada()

    static boolean EstaOrdenadaDesc(int[] arr, int cmzo, int lon) {
        boolean estaOrdenado = true;

        for (int i = 0; i < lon-1; i++) {
            if (arr[cmzo+i] < arr[cmzo+i+1])
                estaOrdenado = false;
        }

        return estaOrdenado;
    } // EstaOrdenadaDesc()

    static int SumaSecu(int[] arr, int cmzo, int lon) {
        int i, acum = 0;

        for (i = 0; i < lon; i++)
            acum += arr[cmzo+i];

        return acum;

    } // int SumaSecu
    
    // 
    // Proceso principal
    //

    static void BorrarSecu(int[] arr, int cmzo, int tamano) {
        int l;

            l = LongSecu(arr, cmzo, tamano);

            DesplazarAIzquierda(arr, cmzo, l+1, tamano);

            return;

    } // void BorrarSecu()

    static void InsertarSecu(int[] arr, int cmzo, int tamano, int[] sec, int tam2) {
        int i = ComienzoSecu(sec, 0, tam2);
        int l = LongSecu(sec, i, tam2);

        DesplazarADerecha(arr, cmzo, l+1, tamano);
        CopiarSecuencia(arr, cmzo, sec, i, l+1);
        return;
    } // void InsertarSecu()

    static void CopiarSecuencia(int[] dest, int cmzod, int[] orig, int cmzoo, int lon) {

        for (int i = 0; i < lon; i++) {
            dest[cmzod+i] = orig[cmzoo+i];
        }
        return;
    } // CopiarSecuencia()

    static void DoItAll(int[] arr, int tam1, int[] sec, int tam2) {
        int i, l;
            i = ComienzoSecu(sec, 0, tam2);
        int lonsecu = LongSecu(sec, i, tam2);
        int sumasecu = SumaSecu(sec, i, lonsecu);

        i = 0;

        while (i < tam1) {
            i = ComienzoSecu(arr, i, tam1);
            
            if (i >= tam1) return;

            l = LongSecu(arr, i, tam1);
            if (EstaOrdenadaDesc(arr, i, l) && (SumaSecu(arr, i, l) == sumasecu)) {
                // resolver 
                BorrarSecu(arr, i, tam1);
                InsertarSecu(arr, i, tam1, sec, tam2);
                l = LongSecu(arr, i, tam1);
            }
            i = i + l; // i += l
        }

    } // void DoItAll()

    // 
    // Desplazamientos
    //

    static void DesplazarAIzquierda(int[] arr, int  cmzo, int lon, int tamano) {
        int i = cmzo;

        while (i < (tamano-lon)) {
            arr[i] = arr[i+lon];
            i++;
        }

        for (i = tamano-lon; i < tamano; i++) {
            arr[i] = 0;
        }

        return;

    } // void DesplazarAIzquierda()

    static void DesplazarADerecha(int[] arr, int  cmzo, int lon, int tamano) {
        int i = tamano - 1;

        while (i >= (cmzo+lon)) {
            arr[i] = arr[i-lon];
            i--;
        }

        arr[tamano-1] = 0;

        return;

    } // void DesplazarADerecha()

} // class AprueboSeguro