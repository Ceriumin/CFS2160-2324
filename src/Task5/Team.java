package Task5;
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

    //Sorts the team based on the number of boxes each volunteer has, then by alphabetical order
    public void sortTeam()
    {
        team.sort((volunteer1, volunteer2) -> {
            if(volunteer1.getBoxes() == volunteer2.getBoxes())
                return volunteer1.getName().compareTo(volunteer2.getName());
            return volunteer2.getBoxes() - volunteer1.getBoxes();
        });
    }
}
