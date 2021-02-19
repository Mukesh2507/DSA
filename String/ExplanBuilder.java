package com.String;
/*
to create object we can use
1 string-->immutable
2 buffer-->mutable objects-->synchronized method-->due to this performance is slow to overcome this builder is introduced
3 builder->jdk 1.5 they create builder-->methods non syn-->increase performance

//constructer in builder are
StringBuilder(){}
StringBuilder(charSequence seq){}
StringBuilder(String str){}
StringBuilder(int capacity){}
//methods
int length,int capacity,append,insert,reverse,delete,deletecharAt,replace,ensureCapapcity,charat,indexof,lastindexof,substring
subsequence,tostring

java.lang package

String->heap,scp(String constant pole) by use new ->heap or literal->scp
memory->if the we change the value of string lots of time allocate more memory
not thread safe
Buffer-> heap area MA(memory allocate)
memory->consumed less memory
thread safe
Builder->heap area MA
->less memory



 */
public class ExplanBuilder {
}
