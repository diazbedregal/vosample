import java.io.File;


public class ReplaceBlankSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String dir = "\\\\vo-dca-devjira\\c$\\Program Files\\Atlassian\\Application Data\\JIRA\\import\\attachments\\P19\\Attachment";

		//File directory = new File(dir); 
		//File[] files = directory.listFiles();
		
		
		 //File myFile = new File("C:" + File.separator);
		
		 File myFile = new File(dir);
		 
		 int  count = 0;

		 
		    for(File s: myFile.listFiles()){


				 File mySubFolder = new File(dir+"\\" + s.getName());

				// System.out.print(s.getName()+ " ");
		    	
				 for(File f: mySubFolder.listFiles()){
					 
					// System.out.println(f.getName());
					 
					 String originalName = f.getName();
					// System.out.println(originalName);					 
					 
					 String woBlanks = dir+"\\" + s.getName() +"\\" + originalName.replaceAll(" ", "_");
					 
					 
					//System.out.println(originalName);
					 
					 
					 //if (woBlanks.contains("D101914")){
					 if (!woBlanks.equals(dir+"\\" + s.getName() +"\\" + f.getName())){
					 
						 System.out.println("Renaming [" +  ++count +"]"+  woBlanks);
						 
						 
						 f.renameTo(new File(woBlanks));
					 
					}else {

						 System.out.println("NOT Renaming"+  woBlanks);

						
					}
					 
				 }
				 
		    	
		    	
		    	
		    	
		    }
		
		
		//File file = new File("c:\\text.txt");
	   // file.renameTo(new File("c:\\text.txt.bak"));
		
		
	}

}
