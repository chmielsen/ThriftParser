package thriftParser;
import thriftParser.Absyn.*;

public class PrettyPrinter
{
  //For certain applications increasing the initial size of the buffer may improve performance.
  private static final int INITIAL_BUFFER_SIZE = 128;
  //You may wish to change the parentheses used in precedence.
  private static final String _L_PAREN = new String("(");
  private static final String _R_PAREN = new String(")");
  //You may wish to change render
  private static void render(String s)
  {
    if (s.equals("{"))
    {
       buf_.append("\n");
       indent();
       buf_.append(s);
       _n_ = _n_ + 2;
       buf_.append("\n");
       indent();
    }
    else if (s.equals("(") || s.equals("["))
       buf_.append(s);
    else if (s.equals(")") || s.equals("]"))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals("}"))
    {
       _n_ = _n_ - 2;
       backup();
       backup();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals(","))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals(";"))
    {
       backup();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals("")) return;
    else
    {
       buf_.append(s);
       buf_.append(" ");
    }
  }


  //  print and show methods are defined for each category.
  public static String print(thriftParser.Absyn.Prog foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(thriftParser.Absyn.Prog foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(thriftParser.Absyn.ListClass foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(thriftParser.Absyn.ListClass foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(thriftParser.Absyn.Class foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(thriftParser.Absyn.Class foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(thriftParser.Absyn.ListField foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(thriftParser.Absyn.ListField foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(thriftParser.Absyn.ListEnumeration foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(thriftParser.Absyn.ListEnumeration foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(thriftParser.Absyn.Field foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(thriftParser.Absyn.Field foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(thriftParser.Absyn.Type foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(thriftParser.Absyn.Type foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(thriftParser.Absyn.Requirement foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(thriftParser.Absyn.Requirement foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(thriftParser.Absyn.Default foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(thriftParser.Absyn.Default foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(thriftParser.Absyn.Delim foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(thriftParser.Absyn.Delim foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(thriftParser.Absyn.Enumeration foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(thriftParser.Absyn.Enumeration foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  /***   You shouldn't need to change anything beyond this point.   ***/

  private static void pp(thriftParser.Absyn.Prog foo, int _i_)
  {
    if (foo instanceof thriftParser.Absyn.Program)
    {
       thriftParser.Absyn.Program _program = (thriftParser.Absyn.Program) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_program.listclass_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(thriftParser.Absyn.ListClass foo, int _i_)
  {
     for (java.util.Iterator<thriftParser.Absyn.Class> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }

  private static void pp(thriftParser.Absyn.Class foo, int _i_)
  {
    if (foo instanceof thriftParser.Absyn.Struct)
    {
       thriftParser.Absyn.Struct _struct = (thriftParser.Absyn.Struct) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("struct");
       pp(_struct.ident_, 0);
       render("{");
       pp(_struct.listfield_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.Enum)
    {
       thriftParser.Absyn.Enum _enum = (thriftParser.Absyn.Enum) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("enum");
       pp(_enum.ident_, 0);
       render("{");
       pp(_enum.listenumeration_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(thriftParser.Absyn.ListField foo, int _i_)
  {
     for (java.util.Iterator<Field> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(";");
       } else {
         render(";");
       }
     }
  }

  private static void pp(thriftParser.Absyn.ListEnumeration foo, int _i_)
  {
     for (java.util.Iterator<Enumeration> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render(",");
       }
     }
  }

  private static void pp(thriftParser.Absyn.Field foo, int _i_)
  {
    if (foo instanceof thriftParser.Absyn.FDecl)
    {
       thriftParser.Absyn.FDecl _fdecl = (thriftParser.Absyn.FDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_fdecl.integer_, 0);
       render(":");
       pp(_fdecl.requirement_, 0);
       pp(_fdecl.type_, 0);
       pp(_fdecl.ident_, 0);
       pp(_fdecl.default_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(thriftParser.Absyn.Type foo, int _i_)
  {
    if (foo instanceof thriftParser.Absyn.TStr)
    {
       thriftParser.Absyn.TStr _tstr = (thriftParser.Absyn.TStr) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("string");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.TInt)
    {
       thriftParser.Absyn.TInt _tint = (thriftParser.Absyn.TInt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("i32");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.TShort)
    {
       thriftParser.Absyn.TShort _tshort = (thriftParser.Absyn.TShort) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("i16");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.TLong)
    {
       thriftParser.Absyn.TLong _tlong = (thriftParser.Absyn.TLong) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("i64");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.TIdent)
    {
       thriftParser.Absyn.TIdent _tident = (thriftParser.Absyn.TIdent) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_tident.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.TMap)
    {
       thriftParser.Absyn.TMap _tmap = (thriftParser.Absyn.TMap) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("map");
       render("<");
       pp(_tmap.type_1, 0);
       render(",");
       pp(_tmap.type_2, 0);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.TList)
    {
       thriftParser.Absyn.TList _tlist = (thriftParser.Absyn.TList) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("list");
       render("<");
       pp(_tlist.type_, 0);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.TSet)
    {
       thriftParser.Absyn.TSet _tset = (thriftParser.Absyn.TSet) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("set");
       render("<");
       pp(_tset.type_, 0);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(thriftParser.Absyn.Requirement foo, int _i_)
  {
    if (foo instanceof thriftParser.Absyn.REmp)
    {
       thriftParser.Absyn.REmp _remp = (thriftParser.Absyn.REmp) foo;
       if (_i_ > 0) render(_L_PAREN);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.RReq)
    {
       thriftParser.Absyn.RReq _rreq = (thriftParser.Absyn.RReq) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("required");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.ROpt)
    {
       thriftParser.Absyn.ROpt _ropt = (thriftParser.Absyn.ROpt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("optional");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(thriftParser.Absyn.Default foo, int _i_)
  {
    if (foo instanceof thriftParser.Absyn.DefEmp)
    {
       thriftParser.Absyn.DefEmp _defemp = (thriftParser.Absyn.DefEmp) foo;
       if (_i_ > 0) render(_L_PAREN);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.DefInt)
    {
       thriftParser.Absyn.DefInt _defint = (thriftParser.Absyn.DefInt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("=");
       pp(_defint.integer_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.DefEmptyStr)
    {
       thriftParser.Absyn.DefEmptyStr _defemptystr = (thriftParser.Absyn.DefEmptyStr) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("=");
       render("\"\"");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.DefStr)
    {
       thriftParser.Absyn.DefStr _defstr = (thriftParser.Absyn.DefStr) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("=");
       render("\"");
       pp(_defstr.ident_, 0);
       render("\"");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(thriftParser.Absyn.Delim foo, int _i_)
  {
    if (foo instanceof thriftParser.Absyn.Comma)
    {
       thriftParser.Absyn.Comma _comma = (thriftParser.Absyn.Comma) foo;
       if (_i_ > 0) render(_L_PAREN);
       render(",");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.SemiC)
    {
       thriftParser.Absyn.SemiC _semic = (thriftParser.Absyn.SemiC) foo;
       if (_i_ > 0) render(_L_PAREN);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof thriftParser.Absyn.Empty)
    {
       thriftParser.Absyn.Empty _empty = (thriftParser.Absyn.Empty) foo;
       if (_i_ > 0) render(_L_PAREN);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(thriftParser.Absyn.Enumeration foo, int _i_)
  {
    if (foo instanceof thriftParser.Absyn.OneEnum)
    {
       thriftParser.Absyn.OneEnum _oneenum = (thriftParser.Absyn.OneEnum) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_oneenum.ident_, 0);
       render("=");
       pp(_oneenum.integer_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }


  private static void sh(thriftParser.Absyn.Prog foo)
  {
    if (foo instanceof thriftParser.Absyn.Program)
    {
       thriftParser.Absyn.Program _program = (thriftParser.Absyn.Program) foo;
       render("(");
       render("Program");
       render("[");
       sh(_program.listclass_);
       render("]");
       render(")");
    }
  }

  private static void sh(thriftParser.Absyn.ListClass foo)
  {
     for (java.util.Iterator<thriftParser.Absyn.Class> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(thriftParser.Absyn.Class foo)
  {
    if (foo instanceof thriftParser.Absyn.Struct)
    {
       thriftParser.Absyn.Struct _struct = (thriftParser.Absyn.Struct) foo;
       render("(");
       render("Struct");
       sh(_struct.ident_);
       render("[");
       sh(_struct.listfield_);
       render("]");
       render(")");
    }
    if (foo instanceof thriftParser.Absyn.Enum)
    {
       thriftParser.Absyn.Enum _enum = (thriftParser.Absyn.Enum) foo;
       render("(");
       render("Enum");
       sh(_enum.ident_);
       render("[");
       sh(_enum.listenumeration_);
       render("]");
       render(")");
    }
  }

  private static void sh(thriftParser.Absyn.ListField foo)
  {
     for (java.util.Iterator<Field> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(thriftParser.Absyn.ListEnumeration foo)
  {
     for (java.util.Iterator<Enumeration> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(thriftParser.Absyn.Field foo)
  {
    if (foo instanceof thriftParser.Absyn.FDecl)
    {
       thriftParser.Absyn.FDecl _fdecl = (thriftParser.Absyn.FDecl) foo;
       render("(");
       render("FDecl");
       sh(_fdecl.integer_);
       sh(_fdecl.requirement_);
       sh(_fdecl.type_);
       sh(_fdecl.ident_);
       sh(_fdecl.default_);
       render(")");
    }
  }

  private static void sh(thriftParser.Absyn.Type foo)
  {
    if (foo instanceof thriftParser.Absyn.TStr)
    {
       thriftParser.Absyn.TStr _tstr = (thriftParser.Absyn.TStr) foo;
       render("TStr");
    }
    if (foo instanceof thriftParser.Absyn.TInt)
    {
       thriftParser.Absyn.TInt _tint = (thriftParser.Absyn.TInt) foo;
       render("TInt");
    }
    if (foo instanceof thriftParser.Absyn.TShort)
    {
       thriftParser.Absyn.TShort _tshort = (thriftParser.Absyn.TShort) foo;
       render("TShort");
    }
    if (foo instanceof thriftParser.Absyn.TLong)
    {
       thriftParser.Absyn.TLong _tlong = (thriftParser.Absyn.TLong) foo;
       render("TLong");
    }
    if (foo instanceof thriftParser.Absyn.TIdent)
    {
       thriftParser.Absyn.TIdent _tident = (thriftParser.Absyn.TIdent) foo;
       render("(");
       render("TIdent");
       sh(_tident.ident_);
       render(")");
    }
    if (foo instanceof thriftParser.Absyn.TMap)
    {
       thriftParser.Absyn.TMap _tmap = (thriftParser.Absyn.TMap) foo;
       render("(");
       render("TMap");
       sh(_tmap.type_1);
       sh(_tmap.type_2);
       render(")");
    }
    if (foo instanceof thriftParser.Absyn.TList)
    {
       thriftParser.Absyn.TList _tlist = (thriftParser.Absyn.TList) foo;
       render("(");
       render("TList");
       sh(_tlist.type_);
       render(")");
    }
    if (foo instanceof thriftParser.Absyn.TSet)
    {
       thriftParser.Absyn.TSet _tset = (thriftParser.Absyn.TSet) foo;
       render("(");
       render("TSet");
       sh(_tset.type_);
       render(")");
    }
  }

  private static void sh(thriftParser.Absyn.Requirement foo)
  {
    if (foo instanceof thriftParser.Absyn.REmp)
    {
       thriftParser.Absyn.REmp _remp = (thriftParser.Absyn.REmp) foo;
       render("REmp");
    }
    if (foo instanceof thriftParser.Absyn.RReq)
    {
       thriftParser.Absyn.RReq _rreq = (thriftParser.Absyn.RReq) foo;
       render("RReq");
    }
    if (foo instanceof thriftParser.Absyn.ROpt)
    {
       thriftParser.Absyn.ROpt _ropt = (thriftParser.Absyn.ROpt) foo;
       render("ROpt");
    }
  }

  private static void sh(thriftParser.Absyn.Default foo)
  {
    if (foo instanceof thriftParser.Absyn.DefEmp)
    {
       thriftParser.Absyn.DefEmp _defemp = (thriftParser.Absyn.DefEmp) foo;
       render("DefEmp");
    }
    if (foo instanceof thriftParser.Absyn.DefInt)
    {
       thriftParser.Absyn.DefInt _defint = (thriftParser.Absyn.DefInt) foo;
       render("(");
       render("DefInt");
       sh(_defint.integer_);
       render(")");
    }
    if (foo instanceof thriftParser.Absyn.DefEmptyStr)
    {
       thriftParser.Absyn.DefEmptyStr _defemptystr = (thriftParser.Absyn.DefEmptyStr) foo;
       render("DefEmptyStr");
    }
    if (foo instanceof thriftParser.Absyn.DefStr)
    {
       thriftParser.Absyn.DefStr _defstr = (thriftParser.Absyn.DefStr) foo;
       render("(");
       render("DefStr");
       sh(_defstr.ident_);
       render(")");
    }
  }

  private static void sh(thriftParser.Absyn.Delim foo)
  {
    if (foo instanceof thriftParser.Absyn.Comma)
    {
       thriftParser.Absyn.Comma _comma = (thriftParser.Absyn.Comma) foo;
       render("Comma");
    }
    if (foo instanceof thriftParser.Absyn.SemiC)
    {
       thriftParser.Absyn.SemiC _semic = (thriftParser.Absyn.SemiC) foo;
       render("SemiC");
    }
    if (foo instanceof thriftParser.Absyn.Empty)
    {
       thriftParser.Absyn.Empty _empty = (thriftParser.Absyn.Empty) foo;
       render("Empty");
    }
  }

  private static void sh(thriftParser.Absyn.Enumeration foo)
  {
    if (foo instanceof thriftParser.Absyn.OneEnum)
    {
       thriftParser.Absyn.OneEnum _oneenum = (thriftParser.Absyn.OneEnum) foo;
       render("(");
       render("OneEnum");
       sh(_oneenum.ident_);
       sh(_oneenum.integer_);
       render(")");
    }
  }


  private static void pp(Integer n, int _i_) { buf_.append(n); buf_.append(" "); }
  private static void pp(Double d, int _i_) { buf_.append(d); buf_.append(" "); }
  private static void pp(String s, int _i_) { buf_.append(s); buf_.append(" "); }
  private static void pp(Character c, int _i_) { buf_.append("'" + c.toString() + "'"); buf_.append(" "); }
  private static void sh(Integer n) { render(n.toString()); }
  private static void sh(Double d) { render(d.toString()); }
  private static void sh(Character c) { render(c.toString()); }
  private static void sh(String s) { printQuoted(s); }
  private static void printQuoted(String s) { render("\"" + s + "\""); }
  private static void indent()
  {
    int n = _n_;
    while (n > 0)
    {
      buf_.append(" ");
      n--;
    }
  }
  private static void backup()
  {
     if (buf_.charAt(buf_.length() - 1) == ' ') {
      buf_.setLength(buf_.length() - 1);
    }
  }
  private static void trim()
  {
     while (buf_.length() > 0 && buf_.charAt(0) == ' ')
        buf_.deleteCharAt(0); 
    while (buf_.length() > 0 && buf_.charAt(buf_.length()-1) == ' ')
        buf_.deleteCharAt(buf_.length()-1);
  }
  private static int _n_ = 0;
  private static StringBuilder buf_ = new StringBuilder(INITIAL_BUFFER_SIZE);
}

