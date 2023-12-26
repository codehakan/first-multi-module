package com.hakanbey.multimodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hakanbey.multimodule.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    //lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*val hiltEntryPoint =
            EntryPointAccessors.fromApplication(applicationContext, MyInterface::class.java)
        name = hiltEntryPoint.myFun()

        println("Result: $name")*/

    }


    /*class MyClass(superSavedStateParcelable: Parcelable) :
        BaseSavedState(superSavedStateParcelable) {

    }

    companion object CREATOR : Parcelable.Creator<MyClass> {

        override fun createFromParcel(source: Parcel?): MyClass {
            TODO("Not yet implemented")
        }

        override fun newArray(size: Int): Array<MyClass> {
            TODO("Not yet implemented")
        }

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }*/

}