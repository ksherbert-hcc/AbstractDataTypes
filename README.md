## Getting Started

[![Stable](https://img.shields.io/badge/docs-stable-blue.svg)](https://ksherbert-hcc.github.io/AbstractDataTypes/)
[![GitHub Actions CI](https://github.com/ksherbert-hcc/AbstractDataTypes/actions/workflows/CI.yml/badge.svg)](https://github.com/ksherbert-hcc/AbstractDataTypes/actions/workflows/CI.yml?query=branch%3Amain)

This package defines the public interface for a variety of abstract data structures.

> Students, I recommend bookmarking this package's [reference documentation](https://ksherbert-hcc.github.io/AbstractDataTypes/).

Each interface comes equipped with a static `validate` method which takes a concrete object (usually required to be empty),
and performs a suite of simple tests to ensure the concrete class implemented the interface methods correctly.
These tests are not meant to be comprehensive and should be supplemented with addtional unit tests special to the concrete class.

These interfaces use generic typing. Implementing classes need not be generic themselves...but they probably should be.

In order to define a class which uses an interface defined in this package, you must:
1. Install this package in your project. See the [Installation](#installation) section below for further assistance.
2. Import the interface. E.g. include `import adt.OrderedPair;` before your class definition.
3. Indicate the class should use the interface in the class definition. E.g. `class KeyValuePair implements OrderedPair<String,Integer>`.
4. Implement all interface methods. In our example, `KeyValuePair` must implement methods `String first()`, `Integer second()`, and `OrderedPair<Integer,String> reversed()`.

## Installation
Simply download the `abstract-data-types.jar` file and drop it in your Java project's `lib` folder.

Most IDEs will automatically load all dependencies located in `lib` when linting and running your code, but if you suspect something isn't working, look up how to manage your `CLASSPATH` environment variable.

> Students, if you haven't yet done so, please bookmark this package's [reference documentation](https://ksherbert-hcc.github.io/AbstractDataTypes/).

## Building Protocol
> Students, this section is addressed to a future version of myself. You need not ever do this!


In order to build documentation and the jar archive locally on your own computer, clone this repository and run the following script.
```shell
# Compile source code and package it into a .jar file.
javac -d bin -sourcepath src src/adt/*
jar cvf abstract-data-types.jar -C bin .

# Generate documentation.
javadoc -d docs -sourcepath src adt
```

TODO: Formalize a build-and-release worfklow in CI.yml.