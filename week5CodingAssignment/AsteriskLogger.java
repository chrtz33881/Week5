package week5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
    public void log (String message) {
        System.out.println("*** " + message + " ***");
    }

	@Override
    public void error(String message) {
        StringBuilder sb = new StringBuilder();
        sb.append("*****************\n");
        sb.append("*** ERROR: ");
        sb.append(message);
        sb.append(" ***\n");
        sb.append("*****************\n");
        System.err.println(sb.toString());
    }
}
