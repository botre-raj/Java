public class PrintNumbes{
    public static void printAllNumbers(int num){
        if(num==1){
            System.out.println("Number : "+ num);
            return;
        }
        System.out.println("Number : "+ num);
        printAllNumbers(num-1);
    }
    public static void main(String[] args){
        printAllNumbers(100);
    }
}