
public class Room
{
    int roomNo;
    String roomName;
    public Room(int rno, String rname)
    {
        // initialise instance variables
        this.roomNo = rno;
        this.roomName = rname;
    }

    public void setroomNo(int rno)
    {
        this.roomNo = rno;
        
    }
    public void setroomName(String rname)
    {
        this.roomName = rname;
        
    }
}
