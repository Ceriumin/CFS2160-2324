package Task2;
public class Main
{
    
    public static void main(String[] args)
    {
        Main app = new Main();
        app.Volunteer("Bob", 200);
    }
    
    private void Volunteer(String name, int boxes)
    {
        /*Wages for the volunteers based off the number of boxes they have volunteered
        * should it be changed, it can be done here through the variables*/

        double wage = 0.15;
        double increasedWage = 0.20;

        double total = 0;

        //Calculates the wage based off the criteria. First 50 boxes are paid at the normal wage, the rest at the increased wage
        if(boxes > 50)
        {
            total = wage * 50;
            total += (boxes - 50) * increasedWage;
        } else
            total = wage * boxes;

        if(boxes <= 0)
        {
            //Checks if the user has entered a negative number of boxes
            System.out.println("You cannot volunteer no boxes");
            return;
        } else 
            System.out.println(name + " earned £" + total + " for volunteering.");

    }

}