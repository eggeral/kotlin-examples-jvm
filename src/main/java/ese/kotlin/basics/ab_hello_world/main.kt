package ese.kotlin.basics.ab_hello_world

// Note that there is no "class"
// in Kotlin functions can be written outside of classes.
// For the JVM nevertheless the Kotlin Compiler will automatically generate a
// class containing that function.
fun main(args: Array<String>) {
    println("Hello World")
}

// fun -> it's a function
// main -> the name of that function
// args -> the name of the parameter
// Array<String> -> the type of the parameter

/*
public final class ese/kotlin/jvm/ab_hello_world/MainKt {


  // access flags 0x19
  public final static main([Ljava/lang/String;)V
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 0
   L0
    ALOAD 0
    LDC "args"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
   L1
    LINENUMBER 8 L1
    LDC "Hello World"
    ASTORE 1
   L2
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ALOAD 1
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/Object;)V
   L3
   L4
    LINENUMBER 9 L4
    RETURN
   L5
    LOCALVARIABLE args [Ljava/lang/String; L0 L5 0
    MAXSTACK = 2
    MAXLOCALS = 2
...
 */