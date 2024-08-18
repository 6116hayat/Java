// importing all the necessary library
import java.io.*;
import java.lang.*;
import java.util.*;

//
interface one  {
    public void indoor_games();
}

interface two{
    public void outdoor_games();
}

interface three extends one, two{
    public void video_games(); // cant add body
}

class games implements three{
    @Override  public void indoor_games(){
        System.out.println("Indoor Games");
    }

    public void outdoor_games(){
        System.out.println("Outdoor Games");
    }
}

// Driver class
public class multi_interfaces {
    public static void main(String[] args) {

        games g = new games();
        g.indoor_games();
        g.outdoor_games();

    }
}
