package thriftParser.Absyn; // Java Package generated by the BNF Converter.

public class RReq extends Requirement {

  public RReq() { }

  public <R,A> R accept(thriftParser.Absyn.Requirement.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof thriftParser.Absyn.RReq) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}