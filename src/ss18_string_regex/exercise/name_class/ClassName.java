package ss18_string_regex.exercise.name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_REGEX ="^[CAP]\\d{4}[GHIKLM]$";
    public ClassName(){
        pattern = Pattern.compile(NAME_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
