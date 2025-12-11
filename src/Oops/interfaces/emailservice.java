package Oops.interfaces;

public class emailservice implements service{
    public void hello(){
        System.out.println("hello");
    }
}

interface service{
//    int a; not allowed
//            | Code                   | Result                                               |
//            | ---------------------- | ---------------------------------------------------- |
//            | `private int x = 5;`   | ❌ ERROR (interface variable private nahi ho sakti)   |
//            | `protected int x = 5;` | ❌ ERROR                                              |
//            | `int x;`               | ❌ ERROR (final hoti hai, so initialization required) |
//            | `static int x;`        | ❌ ERROR (final missing)                              |
//            | `final int x;`         | ❌ ERROR (initialization missing)                     |

    void hello();
//    private void show();     // ❌ ERROR
//    protected void show();   // ❌ ERROR

//            | Example                            | Why not allowed                  |
//            | ---------------------------------- | -------------------------------- |
//            | `void show() { }`                  | ❌ Normal method body not allowed |
//            | `protected default void test() {}` | ❌ protected not allowed          |
//            | `final default void test() {}`     | ❌ final not allowed              |
//            | `synchronized void test() {}`      | ❌ not allowed                    |
//            | `strictfp void test() {}`          | ❌ not allowed                    |

    private void help() {
        System.out.println("helper");
    }
    private static void util() {
        System.out.println("utility");
    }
    default void msg() {
        System.out.println("Hello"); //❌ Cannot be static/abstract with default
    }
    static void info() {
        System.out.println("Static method");
    }
//    public void infot() {
//        System.out.println("Static method");
//    }wrong
    public static void infoo() {
        System.out.println("Static method");
    }


}

