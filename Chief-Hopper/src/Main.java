import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * Este código é um programa Java que calcula a energia mínima para um
 * personagem "chief"
 * saltar entre edifícios em uma determinada configuração. O programa leva em
 * consideração as alturas dos
 * edifícios e o gasto de energia ao saltar.
 *
 * O programa consiste em duas classes principais: Result e Main.
 */

// Classe Result contém a lógica de cálculo de energia mínima.
class Result {
    /**
     * Calcula a energia mínima necessária para um personagem "chief" saltar entre
     * edifícios.
     *
     * @param arr Uma lista de inteiros representando as alturas dos edifícios.
     * @return A energia mínima necessária para completar o salto.
     */
    public static int chiefHopper(List<Integer> arr) {
        int minEnergy = 0;

        for (int i = arr.size() - 1; i >= 0; i--) {
            minEnergy = (int) Math.ceil((double) (minEnergy + arr.get(i)) / 2);
        }

        return minEnergy;
    }
}

class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(4);

        int result = Result.chiefHopper(arr);

        System.out.println(result);
    }
}
