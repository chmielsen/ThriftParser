package thriftParser.Absyn; // Java Package generated by the BNF Converter.

public abstract class Prog implements java.io.Serializable {
  public abstract <R,A> R accept(Prog.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(thriftParser.Absyn.Program p, A arg);

  }

}
