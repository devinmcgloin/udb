# UDB
UDB is a universal data structure system that dynamically optimizes abstract collections. 

UDB is based on the Java Collections framework. 

**It is very much a work in progress. None of the below is implemented yet. Most likely everything will change.**

## Motivations
The primary motivation of this project is simplicity, not performance. It would be excellent if non programmers or beginners could place items in an abstract collection, not worry about the performance costs of an array vs a list, and the system would determine the right data structure. 

The primary goal of the project is to eventually allow non-programmers to store data in these abstract collections and manipulate those collections thru a GUI with no understanding of the data structures behind the scenes. This is reasonable as the number of items will generally be small. 
 
I would like to make all collections immutable, but the focus is on having half decent performance first, then working towards immutability. 

## Collections

- Set
- List
- Queue
- Map

## Operations

- Map 
- Filter
- Reduce
- subset
- Group By

### Special Operators

- Sort
  - Sort is special as it switches the type of data structure used. It automatically converts to a List. 
- Rank
  - Rank automatically converts the collection to a queue. 
