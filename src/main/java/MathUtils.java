import java.util.Arrays;

public class MathUtils {
    public static int additionner(int a,int b){
        return a+b;
    }
    public static int multiplier(int a,int b){
        return a*b;
    }
    public static int soustraire(int a,int b){
        return a-b;
    }
    public static int Addtable(int [] tableau) {
        return tableau[0]+tableau[1]+tableau[2];

    }

    public static int additionner1(int[] nombres){
        return Arrays.stream(nombres).sum();
    }

    public static int additionner2(int... nbrs){
        return Arrays.stream(nbrs).sum();
    }






}

