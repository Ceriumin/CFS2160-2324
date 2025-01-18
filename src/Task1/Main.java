package Task1;
public class Main
{
    public static void main(String[] args)
    {
        //Initialises the main class and calls the Volunteer function with preset values
        Main app = new Main();
        app.Volunteer("Bob", 100);
    }
    
    private void Volunteer(String name, int boxes)
    {
        double wage = 0.15;
        double total = wage * boxes;

        if(boxes <= 0)
        {
            //Checks if the user has entered a negative number of boxes
            System.out.println("You cannot volunteer no boxes");
            return;
        } else 
            System.out.println(name + " earned £" + total + " for volunteering.");

    }

}