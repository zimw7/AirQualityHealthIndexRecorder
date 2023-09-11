public class Program {

	/* 
	 * Main method of the program. It displays a menu to the user and allows them
     * to interact with the AQHI data visualization and management system.
	 */
	public static void main(String[] args) {
		final int ENTER_VALUES = 1;
		final int DISPLAY_REPORT = 2;
		final int RESET_VALUES = 3;
		final int EXIT_PROGRAM = 4;
		int option = 0;
		AirQualityHealthIndexRecorder aqhi = new AirQualityHealthIndexRecorder();
	
		// do-while loop for the menu system
        do {
            // Output menu options
            System.out.println("1. Enter AQHI Values");
            System.out.println("2. Display Report");
            System.out.println("3. Reset AQHI Data");
            System.out.println("4. Exit Program");

            // Get user option
            option = User.inputInteger("Select option: ", 1, 4);

            // Use switch, delegate actions to AirQualityHealthIndexRecorder as needed
            switch (option) {
                case ENTER_VALUES:
                    aqhi.enterData();
                    break;
                case DISPLAY_REPORT:
                    aqhi.printReport();
                    break;
                case RESET_VALUES:
                    aqhi.resetData();
                    break;
                case EXIT_PROGRAM:
                    break;
            }

        } while (option != EXIT_PROGRAM);

        System.out.println("Program exits");

	}

}
