import javax.swing.JOptionPane;

public class travelAgency {
    public static void main(String[] args) {
        //asks for user input
        String input = JOptionPane.showInputDialog(null, "What kind of food do you like? \n1. Italian \n2. Indian \n3. Mexican food", "Travel Agency", 3);
        int temp = Integer.valueOf(input);
        switch (temp) {
            //italian case
            case 1:
                input = JOptionPane.showInputDialog(null, "Would you like to visit an urban or natural attraction?", "Travel Agency", 3);
                if (input.equalsIgnoreCase("urban")) {
                    input = JOptionPane.showInputDialog(null, "What type of culture are you interested in? \n1. Roman \n2. Greek", "Travel Agency", 3);
                    temp = Integer.valueOf(input);
                    if (temp == 1) {
                        JOptionPane.showMessageDialog(null, "Quiz Results: Based on your interests, you should go to Rome", "Travel Agency", 2);
                    } else if (temp == 2) {
                        JOptionPane.showMessageDialog(null, "Quiz Results: According to your answers, we suggest you go to Sicily", "Travel Agency", 2);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, unknown input", "Travel Agency", 1);
                    }
                } else if (input.equalsIgnoreCase("natural")) {
                    JOptionPane.showMessageDialog(null, "Quiz Results: Based on your interests, you should go to Mount Vesuvius", "Travel Agency", 2);
                } else {
                    JOptionPane.showMessageDialog(null, "Error, unknown input", "Travel Agency", 1);
                }
                break;
            
            //indian case
            case 2:
                input = JOptionPane.showInputDialog(null, "Would you rather visit a temple or a marketplace?", "Travel Agency", 3);
                if (input.equalsIgnoreCase("temple")) {
                    JOptionPane.showMessageDialog(null, "Quiz Results: Based on your interests, we have chosen the Taj Mahal, New Delhi", "Travel Agency", 2);
                } else if (input.equalsIgnoreCase("marketplace")) {
                    input = JOptionPane.showInputDialog(null, "Do you like modern or more cultural places?", "Travel Agency", 3);
                    if (input.equalsIgnoreCase("modern")) {
                        JOptionPane.showMessageDialog(null, "Quiz Results: According to your curiosities, we suggest you go to Jaipur, Rajasthan", "Travel Agency", 2);
                    } else if (input.equalsIgnoreCase("culture")) {
                        JOptionPane.showMessageDialog(null, "Quiz Results: Based on your answers, you should go to Janpath, Delhi", "Travel Agency", 2);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, unknown input", "Travel Agency", 1);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error, unknown input", "Travel Agency", 1);
                }
                break;

            case 3:
                input = JOptionPane.showInputDialog(null, "Are you looking for a beach, or more historical ruins?", "Travel Agency", 3);
                if (input.equalsIgnoreCase("ruins")) {
                    JOptionPane.showMessageDialog(null, "Quiz Results: According to your answers, Chichen Itza is the right place for you", "Travel Agency", 2);
                } else if (input.equalsIgnoreCase("beach")) {
                    JOptionPane.showMessageDialog(null, "Quiz Results: Based on your interests, our suggestion is Cancun", "Travel Agency", 2);
                } else {
                    JOptionPane.showMessageDialog(null, "Error, unknown input", "Travel Agency", 1);
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Error, unknown input", "Travel Agency", 1);
                break;
        }
    }
}