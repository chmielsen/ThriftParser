package thriftParser;
import thriftParser.Absyn.*;
/*** BNFC-Generated Visitor Design Pattern Skeleton. ***/
/* This implements the common visitor design pattern.
   Tests show it to be slightly less efficient than the
   instanceof method, but easier to use. 
   Replace the R and A parameters with the desired return
   and context types.*/

public class VisitSkel
{
  public class ProgVisitor<R,A> implements Prog.Visitor<R,A>
  {
    public R visit(thriftParser.Absyn.Program p, A arg)
    {
      /* Code For Program Goes Here */

      for (thriftParser.Absyn.Class x : p.listclass_) {
      }

      return null;
    }

  }
  public class ClassVisitor<R,A> implements thriftParser.Absyn.Class.Visitor<R,A>
  {
    public R visit(thriftParser.Absyn.Struct p, A arg)
    {
      /* Code For Struct Goes Here */

      //p.ident_;
      for (Field x : p.listfield_) {
      }

      return null;
    }
    public R visit(thriftParser.Absyn.Enum p, A arg)
    {
      /* Code For Enum Goes Here */

      //p.ident_;
      for (Enumeration x : p.listenumeration_) {
      }

      return null;
    }

  }
  public class FieldVisitor<R,A> implements Field.Visitor<R,A>
  {
    public R visit(thriftParser.Absyn.FDecl p, A arg)
    {
      /* Code For FDecl Goes Here */

      //p.integer_;
      p.requirement_.accept(new RequirementVisitor<R,A>(), arg);
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      p.default_.accept(new DefaultVisitor<R,A>(), arg);

      return null;
    }

  }
  public class TypeVisitor<R,A> implements Type.Visitor<R,A>
  {
    public R visit(thriftParser.Absyn.TStr p, A arg)
    {
      /* Code For TStr Goes Here */


      return null;
    }
    public R visit(thriftParser.Absyn.TInt p, A arg)
    {
      /* Code For TInt Goes Here */


      return null;
    }
    public R visit(thriftParser.Absyn.TShort p, A arg)
    {
      /* Code For TShort Goes Here */


      return null;
    }
    public R visit(thriftParser.Absyn.TLong p, A arg)
    {
      /* Code For TLong Goes Here */


      return null;
    }
    public R visit(thriftParser.Absyn.TIdent p, A arg)
    {
      /* Code For TIdent Goes Here */

      //p.ident_;

      return null;
    }
    public R visit(thriftParser.Absyn.TMap p, A arg)
    {
      /* Code For TMap Goes Here */

      p.type_1.accept(new TypeVisitor<R,A>(), arg);
      p.type_2.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(thriftParser.Absyn.TList p, A arg)
    {
      /* Code For TList Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(thriftParser.Absyn.TSet p, A arg)
    {
      /* Code For TSet Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }

  }
  public class RequirementVisitor<R,A> implements Requirement.Visitor<R,A>
  {
    public R visit(thriftParser.Absyn.REmp p, A arg)
    {
      /* Code For REmp Goes Here */


      return null;
    }
    public R visit(thriftParser.Absyn.RReq p, A arg)
    {
      /* Code For RReq Goes Here */


      return null;
    }
    public R visit(thriftParser.Absyn.ROpt p, A arg)
    {
      /* Code For ROpt Goes Here */


      return null;
    }

  }
  public class DefaultVisitor<R,A> implements Default.Visitor<R,A>
  {
    public R visit(thriftParser.Absyn.DefEmp p, A arg)
    {
      /* Code For DefEmp Goes Here */


      return null;
    }
    public R visit(thriftParser.Absyn.DefInt p, A arg)
    {
      /* Code For DefInt Goes Here */

      //p.integer_;

      return null;
    }
    public R visit(thriftParser.Absyn.DefEmptyStr p, A arg)
    {
      /* Code For DefEmptyStr Goes Here */


      return null;
    }
    public R visit(thriftParser.Absyn.DefStr p, A arg)
    {
      /* Code For DefStr Goes Here */

      //p.ident_;

      return null;
    }

  }
  public class DelimVisitor<R,A> implements Delim.Visitor<R,A>
  {
    public R visit(thriftParser.Absyn.Comma p, A arg)
    {
      /* Code For Comma Goes Here */


      return null;
    }
    public R visit(thriftParser.Absyn.SemiC p, A arg)
    {
      /* Code For SemiC Goes Here */


      return null;
    }
    public R visit(thriftParser.Absyn.Empty p, A arg)
    {
      /* Code For Empty Goes Here */


      return null;
    }

  }
  public class EnumerationVisitor<R,A> implements Enumeration.Visitor<R,A>
  {
    public R visit(thriftParser.Absyn.OneEnum p, A arg)
    {
      /* Code For OneEnum Goes Here */

      //p.ident_;
      //p.integer_;

      return null;
    }

  }
}