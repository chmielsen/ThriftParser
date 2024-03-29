package thriftParser.Absyn; // Java Package generated by the BNF Converter.

public class Enum extends Class {
  public final String ident_;
  public final ListEnumeration listenumeration_;

  public Enum(String p1, ListEnumeration p2) { ident_ = p1; listenumeration_ = p2; }

  public <R,A> R accept(thriftParser.Absyn.Class.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof thriftParser.Absyn.Enum) {
      thriftParser.Absyn.Enum x = (thriftParser.Absyn.Enum)o;
      return this.ident_.equals(x.ident_) && this.listenumeration_.equals(x.listenumeration_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.listenumeration_.hashCode();
  }


}
