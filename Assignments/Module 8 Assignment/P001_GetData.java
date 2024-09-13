package Assesment;

import Basic.ExcellReader;

public class P001_GetData {
	public static void main(String[] args) {
		ExcellReader e = new ExcellReader("C:\\Users\\Admin\\Desktop","Sheet1");
		int num_of_rows = e.rowCount();
		int num_of_cols = e.colCount();
		String data = e.getData(num_of_rows, num_of_cols);
		System.out.println(data);

}
}