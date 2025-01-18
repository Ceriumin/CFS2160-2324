package Task6;
import java.util.ArrayList;

public class Team
{
    private ArrayList<Volunteer> team = new ArrayList<Volunteer>();
    
    public void addVolunteer(Volunteer volunteer) {

        /*Regex to check if the name contains only alphabets, this is good to have as it ensures that the name is valid
        * as in an applicable real world scenario, there may be numbers or special characters in the name which may not be valid,
        * especially an asterisk which can fool the system and think the volunteer added is a team leader. 
        */

        if(volunteer.getName().matches("[a-zA-Z]+")) {
            team.add(volunteer);
        }
        
        else {
            System.out.println("Invalid name");
        }
    }

    public void removeVolunteer(Volunteer volunteer) {
        team.remove(volunteer);
    }

    public Volunteer getVolunteer(int index) {
        try
        {
            return team.get(index);
        }
        catch(Exception e)
        {
            System.out.println("Index out of bounds");
            return null;
        }
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

    public void sortTeam()
    {
        team.sort((volunteer1, volunteer2) -> {
            if(volunteer1.getBoxes() == volunteer2.getBoxes())
                return volunteer1.getName().compareTo(volunteer2.getName());
            return volunteer2.getBoxes() - volunteer1.getBoxes();
        });
    }
}
