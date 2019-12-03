
public class Math {



    public static void main(String[] args) {
        Math myApp = new Math();
        
        int a = 5;

        int b = 6;

        int sum;
        int subSum;

        sum = myApp.add(a, b);
        subSum = myApp.sub(a, b);

        System.out.println(sum);
        System.out.println(subSum);



    }

    public int add(int first, int second) {
        int sum;
        sum = first + second;
        return sum;
    }

    public int sub(int first, int second) {
        int subSum;
        subSum = first - second;
        return subSum;
    }
}
