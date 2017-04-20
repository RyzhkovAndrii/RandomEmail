package RandomEmailAddress;

public class RandomGetters {

    public int getRandomInt(int start, int finish) {
        return  (int) (start + Math.random() * (finish + 1 - start));
    }

    private char getRandomSymbol() {
        int intSymbol;

        while (true) {
            intSymbol = getRandomInt(48,122);

            if (intSymbol < 58 || intSymbol > 96) {
                return (char) intSymbol;
            }
        }
    }

    public String getRandomString(int length) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            builder.append(getRandomSymbol());
        }

        return builder.toString();
    }

}