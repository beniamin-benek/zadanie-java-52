import java.util.LinkedHashMap;
import java.util.Scanner;

class DataReader {

    LinkedHashMap<Integer,Player> addPlayers() {

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<Integer,Player> players = new LinkedHashMap<>();
        int i = 0;
        String input;

        do {
            System.out.println("Podaj wynik kolejnego gracza (lub stop):");
            input = scanner.nextLine();
            if (!input.equals("stop")) {
                String[] data = input.split(" ");
                if (data.length != 3) throw new NullPointerException();
                try {
                    Player player = new Player(data[0], data[1], Integer.valueOf(data[2]));
                    players.put(i, player);
                    System.out.println("Dodano " + player.toString());
                    i++;
                } catch (NumberFormatException e) {
                    System.err.println("Podałeś nieprawidłowy wynik. Spróbuj ponownie:");
                }
            }
        } while (!input.equals("stop"));

        return players;
    }

}