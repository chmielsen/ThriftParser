#Python 3.3

import sys
# Program nie obluguje komentarzy zaczynajacych sie nie od
# poczatku linii


class State:
    STRUCT_OR_ENUM=0
    COMMENT_OUTSIDE=1
    COMMENT_IN_STRUCT=2
    JUNK=3

def main():
    f = open(sys.argv[1], 'r')
    state = State.JUNK
    for line in f:
#print ("LINIA: " + line[:-1] + " " + str(state))
#if line.startswith('namespace ' ) and state not in [State.COMMENT_IN_STRUCT, State.COMMENT_OUTSIDE]:
#            print(line[:-1])
        if '/*' in line:
            if state == State.STRUCT_OR_ENUM:
                state = State.COMMENT_IN_STRUCT
            else:
                state = State.COMMENT_OUTSIDE
        elif '*/' in line:
            if state == State.COMMENT_OUTSIDE:
                state = State.JUNK
            elif state == State.COMMENT_IN_STRUCT:
                state = State.STRUCT_OR_ENUM
                continue
            elif state not in [State.COMMENT_OUTSIDE, State.COMMENT_IN_STRUCT]:
                print("ERROR in line: " + line + "Bad comment, State = " + str(state))
        elif '//' in line:
            continue;
        elif line.startswith('struct ') or line.startswith('enum '):
            state = State.STRUCT_OR_ENUM
        elif '}' in line and state == State.STRUCT_OR_ENUM:
            print(line[:-1])
            state = State.JUNK

        if state == State.STRUCT_OR_ENUM:
            print(line[:-1])
#        print("STAN PO: " + str(state))
    f.close()

if __name__ == "__main__":
    main()
