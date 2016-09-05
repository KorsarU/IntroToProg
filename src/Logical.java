/**
 * Created by Master on 04.09.2016.
 */
public class Logical extends Expression {
    enum Opcode {and, or, xor, none};
    Opcode op;
    Relation rel;

    public Logical(){}

    public Logical(Opcode op, Relation rel) {
        this.op = op;
        this.rel = rel;
    }
}
