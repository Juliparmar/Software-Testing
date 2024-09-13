package Assesment;
import Basic.ExcellReader;


public class P002_Getdata2 {

		public static void main(String[] args) {
		ExcellReader e = new ExcellReader("C:\\Users\\ONE STEP IT SOLUTION\\OneDrive\\Documents\\guru99_2.xlsx","login");
		 int num_of_rows = e.rowCount() ;
		 int num_of_cols = e.colCount();
		 String data = e.getData(num_of_rows, num_of_cols) ;
		 System.out.println(data);
	}
		}

}
