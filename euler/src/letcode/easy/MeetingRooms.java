package letcode.easy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class MeetingRooms {
  public boolean canAttendMeetings(int[][] intervals) {

    Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
      for(int i=0; i<intervals.length-1; i++){
        if(intervals[i][1] > intervals[i+1][0])
          return false;
      }
    return true;
  }

  @Test
  public void canAttendMeetings(){
    int[][] val1 = {{0,30},{5,10},{15,20}};
    Assert.assertFalse(canAttendMeetings(val1));
    int[][] val2 = {{7,10},{2,4}};
    Assert.assertTrue(canAttendMeetings(val2));
  }
}
