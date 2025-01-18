package Task4;
import java.util.ArrayList;

public class Team
{
    private ArrayList<Volunteer> team = new ArrayList<Volunteer>();

    public void addVolunteer(Volunteer volunteer) {
        if(volunteer == null) {
            throw new IllegalArgumentException("Volunteer cannot be null");
        }

        team.add(volunteer);
    }

    public void removeVolunteer(Volunteer volunteer) {
        team.remove(volunteer);
    }

    //Method to get volunteer by index
    public Volunteer getVolunteer(int index) {
        if(index < 0 || index >= team.size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return team.get(index);
    }


    //Alternative method to get volunteer by name instead of index

    /*public Volunteer getVolunteer(String name) {
        for(Volunteer volunteer : team) {
            if(volunteer.getName().equals(name)) {
                return volunteer;
            }
        }
        return null;
    }*/
    

    public ArrayList<Volunteer> getTeam() {
        return team;
    }

    public int getTeamSize() {
        return team.size();
    }
}
