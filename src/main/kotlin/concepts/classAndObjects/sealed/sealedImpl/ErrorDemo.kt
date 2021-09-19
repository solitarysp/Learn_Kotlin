package concepts.classAndObjects.sealed.sealedImpl

 interface ErrorDemo {
}

sealed class IoError : ErrorDemo {

}

open class FileReadError() : IoError();

