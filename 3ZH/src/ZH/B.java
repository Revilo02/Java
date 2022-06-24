package ZH;

public class B extends A {
	void foo() {System.out.println("B");}
	void bar() {foo();}
	void qus() {super.bar();}
}
