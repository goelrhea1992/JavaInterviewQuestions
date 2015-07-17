/**

**/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MagixBox {

	public static void main(String args[]) {
		
		HashMap<String, Integer> rowFrequency = new HashMap<String, Integer>();
		int i, nZeros = 0;
		int nTestCases, nRows, nCols, j=0;
		int[][] arr;
		int row,col;
		String rowString = "";
		String rowComplementString = "";
		int thisFrequency;
		Map.Entry<String, Integer> maxSoFar = null;

		Scanner in = new Scanner(System.in);
		nTestCases = in.nextInt();
		for(j=0; j<nTestCases; j++) {
			
			rowFrequency = new HashMap<String, Integer>();
			nZeros = 0;
			maxSoFar = null;
			
			nRows = in.nextInt();
			nCols = in.nextInt();
			
			if(nCols==1 || nRows==1) {
				System.out.println(nRows);
				continue;
			}
				
			arr = new int[nRows][nCols];
			
			for(row=0; row<nRows; row++) {
				for(col=0; col<nCols; col++) {
					arr[row][col] = in.nextInt();
				}
			}
	
			for(row=0; row<nRows; row++) {
				rowString = "";
				for(col=0; col<nCols; col++) {
					rowString = rowString + arr[row][col];
				}
				rowComplementString = complementString(rowString);
				if(rowFrequency.containsKey(rowString)) {
					thisFrequency = rowFrequency.get(rowString);
					rowFrequency.put(rowString, thisFrequency + 1);
				}
				else if (rowFrequency.containsKey(rowComplementString)) {
					thisFrequency = rowFrequency.get(rowComplementString);
					rowFrequency.put(rowComplementString, thisFrequency + 1);
				}
				else {
					rowFrequency.put(rowString, 1);
				}
			}
			
			for (Map.Entry<String, Integer> entry: rowFrequency.entrySet()) {
				if (maxSoFar == null || maxSoFar.getValue().compareTo(entry.getValue()) < 0) {
					maxSoFar = entry;
				}
			}
			
			System.out.println(maxSoFar.getValue());
		}
	}

	private static String complementString(String rowString) {
		// TODO Auto-generated method stub
		String complementString = "";
		int i;
		int thisBit;
		for(i=0; i<rowString.length(); i++) {
			thisBit = Integer.parseInt(rowString.substring(i,i+1));
			complementString = complementString + ((thisBit>0)?0:1);
		}
		return complementString;
	}
}
