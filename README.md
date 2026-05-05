## Getting Started

[![Stable](https://img.shields.io/badge/docs-stable-blue.svg)](https://ksherbert-hcc.github.io/AbstractDataTypes/)
[![Build Status](https://github.com/kmsherbertvt/CtrlVQE.jl/actions/workflows/CI.yml/badge.svg?branch=main)](https://github.com/ksherbert-hcc/AbstractDataTypes/actions/workflows/CI.yml?query=branch%3Amain)

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Building Protocol
```shell
# Compile source code and package it into a .jar file.
javac -d bin -sourcepath src src/adt/*
jar cvf abstract-data-types.jar -C bin .  

# Generate documentation.
javadoc -d docs -sourcepath src adt
```