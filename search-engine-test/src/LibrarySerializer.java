
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LibrarySerializer {

    public void saveLibrary(List<Book> books, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
                            // TODO - missing code
            oos.writeObject(books);
            System.out.println("Library Saved successfully to "+fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Book> loadLibrary(String fileName) {
        File file = new File(fileName);
        if (!file.exists() || file.length() == 0) {
            System.err.println("The file does not exist or is empty: "+fileName);
            return null;
        }

        try
                (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            // TODO - missing code
//            Deserializing the list of books
            return (List<Book>)ois.readObject();
        }
        catch (EOFException e) {

            System.err.println("The file is empty or corrupted: " + fileName);
            return null;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

