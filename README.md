**ABSTRACT,INTERFACE and CONCRETE CLASSES**
**ABSTRACT CLASSES AND INTERFACE CLASSES**
They consist of an abstract class and abstract methods to prevent instantiation 
**ABSTRACT CLASSES AND FEATURES**
Cafe(Abstract class)

**Attributes: Variable attributes**
cuisine:Name of a cuisine
block: Number of the block location.

**ABSTRACT METHOD**
public abstract void showMenu();

**EASTCAFE class(Inherits from Cafe)**
**Attributes:**
Inherit attributes from Cafe class.
**Methods:**
Inherits all methods from LibraryItem.

**INTERFACE CLASS AND FEATURES**
They consist of an abstract class and abstract methods to prevent instantiation
**Interface class: Book**
**Attributes: Constant/Final attributes**
name:Theories
chapters: 32.
**ABSTRACT METHOD**
public void Chapters();

**CHAPTERS class(Implements Book interface)**
It is responsible for providing the implementation for the Chapters() method that was defined in the Book interface.
The Chapters() method outputs the name of a chapter ("The Guest List") to the console.
Book Interface (assumed)
The Book interface (not included in the code snippet) is assumed to have an abstract method Chapters() that the implementing class must define.

**MAGAZINE class(Implements Book interface)**
 This class defines the concrete implementation for the abstract method Chapters() declared in the Book interface. The Magazine class outputs the name of a magazine ("Vogue magazine") when the Chapters() method is called.
