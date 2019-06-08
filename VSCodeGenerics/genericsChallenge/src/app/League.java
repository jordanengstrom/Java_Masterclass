package app;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{

    public String name; 
    private List<T> league = new ArrayList<>();

    public boolean addTeam(T team){
        if(league.contains(team)){
            return false;
        } else {
            league.add(team);
            return true;
        }
    }

    public void printLeague() {

        Collections.sort(league);

        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
    

    public League(String name) {
        this.name = name;
    }


}