package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {

    private String str;
    public StringEvaluatorObject(String str) {
        this.str = str;
    }

    public String[] getAllSubstrings() {
        return StringEvaluator.getAllSubstrings(str);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return null;
    }

    public String getLargestCommonSubstring(String secondInput) {
        return null;
    }
}
