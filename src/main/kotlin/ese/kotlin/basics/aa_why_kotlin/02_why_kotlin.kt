package ese.kotlin.basics.aa_why_kotlin

// 1 to 4 see JavaCustomer.java
// see also https://kotlinlang.org/docs/tutorials/koans.html

fun main(args: Array<String>) {

    // 5 use the Java class
    val javaCustomer = JavaCustomer("Java Customer", "Java", 5)
    println(javaCustomer)

    // 6 see KotlinCustomer
    // 7 use the Kotlin class

    val kotlinCustomer = KotlinCustomer("Kotin Customer", "Kotin", 5)
    println(kotlinCustomer)

    // 8 Byte code of JavaCustomer
    /*
    / class version 52.0 (52)
// access flags 0x21
public class ese/kotlin/jvm/aa_why_kotlin/JavaCustomer {

  // compiled from: 01_java_customer.java

  // access flags 0x2
  private Ljava/lang/String; name

  // access flags 0x2
  private Ljava/lang/String; address

  // access flags 0x2
  private I orders

  // access flags 0x1
  public <init>(Ljava/lang/String;Ljava/lang/String;I)V
   L0
    LINENUMBER 12 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
   L1
    LINENUMBER 13 L1
    ALOAD 0
    ALOAD 1
    PUTFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.name : Ljava/lang/String;
   L2
    LINENUMBER 14 L2
    ALOAD 0
    ALOAD 2
    PUTFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.address : Ljava/lang/String;
   L3
    LINENUMBER 15 L3
    ALOAD 0
    ILOAD 3
    PUTFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.orders : I
   L4
    LINENUMBER 16 L4
    RETURN
   L5
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/JavaCustomer; L0 L5 0
    LOCALVARIABLE name Ljava/lang/String; L0 L5 1
    LOCALVARIABLE address Ljava/lang/String; L0 L5 2
    LOCALVARIABLE orders I L0 L5 3
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x1
  public getName()Ljava/lang/String;
   L0
    LINENUMBER 21 L0
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.name : Ljava/lang/String;
    ARETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/JavaCustomer; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public setName(Ljava/lang/String;)V
   L0
    LINENUMBER 25 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.name : Ljava/lang/String;
   L1
    LINENUMBER 26 L1
    RETURN
   L2
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/JavaCustomer; L0 L2 0
    LOCALVARIABLE name Ljava/lang/String; L0 L2 1
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public getAddress()Ljava/lang/String;
   L0
    LINENUMBER 29 L0
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.address : Ljava/lang/String;
    ARETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/JavaCustomer; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public setAddress(Ljava/lang/String;)V
   L0
    LINENUMBER 33 L0
    ALOAD 0
    ALOAD 1
    PUTFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.address : Ljava/lang/String;
   L1
    LINENUMBER 34 L1
    RETURN
   L2
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/JavaCustomer; L0 L2 0
    LOCALVARIABLE address Ljava/lang/String; L0 L2 1
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public getOrders()I
   L0
    LINENUMBER 37 L0
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.orders : I
    IRETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/JavaCustomer; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public setOrders(I)V
   L0
    LINENUMBER 41 L0
    ALOAD 0
    ILOAD 1
    PUTFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.orders : I
   L1
    LINENUMBER 42 L1
    RETURN
   L2
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/JavaCustomer; L0 L2 0
    LOCALVARIABLE orders I L0 L2 1
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
   L0
    LINENUMBER 49 L0
    ALOAD 0
    ALOAD 1
    IF_ACMPNE L1
    ICONST_1
    IRETURN
   L1
    LINENUMBER 50 L1
   FRAME SAME
    ALOAD 1
    IFNULL L2
    ALOAD 0
    INVOKEVIRTUAL java/lang/Object.getClass ()Ljava/lang/Class;
    ALOAD 1
    INVOKEVIRTUAL java/lang/Object.getClass ()Ljava/lang/Class;
    IF_ACMPEQ L3
   L2
   FRAME SAME
    ICONST_0
    IRETURN
   L3
    LINENUMBER 51 L3
   FRAME SAME
    ALOAD 1
    CHECKCAST ese/kotlin/jvm/aa_why_kotlin/JavaCustomer
    ASTORE 2
   L4
    LINENUMBER 52 L4
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.orders : I
    ALOAD 2
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.orders : I
    IF_ICMPNE L5
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.name : Ljava/lang/String;
    ALOAD 2
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.name : Ljava/lang/String;
   L6
    LINENUMBER 53 L6
    INVOKESTATIC java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
    IFEQ L5
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.address : Ljava/lang/String;
    ALOAD 2
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.address : Ljava/lang/String;
   L7
    LINENUMBER 54 L7
    INVOKESTATIC java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
    IFEQ L5
    ICONST_1
    GOTO L8
   L5
   FRAME APPEND [ese/kotlin/jvm/aa_why_kotlin/JavaCustomer]
    ICONST_0
   L8
    LINENUMBER 52 L8
   FRAME SAME1 I
    IRETURN
   L9
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/JavaCustomer; L0 L9 0
    LOCALVARIABLE o Ljava/lang/Object; L0 L9 1
    LOCALVARIABLE that Lese/kotlin/jvm/aa_why_kotlin/JavaCustomer; L4 L9 2
    MAXSTACK = 2
    MAXLOCALS = 3

  // access flags 0x1
  public hashCode()I
   L0
    LINENUMBER 59 L0
    ICONST_3
    ANEWARRAY java/lang/Object
    DUP
    ICONST_0
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.name : Ljava/lang/String;
    AASTORE
    DUP
    ICONST_1
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.address : Ljava/lang/String;
    AASTORE
    DUP
    ICONST_2
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.orders : I
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    AASTORE
    INVOKESTATIC java/util/Objects.hash ([Ljava/lang/Object;)I
    IRETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/JavaCustomer; L0 L1 0
    MAXSTACK = 4
    MAXLOCALS = 1

  // access flags 0x1
  public toString()Ljava/lang/String;
   L0
    LINENUMBER 66 L0
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "JavaCustomer{name='"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.name : Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    BIPUSH 39
    INVOKEVIRTUAL java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
    LDC ", address='"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.address : Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    BIPUSH 39
    INVOKEVIRTUAL java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
    LDC ", orders="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/JavaCustomer.orders : I
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    BIPUSH 125
    INVOKEVIRTUAL java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/JavaCustomer; L0 L1 0
    MAXSTACK = 2
    MAXLOCALS = 1
}
     */

    // 9 Byte code for KotlinConsumer
    /*
    // class version 52.0 (52)
// access flags 0x31
public final class ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer {

  // compiled from: 03_kotlin_customer.kt

  @Lkotlin/Metadata;(mv={1, 1, 11}, bv={1, 0, 2}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0009\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0009\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0009\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0009\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001J\u0009\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0009R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0009R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0016"}, d2={"Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer;", "", "name", "", "address", "orders", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getAddress", "()Ljava/lang/String;", "getName", "getOrders", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-examples-jvm_main"})

  // access flags 0x12
  private final Ljava/lang/String; name
  @Lorg/jetbrains/annotations/NotNull;() // invisible

  // access flags 0x12
  private final Ljava/lang/String; address
  @Lorg/jetbrains/annotations/NotNull;() // invisible

  // access flags 0x12
  private final I orders

  // access flags 0x11
  public final getName()Ljava/lang/String;
  @Lorg/jetbrains/annotations/NotNull;() // invisible
   L0
    LINENUMBER 4 L0
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.name : Ljava/lang/String;
    ARETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x11
  public final getAddress()Ljava/lang/String;
  @Lorg/jetbrains/annotations/NotNull;() // invisible
   L0
    LINENUMBER 4 L0
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.address : Ljava/lang/String;
    ARETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x11
  public final getOrders()I
   L0
    LINENUMBER 4 L0
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.orders : I
    IRETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public <init>(Ljava/lang/String;Ljava/lang/String;I)V
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 0
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 1
   L0
    ALOAD 1
    LDC "name"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
    ALOAD 2
    LDC "address"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
   L1
    LINENUMBER 4 L1
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    ALOAD 0
    ALOAD 1
    PUTFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.name : Ljava/lang/String;
    ALOAD 0
    ALOAD 2
    PUTFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.address : Ljava/lang/String;
    ALOAD 0
    ILOAD 3
    PUTFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.orders : I
    RETURN
   L2
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer; L0 L2 0
    LOCALVARIABLE name Ljava/lang/String; L0 L2 1
    LOCALVARIABLE address Ljava/lang/String; L0 L2 2
    LOCALVARIABLE orders I L0 L2 3
    MAXSTACK = 2
    MAXLOCALS = 4

  // access flags 0x11
  public final component1()Ljava/lang/String;
  @Lorg/jetbrains/annotations/NotNull;() // invisible
   L0
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.name : Ljava/lang/String;
    ARETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x11
  public final component2()Ljava/lang/String;
  @Lorg/jetbrains/annotations/NotNull;() // invisible
   L0
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.address : Ljava/lang/String;
    ARETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x11
  public final component3()I
   L0
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.orders : I
    IRETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x11
  public final copy(Ljava/lang/String;Ljava/lang/String;I)Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer;
  @Lorg/jetbrains/annotations/NotNull;() // invisible
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 0
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 1
   L0
    ALOAD 1
    LDC "name"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
    ALOAD 2
    LDC "address"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
    NEW ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer
    DUP
    ALOAD 1
    ALOAD 2
    ILOAD 3
    INVOKESPECIAL ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.<init> (Ljava/lang/String;Ljava/lang/String;I)V
    ARETURN
   L1
    LOCALVARIABLE this Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer; L0 L1 0
    LOCALVARIABLE name Ljava/lang/String; L0 L1 1
    LOCALVARIABLE address Ljava/lang/String; L0 L1 2
    LOCALVARIABLE orders I L0 L1 3
    MAXSTACK = 5
    MAXLOCALS = 4

  // access flags 0x1049
  public static synthetic bridge copy$default(Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer;
  @Lorg/jetbrains/annotations/NotNull;() // invisible
    ILOAD 4
    ICONST_1
    IAND
    IFEQ L0
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.name : Ljava/lang/String;
    ASTORE 1
   L0
   FRAME SAME
    ILOAD 4
    ICONST_2
    IAND
    IFEQ L1
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.address : Ljava/lang/String;
    ASTORE 2
   L1
   FRAME SAME
    ILOAD 4
    ICONST_4
    IAND
    IFEQ L2
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.orders : I
    ISTORE 3
   L2
   FRAME SAME
    ALOAD 0
    ALOAD 1
    ALOAD 2
    ILOAD 3
    INVOKEVIRTUAL ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.copy (Ljava/lang/String;Ljava/lang/String;I)Lese/kotlin/jvm/aa_why_kotlin/KotlinCustomer;
    ARETURN
    MAXSTACK = 4
    MAXLOCALS = 6

  // access flags 0x1
  public toString()Ljava/lang/String;
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    LDC "KotlinCustomer(name="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.name : Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ", address="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.address : Ljava/lang/String;
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC ", orders="
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.orders : I
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC ")"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ARETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x1
  public hashCode()I
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.name : Ljava/lang/String;
    DUP
    IFNULL L0
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
    GOTO L1
   L0
   FRAME SAME1 java/lang/String
    POP
    ICONST_0
   L1
   FRAME SAME1 I
    BIPUSH 31
    IMUL
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.address : Ljava/lang/String;
    DUP
    IFNULL L2
    INVOKEVIRTUAL java/lang/Object.hashCode ()I
    GOTO L3
   L2
   FRAME FULL [ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer] [I java/lang/String]
    POP
    ICONST_0
   L3
   FRAME FULL [ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer] [I I]
    IADD
    BIPUSH 31
    IMUL
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.orders : I
    INVOKESTATIC java/lang/Integer.hashCode (I)I
    IADD
    IRETURN
    MAXSTACK = 3
    MAXLOCALS = 1

  // access flags 0x1
  public equals(Ljava/lang/Object;)Z
    ALOAD 0
    ALOAD 1
    IF_ACMPEQ L0
    ALOAD 1
    INSTANCEOF ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer
    IFEQ L1
    ALOAD 1
    CHECKCAST ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer
    ASTORE 2
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.name : Ljava/lang/String;
    ALOAD 2
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.name : Ljava/lang/String;
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
    IFEQ L1
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.address : Ljava/lang/String;
    ALOAD 2
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.address : Ljava/lang/String;
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
    IFEQ L1
    ALOAD 0
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.orders : I
    ALOAD 2
    GETFIELD ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer.orders : I
    IF_ICMPNE L2
    ICONST_1
    GOTO L3
   L2
   FRAME APPEND [ese/kotlin/jvm/aa_why_kotlin/KotlinCustomer]
    ICONST_0
   L3
   FRAME SAME1 I
    IFEQ L1
   L0
   FRAME CHOP 1
    ICONST_1
    IRETURN
   L1
   FRAME SAME
    ICONST_0
    IRETURN
    MAXSTACK = 2
    MAXLOCALS = 3
}

     */


    // 10 null safety
    var foo: String = "test"
    // foo = null // not allowed

    var bar: String? = "test"
    bar = null
    //bar.length // not allowed (could be null)

    if (bar != null) { // automated typ conversion
        bar.length
    }

    // 11 Extension functions
    fun JavaCustomer.asJsonString(): String {
        return "{name='${this.name}', address='${this.address}', orders=${this.orders}}"
    }

    val customer = JavaCustomer("test", "test", 5)
    println(customer.asJsonString())

}


