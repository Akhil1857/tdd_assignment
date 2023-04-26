# tdd_assignment

UT-IT is an SBT project that demonstrates Company, Employee and User Management

To run the application, you'll need to have Scala and sbt installed on your system.

    Clone this repository to your local machine.
    Open a terminal or command prompt and navigate to the project directory.
    Run sbt run to start the application.

This will successfully run and pass all the unit tests in the project.

Project structure

The UT-IT project is organized into two modules, both contains a different part of the project:

module1: two classes are defined, 
         both have different functionality.

module2: contains several classes, 
         user management, employee management
         and company management.

Dependencies

The UT-IT project has the following dependencies:

scala-test: A popular scala testing framework that provides a simple way to write and run unit tests.

slf4j: A popular logger framework that provides simple way of logging.

Both scala-test and slf4j are included as dependencies in the build.sbt file, so you don't need to download them separately.

Plugins

The UI-UT project has the following plugin:

scala-style: A common scala style plugin

Added custom scalastyle configuration file
