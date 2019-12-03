
public class Math {



    public static void main(String[] args) {
        Math myApp = new Math();

        int a = 5;
        int b = 6;

        int sum;

        sum = myApp.add(a, b);

        System.out.println(sum);




    }

    public int add(int first, int second) {
        int sum;
        sum = first + second;
        return sum;
    }
}
