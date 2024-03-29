package thriftParser.Absyn; // Java Package generated by the BNF Converter.

public class Struct extends Class {
  public final String ident_;
  public final ListField listfield_;

  public Struct(String p1, ListField p2) { ident_ = p1; listfield_ = p2; }

  public <R,A> R accept(thriftParser.Absyn.Class.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof thriftParser.Absyn.Struct) {
      thriftParser.Absyn.Struct x = (thriftParser.Absyn.Struct)o;
      return this.ident_.equals(x.ident_) && this.listfield_.equals(x.listfield_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.listfield_.hashCode();
  }


}
