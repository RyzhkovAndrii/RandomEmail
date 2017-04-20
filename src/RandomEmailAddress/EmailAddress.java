package RandomEmailAddress;

public class EmailAddress {
    RandomGetters randomGetter = new RandomGetters();

    public String getEmailAddress() {
        StringBuilder builder = new StringBuilder();
        builder.append(getLogin());
        builder.append(getDomain());
        return  builder.toString();
    }

    private String getLogin() {
        return randomGetter.getRandomString(randomGetter.getRandomInt(8,14));
    }

    private String getDomain() {
        switch (randomGetter.getRandomInt(1,5)) {
            case 1: return "@gmail.com";
            case 2: return "@mail.ru";
            case 3: return "@yandex.ru";
            case 4: return "@ukr.net";
            default: return "@yahoo.com";
        }
    }
}

