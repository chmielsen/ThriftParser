package thriftParser;

import thriftParser.Absyn.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/** BNFC-Generated Fold Visitor */
public abstract class FoldVisitor<R,A> implements AllVisitor<R,A> {
    public abstract R leaf(A arg);
    public abstract R combine(R x, R y, A arg);

/* Prog */
    public R visit(thriftParser.Absyn.Program p, A arg) {
      R r = leaf(arg);
      for (thriftParser.Absyn.Class x : p.listclass_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* thriftParser.Absyn.Class */
    public R visit(thriftParser.Absyn.Struct p, A arg) {
      R r = leaf(arg);
      for (Field x : p.listfield_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(thriftParser.Absyn.Enum p, A arg) {
      R r = leaf(arg);
      for (Enumeration x : p.listenumeration_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* Field */
    public R visit(thriftParser.Absyn.FDecl p, A arg) {
      R r = leaf(arg);
      r = combine(p.requirement_.accept(this, arg), r, arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      r = combine(p.default_.accept(this, arg), r, arg);
      return r;
    }

/* Type */
    public R visit(thriftParser.Absyn.TStr p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.TInt p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.TShort p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.TLong p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.TIdent p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.TMap p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_1.accept(this, arg), r, arg);
      r = combine(p.type_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(thriftParser.Absyn.TList p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(thriftParser.Absyn.TSet p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* Requirement */
    public R visit(thriftParser.Absyn.REmp p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.RReq p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.ROpt p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Default */
    public R visit(thriftParser.Absyn.DefEmp p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.DefInt p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.DefEmptyStr p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.DefStr p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Delim */
    public R visit(thriftParser.Absyn.Comma p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.SemiC p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(thriftParser.Absyn.Empty p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Enumeration */
    public R visit(thriftParser.Absyn.OneEnum p, A arg) {
      R r = leaf(arg);
      return r;
    }


}
