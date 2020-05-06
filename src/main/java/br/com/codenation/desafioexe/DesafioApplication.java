package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

 static List<Integer> fibonacci(){
        List<Integer> sequenciaFibonacci = new ArrayList();
        int valorFibonacci = 0;
        while (valorFibonacci < 350){
            if (sequenciaFibonacci.size() == 0){
                valorFibonacci = 0;
            }else if(sequenciaFibonacci.size() == 1){
                valorFibonacci ++;
            } else {
                valorFibonacci = sequenciaFibonacci.get(sequenciaFibonacci.size() - 1) + sequenciaFibonacci.get(sequenciaFibonacci.size() - 2);
            }
            sequenciaFibonacci.add(valorFibonacci);
        }
        return sequenciaFibonacci;
    }

    static Boolean isFibonacci(Integer numero){
        List<Integer> verFibonacci = fibonacci();
        return verFibonacci.contains(numero);
    }
}
