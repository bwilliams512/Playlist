/*
This project involves building a playlist with
the best possible playlist of music using a Java ArrayList.
*/

import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        
        // creating playlist
        ArrayList<String> desertIslandPlaylist;
        desertIslandPlaylist = new
                ArrayList<>();

        // adding songs to playlist
        desertIslandPlaylist.add("Purple Haze - Jimi Hendrix");
        desertIslandPlaylist.add("Whole Lotta Love - Led Zeppelin");
        desertIslandPlaylist.add("Under Pressure - Queen and David Bowie");
        desertIslandPlaylist.add("Rockin in the Free World - Neil Young");
        desertIslandPlaylist.add("Comfortably Numb - Pink Floyd");
        desertIslandPlaylist.add("The Boys are Back in Town - Thin Lizzy");
        desertIslandPlaylist.add("Iron Man - Black Sabbath");
        desertIslandPlaylist.add("Barracuda - Heart");
        desertIslandPlaylist.add("American Girl - Tom Petty and the Heartbreakers");
        desertIslandPlaylist.add("Tom Sawyer - Rush");

        // printing playlist
        // System.out.println(desertIslandPlaylist);

        // checking playlist size
        // System.out.orintln(desertIslandPlaylist.size());

        // removing songs
        desertIslandPlaylist.remove("Whole Lotta Love - Led Zeppelin");
        desertIslandPlaylist.remove("Rockin in the Free World - Neil Young");
        desertIslandPlaylist.remove("The Boys are Back in Town - Thin Lizzy");
        desertIslandPlaylist.remove("Barracuda - Heart");
        desertIslandPlaylist.remove("Tom Sawyer - Rush");

        // printing playlist
        // System.out.println(desertIslandPlaylist.size());

        // swapping songs
        int indexA = desertIslandPlaylist.indexOf("Under Pressure - Queen and David Bowie");
        int indexB = desertIslandPlaylist.indexOf("Comfortably Numb - Pink Floyd");
    
        String tempA = "Under Pressure - Queen and David Bowie";
    
        desertIslandPlaylist.set(indexA, "Comfortably Numb - Pink Floyd");
    
        // System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(indexB, tempA);
        System.out.println(desertIslandPlaylist);
        
    }
}
