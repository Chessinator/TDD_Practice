

public class Main {

    public static void main(String[] args) {
        System.out.println("Hallo Welt");
    }


    String fizzBuzz(int toConvert){

        if(toConvert % 3 == 0 && toConvert % 5 != 0){
        return "Fizz";
        }else if(toConvert % 5 == 0 && toConvert % 3 != 0){
            return "Buzz";
        }else if(toConvert % 3 == 0 && toConvert % 5 == 0 && toConvert != 0){
            return "FizzBuzz";
        }
        return Integer.toString(toConvert);

    }
}
