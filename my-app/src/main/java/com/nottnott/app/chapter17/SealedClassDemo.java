package com.nottnott.app.chapter17;

sealed class MySealedClass permits Alpha, Beta {

}

final class Alpha extends MySealedClass {

}

final class Beta extends MySealedClass {

}

public class SealedClassDemo {

}
