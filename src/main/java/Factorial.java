public class Factorial {
    public static void main(String[] args){
        int number = 10;
        System.out.println(withoutRecursion(number));
        System.out.println(" factorial "+factRecursion(number));

    }
     static int withoutRecursion(int num){
        int result = 1;
        for(int i = num ; i >= 1 ;i--){
            result = result * i;

        }
         return  result;
     }

     static int factRecursion(int num){
        if(num ==1){
            return 1;

        }else{
            return num * factRecursion(num- 1);
        }
     }
}
