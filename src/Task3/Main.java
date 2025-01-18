package Task3;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Team team = new Team(); 
        //Adds volunteers to the team, hardcoded for the purpose of the task
        team.addVolunteer(new Volunteer("Sofya", 127));
        team.addVolunteer(new Volunteer("Steve", 46));
        team.addVolunteer(new Volunteer("Muhammed", 273));
        team.addVolunteer(new Volunteer("Amaara", 129));
        team.addVolunteer(new Volunteer("John", 129));
        team.addVolunteer(new Volunteer("Tony", 17));

        //Loops through the team and calls the Volunteer function for each volunteer
        for(Volunteer volunteer : team.getTeam())
        {
            new Main().Volunteer(volunteer.getName(), volunteer.getBoxes());
        }
    }

    void Volunteer(String name, int boxes)
    {
        //Decimal formatter to format the output to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");

        double wage = 0.15;
        double increasedWage = 0.20;

        double total = 0;


        if(boxes > 50)
        {
            total = wage * 50;
            total += (boxes - 50) * increasedWage;
        } else
            total = wage * boxes;

        if(boxes <= 0)
        {
            System.out.println("You cannot volunteer no boxes");
            return;
        } else 
            System.out.println(name + " earned £" + Double.valueOf(df.format(total)) + " for volunteering.");

    }

}
