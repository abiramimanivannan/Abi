package Example;

public class Isomorphic {
	public boolean isomorphicExample(String str, String str1) {
		int[] arr = new int[2];
		int count = 0;
		if (str.length() == str1.length()) {
			for (int i = 0; i < str.length(); i++) {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						arr[0] = i;
						arr[1] = j;
						count = 1;
					}
				}
				if (count == 1) {
					if (str1.charAt(arr[0]) == str1.charAt(arr[1])) {
						return true;
					} else {
						return false;
					}
				}
			}
		} else {
			return false;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Isomorphic isomorphic = new Isomorphic();
		System.out.println(isomorphic.isomorphicExample("paper", "title"));
	}

}
