package thriftParser;
import thriftParser.Absyn.*;
/** BNFC-Generated Abstract Visitor */
public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
/* Prog */
    public R visit(thriftParser.Absyn.Program p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(thriftParser.Absyn.Prog p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Class */
    public R visit(thriftParser.Absyn.Struct p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.Enum p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(thriftParser.Absyn.Class p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Field */
    public R visit(thriftParser.Absyn.FDecl p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(thriftParser.Absyn.Field p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Type */
    public R visit(thriftParser.Absyn.TStr p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.TInt p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.TShort p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.TLong p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.TIdent p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.TMap p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.TList p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.TSet p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(thriftParser.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Requirement */
    public R visit(thriftParser.Absyn.REmp p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.RReq p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.ROpt p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(thriftParser.Absyn.Requirement p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Default */
    public R visit(thriftParser.Absyn.DefEmp p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.DefInt p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.DefEmptyStr p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.DefStr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(thriftParser.Absyn.Default p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Delim */
    public R visit(thriftParser.Absyn.Comma p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.SemiC p, A arg) { return visitDefault(p, arg); }
    public R visit(thriftParser.Absyn.Empty p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(thriftParser.Absyn.Delim p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Enumeration */
    public R visit(thriftParser.Absyn.OneEnum p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(thriftParser.Absyn.Enumeration p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
