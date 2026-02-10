import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String soal = sc.next();

        switch (soal) {

            // ================= SOAL 1 =================
            case "Soal1": {

                int a = sc.nextInt();
                int b = sc.nextInt();

                // Deteksi overflow tanpa long
                if ((b > 0 && a > Integer.MAX_VALUE - b) ||
                    (b < 0 && a < Integer.MIN_VALUE - b)) {

                    System.out.println("OVERFLOW");
                } else {
                    System.out.println(a + b);
                }

                break;
            }

            // ================= SOAL 2 =================
            case "Soal2": {

                double x = sc.nextDouble();
                double y = sc.nextDouble();

                float fSum = (float) x + (float) y;
                double dSum = x + y;

                double diff = Math.abs(fSum - dSum);

                System.out.printf("%.6f\n", diff);

                break;
            }

            // ================= SOAL 3 =================
            case "Soal3": {

                int N = sc.nextInt();

                Integer a = N;
                Integer b = a;

                a = a + 1;

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));

                break;
            }

            // ================= SOAL 4 =================
            case "Soal4": {

                String S = sc.next();

                String a = S;
                String b = new String(S);

                a = a + "X";

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));

                break;
            }

            // ================= SOAL 5 =================
            case "Soal5": {

                String sInt = sc.next();
                String sDouble = sc.next();
                String sBool = sc.next();

                int i = Integer.parseInt(sInt);
                double d = Double.parseDouble(sDouble);
                boolean b = Boolean.parseBoolean(sBool);

                double result = i * d;

                if (!b) {
                    result *= -1;
                }

                System.out.printf("%.2f\n", result);

                break;
            }

        }

        sc.close();
    }
}

