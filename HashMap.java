import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args){
        // Create a trackList of type hashMap
        HashMap<String, String> trackList = new HashMap<> ();

        // Add in at least 4 songs that are stored by title
        trackList.put("Song1", "Lyric for song 1");
        trackList.put("Song2", "Lyric for song 2");
        trackList.put("Song3", "Lyric for song 3");
        trackList.put("Song4", "Lyric for song 4");

        // Pull out one of the songs by its title
        String songTitle = "Song2";
        String lyricsForSong = trackList.get(songTitle);
        System.out.println("Pulled out song: " + songTitle + " with Lyrics" +lyricsForSong);

        //print out all the track names and lyrics in the format ' Track: Lyrics'
        System.out.println("\nAll Tracks and Lyrics:");
        for(Map.Entry<String, String> entry : trackList.entrySet()){
            System.out.println("Track: " + entry.getKey() + ", Lyrics: " + entry.getValue());
        }
    }
}