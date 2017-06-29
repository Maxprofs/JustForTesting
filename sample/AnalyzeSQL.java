樓上帥哥 撰

public class AnalyzeSQL {

	public void findWords() {

	}

	public static void main(String[] args) {
		// Create random SQL String with upper,lower cases and spaces
		String SQL = " SELECT    ename , salary fROm employee ";

		// Remove all excess spaces change all to lower cases & into array
		String[] word = SQL.toLowerCase().split("\\s+");
		// Alternative:String SQL1=SQL.replaceAll("\\s+", " ");

//		for (int i = 0; i < word.length; i++) {
//			if (word[i].toLowerCase().equals("select")) {
//				System.out.println("select is at:" + i);
//			} else if (word[i].toLowerCase().equals("ename")) {
//				System.out.println("ename is at:" + i);
//			} else if (word[i].toLowerCase().equals("salary")) {
//				System.out.println("salary is at:" + i);
//			} else if (word[i].toLowerCase().equals("from")) {
//				System.out.println("from is at:" + i);
//			} else if (word[i].toLowerCase().equals("employee")) {
//				System.out.println("employee is at:" + i);
//			} else if (word[i].toLowerCase().equals(",")) {
//				System.out.println(", is at:" + i);
//			}
			// Find out the ArrayIndex of those words.

			System.out.println(word[1]);
			System.out.println(word[2]);
			System.out.println(word[3]);
			System.out.println(word[4]);
			System.out.println(word[5]);
			System.out.println(word[6]);
			//Singled-out all words
			
		}
	}
//}