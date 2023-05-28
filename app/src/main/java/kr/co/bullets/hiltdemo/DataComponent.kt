package kr.co.bullets.hiltdemo

import dagger.Component

@Component(modules = [DataModule::class])
interface DataComponent {
    fun inject(mainActivity: MainActivity)
}