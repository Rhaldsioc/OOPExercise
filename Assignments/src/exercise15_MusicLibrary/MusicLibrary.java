package exercise15_MusicLibrary;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    private ArrayList<String> songs = new ArrayList<>();
    private Random rand = new Random();

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in library! - musicLibrary.java:20");
            return;
        }
        int index = rand.nextInt(songs.size());
        System.out.println("Now playing: - musicLibrary.java:24" + songs.get(index));
    }
}
