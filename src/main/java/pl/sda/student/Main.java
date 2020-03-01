package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Category poezja = new Category("poezja");
        Author Byron = new Author("Byron", "Kowalski");
        Book Wiersze = new Book("Wiersze", Byron, poezja);

        Category historia = new Category("historia");
        Author Artur = new Author("Artur", "Jackowski");
        Book Dzieje = new Book("Dzieje", Artur, historia);
        Book Dawno = new Book("Dawno", Artur, historia);

        Category beletrystyka = new Category("beletrystyka");
        Author Baba = new Author("Baba", "Gupia");
        Book Beksa = new Book("Beksa", Baba, historia);

        List<Book> Lista = new ArrayList<>();

        ObjectMapper objectMapper = new ObjectMapper();
        try {

            objectMapper.writeValue(new File("Lista.json"), Lista);
        }
        catch (IOException e)   {
            e.printStackTrace();
        }
    }
}
