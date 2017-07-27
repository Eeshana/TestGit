package testlogic;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MoveFile {

	public static void movieFile() {
		// TODO Auto-generated method stub
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		File destinationFolder = new File("D:/Results/"+dateFormat.format(date));
		File sourceFolder = new File("D:/Automation/workspace/PEPS/Results");

		if (!destinationFolder.exists())
			destinationFolder.mkdirs();

		// Check weather source exists and it is folder.
		if (sourceFolder.exists() && sourceFolder.isDirectory()) {
			// Get list of the files and iterate over them
			File[] listOfFiles = sourceFolder.listFiles();

			if (listOfFiles != null)
			{
				for (File child : listOfFiles )
				{
					// Move files to destination folder
					child.renameTo(new File(destinationFolder + "\\" + child.getName()));
				}
				if(listOfFiles != null)
					System.out.println("Files are moved");

				// Add if you want to delete the source folder
				// sourceFolder.delete();
			}
		}
		else
			System.out.println(sourceFolder + "  Folder does not exist");

	

	}

}
