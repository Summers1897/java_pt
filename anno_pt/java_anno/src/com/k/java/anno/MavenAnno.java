package com.k.java.anno;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 注解目前非常的流行，很多主流框架都支持注解，而且自己编写代码的时候也会尽量的去用注解，一时方便，而是代码更加简洁。 注解的语法比较简单，除了@符号的使用之外，它基本与Java固有语法一致。Java SE5内置了三种标准注解：
 * @Override，表示当前的方法定义将覆盖超类中的方法。
 * @Deprecated，使用了注解为它的元素编译器将发出警告，因为注解@Deprecated是不赞成使用的代码，被弃用的代码。
 * @SuppressWarnings，关闭不当编译器警告信息。 上面这三个注解多少我们都会在写代码的时候遇到。Java还提供了4中注解，专门负责新注解的创建。
 * @Target 表示该注解可以用于什么地方，可能的ElementType参数有： CONSTRUCTOR：构造器的声明 FIELD：域声明（包括enum实例） LOCAL_VARIABLE：局部变量声明 METHOD：方法声明 PACKAGE：包声明 PARAMETER：参数声明 TYPE：类、接口（包括注解类型）或enum声明
 * @Retention 表示需要在什么级别保存该注解信息。可选的RetentionPolicy参数包括： SOURCE：注解将被编译器丢弃 CLASS：注解在class文件中可用，但会被VM丢弃 RUNTIME：VM将在运行期间保留注解，因此可以通过反射机制读取注解的信息。
 * @Document 将注解包含在Javadoc中
 * @Inherited 允许子类继承父类中的注解 　　定义一个注解的方式： 1 @Target(ElementType.METHOD) 2 @Retention(RetentionPolicy.RUNTIME) 3 public @interface Test { 4 5 } 除了@符号，注解很像是一个接口。定义注解的时候需要用到元注解，上面用到了@Target和@RetentionPolicy，它们的含义在上面的表格中已近给出。
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MavenAnno {
	public Class[] depends();
}
