import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class Helpers {

	// Sets
	// Removing duplicates
	public static <T> List removeDuplicateStrings(List<T> a) {
		return new ArrayList(new LinkedHashSet(a));
	}

	// Strings

	// getStringFromStringIndex("Abcd", 1) -> "b"
	public static String getOneLetterFromString(String str1, int index) {
		return String.valueOf(str1.charAt(index));
	}

	// Integers

	// getIntegerElement(518, 2) -> 8
	private static int getIntegerElement(int intNumber, int index) {
		return Character.getNumericValue(Integer.toString(intNumber).charAt(index));
	}

	// randomNum(1, 10) -> 5
	public static int randomNum(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

	// stringToInt("11").orElse(0)
	public static Optional<Integer> stringToInt(String s) {
		try {
			return Optional.of(Integer.parseInt(s));
		} catch (NumberFormatException e) {
			return Optional.empty();
		}
	}

}
