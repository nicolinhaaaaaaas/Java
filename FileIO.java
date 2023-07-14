import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
  public static void main(String[] args) {

	  //uma array de strings
    String[] names = {"Nicolas", "Anabel", "Thiago"};
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
      writer.write("Escrevendo em um arquivo");
      writer.write("\noutra linha");
      
      //isso ta jogando os nomes na array dentro do arquivo
      for (String name : names) {
        writer.write("\n" + name);
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    //aqui pra poder ler
    try {
      BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
      String line;
      //isso to puxando todas as linhas uma por uma
      while((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
