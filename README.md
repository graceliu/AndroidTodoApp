# Pre-work - AndroidTodoApp

AndroidTodoApp is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: Grace Liu

Time spent: 10 hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **successfully add and remove items** from the todo list
* [x] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [x] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://github.com/graceliu/AndroidTodoApp/demos/prework.gif' title='Prework Video Walkthrough' width='' alt='Prework Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** [Enter your answer here in a paragraph or two].

Android's separation of view from logic where view is expressed in the xml files and logic is expressed in the java files is good.  This is similar to traditional javascript framework's separation of view from logic where view is expressed in a templating language, e.g. handlebar.js, and the logic is expressed in javascript.  However the new React/Redux paradigm is changing this somewhat where React itself allows for idiomatic expression of view in javasrcript.

Android's automatic support for associating the data with the view through an adapter is also good.  In terms of how this correlates to a React-based framework, there is no direct correlation, especially specifically for a widget like a list view.  However React does support state in React components, and you can store the data associated with the React component in its state.

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** [Enter your answer here in a paragraph or two].

An adapter stores the data associated with the UI and enables separation of data from UI representation.  Adapters are important as they enable plug and play of different data sources for a given UI view.  Today, you can populate a UI view with data from an array, and tomorrow you can plug in a different adapter and populate the same UI view with data from a database.

The convertView view refers to existing, already created views that are no longer displayed and can be recycled and reused for newly displayed items.  Allowing Android to use recycled views improves performance.

## Notes

Describe any challenges encountered while building the app.

## License

    Copyright [2017] [Grace Liu]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.