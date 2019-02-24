import java.io.IOException;
import java.util.*;

class Main {

    public static void main(String[] args) {

       DataReader dataReader = new DataReader();
       DataWriter dataWriter = new DataWriter();

       try {
           LinkedHashMap<Integer, Player> players = dataReader.addPlayers();
           dataWriter.exportToFile(players);
       } catch (NullPointerException e) {
           System.err.println("Podałeś nieprawidłowe dane zawodnika.");
       } catch (IOException e) {
           System.err.println("Błąd zapisu danych.");
       }

    }

}