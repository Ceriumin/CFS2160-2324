package Task3;
import java.util.ArrayList;

public class Team
{
    //Stores all the volunteers in the team in an ArrayList
    private ArrayList<Volunteer> team = new ArrayList<Volunteer>();

    public void addVolunteer(Volunteer volunteer) {
        team.add(volunteer);
    }

    public void removeVolunteer(Volunteer volunteer) {
        team.remove(volunteer);
    }

    public ArrayList<Volunteer> getTeam() {
        return team;
    }
}
