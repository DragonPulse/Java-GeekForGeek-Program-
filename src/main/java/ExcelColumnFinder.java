
public class ExcelColumnFinder {

	public static void main(String[] args) {
		System.out.println(ExcelColumnName(100));
	}
	
	 private static  String ExcelColumnName(int colNum) {
	        int Base = 26;
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String colName = "";
	 
	        while (colNum > 0) {
	           int position = colNum % Base;
	           colName = (position == 0 ? 'Z' : chars.charAt(position > 0 ? position - 1 : 0)) + colName;
	           colNum = (colNum - 1) / Base;
	        }
	        return colName;
	    }
}
