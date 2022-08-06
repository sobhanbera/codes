package Data_Structure;
 
import java.util.ArrayList;

public class ArrayListQuestion {

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval){
		
		if(intervals == null) {
			intervals = new ArrayList<Interval>();
			intervals.add(newInterval);
			return intervals;
		}else if(intervals.size() == 0){
			intervals.add(newInterval);
			return intervals;
		}
		
		int i=0;
		Interval toInsert = newInterval;
		while(i<intervals.size()){
			Interval current = intervals.get(i);
			if(current.end < toInsert.start) {
				i++;
				continue;
			}
			else if(toInsert.end < current.start) {
				intervals.add(i,toInsert);
				break;
			}
			else {
				toInsert.start = Math.min(toInsert.start, current.start);
				toInsert.end = Math.max(toInsert.end, current.end);
				intervals.remove(i);
			}
		}
		
		if(i==intervals.size()) {
			intervals.add(toInsert);
		}
		
		return intervals;
	}

}

class Interval{
	int start;
	int end;
	Interval(){start=0;end=0;}
	Interval(int s,int e){start=s;end=e;}
}
