package hust.soict.ite6.aims.media.disc.compactDisc;

import hust.soict.ite6.aims.media.Playable;
import hust.soict.ite6.aims.media.disc.Disc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Bui Quang Phuong 20235809

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public CompactDisc(String title, String category, float cost, String artist) {
        super(title, category, cost);
        this.artist = artist;
    }

    public CompactDisc(String title, String category, float cost, String artist, int length, String director) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        for (Track i : tracks) {
            if (Objects.equals(i, track)) {
                System.out.println("Track already existed");
                return;
            }
        }
        tracks.add(track);
        System.out.println("Track added successfully");
    }

    // Bui Quang Phuong 20235809
    public void removeTrack(Track track) {
        for (int i = 0; i < tracks.size(); ++i) {
            if (Objects.equals(tracks.get(i), track)) {
                tracks.remove(i);
                System.out.println("Track removed successfully");
                return;
            }
        }
        System.out.println("Track not exist");
    }

    @Override
    public void play() {
        System.out.println("Information of Compact Disc : \n");
        for (Track track : tracks) {
            track.play();
        }

    }
}
