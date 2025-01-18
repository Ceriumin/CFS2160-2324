package Task4;

public class Volunteer {
    private String name;
    private int boxes;

    public Volunteer(String name, int boxes) {
        this.name = name;
        this.boxes = boxes;
    }

    //Function to add more boxes to the volunteer
    public int addBoxes(int boxes) {
        if(boxes < 0)
            throw new IllegalArgumentException("Boxes cannot be negative");
        return this.boxes += boxes;
    }

    //Function to remove boxes from the volunteer
    public int removeBoxes(int boxes) {
        if(boxes < 0)
            throw new IllegalArgumentException("Remove boxes by a positive number");
        return this.boxes -= boxes;
    }

    public String getName() {
        return name;
    }

    public int getBoxes() {
        if(boxes < 0)
            return 0;
        else
            return boxes;
    }
    
}


