package pl.wkos.homework151;

import java.io.*;
import java.util.List;

public class WriteData {
    public static void writeToTextFile(String fileName, List<Person> lista) {
        try (
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ){
            for(Person item : lista){
                bufferedWriter.write(item.getFirstName() + " " + item.getLastName() + ";" + item.getResult() + "\n");
            }
        }catch (IOException e){
            System.out.println("Błąd wyjścia");
        }
    }
}
