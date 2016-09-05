/**
 * Created by Master on 04.09.2016.
 */
public class Parenthesized extends Primary {
    private Primary primary_In_Parenthesized;

    public Parenthesized(Relation rel, MyInteger left, MyInteger right, String opcode) {
        this.primary_In_Parenthesized = new Primary(left, right, opcode);
    }

    public Primary getPrimary_In_Parenthesized() {
        return primary_In_Parenthesized;
    }

    public void setPrimary_In_Parenthesized(Primary primary_In_Parenthesized) {
        this.primary_In_Parenthesized = primary_In_Parenthesized;
    }
}
