public class Week4 {
    public static int max2Int(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int minArray (int[] array) {
        final int n = array.length;
        int Minn = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] <= Minn) {
                Minn = array[i];
            }
        }
        return Minn;
    }

    public static String calculateBMI(double weight, double height){
        double BMI;
        String S="";
        BMI = (double)((double)weight / (double)(height * height));
        BMI = (Math.round(BMI*10.0))/10.0;
        if (BMI < 18.5) {
            S += "Thiếu cân";
        } else if (BMI >= 18.5 && BMI <= 22.9) {
           S += "Bình thường";
        } else if (BMI >= 23 && BMI <= 24.9) {
            S += "Thừa cân";
        } else if (BMI >= 25) {
            S += "Béo phì";
        }
        return S;
    }
} 