package oop.principles.inheritance

/** Types of inheritance: **/
// single Inheritance
/**
open class A(){}

class B(): A(){}
 **/

// MultiLevel Inheritance
/**
open class A(){}
open class B():A(){}
class C():B(){}
 **/

// Hierarchical Inheritance
/**
                    open class A(){}

class B():A(){}     class C():A(){}     class D():A(){}

 **/


// Multiple Inheritance (not supported)
/**
open class A(){}        open class B(){}

class C():A(),B(){}

// Error Message: Only one class may appear in a supertype list
 **/

// Hybrid Inheritance
/**
open class A(){}

open class B():A(){}     class C():A(){}

class D():B(){}
 **/