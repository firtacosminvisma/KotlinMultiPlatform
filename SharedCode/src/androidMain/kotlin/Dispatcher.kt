import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual val coroutineDispatcher: CoroutineDispatcher
    get() = Dispatchers.Main
