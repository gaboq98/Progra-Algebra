package GUI;


public class TextReader {
    
    private static TextReader instance;
    private int[][] matrix;
    private int pivoteAnterior = 1;
    
    
    public static TextReader getInstance(){
        if(instance == null){
            instance = new TextReader();
        }
        return instance;
    }
    
    public void setMatrix(int[][] mat){
        this.matrix = mat;
    }
    
    public void setNull() {
        this.matrix = null;
        this.pivoteAnterior = 1;
    }
    
    public int[] obtenerColumna(int columna) {
        int[] fila = new int[matrix.length];
        for(int j = 0; j < matrix.length; j++) {
            for(int i = 0; i < matrix[0].length; i++){
                if(i == columna) {
                    fila[j] = matrix[j][i];
                }
            }
        }
	return fila;
    }
    
    private int[] obtenerFila(int fila) {
        int[] filaAux = new int[matrix.length];
        for(int j = 0; j < matrix.length; j++) {
            if(j == fila) {
                filaAux = matrix[j];
            }
        }
        return filaAux;
    }
    
    private int[][] cambiaFila(int[][] matriz,int indexA, int indexB){
        try {
            int[] filaAux = matriz[indexB];
            matriz[indexB] = matriz[indexA];
            matriz[indexA] = filaAux;
            return matriz;
        } catch (Exception e) {
            indexB = 0;
            int[] filaAux = matriz[indexB];
            matriz[indexB] = matriz[indexA];
            matriz[indexA] = filaAux;
            return matriz;
        }
    }
    
    public int[][] getMatrix() {
        return matrix;
    }
    
    public int[][] reducirMatriz(int j) {
            int columna[] = obtenerColumna(j);
            int pivote = columna[j];
            if(pivote == 0) {
                int[] fila = obtenerFila(j);
                for(int e = 0; e < fila.length; e++) {
                    fila[e] *= -1;
                }
                cambiarPivote(j);
                columna = obtenerColumna(j);
                pivote = columna[j];
            }
            hacerCeros(j, obtenerFila(j));
        
        return matrix;
    }
    
    private void cambiarPivote(int columna) {
        int contador = 1;
        do {
            matrix = cambiaFila(matrix, columna, columna + contador);
            contador++;
            if(contador > matrix.length) {
                break;
            }
        } while(matrix[columna][columna] == 0);
    }
    
    private void hacerCeros(int fila, int[] filaPivote){
        int pivote = filaPivote[fila];
        for(int i = fila+1; i < matrix.length; i++) {
            int [] aux = obtenerFila(i).clone();
            for(int j = 0; j < aux.length; j++) {
                aux[j] = ((pivote * matrix[i][j]) + - (matrix[i][fila] * matrix[fila][j])) / pivoteAnterior;
            }
            matrix[i] = aux;
        }
        if (pivote != 0) {
            pivoteAnterior = pivote;
        }
    }
    
    private void hacerCerosArriba(int fila, int[] filaPivote){
        int pivote = filaPivote[fila];
        int i = fila-1;
        for(i = fila-1; i > -1; i--) {
            int [] aux = obtenerFila(i).clone();
            for(int j = 0; j < aux.length; j++) {
                aux[j] = ((pivote * matrix[i][j]) + - (matrix[i][fila] * matrix[fila][j])) / pivoteAnterior;
            }
            matrix[i] = aux;
        }
        pivoteAnterior = pivote;
    }
    
    public int[][] solucionarSistema(int j) {
            int columna[] = obtenerColumna(j);
            int pivote = columna[j];
            if(pivote == 0) {
                int[] fila = obtenerFila(j);
                for(int e = 0; e < fila.length; e++) {
                    fila[e] *= -1;
                }
                cambiarPivote(j);
                columna = obtenerColumna(j);
                pivote = columna[j];
            }
            hacerCerosArriba(j, obtenerFila(j));
        
        return matrix;
    }
    
    /*
    public int solucionarSistema(int nivel) {
        int sol = 0;
        for(int n = nivel; n > 0; n--) {
            for(int i = n-1; i > 1; i++) {
                for (int j = i+1; j > n; j++) {
                    int a = matrix[i][n+1];
                    int c = (matrix[j][j+1] / matrix[j][j]);
                    int b = matrix[i][j];
                    sol += a - (b * c);
                }
            }
        }
        return sol;
    }
    */
    
}
