import thriftParser.Absyn.*;
import thriftParser.Yylex;
import thriftParser.parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: wojtek
 * Date: 8/4/13
 * Time: 9:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Interpret {

    // the directory tree has to be created
    final String MORDA_IO_PATH = "/home/wojtek/mordatest/";
    final String INPUT         = "input/";


    public static void main(String args[]) throws Exception {
        InputStream is = new FileInputStream(args[0]);
        Yylex lex = new Yylex(is);
        parser p  = new parser(lex);
        Program program =  Program.class.cast(p.pProg());
        for (thriftParser.Absyn.Class class : program.listclass_) {

        }

    }

}
