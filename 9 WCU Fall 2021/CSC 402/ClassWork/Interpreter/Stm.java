abstract class Stm {
	abstract void interpret();
}

class CompoundStm extends Stm { // produces two statements, "STM ; STM", our job is to interpret those stms
	Stm stm1, stm2;

	CompoundStm(Stm s1, Stm s2) {
		stm1 = s1;
		stm2 = s2;
	}
	
	void interpret() {
		 stm1.interpret();
       stm2.interpret();
	}
}

class AssignStm extends Stm { // produces "id := EXP", need to interpret id as constant and EXP as variable
	String id;
	Exp exp;

	AssignStm(String i, Exp e) {
		id = i;
		exp = e;
	}

	void interpret() {		
	   Prog.t.put( new String(id), new Integer(exp.interpret()) );
	}
}

class PrintStm extends Stm {
	ExpList exps;

	PrintStm(ExpList e) {
		exps = e;
	}	

	void interpret() {		
		 exps.interpret();
	}
}

abstract class Exp {
	abstract int interpret();
}

class IdExp extends Exp {
	String id;

	IdExp(String i) {
		id = i;
	}	

	int interpret() {		
      return Prog.t.get(id).intValue();
	}
}

class NumExp extends Exp {
	int num;

	NumExp(int n) {
		num = n;
	}
	
	int interpret() {		
	   return num;
	}
}

class OpExp extends Exp {
	Exp left, right;
	int oper;
	final static int Plus = 1, Minus = 2, Times = 3, Div = 4;

	OpExp(Exp l, int o, Exp r) {
		left = l;
		oper = o;
		right = r;
	}
	
	int interpret() {
	   int l = left.interpret();
      int r = right.interpret();
      if (oper == Plus) return l+r;
      if (oper == Minus) return l-r;
      if (oper == Times) return l*r;
      if (oper == Div) return l/r;
      return 0;
	}
}

class EseqExp extends Exp {
	Stm stm;
	Exp exp;

	EseqExp(Stm s, Exp e) {
		stm = s;
		exp = e;
	}
	
	int interpret() {		
		stm.interpret();
      return exp.interpret();
	}
}

abstract class ExpList {
	abstract void interpret();
}

class PairExpList extends ExpList {
	Exp head;
	ExpList tail;

	public PairExpList(Exp h, ExpList t) {
		head = h;
		tail = t;
	}
	
	void interpret() {
	   System.out.println( head.interpret() );
      tail.interpret();
	}
}

class LastExpList extends ExpList {
	Exp head;

	public LastExpList(Exp h) {
		head = h;
	}
	
	void interpret() {
		System.out.println( head.interpret() );
	}
}
