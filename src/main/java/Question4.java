public class Question4 {
    //4- CREATE A METHOD THAT PRINTS ODD NUMBERS BETWEEN 13 AND 25
    public static void odds(){
        for(int a = 13; a < 26;a++){
            if (a % 2 != 0){
                System.out.println(a);
            }
        }
    }


    public static void main(String[] args) {
        odds();
    }
}
