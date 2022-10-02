package com.levox.common

class Either<out T>(
    val status: Status,
    val data: T? = null,
    val errorCode: Int = 0,
    val errorMessage: String = ""
) {
    enum class Status {
        ERROR,
        LOADING,
        SUCCESS
    }

    companion object {
        fun <T> success(data: T?): Either<T> =
            Either(
                Status.SUCCESS,
                data
            )

        fun <T> loading(): Either<T> =
            Either(
                Status.LOADING
            )

        fun <T> error(code: Int, info: String): Either<T> =
            Either(
                Status.ERROR,
                errorCode = code,
                errorMessage = info
            )
    }

    fun isError() = status == Status.ERROR
    fun isLoading() = status == Status.LOADING
    fun isSuccess() = status == Status.SUCCESS

    suspend fun onError(callback: suspend (code: Int, info: String) -> Unit) {
        if (isError()) {
            callback(errorCode, errorMessage)
        }
    }

    suspend fun onLoading(callback: suspend () -> Unit) {
        if (isLoading()) {
            callback()
        }
    }

    suspend fun onSuccess(callback: suspend (data: T?) -> Unit) {
        if (isSuccess()) {
            callback(data)
        }
    }

    class None {}
}

typealias EitherNone = Either<Either.None>