package com.example.guessfm

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.guessfm.Game
import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class GameActivity: AppCompatActivity() {
    fun onSubmit(v: View) {
        // closes the activity and returns to first screen
        this.finish();
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_game)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.title_text_view)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val clueTextViews: List<TextView> = listOf(
            findViewById<TextView>(R.id.clue1),
            findViewById<TextView>(R.id.clue2),
            findViewById<TextView>(R.id.clue3),
            findViewById<TextView>(R.id.clue4)
        )
        lateinit var game: Game
        val username = intent?.getStringExtra("fmUsername")?: ""
        val limit = intent?.getStringExtra("limit")?.toInt()
        CoroutineScope(Dispatchers.IO).launch {
            game = Game(username, limit)
            runOnUiThread({
                clueTextViews[0].text = game.clues[0]
            })
        }
        val guessButton = findViewById<Button>(R.id.guessButton)
        val guessBox = findViewById<TextInputLayout>(R.id.textInputLayout)
        val endMessage = findViewById<TextView>(R.id.endMessageTextView)
        guessButton.setOnClickListener{
            game.numGuesses++
            if (game.checkGuess(guessBox.editText?.text.toString())){
                endMessage.text = "You did it! The song was " + game.trackName
            }
            else if(game.numGuesses >= 4){
                endMessage.text = "Nice try. The song was " + game.trackName
            }
            else{
                guessBox.editText?.setText("")

                clueTextViews[game.numGuesses].text = game.clues[game.numGuesses]
            }

        }


    }
}