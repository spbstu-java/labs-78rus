import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {
        public static void main(String[] args) {

        File file = new File("lab2/src/doc.txt");

        try {
            int n = getNum(file);
            if (n < 1 || n > 1_000_000) {
                throw new NumberLimitException("Число должно быть от 1 до 1000000!");
            }
            double[][] arr = Matrix.creator(n);

            Matrix.placeHolder(arr);

            Matrix.writer(arr);

            Matrix.devide(arr);

            Matrix.writer(Matrix.turnArr90Back(arr));

            Matrix.writer(Matrix.turnArr180Back(arr));

            Matrix.writer(Matrix.turnArr270Back(arr));

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    private static int getNum(File file) throws IOException {
        try (Scanner scanner = new Scanner(file)) {
            return scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new NoFileOrAccessException("Файл не найден или отсутсвует.");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Нецелое число или неверные данные.");
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Пустой файл.");
        }
    }
}