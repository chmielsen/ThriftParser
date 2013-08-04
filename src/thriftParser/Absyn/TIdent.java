package thriftParser.Absyn; // Java Package generated by the BNF Converter.

public class TIdent extends Type {
  public final String ident_;

  public TIdent(String p1) { ident_ = p1; }

  public <R,A> R accept(thriftParser.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof thriftParser.Absyn.TIdent) {
      thriftParser.Absyn.TIdent x = (thriftParser.Absyn.TIdent)o;
      return this.ident_.equals(x.ident_);
    }
    return false;
  }

  public int hashCode() {
    return this.ident_.hashCode();
  }


}