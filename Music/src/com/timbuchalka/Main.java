package com.timbuchalka;

import com.timbuchalka.model.Album;
import com.timbuchalka.model.Artist;
import com.timbuchalka.model.Datasource;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_ASC);
        if(artists == null) {
            System.out.println("no artists");
            return;
        }
        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albumsForArtist = datasource.queryAlbumsForArtists("Carole King", Datasource.ORDER_BY_ASC);
        for(String album : albumsForArtist) {
            System.out.println(album);
        }

        datasource.close();
    }
}
