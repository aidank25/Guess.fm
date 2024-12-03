# Milestone 1 - Guess.fm (Unit 7)

## Table of Contents

1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)

## Overview

### Description

A daily guessing game, like wordle. The user inputs their last.fm account name and then the app picks a random song from their top listened to songs for the user to try to guess.  Each time the user guesses incorrectly, a new clue will be revealed. The clues will be ordered as follows.
1. release date and user scrobbles
2. overall scrobbles
3. tags
4. letter it starts with
5. duration
6. similar track
7. artist
8. album cover
9. first two letters
### App Evaluation

[Evaluation of your app across the following attributes]
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

## Product Spec

### 1. User Features (Required and Optional)

**Required Features**

1. user can input their last.fm account (not login)
2. user can input a guess for a song and receive feedback in the form of clues
3. user can only play once per day
4. user can navigate from home screen to game screen

**Optional Features**

1. user can receive a notification when a new song is available to guess
2. user can choose to guess a song or a letter and receive feedback on where that letter is present in the song title (hangman)
3. user can customize the difficulty (pick random song from top X listened to songs)
4. user can log in
5. user can view past completed games and the number of guesses it took them
6. user can see statistics (average # of guesses, artist they are most familiar with, etc.)
7. user can copy the results of the game to clipboard
8. inputted guesses are cleaned and guesses that are similar enough count as correct


### 2. Screen Archetypes

- Login
	- User can log in
- Home
	- User can see the username they used to login
	- User can input Last.fm account username to use for game personalization
	- User can configure difficulty
	- If the user has already played the game they see the results and a timer until a new song is available
- Game
	- User can play the game
	- If the user has already played the game they see the results and a timer until a new song is available
- Stats
	- User can scroll through past games and their results
	- User can see statistics on their past performance

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Home
* Stats

**Flow Navigation** (Screen to Screen)

- Login
	- => Home
  - Home
	  - => Game
	  - => Login
  - Game
	  - => Home

## Wireframes

[Add picture of your hand sketched wireframes in this section] <img src="guess.fm_paper_wireframe.jpg" width=600>

<br>

<br>

### [BONUS] Digital Wireframes & Mockups
<img src="Guess.fm_figma_wireframe.jpg" width=600>
<img src="figma_with_arrows.png" width=600>

### [BONUS] Interactive Prototype
<img src="guess.fm_figma.gif" width=300>
<br>

# Milestone 2 - Build Sprint 1 (Unit 8)

## GitHub Project board

<img src="sprint1_milestones.png" width=600>

## Issue cards

<img src="sprint1_board.png" width=600>
<img src="sprint1_sprint2board.png" width=600>

## Issues worked on this sprint

- home layout file
- game layout file
- button navigation between home and game
- [Add giphy that shows current build progress for Milestone 2. Note: We will be looking for progression of work between Milestone 2 and 3. Make sure your giphys are not duplicated and clearly show the change from Sprint 1 to 2.]

<br>

# Milestone 3 - Build Sprint 2 (Unit 9)

## GitHub Project board

[Add screenshot of your Project Board with the updated status of issues for Milestone 3. Note that these should include the updated issues you worked on for this sprint and not be a duplicate of Milestone 2 Project board.] <img src="YOUR_WIREFRAME_IMAGE_URL" width=600>

## Completed user stories

- List the completed user stories from this unit
- List any pending user stories / any user stories you decided to cut
from the original requirements

[Add video/gif of your current application that shows build progress]
<img src="YOUR_WIREFRAME_IMAGE_URL" width=600>

## App Demo Video

- Embed the YouTube/Vimeo link of your Completed Demo Day prep video
