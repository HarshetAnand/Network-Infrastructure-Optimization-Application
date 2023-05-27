import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class CustomProgram {
	public static void main(String[] args) throws Exception {
		// reads the provided customPage.html into list
		Scanner in = new Scanner(new File("customPage.html"));
		ArrayList<String> list = new ArrayList<>();
		while (in.hasNextLine())
			list.add(in.nextLine());

		// update list to reflect changes requested through command line args
		// TODO: Complete this section
		String name = "";
		if (args.length > 0)
			for (String arg : args[0].split("&")) {
				String[] keyValuePair = arg.split("=");
				switch (keyValuePair[0]) {
				case "name":
					// TODO: when a greeting is selected (below), this
					// arguments's value should be displayed in that greeting
					if (keyValuePair.length < 2) {
						break;
					}
					name = keyValuePair[1];
					break;
				case "background":
					if (!keyValuePair[1].equals("Dark")) {
						break;
					}
					// TODO: when background="Dark", the body's color should be
					// set to white and it's background-color should be set to
					// black (the opposite of how they are set for "Light" by
					// default.
					list.set(list.indexOf("background-color: White;"), "background-color: Black;");
					break;
				case "Greeting":
					// TODO: when this argument is present and =true, an <h1>
					// element containing the text "Welcome Stranger" should
					// be inserted as the first element within the body. If
					// a non-empty-string name is provided (see above), that
					// name should be used in place of the word Stranger in
					// this greeting.
					if (!keyValuePair[1].equalsIgnoreCase("true")) {
						break;
					}
					if (name.equals("")) {
						list.add((list.indexOf("<body>") + 1), "<h1>Welcome Stranger</h1>");
					} else {
						list.add((list.indexOf("<body>") + 1), "<h1>Welcome " + name + "</h1>");
					}
					break;
				case "SuppressOptions":
					// TODO: when this argument is present and =true, the
					// customization controls should be removed from the page.
					// Everything from and including the <h1> label through the
					// final </ul> should be omitted to accomplish this.
					if (!keyValuePair[1].equalsIgnoreCase("true")) {
						break;
					}
					int removeIndex = list.indexOf("<h1>Page Customization Options:</h1>");
					while (!list.get(removeIndex).equals("<p id=\"warning-text\">WARNING: Errors found in form!</p>")) {
						list.remove(removeIndex);
					}
					break;
				}
			}
		// print the resulting html out to system.out (standard out)
		for (String line : list)
			System.out.println(line);
	}
}