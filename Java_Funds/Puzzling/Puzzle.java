import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

public class Puzzle{
    public ArrayList<Integer> posNum(){
        Integer[] num = { 3,5,1,2,7,9,8,13,25,32 };
        Integer sum = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(Integer val : num){
            sum += val;
            if(val > 10){
                newArray.add(val);
            }
        }
            System.out.println(sum);
            return newArray;
    };

    public ArrayList<String> ninjaName(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");

        int count = 0;
        ArrayList<String> newArray = new ArrayList<String>();
        Collections.shuffle(names);
        System.out.println(names);
        for(int i = 0; i < names.size(); i++){
            if(names.get(i).length() > 5){
                newArray.add(names.get(i));
            }
        }
        System.out.println(newArray);
        return newArray;
    };

    public ArrayList<Character> allLets(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        alphabet.addAll(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        Collections.shuffle(alphabet);
        System.out.println(alphabet.get(alphabet.size()-1));
        if(alphabet.get(0) == 'a'){
            System.out.print("Vowel a!");
        } else if(alphabet.get(0) == 'e'){
            System.out.print("Vowel e!");
        } else if(alphabet.get(0) == 'i'){
            System.out.print("Vowel i!");
        } else if(alphabet.get(0) == 'o'){
            System.out.print("Vowel o!");
        } else if(alphabet.get(0) == 'u'){
            System.out.print("Vowel u!");
        }
        return alphabet;
    };

    public ArrayList<Integer> ranTen(){
        Random r = new Random();
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            newArray.add(55 + r.nextInt(46));
        }
        System.out.println(newArray);
        return newArray;
    };

    public ArrayList<String> smallStr(){
        ArrayList<String> str = new ArrayList<String>();
        Random r = new Random();
        for(int i = 0; i < 5; i++){
            str.add(Character.toString((char)(97 + r.nextInt(26))));
        }
        System.out.println(str);
        return str;
    }

    public ArrayList<String> ranStr(){
        Random r = new Random();
        ArrayList<String> newArray = new ArrayList<String>();

        for(int i = 0; i < 10; i++){
            String word = "";
            for(int j = 0; j < 5; j++){
            word += Character.toString((char) (97 + r.nextInt(26)));
            }
            newArray.add(word);
        }
        return newArray;
    }
}