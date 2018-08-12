
public class MegaBytesConverter {
	
	// MegaBytes is the input of the user
	// MegaBytes and KiloBytes is the output of the program

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(-125);
		
		printMegaBytesAndKiloBytes(0);

		printMegaBytesAndKiloBytes(100);

		printMegaBytesAndKiloBytes(3000);
		
		printMegaBytesAndKiloBytes(1024);

	}
	

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		double divide = 1024;
		
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
		}	
		else if(kiloBytes == 0) {
		    System.out.println("0 KB = 0 MB and 0 KB");
		}
		else if(kiloBytes < 1024) {
			System.out.println(kiloBytes + " KB =" + " 0 MB and 0 KB");
		}
		else if(kiloBytes == 1024) {
			System.out.println(kiloBytes + " KB = 1 MB and " + kiloBytes + " KB");
		}
		else if(kiloBytes > 1024) {
			double megaBytes = (kiloBytes / divide);	
			// Find the remaining MegaBytes
			double remainder = (megaBytes % 1);
			// Convert the remaining MegaBytes into KiloBytes
			double conMegToKil = remainder * 1024;
			System.out.println((int)kiloBytes + " KB = " + (int)megaBytes + " MB and " + (int)conMegToKil + " KB");
		}
	}
}