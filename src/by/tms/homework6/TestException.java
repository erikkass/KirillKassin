package by.tms.homework6;

public final class TestException {


    public static void main(String[] args) {

        try {
            String str = null;
            str.charAt(1);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


        try {
            checkIllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            throwsRandomException();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            System.out.println(e3.getMessage());
        }


        try {
            HalfCaseException();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Конец!");
        }
    }


    public static void checkArrayIndexOutOfBoundsException() {


        try {
            throw new ArrayIndexOutOfBoundsException("Выход индекса за пределы массива");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void checkIllegalArgumentException() throws IllegalArgumentException {
        throw new IllegalArgumentException("Недопустимый аргумент при вызове метода");
    }


    public static void checkException2() throws MyUncheckedException {
        try {
            checkException1();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new MyUncheckedException();
        }
    }


    public static void checkException1() throws IllegalCallerException {
        throw new IllegalCallerException("Метод нельзя выполнить");
    }


    public static void throwsRandomException() throws ArithmeticException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                throw new ArithmeticException("Арифметическая ошибка");
            case 1:
                throw new ArrayIndexOutOfBoundsException("Выход индекса за пределы массива");
            case 2:
                throw new IllegalArgumentException("Недопустимый аргумент при вызове метода");
        }
    }


    public static void HalfCaseException() throws ArithmeticException {
        int random = (int) (Math.random() * 2);
        int x = 10 / random;
        throw new ArithmeticException("Деление на ноль");
    }

}
