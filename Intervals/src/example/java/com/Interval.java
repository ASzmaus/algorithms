package example.java.com;


//Operations on Intervals of Numbers 
//There are two intervals closed by numerical ends and ends: p1, p2. 
//Define the program that determines the beginning and end of the intervals and the set theory product p1, p2 (the beginning is always not greater than the end). 
//The ends of the intervals a1, b1, a2, b2 should be given in the initialization the appropriate changes (of the int type) in the program

public class Interval {

	private int beg, end;

	public Interval(int a, int b) {
		this.beg = a;
		this.end = b;
	}

	Interval intersection(Interval p) {
		int start = Math.max(this.begining(), p.begining());
		int stop = Math.min(this.end(), p.end());
		if (start <= stop) {
			return new Interval(start, stop);
		} else {
			return null;
		}
	}

	public int begining() {
		if (beg < end)
			return beg;
		else
			return end;
	}

	public int end() {
		if (end > beg)
			return end;
		else
			return beg;
	}

	public String toString() {
		return "[" + this.begining() + "," + this.end() + "]";
	}
}
