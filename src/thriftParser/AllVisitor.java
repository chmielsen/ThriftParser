package thriftParser;

import thriftParser.Absyn.*;

/** BNFC-Generated All Visitor */
public interface AllVisitor<R,A> extends
  thriftParser.Absyn.Prog.Visitor<R,A>,
  thriftParser.Absyn.Class.Visitor<R,A>,
  thriftParser.Absyn.Field.Visitor<R,A>,
  thriftParser.Absyn.Type.Visitor<R,A>,
  thriftParser.Absyn.Requirement.Visitor<R,A>,
  thriftParser.Absyn.Default.Visitor<R,A>,
  thriftParser.Absyn.Delim.Visitor<R,A>,
  thriftParser.Absyn.Enumeration.Visitor<R,A>
{}
