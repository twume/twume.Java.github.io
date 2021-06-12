package sample007;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 101; i++) {
			sb.append(i).append(",");
		}
		String s = sb.toString();
		String[] b = s.split(",");
	}

	public String connect(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;
	}
}
