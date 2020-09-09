public class Question6 {
    //6- CREATE A METHOD THAT TAKES AN ARRAY OF NUMBERS AND MULTIPLIES EACH NUMBER IN THE ARRAY BY 3
    public static void multiply(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number * 3);
        }

    }
            public static void main (String[]args){
            multiply(new int[]{9, 2, 3, 7});
        }
    }