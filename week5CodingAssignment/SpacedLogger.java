package week5CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
    public void log(String message) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            sb.append(message.charAt(i));
            if (i != message.length() - 1) {
                sb.append(' ');
            }
        }
        System.out.println(sb.toString());
    }

	@Override
    public void error(String message) {
        StringBuilder sb = new StringBuilder();
        sb.append("ERROR: ");
        for (int i = 0; i < message.length(); i++) {
            sb.append(message.charAt(i));
            if (i != message.length() - 1) {
                sb.append(' ');
            }
        }
        System.err.println(sb.toString());
    }

}
