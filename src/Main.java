
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String artist;
        String title;
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i< 10;i++){
            System.out.println("Please enter an Artist:");
            artist = scan.nextLine();
            System.out.println("Please enter a Song title:");
            title =scan.nextLine();
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song xxxx: songs){
            System.out.println(xxxx.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song xxxx: songs){
            if (xxxx.getTitle().equalsIgnoreCase(titleToFind)){
                System.out.printf("\nI found %s \r\n",xxxx.display());
            }
        }
    }
}