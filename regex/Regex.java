package regex;

import java.util.regex.Pattern;

public interface Regex {
    Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    Pattern MAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
}
