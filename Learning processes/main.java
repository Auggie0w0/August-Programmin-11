public class main {
    public static void main(String [] args) {
        int[] integers = new int[5];
        integers[2] = 10;
        System.out.println(integers);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++) {
            arr[i] = i*2;
            System.out.print(arr[i]);
        }

    }
//    static double pyth(double a, double b) {
//        return Math.sqrt(a * a + b * b);
//    }

//    static double squareRoot(double num) {
//        double epsilon = 0.00001;
//        double ans = 0;
//        double increment = 0.001;
//        int count = 0;
//
//        while (Math.abs(ans * ans - num) > epsilon) {
//            ans += increment;
//            count++;
//        }
//        if (Math.abs(ans * ans - num) < epsilon) {
//            System.out.println("Found the square root at count: " + count + "It is: " + ans);
//            return ans;
//        } else {
//            System.out.println("Failed to find square root");
//            return ans;
//        }
//    }
//
//
//    public static void main(String[] args) {
////        double a = 3;
////        double b = 4;
////        double c = pyth(a,b);
////        System.out.println("Hypotenuse:" + c);
//        System.out.println(squareRoot(76));
//    }
}