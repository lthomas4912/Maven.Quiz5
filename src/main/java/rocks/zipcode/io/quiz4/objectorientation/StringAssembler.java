package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private Character delimeter;
    private String string1 ="";

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {

        string1 += str + delimeter;
        return this;
    }

    public String assemble() {
        return string1.substring(0,string1.length()-1);
    }
}
