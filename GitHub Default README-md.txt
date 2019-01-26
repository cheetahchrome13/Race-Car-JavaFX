# Project Title: Racing Car

This project was to create a graphic of a car and use Timeline/keyframe animation to move it across the stage.
Additional requirements are the ability to slow or speed up the car with the up/down arrow keys, and ability to pause
the car with a mouse click and restart the car with a mouse release. These requirements will be met with use of event handlers.

## Example Output

This image will display as your example output. Name the image README.jpg in your project folder.

![Sample Output](README.jpg)

## Analysis Steps

The project was to create a graphic of a car and use Timeline/keyframe animation to move it across the stage.
Additional requirements are the ability to slow or speed up the car with the up/down arrow keys, and ability to pause
the car with a mouse click and restart the car with a mouse release. These requirements will be met with use of event handlers.
 I broke down the project by requirements:
 1) A car class
 2) A testing class with which to demonstrate the properties and behaviors of the car class. 
 3) Create a car graphic using javafx shapes. 
 4) Design code that will animate the car graphic.
 5) Design code that will use event handlers to power the event-driven mouse action and keystroke requirements.
 
### Design

I started by creating the CarPane class, defining its properties and methods. 
The biggest part of the design time was spent on creating a car graphic that i was satisfied with --
the book example was terrible! I then set about working on the animation of the graphic,
and determining where in my class that code would fit best. Lastly, I went about finishing the code of the
"tester" class that instantiates a CarPane object and contains the most of the code for the event-driven 
portion of the program.

### Testing

Initial program requirements:

The first testing I performed was to get the 2 classes working together so I could run the program
to be able to see the graphics I was designing.

Animation coding and troubleshooting:

Once I was satisfied with the car graphics results, I started writing the code to animate the graphic.
This turned out to be straightforward, and a within a couple program runs, I had the car moving.

Event-handler implementation:

This was the final part of my testing, where I created the event handlers in the tester class that calls on methods in the
CarPane class to perform the required events with the mouse and keys. The trouble I had here was realizing the need to use 
the requestFocus() method to get the events to fire. 

## Notes

The biggest issues I ran into with this program was determining the proper place for the animation and event handler code
to reside in order for it to work properly.

## Do not change content below this line
## Adapted from a README Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
