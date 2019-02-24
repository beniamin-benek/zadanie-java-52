import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

class DataWriter {

    void exportToFile(LinkedHashMap<Integer,Player> players) throws IOException {

        List<Player> playersArray = new LinkedList<>();

        for (int i = 0; i < players.size(); i++)
            playersArray.add(players.get(i)); //kopiuje elementy mapy do listy, zeby je posortowac

        Collections.sort(playersArray);

        FileWriter fileWriter = new FileWriter("stats.csv", false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Player player : playersArray)
            bufferedWriter.write(player.getFirstName() + ";" + player.getLastName() + ";" + player.getScore() + "\n");

        bufferedWriter.close();

        System.out.println("\nDane posortowano i zapisano do pliku stats.csv.");

    }

}