package stream.byteSymbolStream;
import java.io.*;

class InputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);  // выводим символы из файла
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class OutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String data = "Hello, World!";
            for (int i = 0; i < data.length(); i++) {
                fos.write(data.charAt(i));  // записываем символы в файл
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//
//Ответ: Дополнительные иерархии, основанные на абстрактных классах Reader и Writer, предназначены для работы с текстовыми данными.
//InputStream и OutputStream работают с байтовыми данными, а Reader и Writer - с символьными.
//Reader и Writer предоставляют методы, специфичные для работы с текстом, например, read() и write() работают с символами, а не с байтами.


class AutoCloseableExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // После выхода из блока try, файл автоматически закрывается, благодаря AutoCloseable
    }
}

public class Main {

}
