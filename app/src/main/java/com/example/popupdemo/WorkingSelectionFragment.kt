package com.example.popupdemo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.fragment_working_selection.*
import kotlin.properties.Delegates

/**
 * A simple [Fragment] subclass.
 */
class WorkingSelectionFragment : Fragment() {

     var isOpen : Boolean by Delegates.observable(false) {
         _, _, newValue ->
         if (newValue){
            val animation = AnimationUtils.loadAnimation(context, R.anim.move_in)
             popup.startAnimation(animation)
         }else{
             val animation = AnimationUtils.loadAnimation(context, R.anim.move_out)
             popup.startAnimation(animation)
         }

      }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_working_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonBar.setOnClickListener {
            isOpen = !isOpen
        }
    }

}
