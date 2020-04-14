## QRCode
--------------
QRCode is a program that generates a business Card 

## Prerequisites
--------------
Install the latest version of Java and Maven.

## Eclipse Instructions
--------------------

* **Prerequisites:**
    * Install [Eclipse](http://www.eclipse.org/downloads/), the [Maven plugin](http://eclipse.org/m2e/), and optionally the [GitHub plugin](http://eclipse.github.com/).

* Set up Eclipse Preferences

    * Window > Preferences... (or on Mac, Eclipse > Preferences...)
    * Select Maven

        * check on "Download Artifact Sources"
        * check on "Download Artifact JavaDoc"

* Create a new project using `QRCode`

    * Create a new Java Project.
    * Choose the **Location** of the project to be the location of `cmdline-sample`
    * Select the project and **Convert to Maven Project** to add Maven Dependencies.
    * Click on Run > Run configurations
        * Navigate to your **Java Application**'s configuration section
        * In the **Arguments** tab, add the name of the bucket you created above as a **Program argument**
        * In the **Environment** tab, create a variable `GOOGLE_APPLICATION_CREDENTIALS` and set it to the path to your json private key file.

* Run

    * Right-click on project
    * Run As > Java Application
    * If asked, type "StorageSample" and click OK

## Contributing
--------------
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
--------------
[MIT](https://choosealicense.com/licenses/mit/)

##Author
--------------
Amit Samadder
