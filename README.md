# Spring Core - Dependency Injection

A beginner-friendly Java project to understand **Dependency Injection (DI)** concepts in Spring Core.

## 📚 Topics Covered

* Dependency Injection (DI)
* Tight Coupling vs Loose Coupling
* Interface-based Dependency
* Constructor Injection
* Setter Injection
* Field Injection
* Reflection-based Field Injection
* Composition and HAS-A relationship

## 🔹 Dependency Injection

Dependency Injection means **providing the required dependency to an object from outside instead of creating the dependency inside the object**.

Example:

```java
student sc = new student(101, "Amit", new SparkCourse());
```

Here, `SparkCourse` is injected into the `student` object.

## 🔹 Types of Dependency Injection

### 1. Constructor Injection

The dependency is provided through the constructor.

```java
student sc = new student(101, "Amit", spark);
```

### 2. Setter Injection

The dependency is provided using a setter method.

```java
student sc2 = new student(101, "Meera");
sc2.setCourse(bc);
```

### 3. Field Injection

The dependency is directly assigned to a field.

In this project, field injection is demonstrated using Java Reflection.

```java
FieldIInjection.injectCourse(sc3, new SparkCourse());
```

## 🔹 Project Structure

```text
src/
└── DependencyInjection/
    ├── CourseName.java
    ├── SparkCourse.java
    ├── BackendCourse.java
    ├── student.java
    ├── FieldIInjection.java
    └── Main.java
```

## 🎯 Purpose

The purpose of this project is to understand the **basic concept of Dependency Injection** before learning how the **Spring Framework Container** performs Dependency Injection automatically.

## 🛠️ Technologies Used

* Java
* Spring Core Concepts
* Java Reflection
* IntelliJ IDEA

## 👨‍💻 Learning Goal

This project is part of my **Spring Core learning journey**, focusing on understanding Dependency Injection and loose coupling before moving to Spring's actual DI implementation.
