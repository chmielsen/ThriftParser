package thriftParser.Absyn; // Java Package generated by the BNF Converter.

public abstract class Class implements java.io.Serializable {
  public abstract <R,A> R accept(Class.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(thriftParser.Absyn.Struct p, A arg);
    public R visit(thriftParser.Absyn.Enum p, A arg);

  }

    public abstract void

}
