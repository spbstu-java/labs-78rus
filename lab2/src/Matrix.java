import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Matrix {
    private static final Logger LOGGER = Logger.getLogger(Matrix.class.getName());
    public static double[][] devide(double arr[][]) throws DivisionByZeroException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                double sum = 0.0;
                if (i > 0) {
                    sum += arr[i-1][j];
                }
                if (i < arr.length - 1) {
                    sum += arr[i+1][j];
                }
                if (j > 0) {
                    sum += arr[i][j-1];
                }
                if (j < arr[0].length - 1) {
                    sum += arr[i][j+1];
                }
                if (sum == 0) {
                    throw new DivisionByZeroException("Делить на 0 нельзя!");
                }
                arr[i][j] =arr[i][j] / sum;
            }
        }
        return arr;
    }

    public static void writer(double arr[][]) throws IOException {
        try (FileWriter writer = new FileWriter("lab2/src/output.txt", true)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    writer.write(String.format("%.2f", arr[i][j]));
                    writer.write("\t");
                }
                writer.write("\n");
            }
            writer.write("\n");
        } catch (IOException e) {
            throw new IOException("Проблемы с записью в файл");
        }
    }

    public static void placeHolder(double arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Math.random();
            }
        }
    }

    public static double[][] creator(int a) {
        try{
            double arrays[][] = new double[a][a];
                for (int i = 0; i < arrays.length; i++) {
                    for (int j = 0; j < arrays[0].length; j++) {
                        arrays[i][j]=0;
                    }
                 }
            return arrays;
        } catch (OutOfMemoryError e) {
            LOGGER.log(Level.WARNING, "Память закончилась");
            return new double[0][0];
        }
    }

    public static double[][] turnArr90Back(double arr[][]) {
        double turnArr[][] = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                turnArr[i][j] = arr[j][arr.length - i - 1];
            }
        }
        return turnArr;
    }

    public static double[][] turnArr180Back(double arr[][]) {
        double turnArr[][] = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                turnArr[i][j] = arr[arr.length - i - 1][arr.length - j - 1];
            }
        }
        return turnArr;
    }

    public static double[][] turnArr270Back(double arr[][]) {
        double turnArr[][] = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                turnArr[i][j] = arr[arr.length - j - 1][i];
            }
        }
        return turnArr;
    }
}
