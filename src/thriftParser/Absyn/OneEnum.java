package thriftParser.Absyn; // Java Package generated by the BNF Converter.

public class OneEnum extends Enumeration {
  public final String ident_;
  public final Integer integer_;

  public OneEnum(String p1, Integer p2) { ident_ = p1; integer_ = p2; }

  public <R,A> R accept(thriftParser.Absyn.Enumeration.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof thriftParser.Absyn.OneEnum) {
      thriftParser.Absyn.OneEnum x = (thriftParser.Absyn.OneEnum)o;
      return this.ident_.equals(x.ident_) && this.integer_.equals(x.integer_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.integer_.hashCode();
  }


}