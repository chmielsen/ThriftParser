package thriftParser.Absyn; // Java Package generated by the BNF Converter.

public class DefEmp extends Default {

  public DefEmp() { }

  public <R,A> R accept(thriftParser.Absyn.Default.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof thriftParser.Absyn.DefEmp) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}