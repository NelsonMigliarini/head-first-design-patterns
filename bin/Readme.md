# Object Oriented Concepts

## Basics

- Abstraction
- Encapsulation
- Polymorphism
- Inheritance

## Principles

- Encapsulate what varies.
- Favor composition over inheritance.
- Program to interfaces, not implementations.
- Strive for loosely coupled design between objects that interact.
- Classes should be open for extension but closed for modification.
- Depend on abstractions. Do not depend on concrete classes.
  - No variable should hold a reference to a concrete class.
  - No class should derive from a concrete class.
  - No method should override an implemented method of any of its base classes.
- Talk only to your friends.
  - The object itself.
  - Objects passed in as a parameter to the method
  - Any object the method creates or instantiates (not to call methods on objects that were returned from calling other methods)
  - Any components of the object (objects that are referenced by an instance variable, like a HAS-A relationship)

## Patterns

- Strategy: Defines a family of algorithms, encapsulated each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
- Observer: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- Decorator: Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
- Abstract Factory: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- Factory Method: Defines an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to the subclasses.
- Singleton: Ensure a class only has one instance and provide a global point of access to it.
- Command: Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
- Adapter: Converts the interface of a class into another interface clients expect. Lets classes work together that couldn't otherwise because of incompatible interfaces.
- Facade: Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

## Bullet Points

### Pattern

- Knowing the OO basics does not make you a good OO designer.

- Good OO designs are reusable, extensible, and maintainable.

- Patterns show you how to build systems with good OO design qualities.

- Patterns are proven object-oriented experience.

- Patterns don’t give you code, they give you general solutions to design problems. You apply them to your specific application.

- Patterns aren’t invented, they are discovered.

- Most patterns and principles address issues of change in software.

- Most patterns allow some part of a system to vary independently of all other parts.

- We often try to take what varies in a system and encapsulate it.

- Patterns provide a shared language that can maximize the value of your communication with other developers. 

  ---

### Observer Pattern

- The Observer Pattern defines a one-to-many relationship between objects.

- Subjects, or as we also know them, Observables, update Observers using a common interface.

- Observers are loosely coupled in that the Observable knows nothing about them, other than that they implement the Observer interface.

- You can push or pull data from the Observable when using the pattern (pull is considered more “correct”).

- Don’t depend on a specific order of notification for your Observers.

- Java has several implementations of the Observer Pattern, including the general purpose java.util.Observable.

- Watch out for issues with the java.util.Observable implementation.

- Don’t be afraid to create your own Observable implementation if needed.

- Swing makes heavy use of the Observer Pattern, as do many GUI frameworks.

- You’ll also find the pattern in many other places, including JavaBeans and RMI. 

  ---

- Inheritance is one form of extension, but not necessarily the best way to achieve flexibility in our designs.

- In our designs we should allow behavior to be extended without the need to modify existing code.

- Composition and delegation can often be used to add new behaviors at runtime.

- The Decorator Pattern provides an alternative to subclassing for extending behavior.

- The Decorator Pattern involves a set of decorator classes that are used to wrap concrete components.

- Decorator classes mirror the type of the components they decorate. (In fact, they are the same type as the components they decorate, either through inheritance or interface implementation).

- Decorators change the behavior of their components by adding new functionality before and/or after (or even in place of) method calls to the component.

- You can wrap a component with any number of decorators.

- Decorators are typically transparent to the client of the component; that is, unless the client is relying on the component’s concrete type.

- Decorators can result in many small objects in our design, and overuse can be complex.  

---

### Factory Pattern

- All factories encapsulate object creation.
- Simple Factory, while not a bona fide design pattern, is a simple way to decouple your clients from concrete classes.
- Factory Method relies on inheritance: object creation is delegated to subclasses, which implement the factory method to create objects.
- Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory interface.
- All factory patterns promote loose coupling by reducing the dependency of your application on concrete classes.
- The intent of Factory Method is to allow a class to defer instantiation to its subclasses.
- The intent of Abstract Factory is to create families of related objects without having to depend on their concrete classes.
- The Dependency Inversion Principle guides us to avoid dependencies on concrete types and to strive for abstractions.
- Factories are a powerful technique for coding to abstractions, not concrete classes.  

---

### Singleton

- The Singleton Pattern ensures you have at most one instance of a class in your application.
- The Singleton Pattern also provides a global access point to that instance.
- Java’s implementation of the Singleton Pattern makes use of a private constructor, a static method combined with a static variable.
- Examine your performance and resource constraints and carefully choose an appropriate Singleton implementation for multithreaded applications (and we should consider all applications multithreaded!).
- Beware of the double-checked locking implementation; it is not thread-safe in versions before Java 2, version 5.
- Be careful if you are using multiple class loaders; this could defeat the Singleton implementation and result in multiple instances.
- If you are using a JVM earlier than 1.2, you’ll need to create a registry of Singletons to defeat the garbage collector  

---

### Command

- The Command Pattern decouples an object making a request from the one that knows how to perform it.
- A Command object is at the center of this decoupling and encapsulates a receiver with an action (or set of actions).
- An invoker makes a request of a Command object by calling its execute() method, which invokes those actions on the receiver.
- Invokers can be parameterized with Commands, even dynamically at runtime.
- Commands may support undo by implementing an undo method that restores the object to its previous state before the execute() method was last called.
- Macro Commands are a simple extension of Command that allow multiple commands to be invoked. Likewise, Macro Commands can easily support undo().
- In practice, it is not uncommon for “smart” Command objects to implement the request themselves rather than delegating to a receiver.
- Commands may also be used to implement logging and transactional systems. 

---

### Adapter and facade

- When you need to use an existing class and its interface is not the one you need, use an adapter.

- When you need to simplify and unify a large interface or complex set of interfaces, use a facade.

- An adapter changes an interface into one a client expects.

- A facade decouples a client from a complex subsystem.

- Implementing an adapter may require little work or a great deal of work depending on the size and complexity of the target interface.

- Implementing a facade requires that we compose the facade with its subsystem and use delegation to perform the work of the facade.

- There are two forms of the Adapter Pattern: object and class adapters. Class adapters require multiple inheritance.

- You can implement more than one facade for a subsystem.

- An adapter wraps an object to change its interface, a decorator wraps an object to add new behaviors and responsibilities, and a facade “wraps” a set of objects to simplify.

  