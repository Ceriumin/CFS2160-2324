package Task4;
import java.text.DecimalFormat;
import java.util.Formatter;

public class Main
{
    //Formatter to format the output more neatly
    private static Formatter formatter = new Formatter();
    private static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args)
    {
        Team team = new Team(); 
        setVolunteers(team);

        //This is a solution to use the built in formatter to format the output more neatly into a table
        formatter.format("%-10s %10s %10s", "Name", "Boxes", "Total");
        for(Volunteer volunteer : team.getTeam())
        {
            new Main().Volunteer(volunteer.getName(), volunteer.getBoxes(), team); 
        }

        //Prints the main headings of the table
        System.out.println(formatter);
    }

    private void Volunteer(String name, int boxes, Team team)
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

        //Loops through the team and prints them formatted into a table
        formatter.format("\n%-10s %10d %10s", name, boxes, "£" + df.format(total));
    }

    //Function to set the volunteers to keep the code clean and organised.
    private static void setVolunteers(Team team)
    {
        team.addVolunteer(new Volunteer("Sofya", 127));
        team.addVolunteer(new Volunteer("Steve", 46));
        team.addVolunteer(new Volunteer("Muhammed", 273));
        team.addVolunteer(new Volunteer("Amaara", 129));
        team.addVolunteer(new Volunteer("John", 129));
        team.addVolunteer(new Volunteer("Tony", 17));

        //Adds more boxes to the volunteers
        team.getVolunteer(0).addBoxes(13);
        team.getVolunteer(1).addBoxes(9);
        team.getVolunteer(2).addBoxes(27);
        team.getVolunteer(3).addBoxes(33);
        team.getVolunteer(4).addBoxes(39);
        team.getVolunteer(5).addBoxes(106);
        
    }

}
