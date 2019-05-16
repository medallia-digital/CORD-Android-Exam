# Button to Action app
## Medallia Digital - Mobile CORD exam
### In this exam, you are asked to write the "Button to Action" Android and iOS app.

* This app has only 1 button
* Tapping on this button performs one of the [actions](#actions) below
* Each tap on the button will trigger a random action


#### Pre Conditions
* Clone the project to your machine
* Create a new branch with your name e.g. john_smith
* Read the implementation guidelines section
* Implement :)
* Push your implementation and let us know (send us an email)

### Implementation guidelines
#### Actions
The app should support the following actions:
1. Alert
2. Screen
3. Action Sheet

#### Guidelines

* Keep in mind that in the future, the app should be able to support actions that are more complex than the actions above.

- When the user tap the button, one action should be chosen randomly and performed.

##### Configuration 

Fetch the configuration from:
<>

The way an action is chosen is according to the configuration values retrieved from the configuration json above.
The configuration values:

* type (String)
    * Describe the compomenent type (Alert, Screen,BottomSheet)
* enabled (boolean)
    * a disabled action can never be chosen
* title
    * The component should present the title text 
* body
    * The component should present the body text 

#### Componenets 
1. Alert - 
    * Android - AlertDialog 
    * iOS - Alert
2. Screen - 
    * Android - Activity 
    * iOS - ViewController
3. Action Sheet - 
    * Android - BottomSheetDialog
    * iOS - ActionSheet
 

### Notes
* Use proper OOP design
* Third party libraries is a bonus
* Address edge cases
* When done, send the branch github link to our email


# Good Luck