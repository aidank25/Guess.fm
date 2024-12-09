package com.example.guessfm

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.json.JSONException


private const val TAG = "MainActivity/"

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.home, container, false)
        view.findViewById<Button>(R.id.playButton).setOnClickListener{
            // first parameter is the context, second is the class of the activity to launch
            val i = Intent(context, GameActivity::class.java)
            startActivity(i) // brings up the second activity
        }
        // Update the return statement to return the inflated view from above
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

        fun newInstance(): HomeFragment=
            HomeFragment().apply {
                return HomeFragment()
            }
    }
}