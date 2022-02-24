import java.util.function.BiFunction;

public class Q1 {
 
    public static void main(String[] args) {
        BiFunction <Integer, Integer, Integer> funcAddObj = (i1, i2) -> i1 + i2;
        BiFunction <Integer, Integer, Integer> funcSubtractObj = (i1, i2) -> i1 - i2;
        BiFunction <Integer, Integer, Integer> funcMuliplyObj = (i1, i2) -> i1 * i2;
        BiFunction <Integer, Integer, Integer> funcDivideObj = (i1, i2) -> i1 / i2;
        BiFunction <Integer, Integer, Integer> funcModuloObj = (i1, i2) -> i1 % i2;
        System.out.println("Addition of 4 and 5: " + funcAddObj.apply(4, 5));
        System.out.println("Subtract of 8 and 5: " + funcSubtractObj.apply(8, 5));
        System.out.println("Multiply of 9 and 4: " + funcMuliplyObj.apply(9, 4));
        System.out.println("Division of 9 and 3: " + funcDivideObj.apply(9, 3));
        System.out.println("Modulo of 12 and 6: " + funcModuloObj.apply(12, 6));
 
    }
 
}
