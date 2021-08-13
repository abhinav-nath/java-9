# The Java Platform Module System

## Motivation and Goals

* Java has been around since 1995
* It started off small with approximately 250 classes in version 1.0.2
* About 500 classes in version 1.1
* Java SE 8 has over 4000 classes
* Overtime Java grew very large and difficult to maintain and extend


* The Java Platform Module System (JSR 376) or Project JigSaw was targeted for Java 8
* But got delayed into Java 9
* https://openjdk.java.net/projects/jigsaw/


* Large applications can have thousands of jar files
* This becomes a problem at some point of time
* It is known as "JAR Hell"

## Module

Before Java 8 this was the structure of the code:

`package --> class --> methods and fields`

Java 9 added one more level of encapsulation on top of packages:

`module --> package --> class --> methods and fields`

* JDK 9 is completely modularized
* Java SE9 has 94 modules
  
  `java --list-modules`
* 

## How do we declare a module?

we just create a `module-info.java` file inside the src (parent) folder keep the packages which we need inside a module there.

This is how a `module-info.java` looks like:

```java
module com.example.model {
   // module directives go here
}
```

## Module Directives

```java
module com.example.model {
   // What other modules do I require?
   // What packages will I export to other modules?
   // What services do I provide to other modules?
   // What services do I use from other modules?
   // Will my packages be open to reflection?
}
```

## "requires" and "exports" directives

```java
module com.example.cli {
   requires com.example.model;
}
```

```java
module com.example.model {
   exports com.example.model;
}
```

## requires transitive (implied readability)

```java
module com.example.cli {
   requires transitive com.example.model;
}
```

## requires static

```java
module com.example.cli {
   requires static com.example.model;
}
```