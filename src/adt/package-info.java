/// This package defines the public interface for a variety of abstract data structures.
/// 
/// Each interface comes equipped with a static `validate` method which takes a concrete object (usually required to be empty),
/// and performs a suite of simple tests to ensure the concrete class implemented the interface methods correctly.
/// These tests are not meant to be comprehensive and should be supplemented with addtional unit tests special to the concrete class.
/// 
/// These interfaces use generic typing. Implementing classes need not be generic themselves...but they probably should be.
/// 
/// In order to define a class which uses an interface defined in this package, you must:
/// 1. Install this package in your project. See the README at my [GitHub repository](https://github.com/ksherbert-hcc/AbstractDataTypes) for further assistance.
/// 2. Import the interface. E.g. include "`import adt.OrderedPair;`" before your class definition.
/// 3. Indicate the class should use the interface in the class definition. E.g. "`class KeyValuePair implements OrderedPair<String,Integer>`".
/// 4. Implement all interface methods. In our example, "`KeyValuePair`" must implement methods "`String first()`", "`Integer second()`", and "`OrderedPair<Integer,String> reversed()`".
package adt;
