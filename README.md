# COMP3111-Software-Engineering

## Final Review

---

### L01

### Dealing with complexity
Having **clear design goals** reduces system's design complexity as it is needed to 
prioritise client's design goals (qualities).

**Modular and Incremental Development** reduces complexity of cost and time estimates
- Module: a part of a system which makes sense to be considered separately
- Interact with module only via **interfaces**, which **abstracts** and **encapsulates** a module to support 
information hiding. 
- Reduces complexity of understanding (only need to understand interface) and maintaining (changed without 
effecting the rest of system) the system

**Training Software Engineers** which increase effectiveness of software engineering techniques to
reduces complexity of building the system

### Software Engineering
- Modeling 
- Problem solving: search solution in the presence of change -> systematic rather than algorithmic
- Knowledge acquistion
- Rationale management

---

### L02

### UML
General purpose visual modeling language for systems. Independent of the software development methodology / 
process. Show essential details while filtering out non-essential ones to focus on the **programming-in-the-large**.

**OO-modeling** reduces semantic gap between application model and model:
- Requirement level: focus identifying objects without implementation. Consists of defining class
- Analysis & Design level: focus on interfaces of object, how objects interact
- Implementation level: focus on detail of objects, how to code

### Class
Describes a collection of objects (instances) which capture one abstraction theme. Reduces complexity of 
understanding and specifying the system. Helps modular development.

**Attribute** describes data values held by objects, consists of: 
- name
- [type]
- visibility (public (+), private (-), protected (#), package (~))
- [initial value]
- [multiplicity]
- changeability

**Operation**: function / transformation applied to the class. **Method**: operation instance. Consists of: 
- operation signature (name, params. names, result type)
-visibiliity.

### Association
Description of the links (relationship instance) between two objects. Collection of names and association
names must be unique.

Degree of association:
- **Unary** (reflexive): relates one class to itself, requires **role** is one end of an association
- **Binary** : relates two classes, etc

**Multiplicity** specifies restriction on the number of objects in a class that related to **one* object
in another class.
- Minimum cardinality = 0 : optional participation
- Minimum cardinality > 0 : mandatory participation (must be related)
- Maximum cardinality = * : unlimited upper bound
- Min-card = 1 & max-card = 1 : 1
- Min-card = 0 & max-card = * : *

**"part-of" / "made-of" relationship**. Use association when in doubt.
- **Aggregation** (hollow rhombus) : a component may exist independent of the aggregate object of which it is
a part. Not necessarily have the same life-cycle. Min-card = 0 & max-card = 1 or *. Not every "has"
relationship are aggregations.
- **Composition** (full rhombus) : may not exist independent and have to have same life-cycle. Min-card = 0 
& max-card = 1 or *.

---

### L03

### Association Class
Used when the association has attribute, most often needed for many-to-many associations.

### Generalisation
Relationship between classes of the same kind. **Discriminator**: attribute of enumeration type that indicates
which property of a class is used to create a generalisation relationship. Top-down is specialisation, 
bottom-up is generalisation.

**Inheritance** takes up properties by subclass from its superclass, so properties only defined in one place.
Reduces redundancy, promotes reusability, simplifies modification.
