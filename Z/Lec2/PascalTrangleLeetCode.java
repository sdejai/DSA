package code;

import java.util.ArrayList;
import java.util.List;

class Solution{
    public List<List<Integer>> generate(int numberOfOrder) {
        List<List<Integer>> lt = new ArrayList<>();
        int row=0;
		int star=1;
		while(row<numberOfOrder) {
			int col=0;
			int val=1;
            List<Integer> inLt = new ArrayList<Integer>();
			while(col<star) {
				inLt.add(val);
				val=(((row-col)*val)/(col+1));
				col++;
			}
			lt.add(inLt);
			row++;
			star++;
		}
        return lt;
    }
}
