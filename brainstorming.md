## Step 1: Generate New Ideas
1.  Listening List(Todo) using Last.fm API
	- user logs in with a username and password(**actually probably not because the database is going to be stored locally**)
	- uses the last.fm api to search albums
	- the user can add albums to a todo list
		- list is saved to a database entry connected to the user
	- the user can log in to their last.fm account and automatically check off albums when the listen count for all of the songs is >0
	- if the user does not have a last.fm account they can manually check an album off
1. guess the track using last.fm api (Guess.fm)
	- personalized daily guessing game for songs that the user has listened to
	- Picks from albums that the user has scrobbled before
		- login with last.fm account
		- fetch top tracks
		- pick a random one
		- check if it has already been done before
		- store it locally
	- each incorrect guess reveals a clue
      1. release date
      2. user scrobbles
      3. overall scrobbles
      4. letter it starts with
      5. artist
      6. similar track
      7. tags
      8. duration
      9. album cover
      10. first two letters
	- hangman mode?
3. drum sequencer
	- sequences saved to a database
	- configure bpm and time signature
4. migraine log
	- when the user gets a migraine input details like sleep, screen time
	- get the date from the os
	- weather api to get the temperature?
	- get geolocation?
	- data gets saved to a database
	- app has tools to visualize the data (api?)
5. geo hide and seek
	- google maps api
	- hider location gets periodically pinged on a map
	- settings to configure game
6. drawing app
	- user can save drawings
	- browse drawings in recycler view
## Step 2: Evaluating App ideas
### Step 2.1: Top Three
- Listening List (last.fm api)
- Guess The Track or Guess.fm (last.fm api) 
- Migraine Log
### Step 2.2: Evaluating Ideas
#### App Evaluation Criteria
- **Description:** A description of the app.
- **Category:**
  - Education
  - Lifestyle
  - Productivity
  - Travel
  - Health & Fitness
  - Social
  - Entertainment
- **Mobile:** How uniquely mobile is the product experience?
    - What makes your app more than a glorified website?
    - Try for 2 or more of these: maps, camera, location, audio, sensors, push, real-time, etc
- **Story:** How compelling is the story around this app once completed?
    - How clear is the value of this app to your audience?
    - How well would your friends or peers respond to this product idea?
- **Market:** How large or unique is the market for this app?
    - What's the size and scale of your potential user base?
    - Does this app provide huge value to a niche group of people?
    - Do you have a well-defined audience of people for this app?
- **Habit:** How habit-forming or addictive is this app?
    - How frequently would an average user open and use this app?
    - Does an average user just consume your app or do they create?
- **Scope:** How well-formed is the scope for this app?
    - How technically challenging will it be to complete this app by the end of the program?
    - Is a stripped-down version of this app still interesting to build?
    - How clearly defined is the product you want to build?
#### Listening List
- **Description:** A todo app for listening to albums. The user can sync the app with their last.fm account to automatically check albums off when they have been listened to and see their progress.
- **Category:** Lifestyle / Entertainment
- **Mobile:** How uniquely mobile is the product experience?
    - People tend to listen to music on their phones so it would make sense to plan the music you want to listen to on your phone.
    - Try for 2 or more of these: maps, camera, location, audio, sensors, push, real-time, etc
	    - log the time that an album was added to the list
	    - could maybe use another api to play snippets of music
- **Story:** How compelling is the story around this app once completed?
    - I often find albums on my computer that look interesting to me and I open a tab to remind myself to listen to it, but I only really listen to music while on my phone, in transit, so I forget to listen to it. Even when I write it down in a place I can check while on my phone, I forget. This app creates a simple place where you can plan to listen to albums and track your progress if you stop listening halfway through.
    - They may think it's silly but I think some may find it useful.
- **Market:** How large or unique is the market for this app?
    - The size of my userbase is people who listen to full albums. Also some functionality is limited to only last.fm users which shrinks the userbase a little.
    - Yes, this app has the potential to be useful to a niche group of music listeners.
    - Yes, last.fm users/music nerds.
- **Habit:** How habit-forming or addictive is this app?
    - The average user is hopefully the type of person to be discovering new music often so they'd be opening the app a few times a week at least
    - The average user just consumes.
- **Scope:** How well-formed is the scope for this app?
    - This app shouldn't be too technically challenging. The api calls are simple. Api call to search for an album and retrieve the cover and tracks. The albums will be in a recycler view and zooming into the album will show the tracks in a recycler view. I think the most difficult part will checking if individual tracks have been scrobbled but that's not that bad.
    - A stripped down version would probably just show if the user has scrobbled all of the tracks but not show the tracks individually.
    - I think it's a pretty straightforward todo app.
#### Guess.fm 
- **Description:** A daily guessing game like wordle, for songs. There are other song guessing games but they suffer from a problem that sometimes they use songs that the user has never heard of and will never use the more niche songs that the user knows. My app will allow the user to put in their last.fm account to make sure the game uses a song that the user is familiar with and uses the last.fm api to get clues for each incorrect guess.
- **Category:** Entertainment
- **Mobile:** How uniquely mobile is the product experience?
    - What makes your app more than a glorified website?
    - Try for 2 or more of these: maps, camera, location, audio, sensors, push, real-time, etc
	    - the app will use the device time to determine when it is available to do a new game
	    - the app could use notifications to let the user know that a new game is available
- **Story:** How compelling is the story around this app once completed?
    - The value comes in the personalization of the game using the users last.fm account
    - I have posed the idea to my friends and they all see the value in it.
- **Market:** How large or unique is the market for this app?
    - The userbase is strictly last.fm users so not too large.
    - I believe this app does provide a unique value to a niche group
    - Last.fm users who play daily wordle type games.
- **Habit:** How habit-forming or addictive is this app?
    - The average user would open the app around once a day.
    - The average user only consumes the app.
- **Scope:** How well-formed is the scope for this app?
    - It shouldn't be too technically challenging. The last.fm api does most of the work.
    - If I have time I have time I want to implement a hangman system for the app so its not just the api clues but i think just the clues will still be a fun game.
    - I think its very well defined. The app randomly picks a song from the user's last.fm account's top listened to songs, and then they keep guessing and getting new clues until they get it or run out of guesses.
#### Migraine Log
- **Description:** App for logging  when you get a migraine, how long it lasts, and other related data.
- **Category:** Lifestyle
- **Mobile:** How uniquely mobile is the product experience?
    - A migraine can hit you anywhere, so best to be able to take notes on a mobile device.
    - Try for 2 or more of these: maps, camera, location, audio, sensors, push, real-time, etc
	    - use real time to automatically track the time
	    - use location to track location
- **Story:** How compelling is the story around this app once completed?
    - Not super clear, but it basically serves as a better alternative to just writing things down in a notes app. More organized, simplified, and reminds the user what to take note of.
    - I'm not really sure how useful this is to other people because its mainly based off of my own experience with migraines.
- **Market:** How large or unique is the market for this app?
    - The potential userbase is pretty small, people who semi-regularly get migraines and do not know what causes them.
    - It provides moderate value to a small group.
    - The audience is not super well defined.
- **Habit:** How habit-forming or addictive is this app?
    - The average user would open the app as often as they get migraines.
    - The average user just consumes.
- **Scope:** How well-formed is the scope for this app?
    - This is probably the simplest app of my 3, because its basically just typing data into text fields and saving it.
    - A stripped back version would probably not be very interesting to build.
    - Not super clearly defined, I'm not sure every data field i want to include, or how to visualize the data.
### Step 2.3: The Final Decision
I think Guess.fm is the most compelling idea of the 3. It is the most interesting to build and has the clearest value.
