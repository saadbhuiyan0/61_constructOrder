/**
  Exercise constructing  an OrderedList
  from unordered data.
 */
import java.util.ArrayList;  // shortcut

public class UserWantsOrder {
    
    public static void main(String[] commandLine) {
        System.out.println();
        
        // create the data destined for OL_iAS
        ArrayList<Integer> chaos =
           new ArrayList<Integer>();
        chaos.add( 111);  // lowest first
        chaos.add( 113);
        chaos.add( 115);
        chaos.add( 116);
        chaos.add( 114);
        chaos.add( 112);  // second-lowest is last
        System.out.println(
            "unordered data: " + chaos
          + System.lineSeparator());
          
        System.out.println(
            "constructed: "
          + new OrderedList_inArraySlots( chaos)
          + System.lineSeparator());
    }
}
