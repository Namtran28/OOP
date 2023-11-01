import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {

    /**
     * nullPointerEx.
     * @return - String.
     */
    public String nullPointerExTest() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
           return "Lỗi Null Pointer";
        }
    }

    /**
     * arrayIndexOutOfBoundsEx.
     * @return - String.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /**
     * arithmeticEx.
     * @return - String.
     */
    public String arithmeticExTest() {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
    }

    /**
     * fileNotFoundEx.
     * @return - String.
     */
    public String fileNotFoundExTest() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
    }

    /**
     * ioEx.
     * @return - String.
     */
    public String ioExTest() {
        try {
            throw new IOException();
        } catch (IOException e) {
            return "Lỗi IO";
        }
    }
} 