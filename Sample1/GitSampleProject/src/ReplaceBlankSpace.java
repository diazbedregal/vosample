import java.io.File;

public class ReplaceBlankSpace {

	public static void main(String[] args) {

		String dir = "\\\\vo-dca-devjira\\c$\\Program Files\\Atlassian\\Application Data\\JIRA\\import\\attachments\\P19\\Attachment";

		File myFile = new File(dir);

		int count = 0;
		int notRenamed = 0;
		int dots = 0;

		for (File s : myFile.listFiles()) {

			File mySubFolder = new File(dir + "\\" + s.getName());

			for (File f : mySubFolder.listFiles()) {

				// System.out.println(f.getName());

				String originalName = new String(f.getName() + "");
				String newName = new String(f.getName() + "");

				newName = newName
						
						//Replacing blanks
						.replaceAll(" ", "_")
						
						
						//Removing apostrophes
						.replaceAll("’", "")
						.replaceAll("‘", "")
						.replaceAll("'", "")
						
						//Replacing long dash with short dash
						.replaceAll("–", "-")
						
						//Replacing special chars
						.replaceAll("#", "_")
						.replaceAll("\\[", "_")
						.replaceAll("\\]", "_")
						.replaceAll("\\%", "_")
						.replaceAll("û", "_")
						.replaceAll("\\?", "_");
				

				String woBlanks = dir
						+ "\\"
						+ s.getName()
						+ "\\"
						+ newName;

				// – -

				// ’ '

				if (!originalName.equals(newName)) {

					System.out.println("");
					System.out.println("Renaming [" + ++count + "]");
					System.out.println("      From     : " + originalName);
					System.out.println("      To       : " + newName);
					System.out.println("      Full path: " + woBlanks);

					//f.renameTo(new File(woBlanks));

				} else {

					notRenamed++;

					dots++;

					if (dots > 40) {

						System.out.print(".");

						dots = 0;

					}
					// System.out.println("NOT Renaming"+ woBlanks);

				}

			}

		}

		// File file = new File("c:\\text.txt");
		// file.renameTo(new File("c:\\text.txt.bak"));

	}

}
