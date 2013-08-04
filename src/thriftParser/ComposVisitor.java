package thriftParser;
import thriftParser.Absyn.*;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
  thriftParser.Absyn.Prog.Visitor<thriftParser.Absyn.Prog,A>,
  thriftParser.Absyn.Class.Visitor<thriftParser.Absyn.Class,A>,
  thriftParser.Absyn.Field.Visitor<thriftParser.Absyn.Field,A>,
  thriftParser.Absyn.Type.Visitor<thriftParser.Absyn.Type,A>,
  thriftParser.Absyn.Requirement.Visitor<thriftParser.Absyn.Requirement,A>,
  thriftParser.Absyn.Default.Visitor<thriftParser.Absyn.Default,A>,
  thriftParser.Absyn.Delim.Visitor<thriftParser.Absyn.Delim,A>,
  thriftParser.Absyn.Enumeration.Visitor<thriftParser.Absyn.Enumeration,A>
{
/* Prog */
    public Prog visit(thriftParser.Absyn.Program p, A arg)
    {
      ListClass listclass_ = new ListClass();
      for (thriftParser.Absyn.Class x : p.listclass_) {
        listclass_.add(x.accept(this,arg));
      }

      return new thriftParser.Absyn.Program(listclass_);
    }

/* thriftParser.Absyn.Class */
    public thriftParser.Absyn.Class visit(thriftParser.Absyn.Struct p, A arg)
    {
      String ident_ = p.ident_;
      ListField listfield_ = new ListField();
      for (Field x : p.listfield_) {
        listfield_.add(x.accept(this,arg));
      }

      return new thriftParser.Absyn.Struct(ident_, listfield_);
    }
    public thriftParser.Absyn.Class visit(thriftParser.Absyn.Enum p, A arg)
    {
      String ident_ = p.ident_;
      ListEnumeration listenumeration_ = new ListEnumeration();
      for (Enumeration x : p.listenumeration_) {
        listenumeration_.add(x.accept(this,arg));
      }

      return new thriftParser.Absyn.Enum(ident_, listenumeration_);
    }

/* Field */
    public Field visit(thriftParser.Absyn.FDecl p, A arg)
    {
      Integer integer_ = p.integer_;
      Requirement requirement_ = p.requirement_.accept(this, arg);
      Type type_ = p.type_.accept(this, arg);
      String ident_ = p.ident_;
      Default default_ = p.default_.accept(this, arg);

      return new thriftParser.Absyn.FDecl(integer_, requirement_, type_, ident_, default_);
    }

/* Type */
    public Type visit(thriftParser.Absyn.TStr p, A arg)
    {

      return new thriftParser.Absyn.TStr();
    }
    public Type visit(thriftParser.Absyn.TInt p, A arg)
    {

      return new thriftParser.Absyn.TInt();
    }
    public Type visit(thriftParser.Absyn.TShort p, A arg)
    {

      return new thriftParser.Absyn.TShort();
    }
    public Type visit(thriftParser.Absyn.TLong p, A arg)
    {

      return new thriftParser.Absyn.TLong();
    }
    public Type visit(thriftParser.Absyn.TIdent p, A arg)
    {
      String ident_ = p.ident_;

      return new thriftParser.Absyn.TIdent(ident_);
    }
    public Type visit(thriftParser.Absyn.TMap p, A arg)
    {
      Type type_1 = p.type_1.accept(this, arg);
      Type type_2 = p.type_2.accept(this, arg);

      return new thriftParser.Absyn.TMap(type_1, type_2);
    }
    public Type visit(thriftParser.Absyn.TList p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);

      return new thriftParser.Absyn.TList(type_);
    }
    public Type visit(thriftParser.Absyn.TSet p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);

      return new thriftParser.Absyn.TSet(type_);
    }

/* Requirement */
    public Requirement visit(thriftParser.Absyn.REmp p, A arg)
    {

      return new thriftParser.Absyn.REmp();
    }
    public Requirement visit(thriftParser.Absyn.RReq p, A arg)
    {

      return new thriftParser.Absyn.RReq();
    }
    public Requirement visit(thriftParser.Absyn.ROpt p, A arg)
    {

      return new thriftParser.Absyn.ROpt();
    }

/* Default */
    public Default visit(thriftParser.Absyn.DefEmp p, A arg)
    {

      return new thriftParser.Absyn.DefEmp();
    }
    public Default visit(thriftParser.Absyn.DefInt p, A arg)
    {
      Integer integer_ = p.integer_;

      return new thriftParser.Absyn.DefInt(integer_);
    }
    public Default visit(thriftParser.Absyn.DefEmptyStr p, A arg)
    {

      return new thriftParser.Absyn.DefEmptyStr();
    }
    public Default visit(thriftParser.Absyn.DefStr p, A arg)
    {
      String ident_ = p.ident_;

      return new thriftParser.Absyn.DefStr(ident_);
    }

/* Delim */
    public Delim visit(thriftParser.Absyn.Comma p, A arg)
    {

      return new thriftParser.Absyn.Comma();
    }
    public Delim visit(thriftParser.Absyn.SemiC p, A arg)
    {

      return new thriftParser.Absyn.SemiC();
    }
    public Delim visit(thriftParser.Absyn.Empty p, A arg)
    {

      return new thriftParser.Absyn.Empty();
    }

/* Enumeration */
    public Enumeration visit(thriftParser.Absyn.OneEnum p, A arg)
    {
      String ident_ = p.ident_;
      Integer integer_ = p.integer_;

      return new thriftParser.Absyn.OneEnum(ident_, integer_);
    }

}
