package Task6;

public class Volunteer {
    private String name;
    private boolean isLeader;
    private int boxes;

    public Volunteer(String name, int boxes) {
        this.name = name;
        this.boxes = boxes;
    }

    public int addBoxes(int boxes) {
        if(boxes < 0)
            throw new IllegalArgumentException("Boxes cannot be negative");
        return this.boxes += boxes;
    }

    public int removeBoxes(int boxes) {
        if(boxes < 0)
            throw new IllegalArgumentException("Remove boxes using a positive number");
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

    /*Method to set the leader of the team, returns true if the volunteer is the leader should the method
     * be called. The method also appends a '*' to the name of the volunteer if they are the leader, as 
     * an identifier. This also removes the '*' if the volunteer is no longer the leader. 
    */

    public boolean setLeader(boolean leader) {
        if(leader && !isLeader) {
            isLeader = true;
            if (!name.endsWith("*")) {
                name += "*";
        } else if(!leader) {
            isLeader = false;
            name = name.replace("*", "");
        }
        }
        return isLeader;
    }

    public boolean isLeader() {
        return isLeader;
    }
    
}


