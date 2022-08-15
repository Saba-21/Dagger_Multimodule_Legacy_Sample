package com.sample.base.other

open class SingletonHolder<out Api, out Component : Api, in Dependencies>(
    private var creator: (Dependencies) -> Component
) {
    @Volatile
    private var instance: Component? = null

    fun initAndGet(arg: Dependencies): Api {
        return synchronized(this) {
            val created = creator(arg)
            instance = created
            created
        }
    }

    fun get(): Component = instance
        ?: throw IllegalStateException("You must call 'initAndGet()' method first")

    fun reset() {
        instance = null
    }
}