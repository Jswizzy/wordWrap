package name.jnsmith.wordWrap;

public class WordWrap {

    public static String wrap(final String inputLine, final int lineLength) {
        String[] strings = splitStringEvery(inputLine, lineLength);

        return String.join("\n", strings);
    }

    private static String[] splitStringEvery(String s, int interval) {
        int arrayLength = (int) Math.ceil(((s.length() / (double)interval)));
        String[] result = new String[arrayLength];

        int j = 0;
        int lastIndex = result.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            result[i] = s.substring(j, j + interval);
            j += interval;
        } //Add the last bit
        result[lastIndex] = s.substring(j);

        return result;
    }
}
