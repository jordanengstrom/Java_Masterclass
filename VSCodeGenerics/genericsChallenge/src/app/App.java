package app;


        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

public class App {

    public static void main(String[] args) {
	    // FootballPlayer joe = new FootballPlayer("Joe");
        // BaseballPlayer pat = new BaseballPlayer("Pat");
        // SoccerPlayer beckham = new SoccerPlayer("Beckham");

        // Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        // adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        // System.out.println(adelaideCrows.numPlayers());

        // Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        // baseballTeam.addPlayer(pat);

        // Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        // brokenTeam.addPlayer(beckham);

        // Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        // FootballPlayer banks = new FootballPlayer("Gordon");
        // melbourne.addPlayer(banks);

        // Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        // Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        // hawthorn.matchResult(fremantle, 1, 0);
        // hawthorn.matchResult(adelaideCrows, 3, 8);

        // adelaideCrows.matchResult(fremantle, 2, 1);
////        adelaideCrows.matchResult(baseballTeam, 1, 1);

        // System.out.println("Rankings");
        // System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        // System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        // System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        // System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        // System.out.println(adelaideCrows.compareTo(melbourne));
        // System.out.println(adelaideCrows.compareTo(hawthorn));
        // System.out.println(hawthorn.compareTo(adelaideCrows));
        // System.out.println(melbourne.compareTo(fremantle));

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        // We won't be able to add this (on purpose)
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorn);
        footballLeague.addTeam(fremantle);
 
        // This won't work
        //footballLeague.addTeam(baseballTeam);
    }
}