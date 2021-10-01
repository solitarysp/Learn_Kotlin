package com.linecorp.study.kotlin.concepts.classAndObjects.sealed.sealedImpl

 interface ErrorDemo {
}

sealed class IoError : ErrorDemo {

}

open class FileReadError() : IoError();

