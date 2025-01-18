package Task6;
import java.text.DecimalFormat;
import java.util.Formatter;

public class Main
{
    //Objects using formatting to format the output more neatly
    private static Formatter formatter = new Formatter();
    private static DecimalFormat df = new DecimalFormat("#.##");
    private static Team team = new Team(); 

    public static void main(String[] args)
    {
        setVolunteers();
        team.sortTeam();

        formatter.format("%-10s %10s %10s", "Name", "Boxes", "Total");
        for(Volunteer volunteer : team.getTeam())
        {
            new Main().Volunteer(volunteer.getName(), volunteer.getBoxes(), team, volunteer.isLeader()); 
        }
        System.out.println(formatter);
    }

    private void Volunteer(String name, int boxes, Team team, boolean isLeader)
    {
        double wage = 0.15;
        double increasedWage = 0.20;
        double total = 0;

        if(boxes > 50)
        {
            total = wage * 50;
            total += (boxes - 50) * increasedWage;
        } else
            total = wage * boxes;
        
        if(isLeader)
            total = total * 1.2;

        formatter.format("\n%-10s %10d %10s", name, boxes, "£" + df.format(total));
    }

    /*Function to set the volunteers to keep the code clean and organised. 
    There may be some errors when editing the code here itself, but in real application
    this would be handled through an interface or a database*/
     
    private static void setVolunteers()
    {
        team.addVolunteer(new Volunteer("Sofya", 127));
        team.addVolunteer(new Volunteer("Steve", 46));
        team.addVolunteer(new Volunteer("Muhammed", 273));
        team.addVolunteer(new Volunteer("Amaara", 129));
        team.addVolunteer(new Volunteer("John", 129));
        team.addVolunteer(new Volunteer("Tony", 17));
        team.addVolunteer(new Volunteer("Sarah", 385));

        /* Uses index to get the name instead of a String, this is also described in the comments of the Team class 
         * This is a solution to avoid using a string to get the name of the volunteer, which can be prone to duplication
         * and would once again, be handled through an interface to avoid duplicate volunteers
        */
        team.getVolunteer(0).addBoxes(13);
        team.getVolunteer(1).addBoxes(9);
        team.getVolunteer(2).addBoxes(27);
        team.getVolunteer(3).addBoxes(33);
        team.getVolunteer(4).addBoxes(39);
        team.getVolunteer(5).addBoxes(106);

    }

}
