import java.util.ArrayList;
public class BasicsTest{
    public static void main(String[] args){
        Basics b = new Basics();
        b.getInts();
        b.getOdds();
        b.sumInts(255);
        int[] anArray={-2, 5, 19, 12, -2};
        Integer[] theArray={-2, 5, 19, 12, -2};
        b.printAll(anArray);
        b.findMax(theArray);
        b.findAvg(theArray);
        b.oddArr(13);
        b.overVal(anArray, 2);
        b.squaredOff(anArray);
        b.sliceEm(anArray);
        b.mainThree(anArray);
        b.shiftDown(anArray);
    }
}