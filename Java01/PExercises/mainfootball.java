package PExercises;
import PFootballtournament.match;
import PFootballtournament.player;
import PFootballtournament.team;
import PFootballtournament.tournament;

public class mainfootball {
    public static void main(String[] args){
        team team = new team();
        team.name = "Real Place";
        team.players = "Luis and Pablo";

        player player = new player();
        player.name = "Luis Carlos";
        player.age = 19;
        player.position = "Central";
        player.team = "Real Place";

        match match = new match();
        match.team1 = "Real Place";
        match.team2 = "Real America";
        match.score1 = 100;
        match.score2 = 120;
        match.winner = "Real place";

        tournament tournament = new tournament();
        tournament.name = "Summer";
        tournament.teams = "Real Place and Real America";
        tournament.matches = "Monday";
    }    
}
