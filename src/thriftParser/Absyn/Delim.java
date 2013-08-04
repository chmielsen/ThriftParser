package thriftParser.Absyn; // Java Package generated by the BNF Converter.

public abstract class Delim implements java.io.Serializable {
  public abstract <R,A> R accept(Delim.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(thriftParser.Absyn.Comma p, A arg);
    public R visit(thriftParser.Absyn.SemiC p, A arg);
    public R visit(thriftParser.Absyn.Empty p, A arg);

  }

}
