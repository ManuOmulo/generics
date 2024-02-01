interface Player {}

record FootballPlayer (String name, String position) implements Player {}
record BasketballPlayer (String name, String position) implements Player {}

public class Main {
  public static void main(String[] args) {
    Team<FootballPlayer> chiefs = new Team<>("Kansas City Chiefs");
    chiefs.addTeamMember(new FootballPlayer("Patrick Mahomes", "Quarterback"));
    chiefs.addTeamMember(new FootballPlayer("Travis Kelce", "Tight End"));
    chiefs.listTeamMembers();

    Team<FootballPlayer> ravens = new Team<>("Baltimore Ravens");
    ravens.addTeamMember(new FootballPlayer("Lamar Jackson", "Quarterback"));
    ravens.addTeamMember(new FootballPlayer("Zay Flowers", "Receiver"));
    ravens.addTeamMember(new FootballPlayer("Odell Beckam", "Receiver"));

    gameResult(chiefs, 27, ravens, 24);

    Team<BasketballPlayer> lakers = new Team<>("LA Lakers");
    lakers.addTeamMember(new BasketballPlayer("Lebron James", "Forward"));
    lakers.addTeamMember(new BasketballPlayer("Austin Reaves", "Point Guard"));

    Team<BasketballPlayer> grizzlies = new Team<>("Memphis Grizzlies");
    grizzlies.addTeamMember(new BasketballPlayer("Ja Morant", "Point Guard"));
    grizzlies.addTeamMember(new BasketballPlayer("Steven Adams", "Center"));

    gameResult(grizzlies, 124, lakers, 131);
  }

  public static void gameResult(Team team1, int team1Score, Team team2, int team2Score) {
    String message = team1.setScore(team1Score, team2Score);
    team2.setScore(team2Score, team1Score);
    System.out.printf("%s %s %s\n", team1, message, team2);
  }
}
